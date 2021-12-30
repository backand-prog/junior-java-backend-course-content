package elsoAblakos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Compontents {

	private JFrame frameComponents;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compontents window = new Compontents();
					window.frameComponents.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Compontents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frameComponents = new JFrame();
		frameComponents.setTitle("Komponensek");
		frameComponents.setBounds(100, 100, 1151, 676);
		frameComponents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameComponents.getContentPane().setLayout(null);
		
		JLabel lblCimke = new JLabel("cimke");
		lblCimke.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCimke.setBounds(85, 64, 79, 21);
		frameComponents.getContentPane().add(lblCimke);
		
		JComboBox cbGyumolcsok = new JComboBox();
		cbGyumolcsok.setModel(new DefaultComboBoxModel(new String[] {"alma", "k\u00F6rte", "szilva"}));
		cbGyumolcsok.setBounds(85, 118, 213, 30);
		frameComponents.getContentPane().add(cbGyumolcsok);
		
		JCheckBox chckbxHirlevel = new JCheckBox("H\u00EDrlev\u00E9l");
		chckbxHirlevel.setSelected(true);
		chckbxHirlevel.setBounds(376, 63, 113, 25);
		frameComponents.getContentPane().add(chckbxHirlevel);
		
		
		JButton btnGomb = new JButton("gomb");
		btnGomb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGomb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblCimke.setText(cbGyumolcsok.getSelectedIndex() + " " + cbGyumolcsok.getSelectedItem().toString());
				chckbxHirlevel.setSelected(false);
			}
		});
		btnGomb.setBounds(193, 62, 97, 25);
		frameComponents.getContentPane().add(btnGomb);
		
		JRadioButton rdbtnFerfi = new JRadioButton("F\u00E9rfi");
		rdbtnFerfi.setSelected(true);
		buttonGroup.add(rdbtnFerfi);
		rdbtnFerfi.setBounds(337, 202, 127, 25);
		frameComponents.getContentPane().add(rdbtnFerfi);
		
		JRadioButton rdbtnNo = new JRadioButton("N\u0151");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(337, 232, 127, 25);
		frameComponents.getContentPane().add(rdbtnNo);
		
		
		
		
		
	}
}
