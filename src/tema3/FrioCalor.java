package tema3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrioCalor extends JFrame {

	private JPanel contentPane;
	private tf_Frio_Calor textField;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrioCalor frame = new FrioCalor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrioCalor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("NumeroDeLaSuerte");
		menuBar.add(mnInicio);
		
		JMenuItem mntmNuevo = new JMenuItem("Ayuda");
		mnInicio.add(mntmNuevo);
		
		JMenu mnAbrir = new JMenu("Abrir");
		mnInicio.add(mnAbrir);
		
		JMenuItem mntmJuego = new JMenuItem(" Juego");
		mnAbrir.add(mntmJuego);
		
		JMenuItem mntmReiniciar = new JMenuItem("Reiniciar");
		mntmReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.reiniciar();
			}
			
		});
		mnInicio.add(mntmReiniciar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new tf_Frio_Calor();
		textField.setBounds(186, 109, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
