package SwingGUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.math.*;
import java.awt.event.*;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
public class Calculator  {

	private JFrame frmCalculator;
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	void comp(){
		if(op1.equals("+")) {
			a1 = a1 + a2;
			textField.setText(a1.toString());
			
		}
		
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}
	static int a=0;
	static int b=0;
	static String op1;
	String op2="+";
	static Double a1 = 0.0;
	static Double a2 = 0.0;
	static boolean b1=false,b2,b3,b4;
	/**
	 * Initialize the contents of the frame.
	 */
	static void operate() {
		if(op1.equals("+")) {
			a1 = a1 + a2;
		}
		else if(op1.equals("-")) {
			a1 = a1 - a2;
		}
		else if(op1.equals("*")) {
			a1 = a1 * a2;
		}
		else {
			a1 = a1 / a2;
		}
	}
			
	
	private void initialize() {
		
		frmCalculator = new JFrame();
		
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.getContentPane().addKeyListener(new KeyAdapter() {
			
		});
		frmCalculator.setBounds(450, 300, 450, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
				button_16.setEnabled(false);;
			}
		});
		button_16.setBounds(360, 233, 72, 35);
		frmCalculator.getContentPane().add(button_16);
		
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_7  ) {
					String s = textField.getText();
					textField.setText(s + "7");
					}
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent VK_7) {
				if (b1 == true) {
					textField.setText("");
					b1 = false;
				}
				
				String s = textField.getText();
				textField.setText(s + "7");
			}
		});
	
		btnNewButton.setBounds(13, 93, 75, 35);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("8");
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_8  ) {
					String s = textField.getText();
					textField.setText(s + "8");
					}
				
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b1 == true) {
					textField.setText("");
					b1 = false;
				}
				String s = textField.getText();
				textField.setText(s + "8");
			}
		});
		button.addKeyListener(null);
		
		button.setBounds(100, 93, 75, 35);
		frmCalculator.getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("9");
		btnNewButton_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_9  ) {
					String s = textField.getText();
					textField.setText(s + "9");
					}
				
			}
		});
		btnNewButton_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_8) {
					String s = textField.getText();
					textField.setText(s + "8");
				}
					
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b1 == true) {
					textField.setText("");
					b1 = false;
				}
				String s = textField.getText();
				textField.setText(s + "9");
			}
		
		});
	
		btnNewButton_1.setBounds(184, 93, 72, 35);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton button_2 = new JButton("4");
		button_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_4  ) {
					String s = textField.getText();
					textField.setText(s + "4");
					}
				
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b1 == true) {
					textField.setText("");
					b1 = false;
				}
				String s = textField.getText();
				textField.setText(s + "4");
			}
		});
		button_2.setBounds(13, 140, 75, 35);
		frmCalculator.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_5  ) {
					String s = textField.getText();
					textField.setText(s + "5");
					}
				
			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b1 == true) {
					textField.setText("");
					b1 = false;
				}
				String s = textField.getText();
				textField.setText(s + "5");
			}
		});
		button_3.setBounds(100, 140, 72, 35);
		frmCalculator.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_6  ) {
					String s = textField.getText();
					textField.setText(s + "6");
					}
				
			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b1 == true) {
					textField.setText("");
					b1 = false;
				}
				String s = textField.getText();
				textField.setText(s + "6");
			}
		});
		button_4.setBounds(184, 140, 72, 35);
		frmCalculator.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_1  ) {
					String s = textField.getText();
					textField.setText(s + "1");
					}
				
			}
		});
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b1 == true) {
					textField.setText("");
					b1 = false;
				}
				String s = textField.getText();
				textField.setText(s + "1");
				
			}
		});
		button_5.setBounds(13, 187, 75, 35);
		frmCalculator.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_2  ) {
					String s = textField.getText();
					textField.setText(s + "2");
					}
				
			}
		});
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b1 == true) {
					textField.setText("");
					b1 = false;
				}
				String s = textField.getText();
				textField.setText(s + "2");
			
			}
		});
		button_6.setBounds(100, 187, 75, 35);
		frmCalculator.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_3  ) {
					String s = textField.getText();
					textField.setText(s + "3");
					}
				
			}
		});
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b1 == true) {
					textField.setText("");
					b1 = false;
				}
				
					String s = textField.getText();
					textField.setText(s + "3");
				
			}
		});
		button_7.setBounds(184, 187, 75, 35);
		frmCalculator.getContentPane().add(button_7);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(13, 46, 419, 35);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b2==true) {
					textField_1.setText("");
					b2  = false;
					a2 = 0.0;
				}
				a2 = Double.parseDouble((textField.getText()));
				textField_1.setText(textField_1.getText() + a2 + "+");
				op1 = op2;
				op2 = "+";
				Calculator.operate();
				textField.setText(a1.toString());
				b1 = true;
				button_16.setEnabled(true);
				
			}
		});
		btnNewButton_2.setBounds(268, 140, 75, 82);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("X");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b2==true) {
					textField_1.setText("");
					b2  = false;
					a2 = 0.0;
				}
				a2 = Double.parseDouble((textField.getText()));
				textField_1.setText(textField_1.getText() + a2 + "x");
				op1 = op2;
				op2 = "*";
				Calculator.operate();
				textField.setText(a1.toString());
				b1 = true;
			}
		});
		btnNewButton_4.setBounds(356, 140, 73, 35);
		frmCalculator.getContentPane().add(btnNewButton_4);
		
		JButton button_1 = new JButton("/");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b2==true) {
					textField_1.setText("");
					b2  = false;
					a2 = 0.0;
				}
				a2 = Double.parseDouble((textField.getText()));
				textField_1.setText(textField_1.getText() + a2 + "/");
				op1 = op2;
				op2 = "/";
				Calculator.operate();
				textField.setText(a1.toString());
				b1 = true;
			}
		});
		button_1.setBounds(357, 187, 73, 35);
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_8 = new JButton("=");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1==true) {
					int a = textField_1.getText().length();
					textField_1.setText(textField_1.getText().substring(0, a-1));
					b1 = false;
					b2 = true;
					a1 =0.0;
					a2 = 0.0;
					op2 = "+";
				}
				else {
				a2 = Double.parseDouble(textField.getText());
				textField_1.setText(textField_1.getText() + a2);
				op1 = op2;
				Calculator.operate();
				textField.setText(a1.toString());
				b2 = true;
				a1 = 0.0;
				a2 = 0.0;
				op2 = "+";
				}
				if(Double.parseDouble(textField.getText()) < 0) {
					b3 = true;
				}
				else {
					b3 =false;
				}
			}
		});
		button_8.setBounds(184, 234, 72, 35);
		frmCalculator.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b2==true) {
					textField_1.setText("");
					b2  = false;
					a2 = 0.0;
				}
			a2 = Double.parseDouble((textField.getText()));
			textField_1.setText(textField_1.getText() + a2 + "-");
			
			op1 = op2;
			op2 = "-";
			Calculator.operate();
			textField.setText(a1.toString());
			b1 = true;
			}
		});
		button_9.setBounds(269, 234, 73, 35);
		frmCalculator.getContentPane().add(button_9);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(13, 6, 419, 35);
		frmCalculator.getContentPane().add(textField_1);
		
		JButton btnNewButton_3 = new JButton("AC");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1 = 0.0;
				a2 = 0.0;
				textField_1.setText("");
				textField.setText("");
				 a=0;
				 b=0;
				
				 op2="+";
				 a1 = 0.0;
				 a2 = 0.0;
				
			}
		});
		btnNewButton_3.setBounds(268, 93, 75, 35);
		frmCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnC.setBounds(355, 93, 75, 35);
		frmCalculator.getContentPane().add(btnC);
		
		JButton btnSq_1 = new JButton("-/+");
		btnSq_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b3==false) {
					textField.setText("-" + textField.getText());
					b3 = true;
				}
				else {
					int c = textField.getText().length();
					textField.setText(textField.getText().substring(1, c));
					b3 = false;
				}
			}
		});
		btnSq_1.setBounds(13, 234, 75, 35);
		frmCalculator.getContentPane().add(btnSq_1);
		
		
		
		JButton button_10 = new JButton("0");
		button_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_0  ) {
					String s = textField.getText();
					textField.setText(s + "0");
					}
				
			}
		});
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (b1 == true) {
					textField.setText("");
					b1 = false;
				}
				String s = textField.getText();
				textField.setText(s + "0");
			}
		});
		button_10.setBounds(100, 233, 75, 35);
		frmCalculator.getContentPane().add(button_10);
		
		
		
		
		
	}
}
