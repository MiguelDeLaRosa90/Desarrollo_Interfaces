package Examen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.ButtonGroup;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Practica extends JFrame {

	private JPanel contentPane;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica frame = new Practica();
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
	public Practica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmTransferencias = new JMenuItem("Transferencias");
		menuBar.add(mntmTransferencias);
		
		JMenuItem mntmLog = new JMenuItem("Log");
		menuBar.add(mntmLog);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		menuBar.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(31, 11, 269, 355);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEmisor = new JLabel("Emisor");
		lblEmisor.setBounds(103, 11, 46, 14);
		panel.add(lblEmisor);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 47, 46, 14);
		panel.add(lblNombre);
		
		textField_0 = new JTextField();
		textField_0.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String old = textField_0.getText();			
				old = old.toUpperCase();
				textField_0.setText(old);
			}
		});
		textField_0.setBounds(90, 44, 156, 20);
		panel.add(textField_0);
		textField_0.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 89, 46, 14);
		panel.add(lblApellidos);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String old = textField_1.getText();			
				old = old.toUpperCase();
				textField_1.setText(old);
			}
		});
		textField_1.setBounds(90, 86, 156, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 132, 46, 14);
		panel.add(lblDni);
		
		textField_2 = new JTextField();
		textField_2.setBounds(90, 129, 156, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnEfectivo = new JRadioButton("Efectivo");
		buttonGroup.add(rdbtnEfectivo);
		rdbtnEfectivo.setBounds(90, 177, 109, 23);
		panel.add(rdbtnEfectivo);
		
		JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta");
		buttonGroup.add(rdbtnTarjeta);
		rdbtnTarjeta.setBounds(90, 203, 109, 23);
		panel.add(rdbtnTarjeta);
		
		JRadioButton rdbtnPaypal = new JRadioButton("Paypal");
		buttonGroup.add(rdbtnPaypal);
		rdbtnPaypal.setBounds(90, 229, 109, 23);
		panel.add(rdbtnPaypal);
		
		JLabel lblMtodo = new JLabel("M\u00E9todo");
		lblMtodo.setBounds(10, 212, 46, 14);
		panel.add(lblMtodo);
		
		JLabel lblCuanta = new JLabel("Cuant\u00EDa");
		lblCuanta.setBounds(10, 271, 46, 14);
		panel.add(lblCuanta);
		
		textField_3 = new JTextField();
		textField_3.setBounds(90, 268, 156, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDivisa = new JLabel("Divisa");
		lblDivisa.setBounds(10, 315, 46, 14);
		panel.add(lblDivisa);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"D\u00F3lar Estadounidense", "Euro", "Yen, Japones", "Libra Esterlina"}));
		comboBox.setBounds(90, 312, 156, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(433, 11, 229, 157);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(10, 42, 46, 14);
		panel_1.add(lblNombre_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(94, 39, 125, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblReceptor = new JLabel("Receptor");
		lblReceptor.setBounds(94, 11, 64, 14);
		panel_1.add(lblReceptor);
		
		JLabel lblApellidos_1 = new JLabel("Apellidos");
		lblApellidos_1.setBounds(10, 78, 46, 14);
		panel_1.add(lblApellidos_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(94, 75, 125, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDni_1 = new JLabel("DNI");
		lblDni_1.setBounds(10, 119, 46, 14);
		panel_1.add(lblDni_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(94, 116, 125, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("Efectuar");
		btnNewButton.setBounds(433, 252, 103, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(536, 252, 108, 34);
		contentPane.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 392, 664, 101);
		contentPane.add(panel_2);
		
		JLabel lblOperacionesEnEuros = new JLabel("Operaciones en Euros");
		lblOperacionesEnEuros.setBounds(548, 372, 126, 14);
		contentPane.add(lblOperacionesEnEuros);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setBounds(536, 504, 138, 29);
		contentPane.add(btnNewButton_2);
	}
}
