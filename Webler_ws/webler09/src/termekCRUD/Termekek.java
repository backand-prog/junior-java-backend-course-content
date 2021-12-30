package termekCRUD;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Termekek {

	private JFrame frameTermekek;
	private JTable table;
	private JTextField tfKeres;
	private JButton btnKeres;

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
		frameTermekek.setTitle("Term\u00E9kek CRUD");
		frameTermekek.setBounds(100, 100, 1117, 637);
		frameTermekek.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTermekek.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 13, 1051, 156);
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
					{ null, null, null, null, null, null },
					{ null, null, null, null, null, null },
					{ null, null, null, null, null, null },
					{ null, null, null, null, null, null },
				},
				new String[] {"ID", "Leltárszám", "Név", "Ár", "Raktármennyiség", "Állapot"}
				));
		
		JButton btnUjTermek = new JButton("\u00DAj term\u00E9k");
		btnUjTermek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ujTermekAblakMegjelenit();
			}
		});
		btnUjTermek.setBackground(SystemColor.activeCaption);
		btnUjTermek.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUjTermek.setBounds(35, 192, 132, 47);
		frameTermekek.getContentPane().add(btnUjTermek);
		
		
		
		JButton btnKilep = new JButton("KIL\u00C9P");
		btnKilep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnKilep.setForeground(Color.WHITE);
		btnKilep.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnKilep.setBackground(Color.RED);
		btnKilep.setBounds(915, 504, 132, 47);
		frameTermekek.getContentPane().add(btnKilep);
		
		btnKeres = new JButton("KERES\u00C9S");
		btnKeres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				keresAlapjanKeres();
				
			}
		});
		btnKeres.setBackground(new Color(173, 255, 47));
		btnKeres.setBounds(387, 280, 141, 40);
		frameTermekek.getContentPane().add(btnKeres);
		
		tfKeres = new JTextField();
		tfKeres.setHorizontalAlignment(SwingConstants.CENTER);
		tfKeres.setBounds(151, 280, 208, 40);
		frameTermekek.getContentPane().add(tfKeres);
		tfKeres.setColumns(10);
		
		JLabel lblNevKeres = new JLabel("N\u00E9v:");
		lblNevKeres.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNevKeres.setBounds(54, 289, 64, 21);
		frameTermekek.getContentPane().add(lblNevKeres);
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
				((DefaultTableModel) table.getModel()).addRow(
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
			((DefaultTableModel) table.getModel()).removeRow(i);
		}
	}
	
	public void ujTermekAblakMegjelenit() {
		new UjTermek(this);
		
	}
	
	public void modositEsTorolAblakMegjelenit(int row) {
		int id = Integer.parseInt(((DefaultTableModel) table.getModel()).getValueAt(row, 0).toString());
		
		new TermekModositTorol(this, id);
		
		
	}
	
	public void keresAlapjanKeres() {
		
		Db dbObj = new Db();
		tablazatSorokTorol();
		
		
	}
	
}
