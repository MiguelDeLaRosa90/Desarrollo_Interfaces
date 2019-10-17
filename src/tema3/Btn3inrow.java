package tema3;

import java.awt.Color;

import javax.swing.JButton;

public class Btn3inrow extends JButton{
	
	private int status;
	
	public Btn3inrow() {
		
		this.clear();
	}
	
	public void clear() {
		this.setBackground(Color.WHITE);
		this.status=0;
		this.setEnabled(true);
	}
	
	public void activate(int player) {
		
		this.status = player;
		if (player==1) {
			this.setBackground(Color.RED);
		
		}else {
			this.setBackground(Color.GREEN);
			
		}
		this.setEnabled(false);
	}
	
	public int getStatus(){
		return status;
	}
}
