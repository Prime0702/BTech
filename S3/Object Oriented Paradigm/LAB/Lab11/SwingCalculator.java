package labSwing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingCalculator {
	
	String buttonValue;
	String textValue;
	String num1,num2,oper=null;
	int n1,n2;
	int calcu;
	
	SwingCalculator()
	{
		JFrame f=new JFrame("Swing Calculator");
		Container cp=f.getContentPane();
		
		JTextField tfDisplay=new JTextField();
		tfDisplay.setPreferredSize(new Dimension(250,25));
		cp.add(tfDisplay,BorderLayout.NORTH);
		
		JButton b1=new JButton("1");	JButton b2=new JButton("2");
		JButton b3=new JButton("3");	JButton b4=new JButton("4");
		JButton b5=new JButton("5");	JButton b6=new JButton("6");
		JButton b7=new JButton("7");	JButton b8=new JButton("8");
		JButton b9=new JButton("9");	JButton b0=new JButton("0");
		
		JButton bc=new JButton("C");
		
		JButton oa=new JButton("+");	JButton os=new JButton("-");	
		JButton om=new JButton("*");	JButton od=new JButton("/");	
		JButton oe=new JButton("=");	
		
		JPanel panelButtons=new JPanel();
		panelButtons.add(b7);	panelButtons.add(b8);
		panelButtons.add(b9);	panelButtons.add(oa);
		panelButtons.add(b4);	panelButtons.add(b5);
		panelButtons.add(b6);	panelButtons.add(os);
		panelButtons.add(b1);	panelButtons.add(b2);
		panelButtons.add(b3);	panelButtons.add(om);
		panelButtons.add(bc);	panelButtons.add(b0);
		panelButtons.add(oe);	panelButtons.add(od);
		
		panelButtons.setLayout(new GridLayout(4,4));
		
		cp.add(panelButtons,BorderLayout.CENTER);
		
		ActionListener numButtons=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				buttonValue=e.getActionCommand();
				
				if(oper==null)
				{
					if(num1==null)
					{
						num1=buttonValue;
					}else {
						num1+=buttonValue;

					}
				}else {
					if(num2==null)
					{
						num2=buttonValue;
					}else {
						num2+=buttonValue;

					}
				}
				
				textValue=tfDisplay.getText();
				textValue+=buttonValue;
				
				tfDisplay.setText(textValue);
				
			}
		};
		
		b0.addActionListener(numButtons);	b1.addActionListener(numButtons);
		b2.addActionListener(numButtons);	b3.addActionListener(numButtons);
		b4.addActionListener(numButtons);	b5.addActionListener(numButtons);
		b6.addActionListener(numButtons);	b7.addActionListener(numButtons);
		b8.addActionListener(numButtons);	b9.addActionListener(numButtons);	
		
		
		ActionListener opButtons=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				buttonValue=e.getActionCommand();
				
				if(buttonValue!="=")
				{
					textValue=tfDisplay.getText();
					
					
					if(oper==null)
					{
						oper=buttonValue;
					}
					
					textValue+=buttonValue;
					
					
					tfDisplay.setText(textValue);
				}else if(buttonValue=="=") {
				
					n1=Integer.parseInt(num1);
					n2=Integer.parseInt(num2);
					
					if(oper=="+")
					{
						calcu=n1+n2;
					}else if(oper=="-") {
						calcu=n1-n2;
					}else if(oper=="*") {
						calcu=n1*n2;
					}else if(oper=="/") {
						calcu=n1/n2;
					}
					
					textValue=String.valueOf(calcu);
					tfDisplay.setText(textValue);
					
					num1=textValue;
					oper=num2=null;
				}
				
			}
		};
		
		oa.addActionListener(opButtons);	os.addActionListener(opButtons);
		om.addActionListener(opButtons);	od.addActionListener(opButtons);
		oe.addActionListener(opButtons);
		
		ActionListener cButton=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				num1=num2=oper=null;
				
				tfDisplay.setText(null);
				
			}
		};
		
		bc.addActionListener(cButton);
		
		f.setSize(300,200);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingCalculator();
		
	}
}
