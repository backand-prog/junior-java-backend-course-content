package elsoAblakos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Events {

	private JFrame frameEvents;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Events window = new Events();
					window.frameEvents.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Events() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameEvents = new JFrame();
		frameEvents.setTitle("Eg\u00E9r esem\u00E9nyek");
		frameEvents.setBounds(100, 100, 973, 627);
		frameEvents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameEvents.getContentPane().setLayout(null);
		
		JLabel lblEgerFolotte = new JLabel("Eg\u00E9r f\u00F6l\u00F6tte");
		lblEgerFolotte.setHorizontalAlignment(SwingConstants.CENTER);
		lblEgerFolotte.setOpaque(true);
		lblEgerFolotte.setBackground(Color.RED);
		lblEgerFolotte.setBounds(12, 13, 126, 536);
		frameEvents.getContentPane().add(lblEgerFolotte);
		
		lblEgerFolotte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblEgerFolotte.setText("Egér belépett...");
				lblEgerFolotte.setBackground(Color.BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblEgerFolotte.setText("Egér kilépett...");
				lblEgerFolotte.setBackground(Color.PINK);
			}
			
			
		});
		
		
	}

}
