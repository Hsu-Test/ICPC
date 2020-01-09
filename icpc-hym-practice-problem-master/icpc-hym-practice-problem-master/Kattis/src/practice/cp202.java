package practice;

import java.util.Arrays;

public class cp202 {

	
	public static void main(String[]args){
		
		int v = 5;
		int dupC = 0;
		//find v in unsorted list
		int []s = {0,1,5,6,2,3,4,10};
		for(int i = 0; i<s.length ; i++){
			int temp = v-s[i];
			for(int j = i+1; j<s.length;j++){
				if(s[j]==temp){
					System.out.println("a:"+s[i]+"    b:"+s[j]);
				}
			}
		}
		System.out.println("*************************");
		
		//find v in sorted list
		int []s1={0,1,2,3,4,5,6,10};
		int i=0;
		int j = i+1;
		for(i = 0;i<s1.length;i++){
			int temp = v-s1[i];
			while(s1[i]<=v && j<s1.length){
				j=i+1;
				if(s1[j]==temp){
					System.out.println("a:"+s1[i]+"    b:"+s1[j]);
				}
				j++;
				
			}
		}
		
		System.out.println("*************************");		
		//check if contains duplicate;
		int []s2 = {0,1,2,3,4,5,6,7,10,3,3,4};
		Arrays.sort(s);
		for(i = 0; i<s.length ; i++){
			for(j = i+1; j<s.length;j++){
				
				if(s[j]==s[i]){
					dupC++;
					break;
				}
			}
		}
		System.out.println(dupC);
		
	}
}
