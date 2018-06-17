import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class sdsad {
	public static void main(String[] args){
		Dimension dim = new Dimension(800,400);
		
		JFrame frame = new JFrame("자바숙제");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		JTextField tf1 = new JTextField();
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.X_AXIS));
		panel1.add(new JLabel("이름:"));
		panel1.add(tf1);
		
		JTextField tf2 = new JTextField();
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
		panel2.add(new JLabel("수학:"));
		panel2.add(tf2);

		JTextField tf3 = new JTextField();
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3,BoxLayout.X_AXIS));
		panel3.add(new JLabel("국어:"));
		panel3.add(tf3);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS));
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);
		
		JButton bt1 = new JButton("입력");
		JButton bt2 = new JButton("수정");
		JButton bt3 = new JButton("삭제");
		
		JPanel panel5 = new JPanel();
		panel5.add(bt1);
		panel5.add(bt2);
		panel5.add(bt3);
		
		
		
		String[] fieldname = {"이름","수학","국어"};
		String[][] data= {
				{"1","2","3"},
				{"5","6","7"},
				{"9","10","11"},
				
		};
			


		DefaultTableModel model=new DefaultTableModel(data, fieldname);
		JTable table1=new JTable(model);
		JScrollPane sp = new JScrollPane(table1);
		
		frame.add(panel5,BorderLayout.SOUTH);
		frame.add(sp,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.CENTER);
		frame.setVisible(true);
		frame.pack();
		
		bt1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str[]=new String[3];

				

				str[0]=tf1.getText();

				str[1]=tf2.getText();

				str[2]=tf3.getText();
				
				model.addRow(str);
				
				str[0] = "";
				str[1] = "";
				str[2] = "";
				
			}
			
		});
		
		bt2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(table1.getSelectedRow()==-1)

				{

					return;

				}

				else{
					String str1[]=new String[3];
					
					str1[0]=tf1.getText();

					str1[1]=tf2.getText();

					str1[2]=tf3.getText();

					int row = table1.getSelectedRow();
					
					model.removeRow(row);
					model.addRow(str1);
					
					str1[0]="";
					str1[1]="";
					str1[2]="";
					
				}
			}
			
		});
		
		bt3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(table1.getSelectedRow()==-1)

				{

					return;

				}

				else{
					

					int row = table1.getSelectedRow();
					
					model.removeRow(row);
					
					
				}
			}
			
		});
		
	}
}


/*
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class sdsad {
	public static void main(String[] args) {
		Dimension dim = new Dimension(800, 400);

		JFrame frame = new JFrame("자바숙제");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);

		JTextField tf1 = new JTextField();

		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.add(new JLabel("이름:"));
		panel1.add(tf1);

		JTextField tf2 = new JTextField();

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.add(new JLabel("수학:"));
		panel2.add(tf2);

		JTextField tf3 = new JTextField();

		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		panel3.add(new JLabel("국어:"));
		panel3.add(tf3);

		JPanel panel4 = new JPanel();
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);

		JButton bt1 = new JButton("입력");
		JButton bt2 = new JButton("수정");
		JButton bt3 = new JButton("삭제");

		JPanel panel5 = new JPanel();
		panel5.add(bt1);
		panel5.add(bt2);
		panel5.add(bt3);

		String[] fieldname = { "이름", "수학", "국어" };
		String[][] data = { { "1", "2", "3" }, { "5", "6", "7" }, { "9", "10", "11" },

		};

		DefaultTableModel model = new DefaultTableModel(data, fieldname);
		JTable table1 = new JTable(model);
		JScrollPane sp = new JScrollPane(table1);

		frame.add(panel5, BorderLayout.SOUTH);
		frame.add(sp, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.pack();

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
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

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (table1.getSelectedRow() == -1)

				{

					return;

				}

				else {
					String str[] = new String[3];

					int row;

					str[0] = tf1.getText();

					str[1] = tf2.getText();

					str[2] = tf3.getText();

					row = table1.getSelectedRow();

				}
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
					String str[] = new String[3];

					int row;

					str[0] = tf1.getText();

					str[1] = tf2.getText();

					str[2] = tf3.getText();

					removeRow();

				}
			}

		});

	}
}
*/