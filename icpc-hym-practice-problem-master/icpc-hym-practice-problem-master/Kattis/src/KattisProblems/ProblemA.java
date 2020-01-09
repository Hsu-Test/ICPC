package KattisProblems;
import java.util.*;
import java.io.*;
public class ProblemA {
	public static void main(String[]args) throws IOException{
		Scanner sc=new Scanner(System.in); //.useDelimiter("\\n\\n*");
		long temp=1;
		int j=0;
		
		while(sc.hasNextInt()){
			int num=sc.nextInt();
			/*temp=1;
			for(j=num;j>0;j--)
				temp*=j;
			System.out.println(String.valueOf(temp).length());*/
			temp=(long) Math.log10(num);
			System.out.print(temp);
		}
		
		sc.close();
	}

}
