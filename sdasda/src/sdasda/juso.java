package sdasda;

import java.util.Scanner;

 

class juso {

	String[] name = new String[10];

	String[] age = new String[10];

	String[] Phonenumber = new String[10];

	int count = 0;

 

	public void menu() {

		for (;;) {

			System.out.println("### ģ�� ����ó ���� ###");

			System.out.println("\n");

			System.out.println("1.����ó ���");

			System.out.println("2.����ó ���");

			System.out.println("3.����ó ����");

			System.out.println("4.������");

			Scanner scan = new Scanner(System.in);

			int menu = scan.nextInt();

 

			if (menu == 2) {

				if (count > 10 || count < 0) {

					System.out.println("������ �����մϴ�");

				} else {

					Scanner scan1 = new Scanner(System.in);

					System.out.println("�̸��� �Է� �ϼ���");

					name[count] = scan1.nextLine();

					System.out.println("���̸� �Է��ϼ���");

					age[count] = scan1.nextLine();

					System.out.println("���ѹ��� �Է��ϼ���");

					Phonenumber[count] = scan1.nextLine();

 

					System.out.println("ó���Ǿ����ϴ�");

					count++;

				}

			} else if (menu == 1) {

				for (int i = 0; i < name.length; i++) {

					if (name[i] != null || age[i] != null || Phonenumber[i] != null) {

						System.out.println((i+1)+":\t" + name[i] + "\t" + age[i] + "\t" + Phonenumber[i]);

					}

				}

			} else if (menu == 3) {

				System.out.println("��� ���� ���� �Ͻðڽ��ϱ� ? ");

				int menu1 = scan.nextInt();

				name[menu1-1] = null;

				age[menu1-1] = null;

				Phonenumber[menu1-1] = null;

			} else if (menu == 4) {

				break;

			} else {

				System.out.println("�߸� �Է� �ϼ˽��ϴ�");

			}

		}

	}

}