package Tema7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class InterfazCliente {

	private JFrame frame;
	private JTextField textFieldClient_nick;
	private JTextField textFieldClient_IP;
	private JLabel lblClientip;
	private JTextField textFieldPuerto;
	private JTextField textFieldIP;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCliente window = new InterfazCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public InterfazCliente() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 498, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlShadow);
		panel.setBounds(10, 11, 304, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblClientnick = new JLabel("Client_nick");
		lblClientnick.setBounds(10, 11, 71, 14);
		panel.add(lblClientnick);
		
		textFieldClient_nick = new JTextField();
		textFieldClient_nick.setBounds(86, 8, 129, 20);
		panel.add(textFieldClient_nick);
		textFieldClient_nick.setColumns(10);
		
		lblClientip = new JLabel("Client_IP");
		lblClientip.setBounds(10, 36, 66, 14);
		panel.add(lblClientip);
		
		textFieldClient_IP = new JTextField();
		textFieldClient_IP.setBounds(86, 36, 129, 20);
		panel.add(textFieldClient_IP);
		textFieldClient_IP.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textFieldClient_nick.getText().equals("")) {
					String contrasenia = JOptionPane.showInputDialog(frame, "Introduce la contraseña");
					if(contrasenia.equals("12345")) {
						try {
							textFieldClient_IP.setText(InetAddress.getLocalHost().getHostAddress());
						} catch (UnknownHostException e) {
							e.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(frame, "Contraseña inválida", "Error",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(frame, "Introduce un usuario en client_nick");
				}
				
			}
		});
		btnLogin.setBounds(225, 11, 69, 45);
		panel.add(btnLogin);
		
		JLabel lblPuerto = new JLabel("Puerto");
		lblPuerto.setBounds(10, 70, 46, 14);
		panel.add(lblPuerto);
		
		textFieldPuerto = new JTextField();
		textFieldPuerto.setText("5555");
		textFieldPuerto.setBounds(52, 67, 86, 20);
		panel.add(textFieldPuerto);
		textFieldPuerto.setColumns(10);
		
		JLabel lblIp = new JLabel("IP");
		lblIp.setBounds(156, 70, 23, 14);
		panel.add(lblIp);
		
		textFieldIP = new JTextField();
		textFieldIP.setBounds(178, 67, 116, 20);
		panel.add(textFieldIP);
		textFieldIP.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 117, 304, 174);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 303, 304, 44);
		frame.getContentPane().add(textArea_1);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(225, 368, 89, 32);
		frame.getContentPane().add(btnEnviar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldClient_nick.setText("");
				textFieldClient_IP.setText("");
				textFieldIP.setText("");
			}
		});
		btnLimpiar.setBounds(126, 368, 89, 32);
		frame.getContentPane().add(btnLimpiar);
		
		JLabel lblConectados = new JLabel("Conectados");
		lblConectados.setBounds(370, 11, 78, 14);
		frame.getContentPane().add(lblConectados);
		
		JList list = new JList();
		list.setBounds(324, 36, 148, 364);
		frame.getContentPane().add(list);
	}
}
