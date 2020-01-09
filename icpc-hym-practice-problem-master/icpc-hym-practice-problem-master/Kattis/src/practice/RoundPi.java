package practice;

import java.util.Scanner;

public class RoundPi {
	
	public static void main(String[]args){
		
		double pi=Math.PI;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();  //number of floating point
		int acc=(int)Math.pow(10, n);
		pi*=acc;
		pi=Math.ceil(pi);
		pi/=acc;		
		System.out.println(pi);
	}

}
