import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JLabel;

public class Tictactoe extends JFrame {

	private JPanel contentPane;
	static int fdg=-1;
	static int fg2=-1;
	static int fg3=-2;
	static int fg4=-3;
	static int fg5=-4;
	static int fg6=-5;
	static int fg7=-6;
	static int fg8=-7;
	static int fg9=-8;
	static int fg22=-9;
	static int fg24=-6;
	static int fp=-6;

	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactoe frame = new Tictactoe();
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
	public Tictactoe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 12, 176, 159);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 95));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fdg==0) {
					btnNewButton.setText("O");
					fg2=0;
					fdg=1;
					btnNewButton.setForeground(new Color(255, 255, 0));
				}
				else if(fdg==1) {
					fg2=1;
					fdg=0;
					btnNewButton.setText("X");
					btnNewButton.setForeground(new Color(255, 0, 0));
				}
				if((fg2==fg8 && fg8==fg22) || (fg6==fg5 && fg5==fg4) || (fg9==fg7 && fg7==fg3) || (fg2==fg3 && fg3==fg4) || (fg8==fg5 && fg5==fg7) || (fg6==fg9 && fg9==fg22) || (fg2==fg8 && fg8==fg22) || (fg2==fg6 && fg6==fg7) || (fg4==fg7 && fg7==fg22)) {
			        if(fp!=fdg) {
			        	textField.setText(textField.getText()+" Win");
			        }
			        else {
			        	textField.setText("Opponent "+"Win");
			        }
				}
			}
		    
			});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(0, 0, 176, 159);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(10, 177, 176, 159);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 95));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fdg==0) {
					fg3=0;
					fdg=1;
					btnNewButton_3.setText("O");
					btnNewButton_3.setForeground(new Color(255, 255, 0));
				}
				else if(fdg==1) {
					fg3=1;
					fdg=0;
					btnNewButton_3.setText("X");
					btnNewButton_3.setForeground(new Color(255, 0, 0));
				}
				if((fg2==fg8 && fg8==fg22) || (fg6==fg5 && fg5==fg4) || (fg9==fg7 && fg7==fg3) || (fg2==fg3 && fg3==fg4) || (fg8==fg5 && fg5==fg7) || (fg6==fg9 && fg9==fg22) || (fg2==fg8 && fg8==fg22) || (fg2==fg6 && fg6==fg7) || (fg4==fg7 && fg7==fg22)) {
					 if(fp!=fdg) {
				        	textField.setText(textField.getText()+" Win");
				        }
				        else {
				        	textField.setText("Opponent "+"Win");
				        }
			    }
			}
		});
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setBounds(0, 0, 176, 159);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 0, 0));
		panel_1_1.setBounds(10, 341, 176, 159);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 95));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fdg==0) {
					fg4=0;
					fdg=1;
					btnNewButton_8.setText("O");
					btnNewButton_8.setForeground(new Color(255, 255, 0));
				}
				else if(fdg==1) {
					fg4=1;
					fdg=0;
					btnNewButton_8.setText("X");
					btnNewButton_8.setForeground(new Color(255, 0, 0));
				}
				if((fg2==fg8 && fg8==fg22) || (fg6==fg5 && fg5==fg4) || (fg9==fg7 && fg7==fg3) || (fg2==fg3 && fg3==fg4) || (fg8==fg5 && fg5==fg7) || (fg6==fg9 && fg9==fg22) || (fg2==fg8 && fg8==fg22) || (fg2==fg6 && fg6==fg7) || (fg4==fg7 && fg7==fg22)) {
					 if(fp!=fdg) {
				        	textField.setText(textField.getText()+" Win");
				        }
				        else {
				        	textField.setText("Opponent "+"Win");
				        }
			    }
			}
		});
		btnNewButton_8.setBackground(Color.BLACK);
		btnNewButton_8.setBounds(0, 0, 176, 159);
		panel_1_1.add(btnNewButton_8);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(0, 0, 0));
		panel_1_1_1.setBounds(192, 341, 176, 159);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 95));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fdg==0) {
					fg5=0;
					fdg=1;
					btnNewButton_7.setText("O");
					btnNewButton_7.setForeground(new Color(255, 255, 0));
				}
				else if(fdg==1) {
					fg5=1;
					fdg=0;
					btnNewButton_7.setText("X");
					btnNewButton_7.setForeground(new Color(255, 0, 0));
				}
				if((fg2==fg8 && fg8==fg22) || (fg6==fg5 && fg5==fg4) || (fg9==fg7 && fg7==fg3) || (fg2==fg3 && fg3==fg4) || (fg8==fg5 && fg5==fg7) || (fg6==fg9 && fg9==fg22) || (fg2==fg8 && fg8==fg22) || (fg2==fg6 && fg6==fg7) || (fg4==fg7 && fg7==fg22)) {
					 if(fp!=fdg) {
				        	textField.setText(textField.getText()+" Win");
				        }
				        else {
				        	textField.setText("Opponent "+"Win");
				        }
			    }
			}
		});
		btnNewButton_7.setBackground(Color.BLACK);
		btnNewButton_7.setBounds(0, 0, 176, 159);
		panel_1_1_1.add(btnNewButton_7);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(new Color(0, 0, 0));
		panel_1_1_1_1.setBounds(375, 341, 176, 159);
		contentPane.add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 95));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fdg==0) {
					fg6=0;
					fdg=1;
					btnNewButton_6.setText("O");
					btnNewButton_6.setForeground(new Color(255, 255, 0));
				}
				else if(fdg==1) {
					fg6=1;
					fdg=0;
					btnNewButton_6.setText("X");
					btnNewButton_6.setForeground(new Color(255, 0, 0));
				}
				if((fg2==fg8 && fg8==fg22) || (fg6==fg5 && fg5==fg4) || (fg9==fg7 && fg7==fg3) || (fg2==fg3 && fg3==fg4) || (fg8==fg5 && fg5==fg7) || (fg6==fg9 && fg9==fg22) || (fg2==fg8 && fg8==fg22) || (fg2==fg6 && fg6==fg7) || (fg4==fg7 && fg7==fg22)) {
					 if(fp!=fdg) {
				        	textField.setText(textField.getText()+" Win");
				        }
				        else {
				        	textField.setText("Opponent "+"Win");
				        }
			    }
			}
		});
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setBounds(0, 0, 176, 159);
		panel_1_1_1_1.add(btnNewButton_6);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBackground(new Color(0, 0, 0));
		panel_1_1_1_2.setBounds(192, 177, 176, 159);
		contentPane.add(panel_1_1_1_2);
		panel_1_1_1_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 95));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fdg==0) {
					fg7=0;
					fdg=1;
					btnNewButton_4.setText("O");
					btnNewButton_4.setForeground(new Color(255, 255, 0));
				}
				else if(fdg==1) {
					fg7=1;
					fdg=0;
					btnNewButton_4.setText("X");
					btnNewButton_4.setForeground(new Color(255, 0, 0));
				}
				if((fg2==fg8 && fg8==fg22) || (fg6==fg5 && fg5==fg4) || (fg9==fg7 && fg7==fg3) || (fg2==fg3 && fg3==fg4) || (fg8==fg5 && fg5==fg7) || (fg6==fg9 && fg9==fg22) || (fg2==fg8 && fg8==fg22) || (fg2==fg6 && fg6==fg7) || (fg4==fg7 && fg7==fg22)) {
					 if(fp!=fdg) {
				        	textField.setText(textField.getText()+" Win");
				        }
				        else {
				        	textField.setText("Opponent "+"Win");
				        }
			    }
			}
		});
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setBounds(0, 0, 176, 159);
		panel_1_1_1_2.add(btnNewButton_4);
		
		JPanel panel_1_1_1_2_1 = new JPanel();
		panel_1_1_1_2_1.setBackground(new Color(0, 0, 0));
		panel_1_1_1_2_1.setBounds(192, 12, 176, 159);
		contentPane.add(panel_1_1_1_2_1);
		panel_1_1_1_2_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 95));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fdg==0) {
					fg8=0;
					fdg=1;
					btnNewButton_1.setText("O");
					btnNewButton_1.setForeground(new Color(255, 255, 0));
				}
				else if(fdg==1) {
					fg8=1;
					fdg=0;
					btnNewButton_1.setText("X");
					btnNewButton_1.setForeground(new Color(255, 0, 0));
				}
				if((fg2==fg8 && fg8==fg22) || (fg6==fg5 && fg5==fg4) || (fg9==fg7 && fg7==fg3) || (fg2==fg3 && fg3==fg4) || (fg8==fg5 && fg5==fg7) || (fg6==fg9 && fg9==fg22) || (fg2==fg8 && fg8==fg22) || (fg2==fg6 && fg6==fg7) || (fg4==fg7 && fg7==fg22)) {
					 if(fp!=fdg) {
				        	textField.setText(textField.getText()+" Win");
				        }
				        else {
				        	textField.setText("Opponent "+"Win");
				        }
			    }
			}
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(0, 0, 176, 159);
		panel_1_1_1_2_1.add(btnNewButton_1);
		
		JPanel panel_1_1_1_2_2 = new JPanel();
		panel_1_1_1_2_2.setBackground(new Color(0, 0, 0));
		panel_1_1_1_2_2.setBounds(375, 177, 176, 159);
		contentPane.add(panel_1_1_1_2_2);
		panel_1_1_1_2_2.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 95));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fdg==0) {
					fg9=0;
					fdg=1;
					btnNewButton_5.setText("O");
					btnNewButton_5.setForeground(new Color(255, 255, 0));
				}
				else if(fdg==1) {
					fg9=1;
					fdg=0;
					btnNewButton_5.setText("X");
					btnNewButton_5.setForeground(new Color(255, 0, 0));
				}
				if((fg2==fg8 && fg8==fg22) || (fg6==fg5 && fg5==fg4) || (fg9==fg7 && fg7==fg3) || (fg2==fg3 && fg3==fg4) || (fg8==fg5 && fg5==fg7) || (fg6==fg9 && fg9==fg22) || (fg2==fg8 && fg8==fg22) || (fg2==fg6 && fg6==fg7) || (fg4==fg7 && fg7==fg22)) {
					 if(fp!=fdg) {
				        	textField.setText(textField.getText()+" Win");
				        }
				        else {
				        	textField.setText("Opponent "+"Win");
				        }
			    }
			}
		});
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setBounds(0, 0, 176, 159);
		panel_1_1_1_2_2.add(btnNewButton_5);
		
		JPanel panel_1_1_1_2_3 = new JPanel();
		panel_1_1_1_2_3.setBackground(new Color(0, 0, 0));
		panel_1_1_1_2_3.setBounds(375, 12, 176, 159);
		contentPane.add(panel_1_1_1_2_3);
		panel_1_1_1_2_3.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 95));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fdg==0) {
					fg22=0;
					fdg=1;
					btnNewButton_2.setText("O");
					btnNewButton_2.setForeground(new Color(255, 255, 0));
				}
				else if(fdg==1) {
					fg22=1;
					fdg=0;
					btnNewButton_2.setText("X");
					btnNewButton_2.setForeground(new Color(255, 0, 0));
				}
				if((fg2==fg8 && fg8==fg22) || (fg6==fg5 && fg5==fg4) || (fg9==fg7 && fg7==fg3) || (fg2==fg3 && fg3==fg4) || (fg8==fg5 && fg5==fg7) || (fg6==fg9 && fg9==fg22) || (fg2==fg8 && fg8==fg22) || (fg2==fg6 && fg6==fg7) || (fg4==fg7 && fg7==fg22)) {
					 if(fp!=fdg) {
				        	textField.setText(textField.getText()+" Win");
				        }
				        else {
				        	textField.setText("Opponent "+"Win");
				        }
				}
			}
		});
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(0, 0, 176, 159);
		panel_1_1_1_2_3.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 245, 238));
		panel_2.setBounds(561, 11, 211, 489);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    Welcome");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
		lblNewLabel.setBounds(18, 39, 183, 40);
		panel_2.add(lblNewLabel);
		
		JLabel lblTo = new JLabel("            to");
		lblTo.setForeground(new Color(128, 0, 0));
		lblTo.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
		lblTo.setBounds(18, 84, 135, 40);
		panel_2.add(lblTo);
		
		JLabel lblTictactoe = new JLabel("      Tic Tac Toe");
		lblTictactoe.setForeground(new Color(128, 0, 0));
		lblTictactoe.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
		lblTictactoe.setBounds(0, 128, 211, 40);
		panel_2.add(lblTictactoe);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 128, 128));
		textField.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		textField.setBounds(10, 309, 191, 54);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("X");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					fdg=1;
					fp=1;
			}
		});
		btnNewButton_10.setBounds(10, 404, 52, 23);
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_10_1 = new JButton("O");
		btnNewButton_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					fdg=0;
					fp=0;
			}
		});
		btnNewButton_10_1.setBounds(94, 404, 52, 23);
		panel_2.add(btnNewButton_10_1);
	}
}
