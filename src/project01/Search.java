package project01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
	
public void showinfo() throws IOException{
		
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
		System.out.print(">검색어 :");
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		
		System.out.print(">검색하신 값은 : ");
		
		for(int i=0;i<list.size();i++) {
		
			if(list.get(i).getName().indexOf(key)!= -1) {
				System.out.println(list.get(i).getName()+","+list.get(i).getHp()+","+list.get(i).getCompany());
			}
		}
		rd.close();
		br.close();
	}	
}
