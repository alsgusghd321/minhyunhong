package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Phone extends JFrame  {
	
	JPanel main_panel; 						// ��ư�� �ٿ��� ���� �г� ����
	
	JButton bt_1, bt_2; 					// ��ư
	
	public Phone() {
		setTitle("JButton ����"); 			// ������ Ÿ��Ʋ�� �ؽ�Ʈ ����
		setSize(300,160);				    // ������ ũ�� ����(�ȼ�)
											// �����ӹ� ������ܿ� X��ư�� ���� �������� ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_panel = new JPanel(); 			// �г� ��üȭ / �⺻��ġ������ FlowLayout
		
		JButton bt_1 = new JButton("��ȭ��ȣ �Է�"); // ��ư ��üȭ, ��ư�� �ؽ�Ʈ "��ư"���� ����
        JButton bt_2 = new JButton("��ȭ��ȣ ���");
        
        JLabel label = new JLabel("��");
		
        
		main_panel.add(bt_1); 				// �����гο� ��ư1�� ���δ�
        main_panel.add(bt_2); 				// �����гο� ��ư2�� ���δ�
		main_panel.add(label);				// �����гο� ���� ���̱�
		
		add(main_panel); 					// ���� �����ӿ� �����г��� �ٿ��ִ� �۾�
		
		setVisible(true); 					// ������ ���̰� �ϱ�
	}
	
	public static void main(String[] args) {
		new Phone();
	}
}