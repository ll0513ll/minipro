package project01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Delete {
	
	
	public void setDelete() throws IOException {
		
	
		List<Person> list = new ArrayList<Person>();
		
		Reader rd = new FileReader("phoneDB.txt");
		BufferedReader br = new BufferedReader(rd);
		
		while(true) {
			String info = br.readLine();
			
			if(info==null) {
				break;
			}
			String[] friend = info.split(",");
			Person p = new Person(friend[0],friend[1],friend[2]);
			list.add(p);		
		}
		
		System.out.print(">번호 :");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		list.remove(num);
		
		System.out.println("[삭제되었습니다.]");
		
		Writer wd = new FileWriter("phoneDB.txt");
		BufferedWriter bw = new BufferedWriter(wd);
		
		for(int i = 0;i<list.size();i++) {
		
			bw.write(list.get(i).toString());
			bw.newLine();
			bw.flush();

			
		}
		bw.close();
		br.close();
		
	
	}
}
