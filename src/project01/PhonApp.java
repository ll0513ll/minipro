package project01;

import java.io.IOException;
import java.util.Scanner;

public class PhonApp {

	public static void main(String[] args) throws IOException {

		int f = 0;
		System.out.println("*********************************");
		System.out.println("\t전화번호 관리 프로그램");
		System.out.println("*********************************");

		while (true) {
			System.out.println();
			System.out.println("1.리스트   2.등록   3.삭제   4.검색   5.종료");
			System.out.println("---------------------------------");
			System.out.print(">메뉴번호 : ");

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			switch (num) {

			case 1:
				System.out.println("<1. 리스트 >");
				List_01 lt = new List_01();
				lt.showinfo();
				break;
			case 2:
				System.out.println("<2. 등록 >");
				Add add = new Add();
				add.setAdd();
				break;
			case 3:
				System.out.println("<3. 삭제 >");
				Delete del = new Delete();
				del.setDelete();
				break;
			case 4:
				System.out.println("<4. 검색>");
				Search sa = new Search();
				sa.showinfo();

				break;
			case 5:
				System.out.println("*********************************");
				System.out.println("\t        감사합니다.");
				System.out.println("*********************************");
				f = 1;
				break;

			default:
				System.out.println("[다시 입력해주세요.]");

			}

			if (f == 1) {
				break;
			}
		}
	}
}
