package progTetelekAblakosan;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.Random;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class ProgTetelek {

	private JFrame frameProgTetelek;
	private JButton btnOsszeg;
	@SuppressWarnings("rawtypes")
	private JList listVelSzamok;
	private JButton btnAtlag;
	private JButton btnHarommalOszthato;
	private JButton btnLegkisebb;
	private JButton btnLegnagyobb;
	private JButton btnRendezNovekvo;
	private JButton btnKilep;
	private JButton btnRendezCsokkeno;
	private JLabel lblAtlagEredmeny;
	private JButton btnVelSzamokGeneral;
	ArrayList<Integer> velSzamok = new ArrayList<Integer>();
	DefaultListModel<Integer> listModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgTetelek window = new ProgTetelek();
					window.frameProgTetelek.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProgTetelek() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("rawtypes")
	private void initialize() {
		frameProgTetelek = new JFrame();
		frameProgTetelek.setTitle("Progt\u00E9telek Stream API");
		frameProgTetelek.setBounds(100, 100, 905, 531);
		frameProgTetelek.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameProgTetelek.getContentPane().setLayout(null);
		
		listVelSzamok = new JList();
		listVelSzamok.setBounds(35, 23, 128, 435);
		frameProgTetelek.getContentPane().add(listVelSzamok);
		
		btnVelSzamokGeneral = new JButton("V\u00E9letlen sz\u00E1m gener\u00E1l\u00E1s");
		btnVelSzamokGeneral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1. lépés: listafeltöltés és megjelenítés
				listaFeltolt();
				
				//2. lépés: gombok engedélyezése és tiltása
				btnVelSzamokGeneral.setEnabled(false);
				
				btnOsszeg.setEnabled(true);
				btnAtlag.setEnabled(true);
				btnLegkisebb.setEnabled(true);
				btnLegnagyobb.setEnabled(true);
				btnRendezCsokkeno.setEnabled(true);
				btnRendezNovekvo.setEnabled(true);
				btnHarommalOszthato.setEnabled(true);
				
				
			}

			
		});
		
		btnVelSzamokGeneral.setFont(new Font("Arial", Font.PLAIN, 16));
		btnVelSzamokGeneral.setBounds(187, 33, 240, 44);
		frameProgTetelek.getContentPane().add(btnVelSzamokGeneral);
		
		btnOsszeg = new JButton("\u00D6sszeg");
		btnOsszeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String eredmeny = listaOsszegMeghataroz(velSzamok).toString();

				JOptionPane.showMessageDialog(
						frameProgTetelek, 
						"A lista összege: "+eredmeny, 
						"Összeg", 
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnOsszeg.setEnabled(false);
		btnOsszeg.setFont(new Font("Arial", Font.PLAIN, 16));
		btnOsszeg.setBounds(187, 104, 240, 44);
		frameProgTetelek.getContentPane().add(btnOsszeg);
		
		btnAtlag = new JButton("\u00C1tlag");
		btnAtlag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAtlagEredmeny.setVisible(true);
				//lblAtlagEredmeny.setText("Átlag értéke: " + listaAtlagMeghataroz(velSzamok));
				lblAtlagEredmeny.setText("Átlag értéke: " + listaAtlagMeghataroz2(velSzamok).getAsDouble());
			}
		});
		btnAtlag.setEnabled(false);
		
		
		btnAtlag.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAtlag.setBounds(187, 179, 240, 44);
		frameProgTetelek.getContentPane().add(btnAtlag);
		
		btnLegkisebb = new JButton("Legkisebb \u00E9rt\u00E9k/index");
		btnLegkisebb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//legkisebb értékû elem és indexe
				String eredmeny = "érték: "+listaLegkisebbErtekMeghataroz(velSzamok) +
						", index: " +listaLegkisebbErtekuElemIndexMeghataroz(velSzamok);
				
				JOptionPane.showMessageDialog(
						frameProgTetelek, 
						"A lista legkisebb eleme: "+eredmeny, 
						"Legkisebb érték/index", 
						JOptionPane.PLAIN_MESSAGE);
				
			}
		});
		btnLegkisebb.setEnabled(false);
		btnLegkisebb.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLegkisebb.setBounds(187, 337, 240, 44);
		frameProgTetelek.getContentPane().add(btnLegkisebb);
		
		btnLegnagyobb = new JButton("Legnagyobb \u00E9rt\u00E9k/index");
		btnLegnagyobb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eredmeny = "érték: "+listaNagyobbErtekMeghataroz(velSzamok) +
						", index: " +listaNagyobbErtekuElemIndexMeghataroz(velSzamok);
				
				JOptionPane.showMessageDialog(
						frameProgTetelek, 
						"A lista legkisebb eleme: "+eredmeny, 
						"Legkisebb érték/index", 
						JOptionPane.PLAIN_MESSAGE);
				
			}
		});
	
			
		btnLegnagyobb.setEnabled(false);
		btnLegnagyobb.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLegnagyobb.setBounds(187, 394, 240, 44);
		frameProgTetelek.getContentPane().add(btnLegnagyobb);
		
		btnRendezNovekvo = new JButton("Rendez\u00E9s n\u00F6vekv\u0151");
		btnRendezNovekvo.setEnabled(false);
		btnRendezNovekvo.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				rendezNovekvo(velSzamok);
				listModel = new DefaultListModel<Integer>();
				for (Integer item : velSzamok) {
					listModel.addElement(item);
					
				}
				listVelSzamok.setModel(listModel);
			}
		});
		btnRendezNovekvo.setFont(new Font("Arial", Font.PLAIN, 16));
		btnRendezNovekvo.setBounds(556, 33, 240, 44);
		frameProgTetelek.getContentPane().add(btnRendezNovekvo);
		
		btnRendezCsokkeno = new JButton("Rendez\u00E9s cs\u00F6kken\u0151");
		btnRendezCsokkeno.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				rendezCsokkeno(velSzamok);
				listModel = new DefaultListModel<Integer>();
				for (Integer item : velSzamok) {
					listModel.addElement(item);
				}
				listVelSzamok.setModel(listModel);
			}
		});
		btnRendezCsokkeno.setEnabled(false);
		btnRendezCsokkeno.setFont(new Font("Arial", Font.PLAIN, 16));
		btnRendezCsokkeno.setBounds(556, 104, 240, 44);
		frameProgTetelek.getContentPane().add(btnRendezCsokkeno);
		
		btnHarommalOszthato = new JButton("H\u00E1rommal oszthat\u00F3 sz\u00E1mok db");
		btnHarommalOszthato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

					String eredmeny = harommalOszthatoMegszamol(velSzamok).toString();

					JOptionPane.showMessageDialog(
							frameProgTetelek, 
							"Hárommal osztható darabszáma: "+eredmeny, 
							"Hárommal maradék nélkül osztható", 
							JOptionPane.PLAIN_MESSAGE);
				
				
			}
		});
		btnHarommalOszthato.setEnabled(false);
	
		btnHarommalOszthato.setFont(new Font("Arial", Font.PLAIN, 16));
		btnHarommalOszthato.setBounds(556, 179, 240, 44);
		frameProgTetelek.getContentPane().add(btnHarommalOszthato);
		
		btnKilep = new JButton("KIL\u00C9P");
		btnKilep.setForeground(Color.WHITE);
		btnKilep.setBackground(Color.RED);
		btnKilep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnKilep.setBounds(739, 406, 113, 44);
				frameProgTetelek.getContentPane().add(btnKilep);
		
		lblAtlagEredmeny = new JLabel("\u00C1tlag");
		lblAtlagEredmeny.setVisible(false);
		lblAtlagEredmeny.setBackground(new Color(154, 205, 50));
		lblAtlagEredmeny.setOpaque(true);
		lblAtlagEredmeny.setFont(new Font("Arial", Font.PLAIN, 14));
		lblAtlagEredmeny.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtlagEredmeny.setBounds(187, 257, 240, 44);
		frameProgTetelek.getContentPane().add(lblAtlagEredmeny);
		
	}
	
	@SuppressWarnings("unchecked")
	private void listaFeltolt() {
		
		Random r = new Random();
		
		//1. ArrayList feltöltése 20 db véletlen számmal (1-100)
		for (int i = 0; i < 20; i++) {
			int veletlenSzam = r.nextInt(100)+1;
			velSzamok.add(veletlenSzam);
		}
		
		//2. List model létrehozása és feltöltése az ArrayListbõl
		listModel = new DefaultListModel<Integer>();
		for (Integer item : velSzamok) {
			listModel.addElement(item);
		}
		
		//3. Hozzárendeljük a feltöltött modelt a JList ui komponenshez
		
		listVelSzamok.setModel(listModel);
		
		
	}
	
	private Integer listaOsszegMeghataroz (ArrayList<Integer> lista) {
		//1. módszer:
		/*
		Integer osszeg = 0;
		for (Integer item : lista) {
			osszeg+=item;
			
		}
		return osszeg;
		*/
		
		//2. módszer Stream API
		return lista.stream().mapToInt(x->x.intValue()).sum();
		
	}
	
	@SuppressWarnings("unused")
	private Double listaAtlagMeghataroz (ArrayList<Integer> lista) {
		
		//eddig tanultak alapján
		Double atlag = (double)listaOsszegMeghataroz(lista)/lista.size();
		return atlag;
		
		
	}
	
	//átlag stream apival
	private OptionalDouble listaAtlagMeghataroz2 (ArrayList<Integer> lista) {
			
			//eddig tanultak alapján
			OptionalDouble atlag = lista.stream().mapToDouble(f->f.intValue()).average();
			return atlag;

	}
	
	private Integer listaLegkisebbErtekMeghataroz (ArrayList<Integer> lista) {
		return lista.stream().mapToInt(x->x.intValue()).min().getAsInt();
		
		
	}
	
	private Integer listaLegkisebbErtekuElemIndexMeghataroz(ArrayList<Integer> lista) {
		return lista.indexOf(listaLegkisebbErtekMeghataroz(lista));
	}
	
	private Integer listaNagyobbErtekMeghataroz (ArrayList<Integer> lista) {
		return lista.stream().mapToInt(x->x.intValue()).max().getAsInt();
		
		
	}
	
	private Integer listaNagyobbErtekuElemIndexMeghataroz(ArrayList<Integer> lista) {
		return lista.indexOf(listaNagyobbErtekMeghataroz(lista));
	}
	
	private void rendezNovekvo(ArrayList<Integer> lista) {
		Collections.sort(lista);
	}
	
	private void rendezCsokkeno(ArrayList<Integer> lista) {
		Collections.sort(lista, Collections.reverseOrder());
	}
	
	private Integer harommalOszthatoMegszamol (ArrayList<Integer> lista) {
		return (int)lista.stream().filter(i->i%3==0).count();
	}


}
