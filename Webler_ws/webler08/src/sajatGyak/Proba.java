package sajatGyak;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;


public class Proba {

	private JFrame frame;
	private JLabel lblUdvozles;
	private JButton btnNyomjRam;
	private JButton btnUjLabel;
	private JLabel lblListaVelSzam;
	private JButton btnListaGeneral;
	private ArrayList<Integer> lista = new ArrayList<Integer>();
	private DefaultListModel<Integer> listModel;
	private JList listSzamok;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proba window = new Proba();
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
	public Proba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel listPanel = new JPanel();
		listPanel.setBackground(Color.CYAN);
		listPanel.setBounds(500, 200, 500, 500);
		frame.getContentPane().add(listPanel);
		listPanel.setLayout(null);
	
		listSzamok = new JList();
		listSzamok.setBounds(300, 0, 50, 500);
		listPanel.add(listSzamok);
		
		btnListaGeneral = new JButton("Listagenerálás");
		btnListaGeneral.setBounds(100, 300, 150, 30);
		btnListaGeneral.setBackground(Color.GREEN);
		listPanel.add(btnListaGeneral);
		btnListaGeneral.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				listaFeltolt();
			}
			
		});
		
		
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent e) {
				
				btnNyomjRam.setBackground(Color.RED);
				
			}
		});
		panel.setBounds(101, 57, 340, 236);
		panel.setBackground(Color.GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblUdvozles = new JLabel("Üdvözlés");
		lblUdvozles.setBounds(0,0, 80, 20);
		panel.add(lblUdvozles);
		
		
		btnNyomjRam = new JButton("Nyomj rám");
		
		
		btnNyomjRam.setBounds(130, 128, 100, 40);
		btnNyomjRam.setBackground(Color.GREEN);
		btnNyomjRam.setForeground(Color.WHITE);
		
		btnNyomjRam.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnNyomjRam.setBounds(60, 128, 100, 40);
				
			}
		});
		panel.add(btnNyomjRam);
		
		
		
		btnUjLabel = new JButton("Új");
		btnUjLabel.setBounds(0, 100, 50, 50);
		btnUjLabel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.remove(lblUdvozles);
				
				panel.repaint();
			}
		});
		panel.add(btnUjLabel);
		
	}
	
	public void listaFeltolt () {
		Random r = new Random();
		
		
		
		for (int i = 0; i < 20; i++) {
			Integer randInt = r.nextInt(100) + 1;
			lista.add(randInt);
		}
		
		listModel = new DefaultListModel<Integer>();
		for (Integer item : lista) {
			listModel.addElement(item);
		}
		
		listSzamok.setModel(listModel);
		
	}
}
