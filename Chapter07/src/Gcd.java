import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, r;
		System.out.printf("�ΰ��� ������ �Է��ϼ���. (ū��, ������) : ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();

		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("�ִ� �������" + x);
	}
}