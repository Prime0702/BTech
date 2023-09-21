package labSwing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Jdbc {
	Connection c;
	Statement s = null;
	ResultSet result;
	ResultSetMetaData md;

	int d = 0;
	String data[][];
	int row;

	JFrame f;
	JMenuBar mb;

	String id;
	String newPrice;

	String error = null;

	JTable t;
	JScrollPane sp;

	String lr;
	String hr;

	String title[] = { "ID", "TITLE", "AUTHOR", "PRICE", "QTY" };

	Jdbc() {

		f = new JFrame();

		mb = new JMenuBar();

		JMenu m = new JMenu("Table Operations");

		JMenuItem m1 = new JMenuItem("Display");
		JMenuItem m2 = new JMenuItem("Update");
		JMenuItem m3 = new JMenuItem("Search");
		JMenuItem m4 = new JMenuItem("Delete");
		JMenuItem m5 = new JMenuItem("Insert");
		JMenuItem m6 = new JMenuItem("Close");

		resetUI();

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == m1) {
					try {
						resetUI();
						c = DriverManager.getConnection("jdbc:postgresql://localhost/javaLab10", "postgres",
								"lakeford");

						s = c.createStatement();

						String count = "select count(*) from books;";
						result = s.executeQuery(count);
						result.next();
						row = result.getInt(1);

						String select = "select * from books";
						result = s.executeQuery(select);

						String[][] data = new String[row][5];
						int k = 0;

						while (result.next()) {

							int id = result.getInt("id");
							String oid = String.valueOf(id);

							String title = result.getString("title");
							String author = result.getString("author");

							float price = result.getFloat("price");
							String oprice = String.valueOf(price);

							int qty = result.getInt("qty");
							String oqty = String.valueOf(qty);

							data[k][0] = oid;
							data[k][1] = title;
							data[k][2] = author;
							data[k][3] = oprice;
							data[k][4] = oqty;

							k++;
						}

						t = new JTable(data, title);
						sp = new JScrollPane(t);
						JPanel p1 = new JPanel();

						p1.add(sp);
						f.add(p1, BorderLayout.CENTER);
						f.setSize(500, 500);
						f.setVisible(true);

						s.close();
						c.close();

					} catch (Exception er) {
						System.err.println(er.getClass().getName() + ": " + er.getMessage());
						System.exit(0);
					}
				} else if (e.getSource() == m2) {
					resetUI();

					JTextField idtf = new JTextField();

					JLabel idl = new JLabel("id : ");

					JTextField ptf = new JTextField();

					JLabel pl = new JLabel("new price : ");

					JPanel p2 = new JPanel();
					p2.add(idl);
					p2.add(idtf);
					p2.add(pl);
					p2.add(ptf);

					p2.setPreferredSize(new Dimension(400, 100));
					p2.setLayout(new GridLayout(2, 2));
					p2.setSize(300, 200);

					JButton bup = new JButton("Update");

					f.add(bup, BorderLayout.SOUTH);

					f.getContentPane().add(p2, BorderLayout.CENTER);
					f.pack();
					f.setVisible(true);

					ActionListener al2 = new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							id = idtf.getText();
							newPrice = ptf.getText();

							try {
								c = DriverManager.getConnection("jdbc:postgresql://localhost/javaLab10", "postgres",
										"lakeford");

								s = c.createStatement();

								String update = "update books set price =" + newPrice + " where id=" + id;
								s.execute(update);

								String count = "select count(*) from books where id=" + id + ";";
								result = s.executeQuery(count);
								result.next();
								row = result.getInt(1);

							} catch (SQLException er) {
								error = er.getClass().getName() + ": " + er.getMessage();
							}

							System.out.println(row);

							if (row != 0 && error == null) {
								JOptionPane.showMessageDialog(bup, "SUCCESS", "UPDATION SUCCESS",
										JOptionPane.INFORMATION_MESSAGE);
							} else if (row == 0 || error != null) {
								JOptionPane.showMessageDialog(bup, "ERROR", "NOT UPDATED", JOptionPane.ERROR_MESSAGE);
							}

						}
					};

					bup.addActionListener(al2);

				} else if (e.getSource() == m3) {

					resetUI();

					JTextField lrtf = new JTextField();

					JLabel lrl = new JLabel("lower range : ");

					JTextField hrtf = new JTextField();

					JLabel hrl = new JLabel("higher range : ");

					JPanel p3 = new JPanel();
					p3.add(lrl);
					p3.add(lrtf);
					p3.add(hrl);
					p3.add(hrtf);

					p3.setPreferredSize(new Dimension(400, 100));
					p3.setLayout(new GridLayout(2, 2));
					p3.setSize(300, 200);

					JButton bs = new JButton("Search");

					f.add(bs, BorderLayout.SOUTH);

					f.getContentPane().add(p3, BorderLayout.CENTER);
					f.pack();
					f.setVisible(true);

					ActionListener al3 = new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							lr = lrtf.getText();
							hr = hrtf.getText();
							resetUI();

							try {

								c = DriverManager.getConnection("jdbc:postgresql://localhost/javaLab10", "postgres",
										"lakeford");

								s = c.createStatement();

								String count = "select count(*) from books;";
								result = s.executeQuery(count);
								result.next();
								row = result.getInt(1);

								String select = "select * from books where price between " + lr + " and " + hr + " ;";
								result = s.executeQuery(select);

								String[][] data = new String[row][5];
								int k = 0;

								while (result.next()) {

									int id = result.getInt("id");
									String oid = String.valueOf(id);

									String title = result.getString("title");
									String author = result.getString("author");

									float price = result.getFloat("price");
									String oprice = String.valueOf(price);

									int qty = result.getInt("qty");
									String oqty = String.valueOf(qty);

									data[k][0] = oid;
									data[k][1] = title;
									data[k][2] = author;
									data[k][3] = oprice;
									data[k][4] = oqty;

									k++;
								}

								resetUI();

								t = new JTable(data, title);
								sp = new JScrollPane(t);
								JPanel p3 = new JPanel();

								p3.add(sp);
								f.add(p3, BorderLayout.CENTER);
								f.setSize(500, 500);
								f.setVisible(true);

								s.close();
								c.close();

							} catch (Exception er) {
								System.err.println(er.getClass().getName() + ": " + er.getMessage());
								System.exit(0);
							}

						}
					};
					bs.addActionListener(al3);

				} else if (e.getSource() == m4) {

					resetUI();

					String result = (String) JOptionPane.showInputDialog("Enter Id:");

					System.out.println(result);

					try {
						c = DriverManager.getConnection("jdbc:postgresql://localhost/javaLab10", "postgres",
								"lakeford");

						s = c.createStatement();
						String delete = "delete from books where id=" + result + ";";

						s.execute(delete);
					} catch (Exception er) {
						System.err.println(er.getClass().getName() + ": " + er.getMessage());
					}

				} else if (e.getSource() == m5) {
					
					resetUI();
					JTextField idtf = new JTextField();

					JLabel idl = new JLabel("id : ");

					JTextField titletf = new JTextField();

					JLabel titlel = new JLabel("title :");
					
					JTextField authortf = new JTextField();

					JLabel authorl = new JLabel("author : ");

					JTextField pricetf = new JTextField();

					JLabel pricel = new JLabel("price :");
					
					JTextField qtytf = new JTextField();

					JLabel qtyl = new JLabel("qty :");

					JPanel p4 = new JPanel();
					p4.add(idl);
					p4.add(idtf);
					p4.add(titlel);
					p4.add(titletf);
					p4.add(authorl);
					p4.add(authortf);
					p4.add(pricel);
					p4.add(pricetf);
					p4.add(qtyl);
					p4.add(qtytf);

					p4.setPreferredSize(new Dimension(400, 150));
					p4.setLayout(new GridLayout(5,5));
					p4.setSize(300, 200);

					JButton bi = new JButton("Insert");

					f.add(bi, BorderLayout.SOUTH);

					f.getContentPane().add(p4, BorderLayout.CENTER);
					f.pack();
					f.setVisible(true);
					
					ActionListener al5=new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String id=idtf.getText();
							String title=titletf.getText();
							String author=authortf.getText();
							String price=pricetf.getText();
							String qty=qtytf.getText();
							
							try {
								c = DriverManager.getConnection("jdbc:postgresql://localhost/javaLab10", "postgres", "lakeford");

								s = c.createStatement();
								String insert = "INSERT INTO books (ID,title,author,price,qty) VALUES ("+id+",'"+title+"','"+author+"',"+price+","+qty+");";

								s.execute(insert);
							}catch (Exception er) {
								System.err.println(er.getClass().getName() + ": " + er.getMessage());
							}
						}
					};
					
					bi.addActionListener(al5);
					
					
				} else if (e.getSource() == m6) {
					System.exit(0);
				}
			}
		};

		m1.addActionListener(al);
		m2.addActionListener(al);
		m3.addActionListener(al);
		m4.addActionListener(al);
		m5.addActionListener(al);
		m6.addActionListener(al);

		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		m.add(m5);
		m.add(m6);

		mb.add(m);

		f.setSize(500, 500);
		f.setVisible(true);
	}

	void resetUI() {
		f.getContentPane().removeAll();
		f.repaint();
		f.add(mb, BorderLayout.NORTH);
	}

	public static void main(String[] args) {

		new Jdbc();
	}
}
