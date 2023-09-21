package labSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCounterButtons3  {
	
	public SwingCounterButtons3 () {
		JFrame f = new JFrame();

		JLabel l = new JLabel("Counter");
		l.setBounds(10, 5, 50, 30);
		f.add(l);

		JTextField tf = new JTextField("0");
		tf.setBounds(70, 5, 100, 30);
		f.add(tf);

		JButton up = new JButton("Count Up");
		up.setBounds(175, 5, 90, 30);
		f.add(up);
		
		ActionListener upl=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				int ip=Integer.parseInt(tf.getText());
				ip++;
				
				String op=String.valueOf(ip);
				
				tf.setText(op);
			}
		};
		up.addActionListener(upl);
		
		
		JButton down = new JButton("Count Down");
		down.setBounds(270, 5, 110, 30);
		f.add(down);
		
		ActionListener dl=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				int ip=Integer.parseInt(tf.getText());
				ip--;
				
				String op=String.valueOf(ip);
				
				tf.setText(op);
			}
		};
		down.addActionListener(dl);
		
		JButton res = new JButton("Reset");
		res.setBounds(385, 5, 90, 30);
		f.add(res);
		
		ActionListener rl=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				int ip=0;
				
				String op=String.valueOf(ip);
				
				tf.setText(op);
			}
		};
		res.addActionListener(rl);


		f.setSize(500, 100);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingCounterButtons3();
	}
}
