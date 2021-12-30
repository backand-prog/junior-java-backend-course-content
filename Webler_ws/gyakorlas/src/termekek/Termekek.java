package termekek;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Termekek {

	private JFrame frameTermekek;
	private JTable table;
	private JButton btnUjTermek;
	private JScrollPane scrollPane;
	private JButton btnKilep;
	private JButton btnKereses;
	private JLabel lblKeresNev;
	private JTextField tfKeres;
	private Statement stm = null;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Termekek window = new Termekek();
					window.frameTermekek.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Termekek() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameTermekek = new JFrame();
		frameTermekek.setTitle("Term\u00E9kCRUD");
		frameTermekek.setBounds(100, 100, 860, 403);
		frameTermekek.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTermekek.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 29, 806, 144);
		frameTermekek.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//sor azonosítóját kiderítjük
				int row = table.rowAtPoint(e.getPoint());
				
				modositEsTorolAblakMegjelenit(row);
				
			}
		});
		scrollPane.setViewportView(table);
		
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null}
					
				},
				new String[] {"ID", "Leltárszám", "Név", "Ár", "Raktármennyiség", "Állapot"}
				));
		
		
		
		btnUjTermek = new JButton("\u00DAj term\u00E9k");
		btnUjTermek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ujTermekAblakMegjelenit();
				
			}
		});
		btnUjTermek.setBackground(SystemColor.activeCaption);
		btnUjTermek.setBounds(12, 190, 154, 46);
		frameTermekek.getContentPane().add(btnUjTermek);
		
		btnKereses = new JButton("Keres\u00E9s");
		btnKereses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				keresNev();
				
			}
		});
		btnKereses.setBackground(new Color(144, 238, 144));
		btnKereses.setBounds(267, 272, 124, 46);
		frameTermekek.getContentPane().add(btnKereses);
		
		btnKilep = new JButton("KIL\u00C9P");
		btnKilep.setForeground(Color.WHITE);
		btnKilep.setBackground(Color.RED);
		btnKilep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnKilep.setBounds(649, 297, 154, 46);
		frameTermekek.getContentPane().add(btnKilep);
		
		lblKeresNev = new JLabel("N\u00E9v:");
		lblKeresNev.setBounds(12, 272, 76, 46);
		frameTermekek.getContentPane().add(lblKeresNev);
		
		tfKeres = new JTextField();
		tfKeres.setBounds(61, 272, 177, 46);
		frameTermekek.getContentPane().add(tfKeres);
		tfKeres.setColumns(10);
		
		
		refresh();
		
	
	}
	
	public void refresh() {
		
		
		
		Db dbObj = new Db();
		
		String sql = "SELECT * FROM termekek ORDER BY id;";
		
		ResultSet rs = dbObj.lekerdez(sql);
		
		
		tablazatSorokTorol();
		
		try {
			while (rs.next()) {
				
				String allapot = rs.getBoolean("allapot") ? "aktív" : "inaktív";

				((DefaultTableModel)table.getModel()).addRow(
						new Object[] {
								rs.getString("id"),
								rs.getString("leltar_szam"),
								rs.getString("nev"),
								rs.getString("ar"),
								rs.getString("raktar_mennyiseg"),
								allapot,				
								
						}
										
						);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void tablazatSorokTorol() {
		
		int sorokSzama = table.getModel().getRowCount();
		for (int i = sorokSzama-1; i >= 0; i--) {
			
			((DefaultTableModel)table.getModel()).removeRow(i);
			
		}
		
	}
	
	public void ujTermekAblakMegjelenit() {
		
		new UjTermek(this);
		
		
	}
	
	public void modositEsTorolAblakMegjelenit(int row) {
		
		int id = Integer.parseInt(((DefaultTableModel)table.getModel()).getValueAt(row, 0).toString());
		
		new termekModositTorol(this, id);
		
	}
	
	public void keresNev () {
		Db dbObj = new Db();
		String sql = "SElECT * FROM termekek WHERE nev like '%"+tfKeres.getText()+"%'";
		ResultSet rs = dbObj.lekerdez(sql);
		
		
		tablazatSorokTorol();
		try {
			
			while (rs.next()) {
				
				String allapot = rs.getBoolean("allapot") ? "aktív" : "inaktív";

				((DefaultTableModel)table.getModel()).addRow(
						new Object[] {
								rs.getString("id"),
								rs.getString("leltar_szam"),
								rs.getString("nev"),
								rs.getString("ar"),
								rs.getString("raktar_mennyiseg"),
								allapot,				

						});

			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}