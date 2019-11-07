package Tema4;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class tf_Frio_Calor extends JTextField implements KeyListener {
	
	int objetivo;
	
	public tf_Frio_Calor() {
		
		this.reiniciar();
		this.addKeyListener(this);
	}
	
	public void reiniciar() {
		
		this.setText("");
		this.setBackground(Color.white);
		Random rand = new Random();
		objetivo=rand.nextInt(101);
		System.out.println(objetivo);
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stubk
		int numero = Integer.parseInt(this.getText());
		int diferencia = numero -objetivo;
		diferencia=Math.abs(diferencia);	
		
		
		if (diferencia>25) {			
			this.setBackground(Color.GREEN);	
		}else if (diferencia>20) {
			this.setBackground(Color.BLUE);
		}else if (diferencia>15) {
			this.setBackground(Color.YELLOW);
		}else if (diferencia>10) {
			this.setBackground(Color.ORANGE);
		}else if (diferencia>5) {
			this.setBackground(Color.PINK);
		}else if (diferencia>0) {
			this.setBackground(Color.RED);
		}else if (diferencia==0) {
			this.setBackground(Color.WHITE);
			JOptionPane.showMessageDialog(null, "CHAMPIONS");
		}							
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
		
		
	}

}
