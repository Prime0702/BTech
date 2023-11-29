package labSwing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class temperatureConvertor {
	
		float data;
		float op;
		String output;
		
	public temperatureConvertor() {
		
		JFrame f=new JFrame("Temperature Convertor");
		Container cp=f.getContentPane();
		
		JLabel cel=new JLabel("Celcius:");
		
		JLabel faren=new JLabel("Farenheit:");
		
		TextField ctf=new TextField("0");
		
		TextField ftf=new TextField("0");
		
		cp.add(cel);
		cp.add(ctf);
		cp.add(faren);
		cp.add(ftf);
		
		cp.setLayout(new GridLayout(2,2));
		
		TextListener tl=new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {

				if(e.getSource()==ctf)
				{
					data=Float.parseFloat(ctf.getText());

					op=((9.0f/5.0f)*data)+32.0f;
					
					output=String.format("%.1f",op);
					
					ftf.setText(output);
					
				}else if(e.getSource()==ftf)
				{
					data=Float.parseFloat(ftf.getText());

					op=((data-32.0f)*(5.0f/9.0f));
					
					output=String.format("%.1f",op);
					
					ctf.setText(output);
				}
				
			}
		};
		
		ctf.addTextListener(tl);
		ftf.addTextListener(tl);
		
		f.setSize(350,100);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new temperatureConvertor();
	}
}
