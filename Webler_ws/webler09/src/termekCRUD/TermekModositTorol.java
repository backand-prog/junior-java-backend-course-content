package termekCRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TermekModositTorol extends JFrame {

	private JPanel contentPane;
	private Statement stm = null;
	private Connection con = new Db().getCon();
	private JTextField tfLeltarSzam;
	private JTextField tfNev;
	private JTextField tfAr;
	private JTextField tfRaktarMennyiseg;
	@SuppressWarnings("rawtypes")
	private JComboBox cbAllapot;
	
	
	/**
	 * Create the frame.
	 */
	public TermekModositTorol(Termekek MainWindow, int id) {
		setTitle("Term\u00E9k m\u00F3dos\u00EDt \u00E9s t\u00F6r\u00F6l - ID: " + id);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 617, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeltarSzam = new JLabel("Lelt\u00E1rsz\u00E1m:");
		lblLeltarSzam.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeltarSzam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLeltarSzam.setBounds(47, 71, 104, 23);
		contentPane.add(lblLeltarSzam);
		
		JLabel lblNev = new JLabel("N\u00E9v:");
		lblNev.setHorizontalAlignment(SwingConstants.CENTER);
		lblNev.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNev.setBounds(47, 131, 104, 23);
		contentPane.add(lblNev);
		
		JLabel lblAr = new JLabel("\u00C1r:");
		lblAr.setHorizontalAlignment(SwingConstants.CENTER);
		lblAr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAr.setBounds(47, 192, 104, 23);
		contentPane.add(lblAr);
		
		JLabel lblRaktarmennyiseg = new JLabel("Rakt\u00E1rmennyis\u00E9g:");
		lblRaktarmennyiseg.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaktarmennyiseg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRaktarmennyiseg.setBounds(43, 256, 129, 23);
		contentPane.add(lblRaktarmennyiseg);
		
		JLabel lblAllapot = new JLabel("\u00C1llapot:");
		lblAllapot.setHorizontalAlignment(SwingConstants.CENTER);
		lblAllapot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAllapot.setBounds(47, 317, 104, 23);
		contentPane.add(lblAllapot);
		
		tfLeltarSzam = new JTextField();
		tfLeltarSzam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfLeltarSzam.setHorizontalAlignment(SwingConstants.CENTER);
		tfLeltarSzam.setBounds(201, 65, 225, 30);
		contentPane.add(tfLeltarSzam);
		tfLeltarSzam.setColumns(10);
		
		tfNev = new JTextField();
		tfNev.setHorizontalAlignment(SwingConstants.CENTER);
		tfNev.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNev.setColumns(10);
		tfNev.setBounds(201, 132, 225, 30);
		contentPane.add(tfNev);
		
		tfAr = new JTextField();
		tfAr.setHorizontalAlignment(SwingConstants.CENTER);
		tfAr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfAr.setColumns(10);
		tfAr.setBounds(201, 193, 225, 30);
		contentPane.add(tfAr);
		
		tfRaktarMennyiseg = new JTextField();
		tfRaktarMennyiseg.setHorizontalAlignment(SwingConstants.CENTER);
		tfRaktarMennyiseg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfRaktarMennyiseg.setColumns(10);
		tfRaktarMennyiseg.setBounds(201, 257, 225, 30);
		contentPane.add(tfRaktarMennyiseg);
		
		cbAllapot = new JComboBox();
		cbAllapot.setModel(new DefaultComboBoxModel(new String[] {"inakt\u00EDv", "akt\u00EDv"}));
		cbAllapot.setBounds(201, 318, 159, 30);
		contentPane.add(cbAllapot);
		
		JButton btnTorol = new JButton("T\u00D6R\u00D6L");
		btnTorol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "DELETE FROM termekek WHERE id = '"+id+"';";
				try {
					stm.execute(sql);
					MainWindow.refresh();
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnTorol.setBackground(SystemColor.activeCaption);
		btnTorol.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTorol.setBounds(41, 387, 110, 43);
		contentPane.add(btnTorol);
		
		JButton btnModosit = new JButton("M\u00D3DOS\u00CDT");
		btnModosit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//update
				String sql = "UPDATE termekek SET "
						+ "leltar_szam = '"+tfLeltarSzam.getText()+"',"
						+ "nev = '"+tfNev.getText()+"',"
						+ "ar = '"+tfAr.getText()+"',"
						+ "raktar_mennyiseg = '"+tfRaktarMennyiseg.getText()+"',"
						+ "allapot = '"+cbAllapot.getSelectedIndex()+"'"
								+ "where id = '"+id+"';";
						
				try {
					stm.execute(sql);
					MainWindow.refresh();
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnModosit.setBackground(Color.YELLOW);
		btnModosit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnModosit.setBounds(285, 387, 110, 43);
		contentPane.add(btnModosit);
		
		JButton btnBezar = new JButton("BEZ\u00C1R");
		btnBezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBezar.setForeground(Color.WHITE);
		btnBezar.setBackground(Color.RED);
		btnBezar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBezar.setBounds(464, 441, 110, 43);
		contentPane.add(btnBezar);
		
		
		
		adatokBetoltIdAlapjan(id);
		
		setVisible(true);
		
	}
	
	public void adatokBetoltIdAlapjan (int id) {
		
	try {
		stm = con.createStatement();
		String sql = "SELECT * FROM termekek WHERE id = '"+id+"';";
		ResultSet rs = stm.executeQuery(sql);
		if (rs.next()) {
			//u. komponensek feltöltése
			tfLeltarSzam.setText(rs.getString("leltar_szam"));
			tfNev.setText(rs.getString("nev"));
			tfAr.setText(rs.getString("ar"));
			tfRaktarMennyiseg.setText(rs.getString("raktar_mennyiseg"));
			cbAllapot.setSelectedIndex(rs.getInt("allapot"));
			
			
			
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}

}
