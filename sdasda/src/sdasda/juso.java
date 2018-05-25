package sdasda;

import java.util.Scanner;

 

class juso {

	String[] name = new String[10];

	String[] age = new String[10];

	String[] Phonenumber = new String[10];

	int count = 0;

 

	public void menu() {

		for (;;) {

			System.out.println("### 친구 연락처 관리 ###");

			System.out.println("\n");

			System.out.println("1.연락처 출력");

			System.out.println("2.연락처 등록");

			System.out.println("3.연락처 삭제");

			System.out.println("4.끝내기");

			Scanner scan = new Scanner(System.in);

			int menu = scan.nextInt();

 

			if (menu == 2) {

				if (count > 10 || count < 0) {

					System.out.println("공간이 부족합니다");

				} else {

					Scanner scan1 = new Scanner(System.in);

					System.out.println("이름을 입력 하세요");

					name[count] = scan1.nextLine();

					System.out.println("나이를 입력하세요");

					age[count] = scan1.nextLine();

					System.out.println("폰넘버를 입력하세요");

					Phonenumber[count] = scan1.nextLine();

 

					System.out.println("처리되었습니다");

					count++;

				}

			} else if (menu == 1) {

				for (int i = 0; i < name.length; i++) {

					if (name[i] != null || age[i] != null || Phonenumber[i] != null) {

						System.out.println((i+1)+":\t" + name[i] + "\t" + age[i] + "\t" + Phonenumber[i]);

					}

				}

			} else if (menu == 3) {

				System.out.println("몇번 행을 삭제 하시겠습니까 ? ");

				int menu1 = scan.nextInt();

				name[menu1-1] = null;

				age[menu1-1] = null;

				Phonenumber[menu1-1] = null;

			} else if (menu == 4) {

				break;

			} else {

				System.out.println("잘못 입력 하셧습니다");

			}

		}

	}

}