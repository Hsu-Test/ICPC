package KattisProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseRot_1 {
	public static void main(String[]args){
		int s=0;
		int i=0;
		int j=0;
		int testCase=0;

		String[] alphabets=new String[]	{"A","B","C","D","E",
				"F","G","H","I","J","K","L","M","N",
				"O","P","Q","R","S","T","U","V","W",
				"X","Y","Z","_","."};
		ArrayList<String> aToZ=new ArrayList<String>();
		
		
		ArrayList<ArrayList<String>> ans=new ArrayList<ArrayList<String>>();
		
		Scanner sc=new Scanner(System.in);
		int code=sc.nextInt();
		String [] message=new String[]{};
		while(code!=0 && testCase<=30 ){
		
		
		String temp=sc.next();
		temp=temp.toUpperCase();
		
		message=temp.split("");
		Collections.reverse(Arrays.asList(message));
		
		//System.out.print(alphabets.length);
		for(i=0;i<alphabets.length;i++){
			aToZ.add(alphabets[i]);}
		ArrayList<String> another=new ArrayList<String>();
		for(i=0;i<message.length;i++){
			if(aToZ.contains(message[i])){
				int id=aToZ.indexOf(message[i])+code;
				if(id>=28)
					id=id-28;
				another.add(aToZ.get(id));
			}
		}
		ans.add(another);
		//System.out.println(another);
		
		
		code=sc.nextInt();
		testCase++;
		}
		for(i=0;i<ans.size();i++){
			for(j=0;j<ans.get(i).size();j++)
				System.out.print(ans.get(i).get(j));
			System.out.print("\n");
		}
		}
}
