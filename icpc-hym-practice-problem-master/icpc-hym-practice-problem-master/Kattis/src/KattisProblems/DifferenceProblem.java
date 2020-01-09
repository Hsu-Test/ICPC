package KattisProblems;
import java.util.Scanner;

public class DifferenceProblem {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		long a1,a2,a3;
		while(sc.hasNextLong()){
		
			a1=sc.nextLong();
			a2=sc.nextLong();
			if(a1>=a2)
				a3=a1-a2;
			else
				a3=a2-a1;
			
				System.out.println(a3);
				
		}
		sc.close();
	}

}
