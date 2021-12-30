package termekek;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;

public class UjTermek extends JFrame {

	private JPanel contentPane;
	private JTextField tfLeltarSzam;
	private JTextField tfNev;
	private JTextField tfAr;
	private JTextField tfRaktarMennyiseg;
	JButton btnKilep;


	/**
	 * Create the frame.
	 */
	public UjTermek(Termekek MainWindow) {
		setTitle("\u00DAj term\u00E9k felvitel");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 479, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeltarSzam = new JLabel("Lelt\u00E1rsz\u00E1m: ");
		lblLeltarSzam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLeltarSzam.setBounds(30, 38, 87, 34);
		contentPane.add(lblLeltarSzam);
		
		JLabel lblNev = new JLabel("N\u00E9v:");
		lblNev.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNev.setBounds(30, 101, 87, 34);
		contentPane.add(lblNev);
		
		JLabel lblAr = new JLabel("\u00C1r:");
		lblAr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAr.setBounds(30, 168, 87, 34);
		contentPane.add(lblAr);
		
		JLabel lblRaktarMennyiseg = new JLabel("Rakt\u00E1rmennyis\u00E9g:");
		lblRaktarMennyiseg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRaktarMennyiseg.setBounds(30, 224, 117, 39);
		contentPane.add(lblRaktarMennyiseg);
		
		JLabel lblAllapot = new JLabel("\u00C1llapot:");
		lblAllapot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAllapot.setBounds(30, 290, 87, 34);
		contentPane.add(lblAllapot);
		
		tfLeltarSzam = new JTextField();
		tfLeltarSzam.setBounds(185, 43, 242, 27);
		contentPane.add(tfLeltarSzam);
		tfLeltarSzam.setColumns(10);
		
		tfNev = new JTextField();
		tfNev.setColumns(10);
		tfNev.setBounds(185, 108, 242, 27);
		contentPane.add(tfNev);
		
		tfAr = new JTextField();
		tfAr.setColumns(10);
		tfAr.setBounds(185, 175, 242, 27);
		contentPane.add(tfAr);
		
		tfRaktarMennyiseg = new JTextField();
		tfRaktarMennyiseg.setColumns(10);
		tfRaktarMennyiseg.setBounds(185, 233, 242, 27);
		contentPane.add(tfRaktarMennyiseg);
		
		JComboBox cbAllapot = new JComboBox();
		cbAllapot.setModel(new DefaultComboBoxModel(new String[] {"inakt\u00EDv", "akt\u00EDv"}));
		cbAllapot.setBounds(185, 297, 152, 27);
		contentPane.add(cbAllapot);
		
		JButton btnMent = new JButton("MENT");
		btnMent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = new Db().getCon();
				String sql = "INSERT INTO termekek"
						+ " (leltar_szam, nev, ar, raktar_mennyiseg, allapot) VALUES "
						+ " (?,?,?,?,?);";
			
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, tfLeltarSzam.getText());
					ps.setString(2, tfNev.getText());
					ps.setString(3, tfAr.getText());
					ps.setString(4, tfRaktarMennyiseg.getText());
					ps.setInt(5, cbAllapot.getSelectedIndex());
					ps.execute();
					
					MainWindow.refresh();
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnMent.setBackground(SystemColor.activeCaption);
		btnMent.setBounds(261, 337, 122, 34);
		contentPane.add(btnMent);
		
		btnKilep = new JButton("KIL\u00C9P");
		btnKilep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnKilep.setBackground(new Color(255, 255, 0));
		btnKilep.setForeground(new Color(0, 0, 0));
		btnKilep.setBounds(305, 384, 144, 39);
		contentPane.add(btnKilep);
		
		setVisible(true);
		
	}
}
