import java.util.Scanner;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sc = new School();
		Class2 cs = new Class2();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int scan3;

		for (;;) {
			System.out.printf(" 1.�б� ���� �Է� \n 2.�б� ���� ��� \n 3.����ó�� \n 4.���Ƹ����� \n 5.����� \n 6.������ \n ��ȣ�� �Է��ϼ��� : ");
			scan3 = scan2.nextInt();

			if (scan3 == 1) {
				System.out.printf("�б� �̸��� �Է��ϼ��� : ");
				sc.setName(scan.next());

				System.out.printf("�а� �̸��� �Է��ϼ��� : ");
				sc.setDepartment(scan.next());

				System.out.printf("��/��/�� �Է��ϼ��� : ");
				sc.setClass1(scan.next());

			} else if (scan3 == 2) {
				System.out.printf("�б��̸��� %s �а��̸��� %s �̰�  %s(��)�б� �Դϴ�\n", sc.getName(), sc.getDepartment(), sc.getClass1());
			} else if (scan3 == 3) {
				cs.achievement();
			} else if (scan3 == 4){
				cs.Circles();
			} else if (scan3 == 5){
				cs.CompensationAndPunishment();
			} else if(scan3 == 6){
				break;
			}
		}

	}
}