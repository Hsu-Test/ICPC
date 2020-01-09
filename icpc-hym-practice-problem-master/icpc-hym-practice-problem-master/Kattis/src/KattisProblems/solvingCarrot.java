package KattisProblems;
import java.util.*;
public class solvingCarrot{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int line=sc.nextInt();
		int carrot=sc.nextInt();
		String []comment=new String[line];
		int i=0;
		while(line>0){
		comment[i]=sc.next();	
			line--;
		}
		System.out.print(carrot);
		sc.close();
	}
}