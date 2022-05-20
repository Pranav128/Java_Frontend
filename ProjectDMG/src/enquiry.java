import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class enquiry extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton rdbtnNewRadioButton,rdbtnNo ;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					enquiry frame = new enquiry();
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
	public enquiry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(0, 0, 1268, 733);
		contentPane = new JPanel();
//		contentPane.setBackground(Color.WHITE);
		contentPane.setBackground(new Color(47,255,35));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		
		
		JPanel panel_2 = new JPanel();
//		panel_2.setBackground(Color.WHITE);
		panel_2.setBackground(new Color(47,255,35));
		panel_2.setBounds(0, -27, 246, 530);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(36, 39, 130, 36);
//		contentPane.add(lblNewLabel);
		panel_2.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Phone No");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1.setBounds(36, 100, 130, 36);
//		contentPane.add(lblNewLabel_1);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Address");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(36, 160, 130, 36);
//		contentPane.add(lblNewLabel_1_1);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Budget");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(36, 228, 130, 36);
//		contentPane.add(lblNewLabel_1_1_1);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Loan/Finance");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_2.setBounds(36, 293, 180, 36);
//		contentPane.add(lblNewLabel_1_1_2);
		panel_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Expected Date");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_3.setBounds(36, 359, 193, 36);
//		contentPane.add(lblNewLabel_1_1_3);
		panel_2.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Types");
		lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_4.setBounds(36, 421, 130, 36);
//		contentPane.add(lblNewLabel_1_1_4);
		panel_2.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Low Speed");
		lblNewLabel_1_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_5.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_5.setBounds(36, 486, 180, 36);
//		contentPane.add(lblNewLabel_1_1_5);
		panel_2.add(lblNewLabel_1_1_5);
		
		JPanel panel = new JPanel();
//		panel.setBackground(Color.WHITE);
		panel.setBackground(new Color(47,255,35));
		panel.setBounds(0, 552, 659, 137);
		panel.setLayout(null);
		contentPane.add(panel);
		panel.setVisible(false);
		
		JLabel lblNewLabel_1_1_5_1 = new JLabel("High Speed");
		lblNewLabel_1_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_5_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_5_1.setBounds(33, 11, 180, 36);
		panel.add(lblNewLabel_1_1_5_1);
		
		JLabel lblNewLabel_1_1_5_2 = new JLabel("Licence No");
		lblNewLabel_1_1_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_5_2.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_5_2.setBounds(33, 76, 180, 36);
		panel.add(lblNewLabel_1_1_5_2);
		
		
		JPanel panel_1 = new JPanel();
//		panel_1.setBackground(Color.WHITE);
		panel_1.setBackground(new Color(47,255,35));
		panel_1.setBounds(236, -15, 423, 530);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.controlHighlight);
		textField.setFont(new Font("Mangal", Font.BOLD, 16));
		textField.setBounds(23, 24, 332, 37);
		panel_1.add(textField);
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setFont(new Font("Mangal", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(23, 94, 332, 37);
		textField_1.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setFont(new Font("Mangal", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(23, 217, 332, 37);
		textField_2.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.controlHighlight);
		textField_3.setFont(new Font("Mangal", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(23, 284, 332, 37);
		textField_3.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.controlHighlight);
		textField_4.setFont(new Font("Mangal", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(23, 415, 332, 37);
//		textField_4.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));   //this or
		textField_4.setBorder(new LineBorder(new Color(0, 0, 0))); 	 														 //this for border
		panel_1.add(textField_4);     
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setFont(new Font("Arial Black", Font.BOLD, 11));
		slider.setBorder(new LineBorder(new Color(0, 0, 0)));
		slider.setForeground(Color.BLACK);
		slider.setValue(40);
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(20);
		slider.setMaximum(120);
		slider.setMinimum(40);
		slider.setSnapToTicks(true);
		slider.setBounds(20, 471, 396, 50);
		panel_1.add(slider);
		
		JSpinner spinner = new JSpinner();
		spinner.setBackground(SystemColor.controlHighlight);
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 21));
		spinner.setModel(new SpinnerDateModel(new Date(1651084200000L), new Date(1646073000000L), new Date(1735669800000L), Calendar.MONTH));
		spinner.setBounds(23, 354, 268, 31);
//		spinner.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		panel_1.add(spinner);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.controlHighlight);
		textArea.setColumns(5);
		textArea.setRows(4);
		textArea.setBounds(23, 150, 332, 47);
		textArea.setFont(new Font("Mangal", Font.BOLD, 16));
		
	    textArea.setBorder(BorderFactory.createCompoundBorder(border,
	            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
	    panel_1.add(textArea);
		
		textField_5 = new JTextField();
		textField_5.setBackground(SystemColor.controlHighlight);
		textField_5.setFont(new Font("Mangal", Font.BOLD, 16));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(258, 84, 332, 31);
		textField_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textField_5);
		
		JSlider slider_1 = new JSlider();
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(slider_1.getValue() > 40)
				{
//					System.out.println(slider_1.getValue());
					textField_5.setEditable(true);
				}
			}
		});
		slider_1.setValue(40);
		slider_1.setSnapToTicks(true);
		slider_1.setPaintTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setMinorTickSpacing(10);
		slider_1.setMinimum(40);
		slider_1.setMaximum(120);
		slider_1.setMajorTickSpacing(20);
		slider_1.setForeground(Color.BLACK);
		slider_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		slider_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		slider_1.setBounds(258, 11, 399, 50);
		panel.add(slider_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.setBackground(SystemColor.controlHighlight);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected())
				{
					panel.setVisible(true);
				}
			}
		});
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(288, 522, 111, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBackground(SystemColor.controlHighlight);
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if(rdbtnNo.isSelected())
				{
					panel.setVisible(false);
				}
				
			
			}
		});
		rdbtnNo.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNo.setFont(new Font("Arial Black", Font.BOLD, 15));
		rdbtnNo.setBounds(446, 522, 111, 23);
		contentPane.add(rdbtnNo);
		
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNo);
		
		JLabel lblNewLabel_1_1_5_3 = new JLabel("Want High Speed?");
		lblNewLabel_1_1_5_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_5_3.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblNewLabel_1_1_5_3.setBounds(33, 518, 228, 36);
		contentPane.add(lblNewLabel_1_1_5_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(47,255,35));
		panel_3.setBounds(663, 0, 649, 535);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\bike2-removebg-preview.png"));
		lblNewLabel_2.setBounds(0, 151, 538, 395);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Lucida Bright", Font.BOLD, 58));
		lblNewLabel_3.setBounds(49, 11, 550, 194);
		panel_3.add(lblNewLabel_3);
		lblNewLabel_3.setText("<html>THE NEW <br>REVOLUTION <br>IS ELECTRIC....!!</html>");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(663, 534, 649, 155);
		panel_4.setBackground(new Color(47,255,35));
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				        String name =textField.getText();
						String no =textField_1.getText();
						String address =textArea.getText();
						String budget =textField_2.getText();
						String loan =textField_3.getText();
						String date ="01/05/2022";
						String types =textField_4.getText();
						String l_speed =""+slider.getValue();
						String want = "Yes";
						String h_speed = ""+slider_1.getValue();
						String lience  = textField_5.getText();
						
						InsertIntoDatabase.insert(name,no,address,budget,loan,date,types,l_speed,want,h_speed,lience);
						
						
				
			}
		});
		btnNewButton.setForeground(SystemColor.windowText);
		btnNewButton.setBackground(SystemColor.textHighlightText);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(58, 39, 193, 70);
		panel_4.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
				if(a==JOptionPane.YES_OPTION){  
				    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				    dispose();
				} 
			}
		});
		btnCancel.setForeground(SystemColor.windowText);
		btnCancel.setBackground(SystemColor.textHighlightText);
		btnCancel.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnCancel.setBounds(318, 39, 193, 70);
		panel_4.add(btnCancel);
		
	}
}
