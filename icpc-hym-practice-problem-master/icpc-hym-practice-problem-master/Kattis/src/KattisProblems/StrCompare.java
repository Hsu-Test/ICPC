package KattisProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StrCompare {
	public static void main(String []args) throws NumberFormatException, IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int testCase=Integer.parseInt(bf.readLine());
		ArrayList<ArrayList<ArrayList<String>>> master=new ArrayList<ArrayList<ArrayList<String>>>();
		int i=0;int j=0;
		while(testCase!=0){
			String[] arr=new String[testCase];
			
			
		for(i=0;i<testCase;i++){
			arr[i]=bf.readLine();
		}
		Arrays.sort(arr);

		ArrayList<String>first=new ArrayList<String>();
		ArrayList<String>second=new ArrayList<String>();
		
		
		for(j=0;j<arr.length;j+=2){
			
			try{
				if(arr[j].length()<arr[j+1].length()){
			
				first.add(arr[j]);
				second.add(arr[j+1]);
				}
			
			else
				if(arr[j].length()==arr[j+1].length()){
					int comp=arr[j].compareTo(arr[j+1]);
					if(comp>=0){
						first.add(arr[j]);
						second.add(arr[j+1]);
					}
					else 
						{
						first.add(arr[j+1]);
						
					    second.add(arr[j]);
						}
				}
				else
					{
					first.add(arr[j+1]);
					
					second.add(arr[j]);
					}
			}
		catch(ArrayIndexOutOfBoundsException ai){
						first.add(arr[j]);
					 }
		}
		Collections.reverse(second);
		 ArrayList<ArrayList<String>>result=new ArrayList<ArrayList<String>>();
		
		 
		 result.add(first);
		 result.add(second);
		 
		 master.add(result);	 
		 
		testCase=Integer.parseInt(bf.readLine());	
		
		}
		 for(i=0;i<master.size();i++){
			 int tem=i+1;
			 System.out.println("SET "+tem);
		 for(j=0;j<master.get(i).size();j++){
			 for(int k=0;k<master.get(i).get(j).size();k++)
			 System.out.println(master.get(i).get(j).get(k));
		 }
	 }
		
		
	}

}
