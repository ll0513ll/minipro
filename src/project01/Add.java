package project01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Add {

	Scanner sc = new Scanner(System.in);

	public void setAdd() throws IOException {

		System.out.print(">이름 : ");
		String name = sc.nextLine();
		System.out.print(">휴대전화 : ");
		String hp = sc.nextLine();
		System.out.print(">회사전화 : ");
		String company = sc.nextLine();
		System.out.println();
		System.out.println("[등록 되었습니다.]");

		Writer wr = new FileWriter("phoneDB.txt", true);
		BufferedWriter bw = new BufferedWriter(wr);

		bw.write(name + ",");
		bw.write(hp + ",");
		bw.write(company);
		bw.newLine();
		bw.close();
		wr.close();
	}

}
