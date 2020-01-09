package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DoubleProb {
	
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		
		//String str=sc.next();
		//StringTokenizer tzr= new StringTokenizer(str,"//s*.//s*");
		/*
		do{
			System.out.println(tzr.nextToken());
		}while(tzr.hasMoreTokens());
		*/
		double db=sc.nextDouble(); //1.4567
		double num=1000;
		db*=num;
		db=Math.ceil(db);
		db/=num;

		System.out.println(String.format("%7.3f",db));//ss1.457
		
	}

}
