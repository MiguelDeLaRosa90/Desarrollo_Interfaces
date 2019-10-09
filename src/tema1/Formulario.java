package tema1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.font.TextMeasurer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;

public class Formulario extends JFrame {

	private JPanel contentPane;
	public JTextField txtMayusculas;
	private JTextField textField_1;
	private JComboBox Pais;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMayusculas = new JTextField();
		txtMayusculas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				String old = txtMayusculas.getText();			
				old = old.toUpperCase();
				txtMayusculas.setText(old);
			}
		});
		txtMayusculas.setBounds(111, 29, 202, 20);
		contentPane.add(txtMayusculas);
		txtMayusculas.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				String old = textField_1.getText();			
				old = old.toUpperCase();
				textField_1.setText(old);
			}
		});
		textField_1.setBounds(111, 81, 202, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton BotHombre = new JRadioButton("Hombre");
		buttonGroup.add(BotHombre);
		BotHombre.setBounds(319, 28, 109, 23);
		contentPane.add(BotHombre);
		
		JRadioButton BotMujer = new JRadioButton("Mujer");
		buttonGroup.add(BotMujer);
		BotMujer.setBounds(319, 80, 109, 23);
		contentPane.add(BotMujer);
		
		JCheckBox BoxCoche = new JCheckBox("Coche");
		BoxCoche.setBounds(86, 205, 97, 23);
		contentPane.add(BoxCoche);
		
		JCheckBox BoxMetro = new JCheckBox("Metro");
		BoxMetro.setBounds(86, 231, 97, 23);
		contentPane.add(BoxMetro);
		
		JCheckBox BoxMoto = new JCheckBox("Moto");
		BoxMoto.setBounds(191, 205, 97, 23);
		contentPane.add(BoxMoto);
		
		JComboBox Region = new JComboBox();
		Region.setModel(new DefaultComboBoxModel(new String[] {"MADRID", "ALICANTE", "BILBAO", "GRANADA"}));
		Region.setModel(new DefaultComboBoxModel(new String[] {"LISBOA", "OPORTO", "ALGARVE", "COIMBRA"}));
		Region.setBounds(278, 134, 97, 20);
		contentPane.add(Region);
		
		Pais = new JComboBox();
		Pais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println(Pais.getSelectedIndex());
				switch (Pais.getSelectedIndex()) {
				case 0:
					Region.setModel(new DefaultComboBoxModel(new String[] {"MADRID", "BARCELONA", "BILBAO", "SEVILLA"}));
					break;
				case 1:
					Region.setModel(new DefaultComboBoxModel(new String[] {"LISBOA", "OPORTO", "ALGARVE", "COIMBRA"}));
					break;

				default:
					break;
				}
			}
		});
		Pais.setModel(new DefaultComboBoxModel(new String[] {"ESPAÑA", "PORTUGAL"}));
		Pais.setBounds(86, 134, 109, 20);
		contentPane.add(Pais);
		
		
		
		JCheckBox BoxPie = new JCheckBox("Pie");
		BoxPie.setBounds(191, 231, 97, 23);
		contentPane.add(BoxPie);
		
		JCheckBox BoxBus = new JCheckBox("Bus");
		BoxBus.setBounds(290, 205, 97, 23);
		contentPane.add(BoxBus);
		
		JCheckBox BoxOtros = new JCheckBox("Otros");
		BoxOtros.setBounds(290, 231, 97, 23);
		contentPane.add(BoxOtros);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(38, 31, 62, 17);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(30, 84, 71, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblPas = new JLabel("Pa\u00EDs:");
		lblPas.setBounds(38, 137, 46, 14);
		contentPane.add(lblPas);
		
		JLabel lblRegin = new JLabel("Regi\u00F3n");
		lblRegin.setBounds(222, 137, 46, 14);
		contentPane.add(lblRegin);
		
		JLabel lblElijaALos = new JLabel("Elija los tipo/s de transportre que toma para ir a trabajar:");
		lblElijaALos.setBounds(69, 184, 290, 14);
		contentPane.add(lblElijaALos);
		
		JButton btonLimpiar = new JButton("LIMPIAR");
		btonLimpiar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
				
				
			}
		});
		btonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtMayusculas.setText("");
				textField_1.setText("");
				
				
				
				BoxBus.setSelected(false);
			}
		});
		btonLimpiar.setBounds(69, 300, 89, 40);
		contentPane.add(btonLimpiar);
		
		JButton btonCargar = new JButton("CARGAR");
		btonCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btonCargar.setBounds(199, 300, 89, 40);
		contentPane.add(btonCargar);
		
		JButton btonGuardar = new JButton("GUARDAR");
		btonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			// declaras un String le pones un nombre y pones la direccion del fichero donde lo quieras guardar
				
				String rutafichero ="C:\\Users\\MIGUE\\OneDrive\\Escritorio\\2 DAM\\DESARROLLO INTERFACES\\prueba.txt";				
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(rutafichero));
					bw.write("Nombre: ");
					bw.write(txtMayusculas.getText());	
					bw.write("\r\n");
					bw.write("Apellidos: ");
					bw.write(textField_1.getText());
					bw.write("\r\n");
					bw.write("Genero: ");
					
					if(BotHombre.isSelected()) {
						
						if(BotHombre.getText().equals("Hombre"));{
							bw.write("Hombre");
						}
					}
					
					if(BotMujer.isSelected()) {
						
						if(BotMujer.getText().equals("Mujer"));{
							bw.write("Mujer");
						}
					}
					
					
					
					
					bw.flush();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btonGuardar.setBounds(329, 300, 89, 40);
		contentPane.add(btonGuardar);
	}
}
