package Programacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class frmTelevisor extends JFrame {

	private JPanel contentPane;
	private JTextField txtvolumen;
	private JTextField txtcanal;

	
	
	 
	
	 Televisor tv1=new Televisor();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTelevisor frame = new frmTelevisor();
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
	public frmTelevisor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton encender = new JButton("encender");
		encender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			tv1.encender();
			System.out.println (" TV ENCENDIDO ");
			}
		});
		encender.setBounds(316, 11, 89, 23);
		contentPane.add(encender);
		
		JButton btnNewButton = new JButton("apagar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.apagar();
				System.out.println (" TV APAGADO ");
			}
		});
		btnNewButton.setBounds(316, 45, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCanal = new JButton("+ canal");
		btnCanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.cambiarCanalArriba();
				txtcanal.setText("Canal: "+tv1.obtenercanal()+"");
				
			}
		});
		btnCanal.setBounds(316, 90, 89, 23);
		contentPane.add(btnCanal);
		
		JButton btnNewButton_1 = new JButton("-  canal");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tv1.cambiarCanalAbajo();
				txtcanal.setText("Canal: "+tv1.obtenercanal()+"");
			}
		});
		btnNewButton_1.setBounds(316, 124, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnVolumen = new JButton("+ volumen");
		btnVolumen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.suborvolumen();
				txtvolumen.setText("Volumen:" +tv1.obtenervolumen()+"");
			}
		});
		btnVolumen.setBounds(316, 158, 89, 23);
		contentPane.add(btnVolumen);
		
		JButton btnVolumen_1 = new JButton("- volumen");
		btnVolumen_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.bajarVolumen();
				txtvolumen.setText("Volumen:" +tv1.obtenervolumen()+"");
			}
		});
		btnVolumen_1.setBounds(316, 192, 89, 23);
		contentPane.add(btnVolumen_1);
		
		txtvolumen = new JTextField();
		txtvolumen.setBounds(81, 12, 173, 20);
		contentPane.add(txtvolumen);
		txtvolumen.setColumns(10);
		
		txtcanal = new JTextField();
		txtcanal.setText("                                                                                                     ");
		txtcanal.setBounds(75, 43, 179, 23);
		contentPane.add(txtcanal);
		txtcanal.setColumns(10);
	}
}
