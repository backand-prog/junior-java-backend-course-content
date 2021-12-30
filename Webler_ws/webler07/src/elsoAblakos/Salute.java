package elsoAblakos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salute {

	private JFrame frameUdvozles;
	private JTextField tfNev;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salute window = new Salute();
					window.frameUdvozles.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Salute() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameUdvozles = new JFrame();
		frameUdvozles.setTitle("\u00DCdv\u00F6zl\u00E9s");
		frameUdvozles.getContentPane().setFont(new Font("Arial", Font.PLAIN, 14));
		frameUdvozles.setBounds(500, 100, 810, 470);
		frameUdvozles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameUdvozles.getContentPane().setLayout(null);
		
		JLabel lblNev = new JLabel("K\u00E9rem adja meg a nev\u00E9t:");
		lblNev.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNev.setBounds(68, 55, 187, 37);
		frameUdvozles.getContentPane().add(lblNev);
		
		tfNev = new JTextField();
		tfNev.setHorizontalAlignment(SwingConstants.CENTER);
		tfNev.setBounds(257, 60, 391, 29);
		frameUdvozles.getContentPane().add(tfNev);
		tfNev.setColumns(10);
		
		JLabel lblUdvozles = new JLabel("");
		lblUdvozles.setFont(new Font("Arial", Font.PLAIN, 18));
		lblUdvozles.setHorizontalAlignment(SwingConstants.CENTER);
		lblUdvozles.setBounds(68, 149, 700, 67);
		frameUdvozles.getContentPane().add(lblUdvozles);
		
		JButton btnUdvozlesKiir = new JButton("\u00DCdv\u00F6zl\u00E9s");
		btnUdvozlesKiir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//gombra dupla bal klikk
				lblUdvozles.setText("Üdvözöllek, " + tfNev.getText() + "!");
				
				
				
				
			}
		});
		btnUdvozlesKiir.setFont(new Font("Arial", Font.BOLD, 14));
		btnUdvozlesKiir.setBounds(664, 55, 104, 32);
		frameUdvozles.getContentPane().add(btnUdvozlesKiir);
		
		
		

	}
}
