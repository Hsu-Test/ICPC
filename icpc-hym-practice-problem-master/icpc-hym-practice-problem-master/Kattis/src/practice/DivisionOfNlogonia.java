package practice;

import java.util.Scanner;

class DivisionOfNlogonia {
	
	public static void main(String[]args){
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0 || n<=1000){
			while (n>0 && n<=1000){
				
				int x = sc.nextInt();
				
				int y = sc.nextInt();
				for(int i = 0 ;i < n ; i++){
					int a =  sc.nextInt();
					int b = sc.nextInt();
					
					if(a == x || b == y){
						System.out.println("divisa");
					}
					else if(a>x && b>y){
						System.out.println("NE");
					}
					else if(a>x && b<y){
						System.out.println("SE");
					}
					else if(a<x && b>y){
						System.out.println("NO");
					}
					else if(a<x && b<y){
						System.out.println("SO");
					}
				}
				n = sc.nextInt();
		
			}	
		}
		
				
	}

}
