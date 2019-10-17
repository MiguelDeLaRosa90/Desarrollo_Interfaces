package tema3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TresEnRaya extends JFrame {

	private JPanel contentPane;
	private int turno = 0;
	private boolean estado_juego = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresEnRaya frame = new TresEnRaya();
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
	public TresEnRaya() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 419, 201);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		 Btn3inrow btn1 = new  Btn3inrow();
		 btn1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {		 		
		 		turno++;
		 		if (turno%2==0) {
		 			btn1.activate(1);
		 		}else {
		 			btn1.activate(2);
		 		}
		 	}
		 });
		panel.add(btn1);
		
		 Btn3inrow btn2 = new  Btn3inrow();
		 btn2.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {		 		
			 		turno++;
			 		if (turno%2==0) {
			 			btn2.activate(1);
			 		}else {
			 			btn2.activate(2);
			 		}
			 	}
			 });
		panel.add(btn2);
		
		 Btn3inrow btn3 = new  Btn3inrow();
		 btn3.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {		 		
			 		turno++;
			 		if (turno%2==0) {
			 			btn3.activate(1);
			 		}else {
			 			btn3.activate(2);
			 		}
			 	}
			 });
		panel.add(btn3);
		
		 Btn3inrow btn4 = new  Btn3inrow();
		 btn4.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {		 		
			 		turno++;
			 		if (turno%2==0) {
			 			btn4.activate(1);
			 		}else {
			 			btn4.activate(2);
			 		}
			 	}
			 });
		panel.add(btn4);
		
		 Btn3inrow btn5 = new  Btn3inrow();
		 btn5.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {		 		
			 		turno++;
			 		if (turno%2==0) {
			 			btn5.activate(1);
			 		}else {
			 			btn5.activate(2);
			 		}
			 	}
			 });
		panel.add(btn5);
		
		 Btn3inrow btn6 = new  Btn3inrow();
		 btn6.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {		 		
			 		turno++;
			 		if (turno%2==0) {
			 			btn6.activate(1);
			 		}else {
			 			btn6.activate(2);
			 		}
			 	}
			 });
		panel.add(btn6);
		
		 Btn3inrow btn7 = new  Btn3inrow();
		 btn7.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {		 		
			 		turno++;
			 		if (turno%2==0) {
			 			btn7.activate(1);
			 		}else {
			 			btn7.activate(2);
			 		}
			 	}
			 });
		panel.add(btn7);
		
		 Btn3inrow btn8 = new  Btn3inrow();
		 btn8.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {		 		
			 		turno++;
			 		if (turno%2==0) {
			 			btn8.activate(1);
			 		}else {
			 			btn8.activate(2);
			 		}
			 	}
			 });
		panel.add(btn8);
		
		 Btn3inrow btn9 = new  Btn3inrow();
		 btn9.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {		 		
			 		turno++;
			 		if (turno%2==0) {
			 			btn9.activate(1);
			 		}else {
			 			btn9.activate(2);
			 		}
			 	}
			 });
		panel.add(btn9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 211, 419, 39);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 2, 0, 0));
		
		JButton btnNueva = new JButton("NUEVA PARTIDA");
		btnNueva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn1.clear();
				btn2.clear();
				btn3.clear();
				btn4.clear();
				btn5.clear();
				btn6.clear();
				btn7.clear();
				btn8.clear();
				btn9.clear();
			}
		});
		panel_1.add(btnNueva);
		
		JButton btnPause = new JButton("PAUSE");
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (estado_juego) {
					//bloquear todos los botones
					btn1.setEnabled(false);
					estado_juego = false;
				}else {
					if (btn1.getStatus()>0)
						btn1.setEnabled(true);
					estado_juego = true;
				}
			}
		});
		panel_1.add(btnPause);
		
		
		
		
	}
}
