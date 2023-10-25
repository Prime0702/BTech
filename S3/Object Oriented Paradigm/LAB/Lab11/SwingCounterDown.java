import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCounterDown {

	public SwingCounterDown() {
		JFrame f = new JFrame();

		JLabel l = new JLabel("Counter");
		l.setBounds(10, 5, 50, 30);
		f.add(l);

		JTextField tf = new JTextField("88");
		tf.setBounds(70, 5, 100, 30);
		f.add(tf);

		JButton b = new JButton("Count Down");
		b.setBounds(175, 5, 110, 30);
		f.add(b);

		ActionListener c = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(tf.getText());
				i--;
				String data = String.valueOf(i);

				tf.setText(data);

			}
		};

		b.addActionListener(c);

		f.setSize(315, 100);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {

		new SwingCounterDown();
	}

}
