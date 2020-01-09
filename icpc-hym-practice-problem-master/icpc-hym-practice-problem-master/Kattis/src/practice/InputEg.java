package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class InputEg {

	public static void main(String[]args){
		
		/**
		 * list of sorted numbers
		 * 1 test case, infinity inputs
		 * 2 3 42 2 3 3 4 2 2
		 */
		/*Set nSet = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		StringTokenizer str=new StringTokenizer(sc.nextLine()," ");
		while(str.hasMoreTokens()){
			nSet.add(Integer.parseInt(str.nextToken()));
		}
		
		System.out.println(nSet);
		*/
		
		
		/**
		 * n test cases, m inputs 
		 * 3
		 * 1234 2345 3456
		 */
		/*
		int t=3,i=0;
		int a[]=new int[4];
		Scanner sc = new Scanner(System.in);
		while(t>0){
			for(i=0;i<4;i++){
				a[i]=sc.nextInt();
				System.out.print(a[i]);
			}
			System.out.println("\n");
			t--;
		}
		*/
		
		
		/**
		 * n test cases, m inputs
		 * 3
		 * 1 2 3 4
		 * 3 4 4 5
		 * 3 4 5 6
		 */
		/*
		int t=3,i=0;
		//int a[]=new int[4];
		List list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(t>0){
			StringTokenizer str=new StringTokenizer(sc.nextLine()," ");
			for(i=0;i<4;i++){
				list.add(Integer.parseInt(str.nextToken()));
				//System.out.print(list.get(i));
			}
			System.out.println("\n");
			t--;
		}
		*/
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float b = sc.nextFloat();
		System.out.println(a);
		System.out.println(b);
		
	}
}
