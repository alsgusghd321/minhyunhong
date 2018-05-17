import java.util.Scanner;

public class Class2 {

	public void achievement() { // 성적처리
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int number = 0; // 번호입력받는
		int menu; // 메뉴 번호 입력받는
		int number1 = 0; // 번호입력받는
		int[][] achievement = new int[31][6];

		for (;;) {
			System.out.println("<1> 점수 입력  <2> 점수 출력 <3> 뒤로가기");
			menu = scan1.nextInt();

			if (menu == 1) {

				System.out.println("몇번 학생의 성적 을 처리 하시겠습니까 ?\n");
				number = scan1.nextInt();
				if (number <= 0 || number >= 31) {
					System.out.println("잘못 입력 하셧습니다");
					break;
				} else
					System.out.println("국어 점수를 입력하세요 : ");
				achievement[number][0] = scan.nextInt();
				System.out.println("수학 점수를 입력하세요 : ");
				achievement[number][1] = scan.nextInt();
				System.out.println("사회 점수를 입력하세요 : ");
				achievement[number][2] = scan.nextInt();
				System.out.println("과학 점수를 입력하세요 : ");
				achievement[number][3] = scan.nextInt();
				System.out.println("영어 점수를 입력하세요 : ");
				achievement[number][4] = scan.nextInt();

				System.out.println("처리되었습니다");
				number = 0;
			} else if (menu == 2) {
				System.out.println("몇번 학생의 점수를 출력 하시겠습니까: ");
				number1 = scan1.nextInt();
				if (number1 <= 0 || number1 >= 31) {
					System.out.println("잘못 입력 하셧습니다");
					break;
				} else
					System.out.printf("국어 점수는 %d\n수학점수는%d\n사회점수는%d\n과학점수는%d\n영어점수는%d\n평균점수는 : %d 입니다\n",
							achievement[number1][0], achievement[number1][1], achievement[number1][2],
							achievement[number1][3], achievement[number1][4],
							(achievement[number1][0] + achievement[number1][1] + achievement[number1][2]
									+ achievement[number1][3] + achievement[number1][4]) / 5);
			} else if (menu == 3) {
				break;
			} else {
				System.out.println("잘못입력하셧습니다");
				break;
			}
		}
	}

	public void Circles() { // 동아리
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		String[] Circles = new String[31];
		int menu;
		int number;
		String circles;
		for (;;) {
			System.out.println("<1>동아리 가입 \n <2>동아리 탈퇴 \n <3>동아리 확인\n");
			menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("번호를 입력 해주세요: \n");
				number = scan.nextInt();
				if (number <= 0 || number >= 31) {
					System.out.println("잘못 입력 하셧습니다");
					break;
				} else

					System.out.println("어떤 동아리에 가입 하시겠습니까: \n");
				Circles[number] = scan1.nextLine();

				System.out.println("가입되었습니다 \n");

				number = 0;
			} else if (menu == 2) {
				System.out.println("번호를 입력 해주세요: \n");
				int number1 = scan.nextInt();
				if (number1 <= 0 || number1 >= 31) {
					System.out.println("잘못 입력 하셧습니다");
					break;
				} else
					Circles[number1] = "동아리 없음";

				System.out.println("탈퇴되었습니다 \n");

				number = 0;
			} else if (menu == 3) {
				System.out.println("번호를 입력 해주세요: \n");
				int number3 = scan.nextInt();
				if (number3 <= 0 || number3 >= 31) {
					System.out.println("잘못 입력 하셧습니다");
					break;
				} else
					System.out.println(Circles[number3]);
			} else if (menu == 4) {

				break;
			} else {
				System.out.println("잘못 입력 하셧습니다");
				break;
			}
		}
	}

	public void CompensationAndPunishment() {
		int[][] Comp = new int[30][2]; 
		int menu;
		int number;
		Scanner scan = new Scanner(System.in);

		for (;;) {
			System.out.println("<1> 상점 부여 \n <2> 벌점 부여 \n <3> 점수 확인 \n <4> 나가기 \n");
			menu = scan.nextInt();
			
			if (menu==1){
				System.out.println("번호를 입력하세요 \n");
				number = scan.nextInt();
				
				Comp[number-1][0]++;
				
				System.out.println("처리되었습니다 \n");
				number = 0;
			}else if (menu==2){
				System.out.println("번호를 입력하세요 \n");
				number = scan.nextInt();
				
				Comp[number-1][1]++;
				
				System.out.println("처리되었습니다 \n");
				number =0;
			}else if (menu==3){
				System.out.println("번호를 입력하세요 \n");
				number = scan.nextInt();
				
				System.out.printf("상점은 %d 벌점은 %d 점입니다 \n",Comp[number-1][0],Comp[number-1][1]);
				number = 0;
			}else if(menu==4){
				break;
			}else{
				System.out.println("잘못 입력 하셧습니다.");
				break;
			}
			
			/*
			switch (menu) {

			case 1:
				System.out.println("번호를 입력하세요 \n");
				number = scan.nextInt();
				
				Comp[number-1][0]++;
				
				System.out.println("처리되었습니다 \n");
				number = 0;
				break;
			case 2:
				System.out.println("번호를 입력하세요 \n");
				number = scan.nextInt();
				
				Comp[number-1][1]++;
				
				System.out.println("처리되었습니다 \n");
				number =0;
				break;
			case 3:
				System.out.println("번호를 입력하세요 \n");
				number = scan.nextInt();
				
				System.out.printf("상점은 %d 벌점은 %d 점입니다 \n",Comp[number-1][0],Comp[number-1][1]);
				number = 0;
				break;
			case 4:
				break;
			default:
				System.out.println("잘못 입력 하셧습니다.");
				break;
			}
			*/
		}
	}
}
