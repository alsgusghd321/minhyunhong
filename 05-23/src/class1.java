import java.util.Scanner;

//�л� �ټ��� �ټ����� 
//��� ����
public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] gwa = new String[5];
		gwa[0] = "����";
		gwa[1] = "����";
		gwa[2] = "��ȸ";
		gwa[3] = "����";
		gwa[4] = "����";

		int one, two, three, four, five;
		int[] avg = new int[5];
		int[] rank = new int[5];
		int[][] student = new int[5][5];

		for (int i = 0; i < 5; i++) {
			System.out.printf("1���л� %s ���� �Է�:\n", gwa[i]);
			student[0][i] = scan.nextInt();
		}
		one = student[0][0] + student[0][1] + student[0][2] + student[0][3] + student[0][4];
		avg[0] = one / 5;
		System.out.println(avg[0]);
		for (int i = 0; i < 5; i++) {
			System.out.printf("2���л� %s ���� �Է�:", gwa[i]);
			student[1][i] = scan.nextInt();
		}
		two = student[1][0] + student[1][1] + student[1][2] + student[1][3] + student[1][4];
		avg[1] = two / 5;
		System.out.println(avg[1]);
		for (int i = 0; i < 5; i++) {
			System.out.printf("3���л� %s ���� �Է�:", gwa[i]);
			student[2][i] = scan.nextInt();
		}
		three = student[2][0] + student[2][1] + student[2][2] + student[2][3] + student[2][4];
		avg[2] = three / 5;
		System.out.println(avg[2]);
		for (int i = 0; i < 5; i++) {
			System.out.printf("4���л� %s ���� �Է�:", gwa[i]);
			student[3][i] = scan.nextInt();
		}
		four = student[3][0] + student[3][1] + student[3][2] + student[3][3] + student[3][4];
		avg[3] = four / 5;
		System.out.println(avg[3]);
		for (int i = 0; i < 5; i++) {
			System.out.printf("5���л� %s ���� �Է�:", gwa[i]);
			student[4][i] = scan.nextInt();
		}
		for(int i=0; i<5; i++){
			rank[i]=1;
		}
		five = student[4][0] + student[4][1] + student[4][2] + student[4][3] + student[4][4];
		avg[4] = five / 5;
		System.out.println(avg[4]);
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; i < 5; i++) {
				if (avg[i] > avg[j]) 
					rank[i] = rank[i] + 1;
				}
			}

			for (int i = 0; i < 5; i++)
				System.out.println((i + 1) + "�л��� �����" + rank[i]);
		}
	}