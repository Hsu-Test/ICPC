package KattisProblems;
import java.util.*;
public class FizzBus{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int divX=i%x;
			int divY=i%y;
			if(divX==0 && divY==0)
				System.out.println("FizzBuzz");
			else
				if(divX==0 || divY==0){
					if(divX==0)
						System.out.println("Fizz");
					if(divY==0)
					System.out.println("Buzz");
				}
				else
					System.out.println(i);
			
		}
		sc.close();
	}
}