package KattisProblems;
import java.util.*;
public class SecretMessage {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		//System.out.print(testCase);
		int i=0,j=0,k=0,t=0;
		while(t<testCase){
		
		String str=sc.next();
		int len=str.length();
		int sqrt=(int)Math.sqrt(len);
		int ans=sqrt*sqrt;
		int M=len;
		
		while(ans!=len){

		
			len++;
		sqrt=(int)Math.sqrt(len);
		ans=sqrt*sqrt;
		
		}
		M=len;
		int sub=M-str.length();
		if(sub>0){
			for(i=0;i<sub;i++){
				
				str=str+"*";
		}
		}
	//	System.out.print(str);
		String []strArr=new String[]{};
		strArr=str.split("");
		
		
		String[][]arr=new String[4][4];
		String[]r=new String[str.length()];
		k=0;
		for(i=0;i<Math.sqrt(M);i++){
			for(j=0;j<Math.sqrt(M);j++){
				arr[i][j]=strArr[k];
				k++;
			}
		}
		k=0;
		for(i=0;i<Math.sqrt(M);i++){
			for(j=(int)Math.sqrt(M)-1;j>=0;j--){
			r[k]=arr[j][i];
			k++;
		}
		}	
		k=0;
		for(i=0;i<Math.sqrt(M);i++){
			for(j=0;j<Math.sqrt(M);j++){
			arr[i][j]=r[k];	
			k++;
		}
		}
		for(i=0;i<Math.sqrt(M);i++){
			for(j=0;j<Math.sqrt(M);j++){
				if(arr[i][j].equals("*"))
					continue;
				else
					System.out.print(arr[i][j]);	
			
		}
		}
			
			t++;
		}
	
	}
}
