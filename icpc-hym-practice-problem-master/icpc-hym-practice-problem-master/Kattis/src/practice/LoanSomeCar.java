package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LoanSomeCar {
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer str = new StringTokenizer(sc.nextLine()," ");
		int m=Integer.parseInt(str.nextToken()); //30
		float down = Float.parseFloat(str.nextToken()); //500.0
		float loan = Float.parseFloat(str.nextToken()); //15000.0
		int n = Integer.parseInt(str.nextToken()); //3
		
		float inCar = down + loan; //15500
		float owesAmount = loan; //15000
		int i = 0;
		int month = sc.nextInt(); //0
		float de = sc.nextFloat(); //.1
		float deTemp = 0;
		
		for(i=0;i<m;i++){
			
			
			if(month>0){
				owesAmount-=down;
				System.out.println("OA:"+owesAmount+"IC:"+inCar);
			}
			if(i < month){
				inCar -= deTemp;
				System.out.println("OA:"+owesAmount+"IC:"+inCar);
				
				if(owesAmount<inCar){
					break;
				}   
				continue;
			}
			
		
			deTemp = inCar*de;
			inCar -= deTemp;
			
			System.out.println("OA:"+owesAmount+"IC:"+inCar);
			
			if(owesAmount<inCar){
					break;
			}                           
			n--;
			if(n>0){
				System.out.println("OA:"+owesAmount+"IC:"+inCar+"N"+n);
				
				month = sc.nextInt();
				de = sc.nextFloat();
			}
			
			
		}
		
		System.out.println(i);
		
		
		
	}

}
