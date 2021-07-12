package Calculator;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class calculator {
	static boolean num = true;
	public static void main(String[] args) {
				
		JFrame frm = new JFrame("계산기");
		
		frm.setSize(340, 450);
		
		frm.setLocationRelativeTo(null);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout Fla = new FlowLayout();
		
		frm.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel();
		lb1.setBounds(60, 10, 300, 60);
		lb1.setText("계산기");
		lb1.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel();
		lb2.setBounds(60, 30, 300, 50);
		lb2.setText(" ");
		frm.getContentPane().add(lb2);
				
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn0 = new JButton("0");
		JButton btndot = new JButton(".");
		JButton btnequal = new JButton("=");
		JButton btnplus = new JButton("+");
		
		btn1.setBounds(80, 80, 50, 50);
		btn2.setBounds(130, 80, 50, 50);
		btn3.setBounds(180, 80, 50, 50);
		btn4.setBounds(80, 130, 50, 50);
		btn5.setBounds(130, 130, 50, 50);
		btn6.setBounds(180, 130, 50, 50);
		btn7.setBounds(80, 180, 50, 50);
		btn8.setBounds(130, 180, 50, 50);
		btn9.setBounds(180, 180, 50, 50);
		btn0.setBounds(80, 230, 50, 50);
		btndot.setBounds(130, 230, 50, 50);
		btnequal.setBounds(180, 230, 50, 50);
		btnplus.setBounds(230, 210, 50, 70);
		
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(btn2);
		frm.getContentPane().add(btn3);
		frm.getContentPane().add(btn4);
		frm.getContentPane().add(btn5);
		frm.getContentPane().add(btn6);
		frm.getContentPane().add(btn7);
		frm.getContentPane().add(btn8);
		frm.getContentPane().add(btn9);
		frm.getContentPane().add(btn0);
		frm.getContentPane().add(btndot);
		frm.getContentPane().add(btnequal);
		frm.getContentPane().add(btnplus);
		
		btn1.addActionListener(event -> {
			lb2.setText(lb2.getText() + 1);
		});
		
		btn2.addActionListener(event -> {
			lb2.setText(lb2.getText() + 2);
		});
		
		btn3.addActionListener(event -> {
			lb2.setText(lb2.getText() + 3);
		});
		
		btn4.addActionListener(event -> {
			lb2.setText(lb2.getText() + 4);
		});
		
		btn5.addActionListener(event -> {
			lb2.setText(lb2.getText() + 5);
		});
		
		btn6.addActionListener(event -> {
			lb2.setText(lb2.getText() + 6);
		});
		
		btn7.addActionListener(event -> {
			lb2.setText(lb2.getText() + 7);
		});
		
		btn8.addActionListener(event -> {
			lb2.setText(lb2.getText() + 8);
		});
		
		btn9.addActionListener(event -> {
			lb2.setText(lb2.getText() + 9);
		});
		
		btn0.addActionListener(event -> {
			lb2.setText(lb2.getText() + 0);
		});
		
		btndot.addActionListener(event -> {
			if(num) {
				lb2.setText(lb2.getText() + '.');
			num = false;
			}
		});
		
		btnequal.addActionListener(event -> {
			if(num) {
				lb2.setText(lb2.getText() + '=');
			num = false;	
			}
		}); 
		
		btnplus.addActionListener(event -> {
				lb2.setText(lb2.getText() + '+');
			num = true;
			
		}); 
		
			
					frm.setVisible(true);
	}
}
