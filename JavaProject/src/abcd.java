import java.awt.*;
import javax.swing.*;

public class abcd{
	public static void main(String[] args) {
Dimension dim = new Dimension(800,400);

JFrame frame = new JFrame("�ڹټ���");
frame.setLocation(200,400);
frame.setPreferredSize(dim);

JPanel panel1 = new JPanel();
panel1.setLayout(new BoxLayout(panel1,BoxLayout.X_AXIS));
panel1.add(new JLabel("�̸�:"));
panel1.add(new JTextField());

JPanel panel2 = new JPanel();
panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
panel2.add(new JLabel("����:"));
panel2.add(new JTextField());

JPanel panel3 = new JPanel();
panel3.setLayout(new BoxLayout(panel3,BoxLayout.X_AXIS));
panel3.add(new JLabel("����:"));
panel3.add(new JTextField());

JPanel panel4 = new JPanel();
panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS));
panel4.add(panel1);
panel4.add(panel2);
panel4.add(panel3);

JTable table;
String[] fieldname = {"�̸�","����","����","����"};
String[][] data= {{"1","2","3","4"},
		{"5","6","7","8"},
		{"9","10","11","12"},
};

table = new JTable(data,fieldname);
JScrollPane sp = new JScrollPane(table);

frame.add(sp,BorderLayout.EAST);
frame.add(panel4,BorderLayout.CENTER);
frame.add(new JButton("�Է��ϱ�"),BorderLayout.SOUTH);
frame.setVisible(true);
frame.pack();
	}
}