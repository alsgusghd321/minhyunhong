import java.util.Scanner;

public class Class2 {

	public void achievement() { // ����ó��
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int number = 0; // ��ȣ�Է¹޴�
		int menu; // �޴� ��ȣ �Է¹޴�
		int number1 = 0; // ��ȣ�Է¹޴�
		int[][] achievement = new int[31][6];

		for (;;) {
			System.out.println("<1> ���� �Է�  <2> ���� ��� <3> �ڷΰ���");
			menu = scan1.nextInt();

			if (menu == 1) {

				System.out.println("��� �л��� ���� �� ó�� �Ͻðڽ��ϱ� ?\n");
				number = scan1.nextInt();
				if (number <= 0 || number >= 31) {
					System.out.println("�߸� �Է� �ϼ˽��ϴ�");
					break;
				} else
					System.out.println("���� ������ �Է��ϼ��� : ");
				achievement[number][0] = scan.nextInt();
				System.out.println("���� ������ �Է��ϼ��� : ");
				achievement[number][1] = scan.nextInt();
				System.out.println("��ȸ ������ �Է��ϼ��� : ");
				achievement[number][2] = scan.nextInt();
				System.out.println("���� ������ �Է��ϼ��� : ");
				achievement[number][3] = scan.nextInt();
				System.out.println("���� ������ �Է��ϼ��� : ");
				achievement[number][4] = scan.nextInt();

				System.out.println("ó���Ǿ����ϴ�");
				number = 0;
			} else if (menu == 2) {
				System.out.println("��� �л��� ������ ��� �Ͻðڽ��ϱ�: ");
				number1 = scan1.nextInt();
				if (number1 <= 0 || number1 >= 31) {
					System.out.println("�߸� �Է� �ϼ˽��ϴ�");
					break;
				} else
					System.out.printf("���� ������ %d\n����������%d\n��ȸ������%d\n����������%d\n����������%d\n��������� : %d �Դϴ�\n",
							achievement[number1][0], achievement[number1][1], achievement[number1][2],
							achievement[number1][3], achievement[number1][4],
							(achievement[number1][0] + achievement[number1][1] + achievement[number1][2]
									+ achievement[number1][3] + achievement[number1][4]) / 5);
			} else if (menu == 3) {
				break;
			} else {
				System.out.println("�߸��Է��ϼ˽��ϴ�");
				break;
			}
		}
	}

	public void Circles() { // ���Ƹ�
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		String[] Circles = new String[31];
		int menu;
		int number;
		String circles;
		for (;;) {
			System.out.println("<1>���Ƹ� ���� \n <2>���Ƹ� Ż�� \n <3>���Ƹ� Ȯ��\n");
			menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("��ȣ�� �Է� ���ּ���: \n");
				number = scan.nextInt();
				if (number <= 0 || number >= 31) {
					System.out.println("�߸� �Է� �ϼ˽��ϴ�");
					break;
				} else

					System.out.println("� ���Ƹ��� ���� �Ͻðڽ��ϱ�: \n");
				Circles[number] = scan1.nextLine();

				System.out.println("���ԵǾ����ϴ� \n");

				number = 0;
			} else if (menu == 2) {
				System.out.println("��ȣ�� �Է� ���ּ���: \n");
				int number1 = scan.nextInt();
				if (number1 <= 0 || number1 >= 31) {
					System.out.println("�߸� �Է� �ϼ˽��ϴ�");
					break;
				} else
					Circles[number1] = "���Ƹ� ����";

				System.out.println("Ż��Ǿ����ϴ� \n");

				number = 0;
			} else if (menu == 3) {
				System.out.println("��ȣ�� �Է� ���ּ���: \n");
				int number3 = scan.nextInt();
				if (number3 <= 0 || number3 >= 31) {
					System.out.println("�߸� �Է� �ϼ˽��ϴ�");
					break;
				} else
					System.out.println(Circles[number3]);
			} else if (menu == 4) {

				break;
			} else {
				System.out.println("�߸� �Է� �ϼ˽��ϴ�");
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
			System.out.println("<1> ���� �ο� \n <2> ���� �ο� \n <3> ���� Ȯ�� \n <4> ������ \n");
			menu = scan.nextInt();
			
			if (menu==1){
				System.out.println("��ȣ�� �Է��ϼ��� \n");
				number = scan.nextInt();
				
				Comp[number-1][0]++;
				
				System.out.println("ó���Ǿ����ϴ� \n");
				number = 0;
			}else if (menu==2){
				System.out.println("��ȣ�� �Է��ϼ��� \n");
				number = scan.nextInt();
				
				Comp[number-1][1]++;
				
				System.out.println("ó���Ǿ����ϴ� \n");
				number =0;
			}else if (menu==3){
				System.out.println("��ȣ�� �Է��ϼ��� \n");
				number = scan.nextInt();
				
				System.out.printf("������ %d ������ %d ���Դϴ� \n",Comp[number-1][0],Comp[number-1][1]);
				number = 0;
			}else if(menu==4){
				break;
			}else{
				System.out.println("�߸� �Է� �ϼ˽��ϴ�.");
				break;
			}
			
			/*
			switch (menu) {

			case 1:
				System.out.println("��ȣ�� �Է��ϼ��� \n");
				number = scan.nextInt();
				
				Comp[number-1][0]++;
				
				System.out.println("ó���Ǿ����ϴ� \n");
				number = 0;
				break;
			case 2:
				System.out.println("��ȣ�� �Է��ϼ��� \n");
				number = scan.nextInt();
				
				Comp[number-1][1]++;
				
				System.out.println("ó���Ǿ����ϴ� \n");
				number =0;
				break;
			case 3:
				System.out.println("��ȣ�� �Է��ϼ��� \n");
				number = scan.nextInt();
				
				System.out.printf("������ %d ������ %d ���Դϴ� \n",Comp[number-1][0],Comp[number-1][1]);
				number = 0;
				break;
			case 4:
				break;
			default:
				System.out.println("�߸� �Է� �ϼ˽��ϴ�.");
				break;
			}
			*/
		}
	}
}