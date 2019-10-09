package tema1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class InterfazCalculadora {

	private JFrame frame;
	private JTextField textOper;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCalculadora window = new InterfazCalculadora();
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
	public InterfazCalculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textOper = new JTextField();
		textOper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		textOper.setBounds(10, 124, 414, 20);
		frame.getContentPane().add(textOper);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 30, 404, 83);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textLog = new JTextArea();
		scrollPane.setViewportView(textLog);
		
		
		
		JLabel lblLog = new JLabel("Log:");
		lblLog.setBounds(21, 11, 46, 14);
		frame.getContentPane().add(lblLog);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 155, 272, 215);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("7");
				textOper.setText(texto_old);
				
				
				
			}
		});
		panel.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("8");
				textOper.setText(texto_old);
			}
		});
		panel.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("9");
				textOper.setText(texto_old);
			}
		});
		panel.add(boton9);
		
		JButton boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("4");
				textOper.setText(texto_old);
			}
		});
		panel.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("5");
				textOper.setText(texto_old);
			}
		});
		panel.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("6");
				textOper.setText(texto_old);
			}
		});
		panel.add(boton6);
		
		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("1");
				textOper.setText(texto_old);
			}
		});
		panel.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("2");
				textOper.setText(texto_old);
			}
		});
		panel.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("3");
				textOper.setText(texto_old);
			}
		});
		panel.add(boton3);
		
		JButton btnNewButton_11 = new JButton("");
		panel.add(btnNewButton_11);
		
		JButton boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("0");
				textOper.setText(texto_old);
			}
		});
		panel.add(boton0);
		
		JButton btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(331, 155, 93, 215);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton botonAC = new JButton("AC");
		botonAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("6");
				textOper.setText("");
				JOptionPane.showMessageDialog(panel, "Borrado","texto en ventana",JOptionPane.ERROR_MESSAGE);
				
			}
		});
		panel_1.add(botonAC);
		
		JButton botonDEL = new JButton("DEL");
		botonDEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("6");
				textOper.setText("");
			}
		});
		panel_1.add(botonDEL);
		
		JButton botonDIV = new JButton("/");
		botonDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("/");
				textOper.setText(texto_old);
			}
		});
		panel_1.add(botonDIV);
		
		JButton botonMULT = new JButton("*");
		botonMULT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("*");
				textOper.setText(texto_old);
			}
		});
		panel_1.add(botonMULT);
		
		JButton botonRESTA = new JButton("-");
		botonRESTA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("-");
				textOper.setText(texto_old);
			}
		});
		panel_1.add(botonRESTA);
		
		JButton botonSUMA = new JButton("+");
		botonSUMA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("+");
				textOper.setText(texto_old);
				
			}
		});
		panel_1.add(botonSUMA);
		
		JButton botonIGUAL = new JButton("=");
		botonIGUAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_old = textOper.getText();
				texto_old = texto_old.concat("=");
				textLog.append(textOper.getText()+ "\r\n");
				textOper.setText("");

			}
		});
		panel_1.add(botonIGUAL);
		
		
	}
}
