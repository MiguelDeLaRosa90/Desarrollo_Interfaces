package Tema5;

import javax.swing.JProgressBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Progreso extends JProgressBar implements ChangeListener{
	
	public Progreso() {
		// TODO Auto-generated constructor stub
		addChangeListener(this);
	}
	

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("texto para enrique: "+this.getValue());
		
	}

	

}
