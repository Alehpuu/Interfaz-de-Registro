


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Proyecto3 {

	protected static final String Proyecto31 = null;
	public static final String Proyecto3 = null;
	protected static Object staticField;
	JFrame JFrameProyecto5;
	private ButtonGroup bg = new ButtonGroup();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto3 window = new Proyecto3();
					window.JFrameProyecto5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Proyecto3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrameProyecto5 = new JFrame();
		JFrameProyecto5.setBounds(100, 100, 622, 452);
		JFrameProyecto5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrameProyecto5.getContentPane().setLayout(null);
		JFrameProyecto5.setResizable(false);
		
		JLabel lblFecha = new JLabel("* Introduzca la fecha con día/mes/año");
		lblFecha.setBounds(74, 277, 224, 14);
		JFrameProyecto5.getContentPane().add(lblFecha);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setToolTipText("");
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		textField.setBorder(new LineBorder(Color.DARK_GRAY));
		textField.setBounds(315, 258, 199, 24);
		JFrameProyecto5.getContentPane().add(textField);
		
		JRadioButton RadioButtonNo = new JRadioButton("No");
		RadioButtonNo.setForeground(new Color(51, 0, 51));
		RadioButtonNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		RadioButtonNo.setOpaque(false);
		RadioButtonNo.setBounds(415, 316, 109, 23);
		JFrameProyecto5.getContentPane().add(RadioButtonNo);
		
		JRadioButton RadioButtonSi = new JRadioButton("Sí");
		RadioButtonSi.setForeground(new Color(51, 0, 51));
		RadioButtonSi.setFont(new Font("Tahoma", Font.BOLD, 12));
		RadioButtonSi.setOpaque(false);
		RadioButtonSi.setBounds(359, 316, 109, 23);
		JFrameProyecto5.getContentPane().add(RadioButtonSi);
		
		bg.add(RadioButtonSi);
		bg.add(RadioButtonNo);
		
		JLabel lblNewLabel = new JLabel("¿ Deseas compartir información adicional ? :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(74, 319, 310, 14);
		JFrameProyecto5.getContentPane().add(lblNewLabel);
		
		JLabel lblFechaDeNacimiento = new JLabel("FECHA DE NACIMIENTO");
		lblFechaDeNacimiento.setForeground(new Color(51, 0, 51));
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblFechaDeNacimiento.setBounds(74, 251, 243, 30);
		JFrameProyecto5.getContentPane().add(lblFechaDeNacimiento);
		
		JButton btnNext = new JButton("NEXT");
				btnNext.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                String fecha = textField.getText();
		                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		                dateFormat.setLenient(false);

		                try {
		                    java.util.Date parsedDate = dateFormat.parse(fecha);
		                    dateFormat.format(parsedDate).equals(fecha);

		                    Proyecto4 p4 = new Proyecto4();
		                    p4.JFrameProyecto4.setVisible(true);
		                    JFrameProyecto5.dispose();

		                } catch (Exception ex) {
		                    JOptionPane.showMessageDialog(JFrameProyecto5, "INTRODUZCA UNA FECHA VALIDA [DD/MM/AAAA]", "ERROR",
		                            JOptionPane.ERROR_MESSAGE);
		                }

		            }
		        });

		btnNext.setForeground(new Color(255, 255, 204));
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext.setBackground(new Color(102, 0, 51));
		btnNext.setBounds(482, 347, 93, 36);
		JFrameProyecto5.getContentPane().add(btnNext);
		
		JLabel lblEdad_1 = new JLabel("EDAD");
		lblEdad_1.setBackground(new Color(255, 255, 255));
		lblEdad_1.setForeground(new Color(51, 0, 51));
		lblEdad_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEdad_1.setBounds(74, 194, 113, 21);
		JFrameProyecto5.getContentPane().add(lblEdad_1);
		
		JLabel lblGenero = new JLabel("GÉNERO");
		lblGenero.setForeground(new Color(51, 0, 51));
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGenero.setBounds(74, 112, 113, 30);
		JFrameProyecto5.getContentPane().add(lblGenero);
		
		final JLabel lblEdad = new JLabel("Edad : ");
		lblEdad.setForeground(new Color(75, 0, 130));
		lblEdad.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblEdad.setBounds(358, 225, 110, 23);
		JFrameProyecto5.getContentPane().add(lblEdad);
		
		JLabel lblTitle = new JLabel("REGÍSTRATE");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(new Color(51, 0, 102));
		lblTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 42));
		lblTitle.setBorder(null);
		lblTitle.setBackground(new Color(0, 0, 51));
		lblTitle.setBounds(0, 11, 609, 78);
		JFrameProyecto5.getContentPane().add(lblTitle);
		
		JComboBox comboGenero = new JComboBox();
		comboGenero.setBackground(new Color(192, 192, 192));
		comboGenero.setForeground(new Color(72, 61, 139));
		comboGenero.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboGenero.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer", "Otro"}));
		comboGenero.setBounds(315, 115, 200, 29);
		JFrameProyecto5.getContentPane().add(comboGenero);
		
		final JSlider sliderEdad = new JSlider();
		sliderEdad.setMinimum(16);
		sliderEdad.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		sliderEdad.setOpaque(false);
		sliderEdad.setBorder(null);
		sliderEdad.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblEdad.setText("Edad: "+sliderEdad.getValue());
			}
		});
		sliderEdad.setPaintLabels(true);
		sliderEdad.setMajorTickSpacing(16);
		sliderEdad.setForeground(new Color(75, 0, 130));
		sliderEdad.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		sliderEdad.setAutoscrolls(true);
		sliderEdad.setBackground(Color.DARK_GRAY);
		sliderEdad.setToolTipText("");
		sliderEdad.setValue(18);
		sliderEdad.setPaintTicks(true);
		sliderEdad.setBounds(315, 168, 200, 51);
		JFrameProyecto5.getContentPane().add(sliderEdad);
		
		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondo.setIcon(new ImageIcon(Proyecto3.class.getResource("/Imagenes/Premium Vector _ 3d shapes background.jpg")));
		lblFondo.setBounds(0, 0, 609, 417);
		JFrameProyecto5.getContentPane().add(lblFondo);
	}
}
