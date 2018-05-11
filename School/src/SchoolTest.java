import java.util.Scanner;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sc = new School();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int scan3;

		for (;;) {
			System.out.printf(" 1.학교 정보 입력 \n 2.학교 정보 출력 \n 3.나가기 \n 번호를 입력하세요 : ");
			scan3 = scan2.nextInt();

			if (scan3 == 1) {
				System.out.printf("학교 이름을 입력하세요 : ");
				sc.setName(scan.next());

				System.out.printf("학과 이름을 입력하세요 : ");
				sc.setDepartment(scan.next());

				System.out.printf("초/중/고 입력하세요 : ");
				sc.setClass1(scan.next());

			} else if (scan3 == 2) {
				System.out.printf("학교이름은 %s 학과이름은 %s 이고  %s(등)학교 입니다\n", sc.getName(), sc.getDepartment(), sc.getClass1());
			} else if (scan3 == 3) {
				break;
			} else {
				System.out.println("잘못 입력했습니다");
			}
		}

	}
}
