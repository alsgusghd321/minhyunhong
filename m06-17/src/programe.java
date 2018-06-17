import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class programe {
	static class sungjuk {
		sungjuk() {
			// TODO Auto-generated method stub
			Dimension dim = new Dimension(900, 400);
			JFrame frame = new JFrame();
			JPanel p1 = new JPanel();
			p1.setLayout(new GridLayout(0, 3, 20, 0));
			p1.add(new Button("이름"));
			JTextField tf1 = new JTextField("");
			JButton bt1 = new JButton("추가");
			p1.add(tf1);
			p1.add(bt1);

			JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout(0, 3, 20, 0));
			p2.add(new Button("국어점수"));
			JTextField tf2 = new JTextField("");
			p2.add(tf2);

			JButton bt3 = new JButton("제거");
			p2.add(bt3) ;

			JPanel p3 = new JPanel();
			p3.setLayout(new GridLayout(0, 3, 20, 0));
			p3.add(new Button("영어 점수"));
			JTextField tf3 = new JTextField("");
			p3.add(tf3);

			p3.add(new JButton("수정"));

			JPanel p4 = new JPanel();
			p4.setLayout(new GridLayout(0, 3, 20, 0));
			p4.add(new Button("수학 점수"));
			JTextField tf4 = new JTextField("");
			p4.add(tf4);

			JPanel p5 = new JPanel();
			p5.setLayout(new GridLayout(4, 0, 0, 20));
			p5.add(p1);
			p5.add(p2);
			p5.add(p3);
			p5.add(p4);

			JTable table;

			String[] fieldname = { "이름", "국어점수", "영어점수", "수학점수", "총점", "평균" };
			String[][] data = { { "초", "", "", "", "", "" }, { "기", "", "", "", "", "" }, { "값", "", "", "", "", "" },

			};

			DefaultTableModel model = new DefaultTableModel(data, fieldname);
			JTable table1 = new JTable(model);
			JScrollPane sp = new JScrollPane(table1);

			bt1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					String str[] = new String[3];

					str[0] = tf1.getText();

					str[1] = tf2.getText();

					str[2] = tf3.getText();

					model.addRow(str);

					str[0] = "";
					str[1] = "";
					str[2] = "";

				}
			});

			bt3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (table1.getSelectedRow() == -1)

					{

						return;

					}

					else {

						int row = table1.getSelectedRow();

						model.removeRow(row);

					}
				}

			});

			JPanel p6 = new JPanel();
			p6.setLayout(new GridLayout(0, 1, 0, 20));
			p6.add(sp);

			frame.setLocation(200, 400);
			frame.setPreferredSize(dim);

			frame.setLayout(new GridLayout(0, 2, 20, 20));
			frame.add(p5);
			frame.add(p6);
			frame.setVisible(true);
			frame.pack();
		}
	}

	public static void main(String[] args) {
		new sungjuk();
	}
}