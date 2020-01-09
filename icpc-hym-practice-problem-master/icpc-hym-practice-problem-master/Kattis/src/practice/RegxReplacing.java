package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxReplacing {
	
	public static void main(String []args){
		
		String pattern = "\\s\\w\\d\\d\\s";
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		Matcher matcher = Pattern.compile(pattern).matcher(str);
		while(matcher.find()){
			System.out.println(matcher.replaceAll("***"));
		}
		System.out.println("End");
		
		
	}

}
