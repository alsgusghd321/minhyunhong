import java.util.Scanner;

public class DeaSo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeaSoclass d = new DeaSoclass();
		Scanner scan = new Scanner(System.in);
		System.out.printf("문자열을 입력하세요: ");
		d.de = scan.nextLine();
		d.banbok();
		System.out.println("대문자 : " +d.count+ "소문자 :" +d.count1);
	}
}

class DeaSoclass {
	String de;
	char s;
    int count = 0, count1 = 0;

	void banbok() {
		for (int i = 0; i < de.length(); i++) {
			s = de.charAt(i);
			if (s >= 'a' && s <= 'z') {
				count++;
			} else if (s >= 'A' && s <= 'Z') {
				count1++;
			}
		}
	}
}
