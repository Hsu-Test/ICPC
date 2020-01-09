package KattisProblems;

import java.util.Scanner;

public class Bijele {
	public static void main(String[]args){
		int i=0;
		int [] set=new int[]{1,1,2,2,2,8};
		Scanner sc=new Scanner(System.in);
		while(i<6){
			int ans=set[i]-sc.nextInt();
			System.out.print(ans+" ");
			i++;
		}
		sc.close();
		
	}

}
