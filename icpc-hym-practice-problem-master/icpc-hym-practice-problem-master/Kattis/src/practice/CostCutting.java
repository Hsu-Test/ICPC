package practice;
import java.util.Arrays;
import java.util.Scanner;
public class CostCutting {
	
	private static Scanner sc;

	public static void main(String []args){
		
		sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int j=1;
		for(int i = 0; i<n; i++){
			
			System.out.print("Case "+j+":");
			int [] s = new int [3];
			s[0]=sc.nextInt();
			s[1]=sc.nextInt();
			s[2]=sc.nextInt();
			Arrays.sort(s);
			System.out.println(s[1]);
			j++;
			
		}
	}
}
