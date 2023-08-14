package labSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCounter  {

	public SwingCounter() {
		JFrame f = new JFrame();
		
		JLabel l=new JLabel("Counter");
		l.setBounds(10,5,50,30);
		f.add(l);
		
		JTextField tf=new JTextField("0");
		tf.setBounds(70,5,100,30);
		f.add(tf);
		
		JButton b=new JButton("Count");
		b.setBounds(190,5,80,30);
		f.add(b);
		
		ActionListener c=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i=Integer.parseInt(tf.getText());
				i++;
				String data=String.valueOf(i);
				
				tf.setText(data);

			}
		};
		
		b.addActionListener(c);
		
		
		f.setSize(300, 100);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
		
	}

	public static void main(String[] args) {

		new SwingCounter();
	}

	
}
