package project01;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class List_01 {
	
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
		for(int i=0;i<list.size();i++) {
			
			
			System.out.println(list.get(i).toString());
			
		}
		br.close();
		rd.close();
	}


}
