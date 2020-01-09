package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BirthdayOrder {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args){
		

		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			System.out.print(t);
			ArrayList<Date> list = new ArrayList<>();
			while(t>0){
				StringTokenizer str=new StringTokenizer(s,",");
					Date date = new Date();
						date.setDate(Integer.parseInt(str.nextToken()));
						date.setMonth(Integer.parseInt(str.nextToken()));
						date.setYear(Integer.parseInt(str.nextToken()));
					
					//Date date = new Date(str.nextToken());
					list.add(date);
					//System.out.print(list.get(i));
					t--;
					s=null;
					s=sc.nextLine();
			}
			Collections.sort(list);
			System.out.println(list);
			Collections.sort(list,Collections.reverseOrder());
			System.out.println(list);
				
		}
		String s = sc.nextLine();
		System.out.print(t);
		/*ArrayList<Date> list = new ArrayList<>();
		while(t>0){
			StringTokenizer str=new StringTokenizer(s,",");
				Date date = new Date();
					date.setDate(Integer.parseInt(str.nextToken()));
					date.setMonth(Integer.parseInt(str.nextToken()));
					date.setYear(Integer.parseInt(str.nextToken()));
				
				//Date date = new Date(str.nextToken());
				list.add(date);
				//System.out.print(list.get(i));
				t--;
				s=null;
				s=sc.nextLine();
		}
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
			*/
	}

}
