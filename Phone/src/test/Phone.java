package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Phone extends JFrame  {
	
	JPanel main_panel; 						// 버튼을 붙여질 메인 패널 선원
	
	JButton bt_1, bt_2; 					// 버튼
	
	public Phone() {
		setTitle("JButton 예제"); 			// 프레임 타이틀바 텍스트 지정
		setSize(300,160);				    // 프레임 크기 조정(픽셀)
											// 프레임바 우측상단에 X버튼에 대한 강제종료 기능 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_panel = new JPanel(); 			// 패널 객체화 / 기본배치관리자 FlowLayout
		
		JButton bt_1 = new JButton("전화번호 입력"); // 버튼 객체화, 버튼에 텍스트 "버튼"으로 지정
        JButton bt_2 = new JButton("전화번호 출력");
        
        JLabel label = new JLabel("라벨");
		
        
		main_panel.add(bt_1); 				// 메인패널에 버튼1을 붙인다
        main_panel.add(bt_2); 				// 메인패널에 버튼2을 붙인다
		main_panel.add(label);				// 메인패널에 라벨을 붙이기
		
		add(main_panel); 					// 메인 프레임에 메인패널을 붙여주는 작업
		
		setVisible(true); 					// 프레임 보이게 하기
	}
	
	public static void main(String[] args) {
		new Phone();
	}
}