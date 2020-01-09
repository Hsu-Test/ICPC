package KattisProblems;

import java.util.Scanner;

public class Aaah_1 {
	public static void main(String[]args){
		int jonWordNum,doctorWordNum;
		String jonWord,doctorWord;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the aah Jon is able to say");
		jonWord=sc.next();
		jonWordNum=jonWord.length()-1;
				
		//System.out.println("Enter the aah doctor want to hear");
		doctorWord=sc.next();
		doctorWordNum=doctorWord.length()-1;
		if(jonWordNum>=doctorWordNum)
			System.out.println("go");
		else
			System.out.println("no");
		sc.close();
	}

}
