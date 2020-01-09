import java.util.Scanner;
import java.util.Stack;

public class BagsBoxBoutique {
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [][]dimen = new int[t][3];
		int [] len = new int[4];
		Stack st = new Stack();
		
		for(int i = 0 ; i < t ; i++){	
			for(int j=0;j<3;j++){
				dimen[i][j] = sc.nextInt();
			}
			
		}
		for(int i =0;i<t;i++){
			

			int max = findMax(dimen[i]);
			int min = dimen[i][0];
			for(int j =0;j<2;j++){
				
				if(dimen[i][j+1]<min){
					min = dimen[i][j+1];
				}
			}
			len[i]=max-min;
			System.out.println(len[i]+""+i);
		}
	
		
		
		
		
	}

	public static int findMax(int[] arr){
		int max = arr[0];
		int min = arr[0];
		for(int j =0;j<2;j++){
			if(arr[j+1]>max){
				max = arr[j+1];
			}
			
		}
		return max;
		
	}
}
