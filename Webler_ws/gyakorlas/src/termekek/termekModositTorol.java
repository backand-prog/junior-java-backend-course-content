package termekek;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
public class termekModositTorol extends JFrame {

	private JPanel contentPane;
	private Statement stm = null;
	private Connection con = new Db().getCon();
	private JTextField tfLeltarSzam;
	private JTextField tfNev;
	private JTextField tfAr;
	private JTextField tfRaktarMennyiseg;
	private JComboBox cbAllapot;
	

	/**
	 * Create the frame.
	 */
	public termekModositTorol(Termekek MainWindow, int id) {
		setTitle("Term\u00E9k m\u00F3dos\u00EDt \u00E9s t\u00F6r\u00F6l - ID: " + id);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 555, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeltarszam = new JLabel("Lelt\u00E1rsz\u00E1m:");
		lblLeltarszam.setHorizontalAlignment(SwingConstants.LEFT);
		lblLeltarszam.setBounds(42, 45, 74, 33);
		contentPane.add(lblLeltarszam);
		
		JLabel lblNev = new JLabel("N\u00E9v:");
		lblNev.setHorizontalAlignment(SwingConstants.LEFT);
		lblNev.setBounds(42, 108, 74, 33);
		contentPane.add(lblNev);
		
		JLabel lblAr = new JLabel("\u00C1r:");
		lblAr.setHorizontalAlignment(SwingConstants.LEFT);
		lblAr.setBounds(42, 172, 74, 33);
		contentPane.add(lblAr);
		
		JLabel lblRaktarMennyiseg = new JLabel("Rakt\u00E1rmennyis\u00E9g:");
		lblRaktarMennyiseg.setHorizontalAlignment(SwingConstants.LEFT);
		lblRaktarMennyiseg.setBounds(42, 236, 117, 33);
		contentPane.add(lblRaktarMennyiseg);
		
		JLabel lblAllapot = new JLabel("\u00C1llapot:");
		lblAllapot.setHorizontalAlignment(SwingConstants.LEFT);
		lblAllapot.setBounds(42, 300, 74, 33);
		contentPane.add(lblAllapot);
		
		tfLeltarSzam = new JTextField();
		tfLeltarSzam.setHorizontalAlignment(SwingConstants.CENTER);
		tfLeltarSzam.setBounds(175, 50, 201, 28);
		contentPane.add(tfLeltarSzam);
		tfLeltarSzam.setColumns(10);
		
		tfNev = new JTextField();
		tfNev.setHorizontalAlignment(SwingConstants.CENTER);
		tfNev.setColumns(10);
		tfNev.setBounds(175, 113, 201, 28);
		contentPane.add(tfNev);
		
		tfAr = new JTextField();
		tfAr.setHorizontalAlignment(SwingConstants.CENTER);
		tfAr.setColumns(10);
		tfAr.setBounds(175, 177, 201, 28);
		contentPane.add(tfAr);
		
		tfRaktarMennyiseg = new JTextField();
		tfRaktarMennyiseg.setHorizontalAlignment(SwingConstants.CENTER);
		tfRaktarMennyiseg.setColumns(10);
		tfRaktarMennyiseg.setBounds(175, 238, 201, 28);
		contentPane.add(tfRaktarMennyiseg);
		
		cbAllapot = new JComboBox();
		cbAllapot.setModel(new DefaultComboBoxModel(new String[] {"inakt\u00EDv", "akt\u00EDv"}));
		cbAllapot.setBounds(173, 305, 154, 28);
		contentPane.add(cbAllapot);
		
		JButton btnTorol = new JButton("T\u00D6R\u00D6L");
		btnTorol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "DELETE FROM termekek WHERE id = '"+id+"';";
				try {
					stm.executeUpdate(sql);
					MainWindow.refresh();
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnTorol.setBackground(Color.RED);
		btnTorol.setBounds(42, 365, 109, 33);
		contentPane.add(btnTorol);
		
		JButton btnModosit = new JButton("M\u00F3dos\u00EDt");
		btnModosit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "UPDATE termekek SET "
						+ "leltar_szam = '"+tfLeltarSzam.getText()+"',"
						+ "nev = '"+tfNev.getText()+"',"
						+ "ar = '"+tfAr.getText()+"',"
						+ "raktar_mennyiseg = '"+tfRaktarMennyiseg.getText()+"',"
						+ "allapot = '"+cbAllapot.getSelectedIndex()+"'"
								+ "where id = '"+id+"';";
				try {
					stm.executeUpdate(sql);
					MainWindow.refresh();
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
						
				
			}
		});
		btnModosit.setBackground(SystemColor.activeCaption);
		btnModosit.setBounds(235, 365, 109, 33);
		contentPane.add(btnModosit);
		
		JButton btnBezar = new JButton("BEZ\u00C1R");
		btnBezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBezar.setBackground(Color.YELLOW);
		btnBezar.setBounds(395, 399, 109, 33);
		contentPane.add(btnBezar);
		
		setVisible(true);
		adatokBetoltIdAlapjan(id);
		
	}
	
	public void adatokBetoltIdAlapjan(int id) {
			
		try {
			stm = con.createStatement();
			String sql = "SELECT * from termekek WHERE id ='"+id+"';";
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				
				//ui. komponensek feltöltése
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
