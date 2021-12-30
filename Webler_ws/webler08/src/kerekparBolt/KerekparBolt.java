package kerekparBolt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class KerekparBolt {

	private List<Kerekpar> kerekparLista =  new ArrayList<Kerekpar>();
	private JFrame frmKerekeparbolt;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnLegolcsobbHasznaltMTB;
	private JButton btnGyerekKerkeparokSzama;
	private JButton btnTrekkingFrerfiFajlbaIr;
	private JButton btnFajlbeolvas;
	private JButton btnHibasAdatTorlese;
	private JButton btnKilep;
	private JLabel lblGyerekKerekparokSzama;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KerekparBolt window = new KerekparBolt();
					window.frmKerekeparbolt.setVisible(true);
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
		frmKerekeparbolt = new JFrame();
		frmKerekeparbolt.setTitle("Ker\u00E9kp\u00E1rbolt");
		frmKerekeparbolt.setBounds(100, 100, 1111, 648);
		frmKerekeparbolt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKerekeparbolt.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 27, 1001, 280);
		frmKerekeparbolt.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setRowHeaderView(scrollPane_1);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnLegolcsobbHasznaltMTB = new JButton("Legolcs\u00F3bb haszn\u00E1lt MTB");
		btnLegolcsobbHasznaltMTB.setEnabled(false);
		btnLegolcsobbHasznaltMTB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLegolcsobbHasznaltMTB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Kerekpar legolcsobbHasznaltMTB = kerekparLista.stream()
						.filter(c->c.getTipus().equals("mtb"))
						.filter(x->x.getHasznalt() == true)
						.min(Comparator.comparing(Kerekpar::getAr))
						.orElseThrow(NoSuchElementException::new);
				
				//Hf: hagyományos módon megoldani
				JOptionPane.showMessageDialog(frmKerekeparbolt,
						"Legolcsóbb használt mtb neve és ára: " +
						legolcsobbHasznaltMTB.getNev() + " / " + legolcsobbHasznaltMTB.getAr(),
						"Legolcsóbb használt MTB és ára",
						JOptionPane.PLAIN_MESSAGE
						
						);
			}
		});
		btnLegolcsobbHasznaltMTB.setBounds(61, 349, 270, 55);
		frmKerekeparbolt.getContentPane().add(btnLegolcsobbHasznaltMTB);
		
		btnGyerekKerkeparokSzama = new JButton("Gyerek ker\u00E9kp\u00E1rok sz\u00E1ma");
		btnGyerekKerkeparokSzama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer dbGyerekKerekparokSzam = 0;
				for (Kerekpar item : kerekparLista) {
					if (item.getKategoriaId() == 3) {
						dbGyerekKerekparokSzam++;
					}
				}
				lblGyerekKerekparokSzama.setText(dbGyerekKerekparokSzam.toString());
				lblGyerekKerekparokSzama.setVisible(true);
			}
		});
		btnGyerekKerkeparokSzama.setEnabled(false);
		btnGyerekKerkeparokSzama.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGyerekKerkeparokSzama.setBounds(61, 444, 270, 55);
		frmKerekeparbolt.getContentPane().add(btnGyerekKerkeparokSzama);
		
		btnTrekkingFrerfiFajlbaIr = new JButton("Trekking - f\u00E9rfi ker\u00E9kp\u00E1r");
		btnTrekkingFrerfiFajlbaIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FajlKezelo fkObj = new FajlKezelo();
				fkObj.trekkingFerfiKerekparFajbaIr(kerekparLista);
				
				JOptionPane.showMessageDialog(frmKerekeparbolt, "Létrejött a trekking_ferfi.csv fájl!",
						"Sikeresen létrejött a fájl",
						JOptionPane.PLAIN_MESSAGE);
				
			}
		});
		btnTrekkingFrerfiFajlbaIr.setEnabled(false);
		btnTrekkingFrerfiFajlbaIr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTrekkingFrerfiFajlbaIr.setBounds(61, 533, 270, 55);
		frmKerekeparbolt.getContentPane().add(btnTrekkingFrerfiFajlbaIr);
		
		btnFajlbeolvas = new JButton("F\u00E1jlbeolvas");
		btnFajlbeolvas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FajlKezelo fkObj = new FajlKezelo();
				
				kerekparLista = fkObj.fajlBeolvas("kerekparok.csv");
				
				DefaultTableModel model = new DefaultTableModel(
						new Object[] {
								"Cikszám",
								"Név",
								"Típus",
								"Ár (ft)",
								"Használt",
								"Kategória",
								"Rögzítés dátuma"}, 0);
						for (Kerekpar item : kerekparLista) {
							model.addRow(new Object[] {
									item.getCikkszam(),
									item.getNev(),
									item.getTipus(),
									item.getAr(),
									item.getHasznaltSzovegesen(),
									item.getKategoriaSzoveg(),
									item.getRogzitesDatumaFormazottan()
									});
						}
						table.setModel(model);
						
						  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
						
						centerRenderer.setHorizontalAlignment(JLabel.CENTER);
						for (int i = 0; i < model.getColumnCount(); i++) {
							table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
						}
						
						btnHibasAdatTorlese.setEnabled(true);
						btnFajlbeolvas.setEnabled(false);
						
			}
		});
		btnFajlbeolvas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFajlbeolvas.setBounds(716, 349, 270, 55);
		frmKerekeparbolt.getContentPane().add(btnFajlbeolvas);
		
		btnHibasAdatTorlese = new JButton("Hib\u00E1s adat t\u00F6rl\u00E9se");
		btnHibasAdatTorlese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int hibasIndex = -1;
				for (int i = 0; i < kerekparLista.size(); i++) {
					if (kerekparLista.get(i).getCikkszam().toString().length() != 6) {
				
						hibasIndex = i;			
						
					}
				}
				
				
				
				kerekparLista.remove(hibasIndex);
				
				((DefaultTableModel)table.getModel()).removeRow(hibasIndex);
				
				btnHibasAdatTorlese.setEnabled(false);
				
				btnLegolcsobbHasznaltMTB.setEnabled(true);
				btnGyerekKerkeparokSzama.setEnabled(true);
				btnTrekkingFrerfiFajlbaIr.setEnabled(true);
				
			}
		});
		btnHibasAdatTorlese.setEnabled(false);
		btnHibasAdatTorlese.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHibasAdatTorlese.setBounds(716, 444, 270, 55);
		frmKerekeparbolt.getContentPane().add(btnHibasAdatTorlese);
		
		btnKilep = new JButton("KIL\u00C9P\u00C9S");
		btnKilep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		btnKilep.setBackground(Color.RED);
		btnKilep.setForeground(Color.WHITE);
		btnKilep.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnKilep.setBounds(928, 550, 126, 38);
		frmKerekeparbolt.getContentPane().add(btnKilep);
		
		lblGyerekKerekparokSzama = new JLabel("New label");
		lblGyerekKerekparokSzama.setVisible(false);
		lblGyerekKerekparokSzama.setHorizontalAlignment(SwingConstants.CENTER);
		lblGyerekKerekparokSzama.setBackground(new Color(50, 205, 50));
		lblGyerekKerekparokSzama.setOpaque(true);
		lblGyerekKerekparokSzama.setBounds(368, 445, 206, 55);
		frmKerekeparbolt.getContentPane().add(lblGyerekKerekparokSzama);
		
	}
}
