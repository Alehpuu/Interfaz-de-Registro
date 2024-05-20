

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Proyecto2 {

	JFrame JFrameProyecto2;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passOculto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto2 window = new Proyecto2();
					window.JFrameProyecto2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Proyecto2() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrameProyecto2 = new JFrame();
		JFrameProyecto2.setBounds(100, 100, 619, 452);
		JFrameProyecto2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrameProyecto2.getContentPane().setLayout(null);
		JFrameProyecto2.setResizable(false);
		
		
		final JLabel botonShow = new JLabel("SHOW");
		
		final JCheckBox CheckBoxTyc = new JCheckBox("* Estoy de acuerdo con los terminos y condiciones");
		CheckBoxTyc.setFont(new Font("Tahoma", Font.BOLD, 12));
		CheckBoxTyc.setOpaque(false);
		CheckBoxTyc.setBounds(110, 307, 360, 23);
		JFrameProyecto2.getContentPane().add(CheckBoxTyc); 
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Deseo recibir publicidad");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(110, 281, 224, 23);
		JFrameProyecto2.getContentPane().add(chckbxNewCheckBox);
		
		passOculto = new JPasswordField();
		passOculto.setBorder(new LineBorder(new Color(0, 0, 0)));
		passOculto.setFont(new Font("Tahoma", Font.BOLD, 14));
		passOculto.setBounds(271, 169, 199, 23);
		JFrameProyecto2.getContentPane().add(passOculto);
		botonShow.setOpaque(true);
		botonShow.setHorizontalAlignment(SwingConstants.CENTER);
		botonShow.setForeground(Color.WHITE);
		botonShow.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonShow.setBackground(new Color(102, 51, 153));
		botonShow.setBounds(485, 169, 57, 23);
		JFrameProyecto2.getContentPane().add(botonShow);
		
		final JLabel botonHidee = new JLabel("HIDE");
		botonHidee.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				botonShow.setVisible(true);
				botonHidee.setVisible(false);
				passOculto.setEchoChar('●'); 
			}
		});
		botonShow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				botonShow.setVisible(false);
				botonHidee.setVisible(true);
				passOculto.setEchoChar((char) 0); 
			}
		});
		botonHidee.setOpaque(true);
		botonHidee.setHorizontalAlignment(SwingConstants.CENTER);
		botonHidee.setForeground(Color.WHITE);
		botonHidee.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonHidee.setBackground(new Color(102, 51, 153));
		botonHidee.setBounds(485, 169, 57, 23);
		JFrameProyecto2.getContentPane().add(botonHidee);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setBackground(new Color(129, 16, 86));
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext.setForeground(new Color(255, 255, 204));
		btnNext.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		btnNext.setBounds(474, 348, 93, 36);
		JFrameProyecto2.getContentPane().add(btnNext);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setForeground(new Color(51, 0, 51));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmail.setBounds(110, 219, 162, 24);
		JFrameProyecto2.getContentPane().add(lblEmail);
		
		JLabel lblNombre2 = new JLabel("NOMBRE");
		lblNombre2.setForeground(new Color(51, 0, 51));
		lblNombre2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNombre2.setBounds(110, 118, 113, 21);
		JFrameProyecto2.getContentPane().add(lblNombre2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setToolTipText("");
		textField_2.setForeground(Color.BLACK);
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(Color.DARK_GRAY));
		textField_2.setBounds(271, 219, 199, 24);
		JFrameProyecto2.getContentPane().add(textField_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setToolTipText("");
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		textField.setBorder(new LineBorder(Color.DARK_GRAY));
		textField.setBounds(271, 115, 199, 24);
		JFrameProyecto2.getContentPane().add(textField);
		
		JLabel lblTitle = new JLabel("REGÍSTRATE");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(new Color(51, 0, 102));
		lblTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 42));
		lblTitle.setBorder(null);
		lblTitle.setBackground(new Color(0, 0, 51));
		lblTitle.setBounds(0, 11, 609, 78);
		JFrameProyecto2.getContentPane().add(lblTitle);
		
		JLabel lblContraseña2 = new JLabel("CONTRASEÑA");
		lblContraseña2.setForeground(new Color(51, 0, 51));
		lblContraseña2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblContraseña2.setBounds(110, 162, 162, 31);
		JFrameProyecto2.getContentPane().add(lblContraseña2);
		
		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondo.setIcon(new ImageIcon(Proyecto2.class.getResource("/Imagenes/Premium Vector _ 3d shapes background.jpg")));
		lblFondo.setBounds(0, 0, 609, 417);
		JFrameProyecto2.getContentPane().add(lblFondo);
		
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(JFrameProyecto2, "INTRODUZCA SU NOMBRE" ,"ERROR",JOptionPane.ERROR_MESSAGE);
				}else if (String.valueOf(passOculto.getPassword()).isEmpty()) {
					JOptionPane.showMessageDialog(JFrameProyecto2, "INTRODUZCA SU CONTRASEÑA" ,"ERROR",JOptionPane.ERROR_MESSAGE);
				}else if (textField_2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(JFrameProyecto2, "INTRODUZCA SU EMAIL" ,"ERROR",JOptionPane.ERROR_MESSAGE);
				}else if (!(CheckBoxTyc.isSelected())){	
					CheckBoxTyc.setForeground(new Color(255, 0, 0));			
				} else {
					Proyecto3 p5 = new Proyecto3();
					p5.JFrameProyecto5.setVisible(true);
					JFrameProyecto2.dispose();	
				}

			}
		});
	}

}
