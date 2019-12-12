package Examen2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.TextArea;
import javax.swing.JProgressBar;
import java.awt.Button;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;

public class EmisoraRadio extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldU;
	private JTextField textFieldPWD;
	private JTextField textFieldNumeros;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmisoraRadio frame = new EmisoraRadio();
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
	public EmisoraRadio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnRegistro = new JMenu("Registro");
		mnRegistro.setMnemonic('R');
		menuBar.add(mnRegistro);
		
		JMenuItem mntmRegistrar = new JMenuItem("Registrar");
		mntmRegistrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
		mnRegistro.add(mntmRegistrar);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldU.setText("");
				textFieldPWD.setText("");
				
			}
		});
		mntmBorrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
		mnRegistro.add(mntmBorrar);
		
		JMenu mnFrecuencia = new JMenu("Frecuencia");
		mnFrecuencia.setMnemonic('F');
		menuBar.add(mnFrecuencia);
		
		JMenuItem mntmIncrementar = new JMenuItem("Incrementar");
		mntmIncrementar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UP, InputEvent.SHIFT_MASK));
		mnFrecuencia.add(mntmIncrementar);
		
		JMenuItem mntmDecrementar = new JMenuItem("Decrementar");
		mntmDecrementar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, InputEvent.SHIFT_MASK));
		mnFrecuencia.add(mntmDecrementar);
		
		JMenu mnVolumen = new JMenu("Volumen");
		mnVolumen.setMnemonic('V');
		menuBar.add(mnVolumen);
		
		JMenuItem mntmAumentar = new JMenuItem("Aumentar");
		mntmAumentar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UP, InputEvent.ALT_MASK));
		mnVolumen.add(mntmAumentar);
		
		JMenuItem mntmDisminuir = new JMenuItem("Disminuir");
		mntmDisminuir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, InputEvent.ALT_MASK));
		mnVolumen.add(mntmDisminuir);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setMnemonic('H');
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mntmHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(contentPane, "Rango de frecuencias válido:[87,MHz-108MHz] \nRango de niveles de volumen válido:[0-6]", "Help", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		mntmHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mnHelp.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 206, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setBounds(10, 11, 57, 23);
		panel.add(lblNewLabel);
		
		textFieldU = new JTextField();
		textFieldU.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
		});
		textFieldU.setBounds(97, 12, 86, 20);
		panel.add(textFieldU);
		textFieldU.setColumns(10);
		
		JLabel lblPwd = new JLabel("PWD");
		lblPwd.setBounds(10, 45, 46, 14);
		panel.add(lblPwd);
		
		textFieldPWD = new JTextField();
		textFieldPWD.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
		});
		textFieldPWD.setBounds(97, 43, 86, 20);
		panel.add(textFieldPWD);
		textFieldPWD.setColumns(10);
		
		JButton boton1 = new JButton("Conectar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((textFieldU.getText().length()>0) && (textFieldPWD.getText().length()>0))
				
				JOptionPane.showMessageDialog(contentPane, "Conectado usuario IMF", "Login", JOptionPane.INFORMATION_MESSAGE);
				
					
				}
		});
		boton1.setBounds(20, 76, 163, 23);
		panel.add(boton1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 152, 206, 54);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textFieldNumeros = new JTextField();
		textFieldNumeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		textFieldNumeros.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNumeros.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textFieldNumeros.setText("87,5");
		textFieldNumeros.setBounds(0, 0, 206, 53);
		panel_1.add(textFieldNumeros);
		textFieldNumeros.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("FRECUENCIA");
		lblNewLabel_1.setBounds(10, 132, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton boton2 = new JButton("<");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		boton2.setBounds(10, 206, 89, 23);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton(">");
		boton3.setBounds(127, 206, 89, 23);
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("REGISTRAR");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		String respuesta = JOptionPane.showInputDialog(contentPane, "Introduzca numero del registro", "Registrar", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(contentPane, "No se ha podido efectuar el registro", "Registrar", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(contentPane, "Efectuado registro", "Registrar", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		boton4.setBounds(10, 228, 206, 23);
		contentPane.add(boton4);
		
		JRadioButton Radio1 = new JRadioButton("FM");
		Radio1.setSelected(true);
		buttonGroup.add(Radio1);
		Radio1.setBounds(236, 152, 59, 23);
		contentPane.add(Radio1);
		
		JRadioButton Radio2 = new JRadioButton("AM");
		buttonGroup.add(Radio2);
		Radio2.setBounds(236, 183, 59, 23);
		contentPane.add(Radio2);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setToolTipText("");
		progressBar.setValue(50);
		progressBar.setBounds(10, 278, 285, 23);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel_2 = new JLabel("VOLUMEN");
		lblNewLabel_2.setBounds(10, 262, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton Boton5 = new JButton("-");
		Boton5.setBounds(20, 306, 121, 23);
		contentPane.add(Boton5);
		
		JButton Boton6 = new JButton("+");
		Boton6.setBounds(174, 306, 121, 23);
		contentPane.add(Boton6);
		
		Button Boton7 = new Button("BORRAR");
		Boton7.setBounds(310, 307, 176, 22);
		contentPane.add(Boton7);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(300, 29, 204, 269);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_3 = new JLabel("REGISTRO");
		lblNewLabel_3.setBounds(298, 11, 64, 14);
		contentPane.add(lblNewLabel_3);
	}
}
