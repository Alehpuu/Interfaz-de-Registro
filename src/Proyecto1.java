import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Proyecto1 {

	private JFrame frame;
	private JLabel varLabelTitle;
	private JLabel LabelFondo;
	private JTextField textIntroduce;
	private JLabel lblNombre;
	private JLabel lblContraseña;
	private JPasswordField passOculto;
	private JLabel botonShow;
	private JLabel botonOcultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto1 window = new Proyecto1();
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
	public Proyecto1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 634, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JButton botonRegistro = new JButton("Regístrate");
		botonRegistro.setFont(new Font("Tahoma", Font.BOLD, 16));
		botonRegistro.setForeground(new Color(255, 255, 51));
		botonRegistro.setContentAreaFilled(false);
		botonRegistro.setBorderPainted(false);
		botonRegistro.setBorder(null);
		botonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proyecto2 p2 = new Proyecto2();
				p2.JFrameProyecto2.setVisible(true);
				frame.dispose();
			}
		});
		
		botonShow = new JLabel("SHOW");
		botonShow.setForeground(new Color(255, 255, 255));
		botonShow.setBackground(new Color(102, 51, 153));
		botonShow.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonShow.setHorizontalAlignment(SwingConstants.CENTER);
		botonShow.setOpaque(true);
		botonShow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				botonShow.setVisible(false);
				botonOcultar.setVisible(true);
				passOculto.setEchoChar((char) 0); 			
			}
		});
		botonShow.setBounds(503, 188, 57, 23);
		frame.getContentPane().add(botonShow);
		
		JCheckBox CheckBox = new JCheckBox("Deseo mantener iniciada mi sesión");
		CheckBox.setForeground(Color.WHITE);
		CheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		CheckBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		CheckBox.setContentAreaFilled(false);
		CheckBox.setBounds(205, 234, 243, 23);
		frame.getContentPane().add(CheckBox);
		
		passOculto = new JPasswordField();
		passOculto.setBorder(new LineBorder(new Color(0, 0, 0)));
		passOculto.setFont(new Font("Tahoma", Font.BOLD, 14));
		passOculto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		passOculto.setBounds(294, 182, 199, 29);
		frame.getContentPane().add(passOculto);
		botonRegistro.setBounds(335, 358, 89, 23);
		frame.getContentPane().add(botonRegistro);
		
		varLabelTitle = new JLabel("TELEFÓNICA");
		varLabelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		varLabelTitle.setBorder(null);
		varLabelTitle.setBackground(new Color(0, 0, 51));
		varLabelTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 42));
		varLabelTitle.setForeground(new Color(255, 153, 255));
		varLabelTitle.setBounds(10, 22, 608, 78);
		frame.getContentPane().add(varLabelTitle);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(153, 0, 153));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(404, 277, 89, 31);
		frame.getContentPane().add(btnLogin);
		
		textIntroduce = new JTextField();
		textIntroduce.setFont(new Font("Tahoma", Font.BOLD, 14));
		textIntroduce.setBorder(new LineBorder(Color.DARK_GRAY));
		textIntroduce.setForeground(Color.BLACK);
		textIntroduce.setToolTipText("");
		textIntroduce.setColumns(10);
		textIntroduce.setBounds(294, 120, 199, 23);
		frame.getContentPane().add(textIntroduce);
		
		lblNombre = new JLabel("NOMBRE");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBounds(135, 122, 113, 21);
		frame.getContentPane().add(lblNombre);
		
		lblContraseña = new JLabel("CONTRASEÑA");
		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblContraseña.setForeground(Color.WHITE);
		lblContraseña.setBounds(135, 182, 162, 31);
		frame.getContentPane().add(lblContraseña);
		
		JLabel lblPregunta = new JLabel("No tienes cuenta?");
		lblPregunta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPregunta.setForeground(new Color(255, 255, 255));
		lblPregunta.setBounds(187, 362, 148, 14);
		frame.getContentPane().add(lblPregunta);
		
		botonOcultar = new JLabel("HIDE");
		botonOcultar.setBackground(new Color(102, 51, 153));
		botonOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		botonOcultar.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonOcultar.setForeground(new Color(255, 255, 255));
		botonOcultar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				botonShow.setVisible(true);
				botonOcultar.setVisible(false);
				passOculto.setEchoChar('●'); 
			}
		});
		botonOcultar.setOpaque(true);
		botonOcultar.setBounds(503, 188, 57, 23);
		frame.getContentPane().add(botonOcultar);
		
		
		LabelFondo = new JLabel("");
		LabelFondo.setIcon(new javax.swing.ImageIcon(Proyecto1.class.getResource("/Imagenes/3d glass metaballs, Judy Kao.jpg")));
		LabelFondo.setBounds(0, -55, 641, 523);
		frame.getContentPane().add(LabelFondo);
	}
}
