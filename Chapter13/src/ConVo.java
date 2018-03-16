import java.util.*;

public class ConVo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		char s2;
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.printf("문자열을 입력하세요 : ");
		s = scan.next();
		for (int i = 0; i < s.length(); i++) {
			s2 = s.charAt(i);
			if (s2 >= 'A' && s2 <= 'Z') {
				count1++;
			} else if (s2 >= 'a' && s2 <= 'z') {
				count2++;
			} else if (s2 >= '0' && s2 <= '9') {
				count3++;
			} else if (s2 >= '!' && s2 <= 'ω') {
				count4++;
			}

		}
		System.out.println(
				"대문자는 \t" + count1 + "개 \n소문자는\t" + count2 + "개 \n숫자는\t" + count3 + " 개 \n특수문자는" + count4 + "개 입니다");

	}

}
