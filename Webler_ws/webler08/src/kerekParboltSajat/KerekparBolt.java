package kerekParboltSajat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;

public class KerekparBolt {

	private JFrame frame;
	private JButton btnLegolcsobb;
	private JButton btnGyerekKerekparDb;
	private JButton btnTrekkingFerfiFajlbaIr;
	private JButton btnKilep;
	private JButton btnHibasAdatTorol;
	private JButton btnFajlBeolvasas;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KerekparBolt window = new KerekparBolt();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KerekparBolt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 868, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnLegolcsobb = new JButton("Legolcs\u00F3bb haszn\u00E1lt MTB");
		btnLegolcsobb.setEnabled(false);
		
		
		btnLegolcsobb.setBounds(62, 299, 244, 47);
		frame.getContentPane().add(btnLegolcsobb);
		
		btnGyerekKerekparDb = new JButton("Legolcs\u00F3bb haszn\u00E1lt MTB");
		btnGyerekKerekparDb.setEnabled(false);
		btnGyerekKerekparDb.setBounds(62, 377, 244, 47);
		frame.getContentPane().add(btnGyerekKerekparDb);
		
		btnTrekkingFerfiFajlbaIr = new JButton("Legolcs\u00F3bb haszn\u00E1lt MTB");
		btnTrekkingFerfiFajlbaIr.setEnabled(false);
		btnTrekkingFerfiFajlbaIr.setBounds(62, 449, 244, 47);
		frame.getContentPane().add(btnTrekkingFerfiFajlbaIr);
		
		btnKilep = new JButton("KIL\u00C9P");
		btnKilep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnKilep.setForeground(Color.WHITE);
		btnKilep.setBackground(Color.RED);
		btnKilep.setBounds(653, 476, 136, 55);
		frame.getContentPane().add(btnKilep);
		
		btnFajlBeolvasas = new JButton("F\u00E1jlbeolvas\u00E1s");
		btnFajlBeolvasas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFajlBeolvasas.setEnabled(false);
				btnHibasAdatTorol.setEnabled(true);
				
			}
			
		});

		btnFajlBeolvasas.setBounds(582, 299, 179, 47);
		frame.getContentPane().add(btnFajlBeolvasas);
		
		btnHibasAdatTorol = new JButton("Hib\u00E1s adat t\u00F6rl\u00E9se");
		btnHibasAdatTorol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLegolcsobb.setEnabled(true);
				btnGyerekKerekparDb.setEnabled(true);
				btnTrekkingFerfiFajlbaIr.setEnabled(true);
			}
		});
		btnHibasAdatTorol.setEnabled(false);
		btnHibasAdatTorol.setBounds(582, 366, 179, 47);
		frame.getContentPane().add(btnHibasAdatTorol);
		
		JLabel lblGyerekKerekparDb = new JLabel("");
		lblGyerekKerekparDb.setVisible(false);
		lblGyerekKerekparDb.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGyerekKerekparDb.setBackground(new Color(0, 128, 0));
		lblGyerekKerekparDb.setRequestFocusEnabled(false);
		lblGyerekKerekparDb.setOpaque(true);
		lblGyerekKerekparDb.setForeground(new Color(0, 0, 0));
		lblGyerekKerekparDb.setHorizontalAlignment(SwingConstants.CENTER);
		lblGyerekKerekparDb.setBounds(338, 377, 167, 47);
		frame.getContentPane().add(lblGyerekKerekparDb);
		
		table = new JTable();
		table.setBounds(62, 47, 702, 222);
		frame.getContentPane().add(table);
		
	}
}
