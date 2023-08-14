package labSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingFactorial {

	public SwingFactorial() {
		
		JFrame f = new JFrame();
		
		JLabel l1=new JLabel("n");
		l1.setBounds(30,5,10,30);
		f.add(l1);
		
		JTextField tf1=new JTextField("1");
		tf1.setBounds(50,5,80,30);
		f.add(tf1);
		
		JLabel l2=new JLabel("factorial(n)");
		l2.setBounds(135,5,75,30);
		f.add(l2);
		
		JTextField tf2=new JTextField("1");
		tf2.setBounds(210,5,100,30);
		f.add(tf2);
		
		JButton b=new JButton("Next");
		b.setBounds(320,5,60,30);
		f.add(b);
		
		ActionListener fact=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int n=Integer.parseInt(tf1.getText());
				n++;
				
				int facto=1;
				
				for(int i=1;i<=n;i++)
				{
					facto*=i;
				}
				
				String opN=String.valueOf(n);
				String opFacto=String.valueOf(facto);
				
				tf1.setText(opN);
				tf2.setText(opFacto);		
			}
		};
		
		b.addActionListener(fact);
		
		f.setSize(400,100);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingFactorial();
	}
	
}
