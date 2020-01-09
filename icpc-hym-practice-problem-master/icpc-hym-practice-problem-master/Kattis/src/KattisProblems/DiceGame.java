package KattisProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DiceGame {
	public static void main(String args[]) throws Exception{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		//int[]emma=new int[]{};
		int i=0,sum1=0,sum2=0;
		String[]gunnar=new String[]{};
		String emma[]=new String []{};
		emma=bf.readLine().split("\\s");
		for(i=0;i<emma.length;i++){
			sum1+=Integer.parseInt(emma[i]);
		}
		gunnar=bf.readLine().split("\\s");
		for(i=0;i<gunnar.length;i++){
			sum2+=Integer.parseInt(gunnar[i]);
		}
		if(sum1>sum2)
			System.out.println("Gunnar");
		else if(sum1<sum2)
			System.out.println("Emma");
		else
			System.out.println("Tie");
	}

}
