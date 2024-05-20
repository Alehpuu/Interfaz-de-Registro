import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
public class Proyecto4 {

	JFrame JFrameProyecto4;
	private ButtonGroup bg2 = new ButtonGroup();
	private JTextField textTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto4 window = new Proyecto4();
					window.JFrameProyecto4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Proyecto4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrameProyecto4 = new JFrame();
		JFrameProyecto4.setBounds(100, 100, 621, 452);
		JFrameProyecto4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrameProyecto4.getContentPane().setLayout(null);
		JFrameProyecto4.setResizable(false);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Plan familiar: -25% de descuento ");

		chckbxNewCheckBox.setForeground(new Color(51, 0, 51));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(70, 293, 305, 23);
		JFrameProyecto4.getContentPane().add(chckbxNewCheckBox);
		
		final JRadioButton RadioButton2 = new JRadioButton("600 megas 19.90€/mes");
		RadioButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float precio = 19.90f;
				float calculoTotal = precio * 12;
				float descuento = (float) (calculoTotal * 0.75);
				DecimalFormat formatoDecimal = new DecimalFormat("0.00");
				if (chckbxNewCheckBox.isSelected()) {
					textTotal.setText(formatoDecimal.format(descuento)+ "€");
				} else {
					textTotal.setText(formatoDecimal.format(calculoTotal)+ "€");
				}
			}
		});
		RadioButton2.setForeground(new Color(51, 0, 51));
		RadioButton2.setFont(new Font("Tahoma", Font.BOLD, 16));
		RadioButton2.setOpaque(false);
		RadioButton2.setBounds(182, 207, 221, 23);
		JFrameProyecto4.getContentPane().add(RadioButton2);
		
		final JRadioButton RadioButton3 = new JRadioButton("950 megas 28.70€/mes");
		RadioButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float precio = 28.70f;
				float calculoTotal = precio * 12;
				float descuento = (float) (calculoTotal * 0.75);
				 DecimalFormat formatoDecimal = new DecimalFormat("0.00");
				if (chckbxNewCheckBox.isSelected()) {
					textTotal.setText(formatoDecimal.format(descuento)+ "€");
				} else {
					textTotal.setText(formatoDecimal.format(calculoTotal)+ "€");
				}
			}
		});
		RadioButton3.setForeground(new Color(51, 0, 51));
		RadioButton3.setFont(new Font("Tahoma", Font.BOLD, 16));
		RadioButton3.setOpaque(false);
		RadioButton3.setBounds(182, 249, 221, 23);
		JFrameProyecto4.getContentPane().add(RadioButton3);
		
		final JRadioButton RadioButton1 = new JRadioButton("Gratuito");
		RadioButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTotal.setText("0€");
			}
		});
		RadioButton1.setForeground(new Color(51, 0, 51));
		RadioButton1.setFont(new Font("Tahoma", Font.BOLD, 16));
		RadioButton1.setOpaque(false);
		RadioButton1.setBounds(182, 163, 109, 23);
		JFrameProyecto4.getContentPane().add(RadioButton1);
		
		bg2.add(RadioButton1);
		bg2.add(RadioButton2);
		bg2.add(RadioButton3);
		
		JLabel lblPlan = new JLabel("Seleccione un plan:");
		lblPlan.setForeground(new Color(51, 0, 51));
		lblPlan.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPlan.setBounds(70, 119, 236, 23);
		JFrameProyecto4.getContentPane().add(lblPlan);
		
		JButton btnFinish = new JButton("FINISH");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (RadioButton1.isSelected() || RadioButton2.isSelected() || RadioButton3.isSelected()) {
					JOptionPane.showMessageDialog(JFrameProyecto4, "El valor total es: " + textTotal.getText() ,"Valor total",JOptionPane.INFORMATION_MESSAGE);
					JFrameProyecto4.dispose();
				}else {
					JOptionPane.showMessageDialog(JFrameProyecto4, "DEBE SELECCIONAR UN PLAN DE PAGO" ,"ERROR",JOptionPane.ERROR_MESSAGE);
				}
			
			}
		});
		btnFinish.setForeground(new Color(255, 255, 204));
		btnFinish.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnFinish.setBackground(new Color(102, 0, 51));
		btnFinish.setBounds(483, 349, 93, 36);
		JFrameProyecto4.getContentPane().add(btnFinish);
		
		JLabel lblTitle = new JLabel("PLANES DE PAGO");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(new Color(51, 0, 102));
		lblTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 42));
		lblTitle.setBorder(null);
		lblTitle.setBackground(new Color(0, 0, 51));
		lblTitle.setBounds(0, 11, 609, 78);
		JFrameProyecto4.getContentPane().add(lblTitle);
		
		JLabel lblNewLabel = new JLabel("TOTAL: ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(70, 337, 90, 14);
		JFrameProyecto4.getContentPane().add(lblNewLabel);
		
		textTotal = new JTextField();
		textTotal.setForeground(new Color(255, 255, 255));
		textTotal.setBackground(new Color(153, 0, 153));
		textTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		textTotal.setEditable(false);
		textTotal.setBounds(137, 333, 109, 23);
		JFrameProyecto4.getContentPane().add(textTotal);
		textTotal.setColumns(10);
		textTotal.setText("0.0€");
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondo.setIcon(new ImageIcon(Proyecto4.class.getResource("/Imagenes/Premium Vector _ 3d shapes background.jpg")));
		lblFondo.setBounds(0, 0, 609, 417);
		JFrameProyecto4.getContentPane().add(lblFondo);
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					float precio = 0;					
					if (RadioButton2.isSelected()) {
						precio = 19.90f*12;
					} else if (RadioButton3.isSelected()){
						precio = 28.70f*12;
					}			
					 DecimalFormat formatoDecimal = new DecimalFormat("0.00");
				if (chckbxNewCheckBox.isSelected()) {
					float descuento = (float) (precio * 0.75);
						textTotal.setText(formatoDecimal.format(descuento)+ "€");
					} else {
						textTotal.setText(formatoDecimal.format(precio)+ "€");
					}
				}
				
		});
	}

}
