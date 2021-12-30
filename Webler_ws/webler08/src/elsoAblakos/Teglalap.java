package elsoAblakos;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teglalap {

	private JFrame frameTeglalap;
	private JTextField tfAOldal;
	private JTextField tfBOldal;
	private JLabel lblEredmeny;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teglalap window = new Teglalap();
					window.frameTeglalap.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Teglalap() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameTeglalap = new JFrame();
		frameTeglalap.setTitle("T\u00E9glalap ker\u00FClet, ter\u00FClet");
		frameTeglalap.setBounds(100, 100, 998, 667);
		frameTeglalap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTeglalap.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(212, 99, 544, 404);
		frameTeglalap.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAOldal = new JLabel("A oldal");
		lblAOldal.setBounds(65, 78, 56, 16);
		panel.add(lblAOldal);
		
		JLabel lblBOldal = new JLabel("B oldal");
		lblBOldal.setBounds(65, 140, 56, 16);
		panel.add(lblBOldal);
		
		tfAOldal = new JTextField();
		tfAOldal.setHorizontalAlignment(SwingConstants.CENTER);
		tfAOldal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfAOldal.setBounds(175, 68, 196, 34);
		panel.add(tfAOldal);
		tfAOldal.setColumns(10);
		
		tfBOldal = new JTextField();
		tfBOldal.setHorizontalAlignment(SwingConstants.CENTER);
		tfBOldal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfBOldal.setColumns(10);
		tfBOldal.setBounds(175, 130, 196, 34);
		panel.add(tfBOldal);
		
		JButton btnSzamitas = new JButton("SZ\u00C1M\u00CDT\u00C1S");
		btnSzamitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				try {
					
					Integer a = Integer.parseInt(tfAOldal.getText());
					Integer b = Integer.parseInt(tfBOldal.getText());
					Integer ker = (a + b) * 2;
					Integer ter = a * b;
					lblEredmeny.setText("Kerület: " + ker.toString() + ", terület: " + ter.toString());
					
				} catch (NumberFormatException e1) {
					lblEredmeny.setText("Hibás adatot adott meg.");
					
				}
				
			}
			
		});
		btnSzamitas.setForeground(Color.WHITE);
		btnSzamitas.setBackground(SystemColor.activeCaption);
		btnSzamitas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSzamitas.setBounds(175, 192, 196, 48);
		panel.add(btnSzamitas);
		
		lblEredmeny = new JLabel("");
		lblEredmeny.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEredmeny.setHorizontalAlignment(SwingConstants.CENTER);
		lblEredmeny.setBounds(114, 286, 308, 83);
		panel.add(lblEredmeny);
		
		JButton btnKilep = new JButton("KIL\u00C9P");
		btnKilep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
		btnKilep.setForeground(Color.WHITE);
		btnKilep.setBackground(Color.RED);
		btnKilep.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnKilep.setBounds(833, 558, 118, 49);
		frameTeglalap.getContentPane().add(btnKilep);
	}
}
