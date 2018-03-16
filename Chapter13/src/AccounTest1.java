import java.util.*;

class Accoun1 {
	public int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		this.balance = balance;
	}
}

public class AccounTest1 {
	public static void main(String[] args) {
		int scan;
		Accoun1 obj = new Accoun1();
		Scanner s = new Scanner(System.in);
		System.out.println("돈을 입력하세요:");
		scan = s.nextInt();
		if (0 > scan) {
			System.out.printf("에러");
		} else {
			obj.setBalance(scan);

		System.out.println("돈은 " + obj.getBalance() + "원 있습니다");
		}
	}

}
