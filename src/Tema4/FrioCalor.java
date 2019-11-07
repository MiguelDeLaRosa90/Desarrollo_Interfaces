package Tema4;

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
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

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
		mntmNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				OpenCHM.open("Tema4/Manual_Frio_Caliente.chm");
			}
		});
		mntmNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnInicio.add(mntmNuevo);
		
		
		
		JMenu mnAbrir = new JMenu("Abrir");
		mnInicio.add(mnAbrir);
		
		JMenuItem mntmJuego = new JMenuItem(" Juego");
		mntmJuego.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_MASK));
		mnAbrir.add(mntmJuego);
		
		JMenuItem mntmReiniciar = new JMenuItem("Reiniciar");
		mntmReiniciar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
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
