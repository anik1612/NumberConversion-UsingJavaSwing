package SwingApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class NumberConversion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField jtf1;
	private String[] convertMethod = {"None", "Binary", "Octal", "HexaDeciaml"};
	private JTextField jtf2;
	@SuppressWarnings("rawtypes")
	private JComboBox cb1;
	private JLabel DevName;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberConversion frame = new NumberConversion();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public NumberConversion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jl1 = new JLabel("Enter any Decimal Number");
		jl1.setFont(new Font("Tahoma", Font.BOLD, 15));
		jl1.setBounds(12, 30, 216, 40);
		contentPane.add(jl1);
		
		jtf1 = new JTextField();
		jtf1.setBounds(240, 29, 150, 41);
		contentPane.add(jtf1);
		jtf1.setColumns(10);
		
		cb1 = new JComboBox(convertMethod);
		cb1.setBackground(Color.WHITE);
		cb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb1.setBounds(242, 105, 148, 41);
		contentPane.add(cb1);
		
		JLabel jl2 = new JLabel("Choose Conversional Method");
		jl2.setFont(new Font("Tahoma", Font.BOLD, 15));
		jl2.setBounds(12, 105, 216, 41);
		contentPane.add(jl2);
		
		jtf2 = new JTextField();
		jtf2.setColumns(10);
		jtf2.setBounds(240, 187, 150, 41);
		contentPane.add(jtf2);
		
		JLabel jl3 = new JLabel("");
		jl3.setFont(new Font("Tahoma", Font.BOLD, 15));
		jl3.setBounds(12, 188, 216, 40);
		contentPane.add(jl3);
		
		DevName = new JLabel("Developer: Anik Sarker");
		DevName.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		DevName.setBackground(Color.BLACK);
		DevName.setForeground(Color.BLACK);
		DevName.setBounds(248, 427, 184, 26);
		contentPane.add(DevName);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("OCR A Extended", Font.BOLD, 20));
		btnNewButton.setBounds(124, 304, 174, 46);
		contentPane.add(btnNewButton);
		setTitle("NumberConversion");
		
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(cb1.getSelectedItem().equals("Binary")) {

					String numInput = jtf1.getText();
					int n = Integer.parseInt(numInput);
					String binary = Integer.toBinaryString(n);
					jtf2.setText(binary);
					jl3.setText("Decimal to Binary");
				}
//				else if() {
//					
//				}else if() {
//					
//				}else {
//					
//				}
			}
		});
		
		
		
		
	}
}
