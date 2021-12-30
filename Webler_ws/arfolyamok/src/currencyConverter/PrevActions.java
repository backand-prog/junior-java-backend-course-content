package currencyConverter;


import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PrevActions extends JFrame {

	private JPanel contentPane;
	@SuppressWarnings("rawtypes")
	private JComboBox cbCurrenciesFrom;
	private JTable table;
	private JDateChooser dcFilterDate;
	private JLabel lblFilterByCurrencyFromTo;
	private JLabel lblFilterByDate;
	private JLabel lblFilterByCurrencyFrom;
	@SuppressWarnings("rawtypes")
	private JComboBox cbCurrenciesTo;
	private JButton btnFilterCurrFrom;
	private JButton btnFilterCurrTo;
	private JButton btndate;
	private JButton btnDeleteAll;
	private JButton btnExit;
	private Statement stm = null;
	private Connection con = new Db().getCon();
	private JButton btnRemoveFilters;
	


	/**
	 * Create the frame.
	 */
	public PrevActions(CurrencyConverter MainWindow) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 200, 1135, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 61, 1044, 220);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		scrollPane.setViewportView(table);
		
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{ null, null, null, null, null, null, null },
				},
				new String[] {"Query date", "Data Date", "Original currency", "Converted currency", "Original value", "Converted value", "Exchange rate"}
				));
		
		
		cbCurrenciesFrom = new JComboBox();
		cbCurrenciesFrom.setModel(new DefaultComboBoxModel(Data.currencies));
		cbCurrenciesFrom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbCurrenciesFrom.setBounds(238, 328, 163, 26);
		contentPane.add(cbCurrenciesFrom);
		
		lblFilterByCurrencyFrom = new JLabel("Filter by currency (from):");
		lblFilterByCurrencyFrom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFilterByCurrencyFrom.setBounds(33, 328, 193, 26);
		contentPane.add(lblFilterByCurrencyFrom);
		
		lblFilterByDate = new JLabel("Filter by data date:");
		lblFilterByDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFilterByDate.setBounds(534, 328, 141, 26);
		contentPane.add(lblFilterByDate);
		
		dcFilterDate = new JDateChooser();
		dcFilterDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dcFilterDate.setDateFormatString("yyyy-MM-dd");
		dcFilterDate.setBounds(696, 315, 184, 37);
		contentPane.add(dcFilterDate);

		lblFilterByCurrencyFromTo = new JLabel("Filter by currency (to):");
		lblFilterByCurrencyFromTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFilterByCurrencyFromTo.setBounds(33, 386, 193, 26);
		contentPane.add(lblFilterByCurrencyFromTo);

		cbCurrenciesTo = new JComboBox();
		cbCurrenciesTo.setModel(new DefaultComboBoxModel(Data.currencies));
		cbCurrenciesTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbCurrenciesTo.setBounds(238, 386, 163, 26);
		contentPane.add(cbCurrenciesTo);

		btnFilterCurrFrom = new JButton("FILTER");
		btnFilterCurrFrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				filterByCurrencyFrom();
			
			}
		});
		btnFilterCurrFrom.setBackground(new Color(154, 205, 50));
		btnFilterCurrFrom.setBounds(413, 330, 97, 25);
		contentPane.add(btnFilterCurrFrom);
		
		btnFilterCurrTo = new JButton("FILTER");
		btnFilterCurrTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				filterByCurrencyTo();
				
			}
		});
		btnFilterCurrTo.setBackground(new Color(154, 205, 50));
		btnFilterCurrTo.setBounds(413, 388, 97, 25);
		contentPane.add(btnFilterCurrTo);
		
		btndate = new JButton("FILTER");
		btndate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				filterByDate();
				
			}
		});
		btndate.setBackground(new Color(154, 205, 50));
		btndate.setBounds(903, 329, 97, 25);
		contentPane.add(btndate);
		
		btnDeleteAll = new JButton("DELETE ALL RECORDS");
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				emptyTable();
				refresh();
			}
		});
		btnDeleteAll.setBounds(710, 378, 170, 45);
		contentPane.add(btnDeleteAll);
		
		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExit.setBounds(907, 403, 170, 45);
		contentPane.add(btnExit);
		
		btnRemoveFilters = new JButton("REMOVE FILTERS");
		btnRemoveFilters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				refresh();
				
			}
		});
		btnRemoveFilters.setBounds(534, 378, 170, 45);
		contentPane.add(btnRemoveFilters);
		
		setVisible(true);
		
		refresh();
	}
	
	public void refresh() {
		
		Db dbObj = new Db();
		
		String sql = "SELECT * from exchangeactions ORDER BY id";
		deleteRowsFromTable();
		
		ResultSet rs = dbObj.query(sql);
		
		try {
			while (rs.next()) {
				
				((DefaultTableModel) table.getModel()).addRow(
						new Object[] {
								rs.getString("creation_date"),
								rs.getString("data_date"),
								rs.getString("exchange_from"),
								rs.getString("exchange_to"),
								rs.getString("original_value"),
								rs.getString("converted_value"),
								rs.getString("exchange_rate")
						}
						);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	};
	
	public void deleteRowsFromTable() {
		
		int rowCount = table.getModel().getRowCount();
		for (int i = rowCount-1; i >= 0; i--) {
		((DefaultTableModel) table.getModel()).removeRow(i);
			
		}
		
	}
	
	public void emptyTable() {
		
		try {
			stm = con.createStatement();
			String sql = "TRUNCATE TABLE exchangeactions";
			stm.execute(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void filterByCurrencyFrom() {
		
		Db dbObj = new Db();
		String sql = "SELECT * FROM exchangeactions WHERE exchange_from like '" + cbCurrenciesFrom.getSelectedItem() + "';";
		ResultSet rs = dbObj.query(sql);
		
		deleteRowsFromTable();
		
		try {
			while (rs.next()) {
				
				((DefaultTableModel) table.getModel()).addRow(
						new Object[] {
								rs.getString("creation_date"),
								rs.getString("data_date"),
								rs.getString("exchange_from"),
								rs.getString("exchange_to"),
								rs.getString("original_value"),
								rs.getString("converted_value"),
								rs.getString("exchange_rate")
						}
						);
						
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void filterByCurrencyTo() {
			
			Db dbObj = new Db();
			String sql = "SELECT * FROM exchangeactions WHERE exchange_to like '" + cbCurrenciesTo.getSelectedItem() + "';";
			ResultSet rs = dbObj.query(sql);
			
			deleteRowsFromTable();
			
			try {
				while (rs.next()) {
					
					((DefaultTableModel) table.getModel()).addRow(
							new Object[] {
									rs.getString("creation_date"),
									rs.getString("data_date"),
									rs.getString("exchange_from"),
									rs.getString("exchange_to"),
									rs.getString("original_value"),
									rs.getString("converted_value"),
									rs.getString("exchange_rate")
							}
							);
		
				}
			} catch (SQLException e) {
				e.printStackTrace();
		}
		
	}
	
	public void filterByDate() {
		
		Db dbObj = new Db();
		
		String sql = "SELECT * FROM exchangeactions WHERE data_date like '" +  new ConvertCurrencies().dateString(dcFilterDate.getCalendar())  + "';";
		ResultSet rs = dbObj.query(sql);
		
		deleteRowsFromTable();
		
		try {
			while (rs.next()) {
				
				((DefaultTableModel) table.getModel()).addRow(
						new Object[] {
								rs.getString("creation_date"),
								rs.getString("data_date"),
								rs.getString("exchange_from"),
								rs.getString("exchange_to"),
								rs.getString("original_value"),
								rs.getString("converted_value"),
								rs.getString("exchange_rate")
						}
						);

			}
		} catch (SQLException e) {
			e.printStackTrace();
	}
	
}
	
}
