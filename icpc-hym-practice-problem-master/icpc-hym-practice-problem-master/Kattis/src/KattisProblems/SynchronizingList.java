package KattisProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SynchronizingList {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		int k=0;
		ArrayList <ArrayList<Integer>> output=new ArrayList<ArrayList<Integer>>();
		while(num!=0){
		int[] firstArray=new int[num];
		
		for(int i=0;i<num;i++){
			firstArray[i]=Integer.parseInt(bf.readLine());
		}
		int [] sortedArr1=firstArray.clone();
		Arrays.sort(sortedArr1);
		
		int [] secondArray=new int[num];
		for(int i=0;i<num;i++)
			secondArray[i]=Integer.parseInt(bf.readLine());
		
		int [] sortedArr2=secondArray.clone();
		Arrays.sort(sortedArr2);
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<sortedArr1.length;i++){
		a.add(sortedArr1[i]);
		//System.out.println(a.get(i));
		}
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		for(int i=0;i<firstArray.length;i++){
			if(a.contains(firstArray[i]))
				b.add(sortedArr2[a.indexOf(firstArray[i])]);
		}
	
		output.add(b);
	
		num=Integer.parseInt(bf.readLine());
	}	
		for(int i=0;i<output.size();i++){
			for(k=0;k<output.get(i).size();k++)
				System.out.println(output.get(i).get(k));
		System.out.print("\n");
		}
	
		
	}

	}


