import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 59; // ����
		int guess;
		Scanner sc = new Scanner(System.in);
		int tries = 0;

		do {
			System.out.print("������ �����Ͽ� ������: ");
			guess = sc.nextInt();
			tries++;

			if (guess > answer) {
				System.out.println("������ ������ �����ϴ�.");
			}
			if (guess < answer) {
				System.out.println("������ ������ �����ϴ�.");
			}

		} while (guess != answer);
		System.out.println("�����մϴ�. �����Դϴ�. �õ�Ƚ����" + tries);
	}

}