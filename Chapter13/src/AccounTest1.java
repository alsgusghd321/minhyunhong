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
		System.out.println("���� �Է��ϼ���:");
		scan = s.nextInt();
		if (0 > scan) {
			System.out.printf("����");
		} else {
			obj.setBalance(scan);

		System.out.println("���� " + obj.getBalance() + "�� �ֽ��ϴ�");
		}
	}

}