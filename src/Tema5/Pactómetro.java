 package Tema5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JMenuItem;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Pactómetro extends JFrame {

	private JPanel contentPane;
	private Progreso progressBar;
	private JTextField textField_psoe;
	private JTextField textField_pp;
	private JTextField textField_vox;
	private JTextField textField_up;
	private JTextField textField_erc;
	private JTextField textField_cs;
	private JTextField textField_jxcat;
	private JTextField textField_pnv;
	private JTextField textField_eh;
	private JTextField textField_mp;
	private JTextField textField_cup;
	private JTextField textField_cca;
	private JTextField textField_na;
	private JTextField textField_bng;
	private JTextField textField_prc;
	private JTextField textField_tex;
	private JCheckBox boxPsoe;
	private JCheckBox boxPP;
	private JCheckBox boxVOX;
	private JCheckBox boxUP;
	private JCheckBox boxERC;
	private JCheckBox boxCs;
	private JCheckBox boxJxCAT;
	private JCheckBox boxPNV;
	private JCheckBox boxEH;
	private JCheckBox boxMP;
	private JCheckBox boxCUP;
	private JCheckBox boxCCa;
	private JCheckBox boxNA;
	private JCheckBox boxBNG;
	private JCheckBox boxPRC;
	private JCheckBox boxTEX;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pactómetro frame = new Pactómetro();
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
	public Pactómetro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 397);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAcciones = new JMenu("Acciones");
		menuBar.add(mnAcciones);
		
		JMenuItem mntmReiniciar = new JMenuItem("Reiniciar");
		mntmReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		mnAcciones.add(mntmReiniciar);
		
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Abrir");
		mnHelp.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		boxPsoe = new JCheckBox("PSOE");
		boxPsoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int value_Actual = progressBar.getValue();
				if (boxPsoe.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_psoe.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_psoe.getText());
				}
				progressBar.setValue(value_Actual);
				
			}
		});
		boxPsoe.setBounds(6, 24, 62, 23);
		contentPane.add(boxPsoe);
		
		boxPP = new JCheckBox("PP");
		boxPP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_pp.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_pp.getText());
				}
				progressBar.setValue(value_Actual);
				
			}
		});
		boxPP.setBounds(6, 64, 48, 23);
		contentPane.add(boxPP);
		
		boxVOX = new JCheckBox("VOX");
		boxVOX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_vox.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_vox.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxVOX.setBounds(6, 105, 62, 23);
		contentPane.add(boxVOX);
		
		boxUP = new JCheckBox("UP");
		boxUP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_up.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_up.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxUP.setBounds(6, 148, 48, 23);
		contentPane.add(boxUP);
		
		textField_psoe = new JTextField();
		textField_psoe.setText("120");
		textField_psoe.setBounds(74, 14, 48, 42);
		contentPane.add(textField_psoe);
		textField_psoe.setColumns(10);
		
		textField_pp = new JTextField();
		textField_pp.setText("89");
		textField_pp.setBounds(74, 55, 48, 41);
		contentPane.add(textField_pp);
		textField_pp.setColumns(10);
		
		textField_vox = new JTextField();
		textField_vox.setText("52");
		textField_vox.setBounds(74, 95, 48, 42);
		contentPane.add(textField_vox);
		textField_vox.setColumns(10);
		
		textField_up = new JTextField();
		textField_up.setText("35");
		textField_up.setBounds(74, 138, 48, 42);
		contentPane.add(textField_up);
		textField_up.setColumns(10);
		
		JButton btnNewButton = new JButton("REINICIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boxPsoe.setSelected(false);
				boxPP.setSelected(false);
				boxVOX.setSelected(false);
				boxUP.setSelected(false);
				boxERC.setSelected(false);
				boxCs.setSelected(false);
				boxJxCAT.setSelected(false);
				boxPNV.setSelected(false);
				boxEH.setSelected(false);
				boxMP.setSelected(false);
				boxCUP.setSelected(false);
				boxCCa.setSelected(false);
				boxNA.setSelected(false);
				boxBNG.setSelected(false);
				boxPRC.setSelected(false);
				boxTEX.setSelected(false);
				
				progressBar.setValue(0);
			}
		});
		btnNewButton.setBounds(59, 217, 386, 38);
		contentPane.add(btnNewButton);
		
		progressBar = new Progreso();
		progressBar.setMaximum(350);
		progressBar.setForeground(new Color(50, 205, 50));
		progressBar.setBackground(Color.WHITE);
		progressBar.setStringPainted(true);
		progressBar.setToolTipText("");
		progressBar.setBounds(28, 278, 442, 48);
		contentPane.add(progressBar);
		
		boxERC = new JCheckBox("ERC");
		boxERC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_erc.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_erc.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxERC.setBounds(139, 24, 56, 23);
		contentPane.add(boxERC);
		
		boxCs = new JCheckBox("Cs");
		boxCs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_cs.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_cs.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxCs.setBounds(138, 64, 48, 23);
		contentPane.add(boxCs);
		
		boxJxCAT = new JCheckBox("JxCAT");
		boxJxCAT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_jxcat.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_jxcat.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxJxCAT.setBounds(138, 105, 56, 23);
		contentPane.add(boxJxCAT);
		
		boxPNV = new JCheckBox("PNV");
		boxPNV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_pnv.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_pnv.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxPNV.setBounds(138, 148, 57, 23);
		contentPane.add(boxPNV);
		
		textField_erc = new JTextField();
		textField_erc.setText("13");
		textField_erc.setBounds(197, 14, 48, 42);
		contentPane.add(textField_erc);
		textField_erc.setColumns(10);
		
		textField_cs = new JTextField();
		textField_cs.setText("10");
		textField_cs.setBounds(197, 54, 48, 41);
		contentPane.add(textField_cs);
		textField_cs.setColumns(10);
		
		textField_jxcat = new JTextField();
		textField_jxcat.setText("8");
		textField_jxcat.setBounds(197, 95, 48, 42);
		contentPane.add(textField_jxcat);
		textField_jxcat.setColumns(10);
		
		textField_pnv = new JTextField();
		textField_pnv.setText("6");
		textField_pnv.setBounds(197, 138, 48, 42);
		contentPane.add(textField_pnv);
		textField_pnv.setColumns(10);
		
		boxEH = new JCheckBox("EH");
		boxEH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_eh.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_eh.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxEH.setBounds(259, 24, 48, 23);
		contentPane.add(boxEH);
		
		boxMP = new JCheckBox("MP");
		boxMP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_mp.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_mp.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxMP.setBounds(259, 64, 48, 23);
		contentPane.add(boxMP);
		
		boxCUP = new JCheckBox("CUP");
		boxCUP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_cup.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_cup.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxCUP.setBounds(259, 105, 48, 23);
		contentPane.add(boxCUP);
		
		boxCCa = new JCheckBox("CCa");
		boxCCa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_cca.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_cca.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxCCa.setBounds(259, 148, 48, 23);
		contentPane.add(boxCCa);
		
		textField_eh = new JTextField();
		textField_eh.setText("5");
		textField_eh.setBounds(313, 14, 48, 42);
		contentPane.add(textField_eh);
		textField_eh.setColumns(10);
		
		textField_mp = new JTextField();
		textField_mp.setText("3");
		textField_mp.setBounds(313, 55, 48, 41);
		contentPane.add(textField_mp);
		textField_mp.setColumns(10);
		
		textField_cup = new JTextField();
		textField_cup.setText("2");
		textField_cup.setBounds(313, 95, 48, 42);
		contentPane.add(textField_cup);
		textField_cup.setColumns(10);
		
		textField_cca = new JTextField();
		textField_cca.setText("2");
		textField_cca.setBounds(313, 138, 48, 42);
		contentPane.add(textField_cca);
		textField_cca.setColumns(10);
		
		boxNA = new JCheckBox("NA+");
		boxNA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_na.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_na.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxNA.setBounds(373, 24, 62, 23);
		contentPane.add(boxNA);
		
		boxBNG = new JCheckBox("BNG");
		boxBNG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_bng.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_bng.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxBNG.setBounds(373, 64, 62, 23);
		contentPane.add(boxBNG);
		
		boxPRC = new JCheckBox("PRC");
		boxPRC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_prc.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_prc.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxPRC.setBounds(373, 105, 62, 23);
		contentPane.add(boxPRC);
		
		boxTEX = new JCheckBox("TEX");
		boxTEX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value_Actual = progressBar.getValue();
				if (boxPP.isSelected()==true) {
					value_Actual = value_Actual+Integer.valueOf(textField_tex.getText());
				}else {
					value_Actual = value_Actual-Integer.valueOf(textField_tex.getText());
				}
				progressBar.setValue(value_Actual);
				
			
			}
		});
		boxTEX.setBounds(373, 148, 65, 23);
		contentPane.add(boxTEX);
		
		textField_na = new JTextField();
		textField_na.setText("2");
		textField_na.setBounds(444, 14, 48, 42);
		contentPane.add(textField_na);
		textField_na.setColumns(10);
		
		textField_bng = new JTextField();
		textField_bng.setText("1");
		textField_bng.setBounds(444, 55, 48, 41);
		contentPane.add(textField_bng);
		textField_bng.setColumns(10);
		
		textField_prc = new JTextField();
		textField_prc.setText("1");
		textField_prc.setBounds(444, 95, 48, 42);
		contentPane.add(textField_prc);
		textField_prc.setColumns(10);
		
		textField_tex = new JTextField();
		textField_tex.setText("1");
		textField_tex.setBounds(444, 138, 48, 42);
		contentPane.add(textField_tex);
		textField_tex.setColumns(10);
	}
}
