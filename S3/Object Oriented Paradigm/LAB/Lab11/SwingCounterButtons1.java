package labSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCounterButtons1 implements ActionListener{

	JTextField tf ;
	
	public SwingCounterButtons1() {
		JFrame f = new JFrame();

		JLabel l = new JLabel("Counter");
		l.setBounds(10, 5, 50, 30);
		f.add(l);

		tf = new JTextField("0");
		tf.setBounds(70, 5, 100, 30);
		f.add(tf);

		JButton up = new JButton("Count Up");
		up.setBounds(175, 5, 90, 30);
		up.addActionListener(this);
		f.add(up);
		
		
		JButton down = new JButton("Count Down");
		down.setBounds(270, 5, 110, 30);
		down.addActionListener(this);
		f.add(down);
		
		JButton res = new JButton("Reset");
		res.setBounds(385, 5, 90, 30);
		res.addActionListener(this);
		f.add(res);


		f.setSize(500, 100);
		f.setLayout(null);
		f.setVisible(true);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String data=e.getActionCommand();
		
		int ip=Integer.parseInt(tf.getText());
		
		if(data=="Count Up")
		{
			ip++;
		}else if(data=="Count Down")
		{
			ip--;
		}else if(data=="Reset")
		{
			ip=0;
		}
		
		String op=String.valueOf(ip);
		
		tf.setText(op);
		
	}
	
	
	public static void main(String[] args) {
		
		new SwingCounterButtons1();
	}

	
}
