package termekCRUD;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class UjTermek extends JFrame {

	private JPanel contentPane;
	private JTextField tfLeltarSzam;
	private JTextField tfNev;
	private JTextField tfAr;
	private JTextField tfRaktarMennyiseg;


	/**
	 * Create the frame.
	 */
	public UjTermek(Termekek MainWindow) {
		setTitle("\u00DAj term\u00E9k felvitel");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 680, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeltarSzam = new JLabel("Lelt\u00E1rsz\u00E1m:");
		lblLeltarSzam.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeltarSzam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLeltarSzam.setBounds(52, 57, 126, 43);
		contentPane.add(lblLeltarSzam);
		
		JLabel lblNev = new JLabel("N\u00E9v:");
		lblNev.setHorizontalAlignment(SwingConstants.CENTER);
		lblNev.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNev.setBounds(52, 133, 126, 43);
		contentPane.add(lblNev);
		
		JLabel lblAr = new JLabel("\u00C1r:");
		lblAr.setHorizontalAlignment(SwingConstants.CENTER);
		lblAr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAr.setBounds(52, 221, 126, 43);
		contentPane.add(lblAr);
		
		JLabel lblRaktarMennyiseg = new JLabel("Rakt\u00E1rmennyis\u00E9g:");
		lblRaktarMennyiseg.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaktarMennyiseg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRaktarMennyiseg.setBounds(52, 310, 126, 43);
		contentPane.add(lblRaktarMennyiseg);
		
		JLabel lblAllapot = new JLabel("\u00C1llapot:");
		lblAllapot.setHorizontalAlignment(SwingConstants.CENTER);
		lblAllapot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAllapot.setBounds(52, 386, 126, 43);
		contentPane.add(lblAllapot);
		
		tfLeltarSzam = new JTextField();
		tfLeltarSzam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfLeltarSzam.setBounds(190, 62, 350, 33);
		contentPane.add(tfLeltarSzam);
		tfLeltarSzam.setColumns(10);
		
		tfNev = new JTextField();
		tfNev.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNev.setColumns(10);
		tfNev.setBounds(190, 138, 350, 33);
		contentPane.add(tfNev);
		
		tfAr = new JTextField();
		tfAr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfAr.setColumns(10);
		tfAr.setBounds(190, 226, 350, 33);
		contentPane.add(tfAr);
		
		tfRaktarMennyiseg = new JTextField();
		tfRaktarMennyiseg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfRaktarMennyiseg.setColumns(10);
		tfRaktarMennyiseg.setBounds(190, 315, 350, 33);
		contentPane.add(tfRaktarMennyiseg);
		
		JComboBox cbAllapot = new JComboBox();
		cbAllapot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbAllapot.setModel(new DefaultComboBoxModel(new String[] {"inakt\u00EDv", "akt\u00EDv"}));
		cbAllapot.setBounds(190, 391, 194, 32);
		contentPane.add(cbAllapot);
		
		JButton btnMent = new JButton("MENT");
		btnMent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Adatmázis MENTÉS
				Connection con = new Db().getCon();
				String sql = "INSERT INTO termekek (leltar_szam, nev, ar, raktar_mennyiseg, allapot) "
						+ "VALUES (?,?,?,?,?);";
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1,  tfLeltarSzam.getText());
					ps.setString(2,  tfNev.getText());
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
		btnMent.setBounds(484, 404, 126, 55);
		contentPane.add(btnMent);
		
		JButton btnNewButton = new JButton("BEZ\u00C1R");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(532, 522, 118, 42);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
		setVisible(true);
		
	}

}
