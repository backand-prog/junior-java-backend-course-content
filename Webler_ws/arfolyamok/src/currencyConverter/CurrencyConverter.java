package currencyConverter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import hu.mnb.www.webservices.MNBArfolyamServiceSoapProxy;



public class CurrencyConverter {

	private JFrame frmCurrencyConverter;
	private JTextField tfEchangeFrom;
	private JButton btnConvert;
	@SuppressWarnings("rawtypes")
	private JComboBox cbEchangeFrom;
	@SuppressWarnings("rawtypes")
	private JComboBox cbExcangeTo;
	private MNBArfolyamServiceSoapProxy afObj = new MNBArfolyamServiceSoapProxy();
	private JLabel lblResultDisplay;
	private JButton btnExit;
	private JLabel lblExceptions;
	private ConvertCurrencies cc = new ConvertCurrencies(); 
	private JLabel lblResult;
	private JLabel lblDate;
	private JDateChooser dateChooser;
	private JLabel lblConvertTo;
	private JButton btnPreviousActions;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter window = new CurrencyConverter();
					window.frmCurrencyConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CurrencyConverter() {
		initialize();
	}

	/**s
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
				
		frmCurrencyConverter = new JFrame();
		frmCurrencyConverter.setBackground(Color.LIGHT_GRAY);
		frmCurrencyConverter.setTitle("Currency Converter");
		frmCurrencyConverter.setBounds(100, 100, 497, 548);
		frmCurrencyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCurrencyConverter.getContentPane().setLayout(null);
		
		tfEchangeFrom = new JTextField();
		tfEchangeFrom.setHorizontalAlignment(SwingConstants.CENTER);
		tfEchangeFrom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfEchangeFrom.setBounds(22, 127, 145, 37);
		frmCurrencyConverter.getContentPane().add(tfEchangeFrom);
		tfEchangeFrom.setColumns(10);
		
		cbEchangeFrom = new JComboBox();
		cbEchangeFrom.setModel(new DefaultComboBoxModel(Data.currencies));
		cbEchangeFrom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbEchangeFrom.setBounds(210, 132, 163, 26);
		frmCurrencyConverter.getContentPane().add(cbEchangeFrom);
		
		cbExcangeTo = new JComboBox();
		cbExcangeTo.setModel(new DefaultComboBoxModel(Data.currencies));
		cbExcangeTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbExcangeTo.setBounds(210, 206, 163, 26);
		frmCurrencyConverter.getContentPane().add(cbExcangeTo);
		
		lblResultDisplay = new JLabel("");
		lblResultDisplay.setForeground(new Color(204, 0, 0));
		lblResultDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultDisplay.setBounds(126, 312, 334, 37);
		frmCurrencyConverter.getContentPane().add(lblResultDisplay);
		
		btnConvert = new JButton("CONVERT");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					lblResultDisplay.setText(cc.changeCurrency(tfEchangeFrom.getText(), cbEchangeFrom.getSelectedItem().toString(), cbExcangeTo.getSelectedItem().toString(), dateChooser.getCalendar()).toString());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							frmCurrencyConverter, 
							"No data.\nPlease check the following:\n"
							+ "The given date is in valid format and it is on a not future work day.\n"
							+ "The amount is in valid number format", 
							"ERROR", 
							JOptionPane.PLAIN_MESSAGE);
					
				
				}
				

				saveExchangeToDb();
				
				}
			});
		btnConvert.setBackground(SystemColor.activeCaption);
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConvert.setBounds(210, 262, 163, 37);
		frmCurrencyConverter.getContentPane().add(btnConvert);
		
		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
			
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBackground(new Color(255, 51, 51));
		btnExit.setBounds(328, 457, 132, 31);
		frmCurrencyConverter.getContentPane().add(btnExit);
		
		lblExceptions = new JLabel("");
		lblExceptions.setForeground(new Color(204, 0, 0));
		lblExceptions.setBounds(32, 177, 274, 27);
		frmCurrencyConverter.getContentPane().add(lblExceptions);
		
		lblResult = new JLabel("Result:");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(12, 312, 139, 37);
		frmCurrencyConverter.getContentPane().add(lblResult);
		
		lblDate = new JLabel("Date:");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDate.setBounds(-16, 47, 184, 37);
		frmCurrencyConverter.getContentPane().add(lblDate);
		
		dateChooser = new JDateChooser();
		dateChooser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(194, 47, 184, 37);
		frmCurrencyConverter.getContentPane().add(dateChooser);
		
		lblConvertTo = new JLabel("Convert to:");
		lblConvertTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblConvertTo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConvertTo.setBounds(12, 201, 139, 37);
		frmCurrencyConverter.getContentPane().add(lblConvertTo);
		
		btnPreviousActions = new JButton("PREVIOUS ACTIONS");
		btnPreviousActions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				prevActionsFrame();
				
			}
		});
		btnPreviousActions.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPreviousActions.setBackground(SystemColor.activeCaption);
		btnPreviousActions.setBounds(88, 382, 298, 53);
		frmCurrencyConverter.getContentPane().add(btnPreviousActions);
		
	}
	
	public void prevActionsFrame () {
		new PrevActions(this);
	}
	
	public void saveExchangeToDb() {
		
		Connection con = new Db().getCon();
		
		String sql = "INSERT INTO exchangeactions (creation_date, data_date, exchange_from, exchange_to, original_value, converted_value, exchange_rate)"
				+ "VALUES (?,?,?,?,?,?,?)";

		try {

			Calendar dateTime = Calendar.getInstance();
			String currentDateTime = "";
			Integer year = dateTime.get(dateTime.YEAR);
			Integer month = dateTime.get(dateTime.MONTH);
			Integer day = dateTime.get(dateTime.DAY_OF_MONTH);

			month = month + 1;

			String monthString = month.toString();

			if (monthString.length() == 1) {
				monthString = "0" + monthString;
			}

			Calendar dataDateCal = dateChooser.getCalendar();
			String dataDate = "";
			Integer yearData = dataDateCal.get(dataDateCal.YEAR);
			Integer monthData = dataDateCal.get(dataDateCal.MONTH);
			Integer dayData = dataDateCal.get(dataDateCal.DAY_OF_MONTH);

			monthData = monthData + 1;

			String monthDataString = monthData.toString();

			if (monthDataString.length() == 1) {
				monthDataString = "0" + monthDataString;
			}

			dataDate = yearData.toString() + "-" + monthDataString + "-" + dayData.toString();
			currentDateTime = year.toString() + "-" + monthString + "-" + day.toString();

			String changeRate = ((Double)(Double.parseDouble(lblResultDisplay.getText()) / Double.parseDouble(tfEchangeFrom.getText()))).toString();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, currentDateTime);
			ps.setString(2, dataDate);
			ps.setString(3, cbEchangeFrom.getSelectedItem().toString());
			ps.setString(4, cbExcangeTo.getSelectedItem().toString());
			ps.setString(5, tfEchangeFrom.getText());
			ps.setString(6, lblResultDisplay.getText());
			ps.setString(7, changeRate);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
