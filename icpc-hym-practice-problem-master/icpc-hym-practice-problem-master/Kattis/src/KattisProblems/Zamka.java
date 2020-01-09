package KattisProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zamka {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long L=Long.parseLong(br.readLine());
		long D=Long.parseLong(br.readLine());
		int X=Integer.parseInt(br.readLine());
        long N=0;
        long M=0;
        long div=0;
        long quo=0;
        int ans=0;
		//long M=0;
		//long N=0;
	//System.out.println(L+","+D+" "+X);
		for(N=L;N<D;N++){
			div=N/10;
			quo=N%10;
			while(div>0){
				//System.out.println(k);
				
				ans+=quo;
				//System.out.println(ans);
				quo=div%10;
				div=div/10;
			}			
			ans+=quo;
			if(ans==X){
				System.out.println(N);
				break;
			}
			ans=0;
			
		}
		ans=0;
		for(M=D;M>=N;M--){
			div=M/10;
			quo=M%10;
			
			while(div>0){
			
				ans+=quo;
				quo=div%10;
				div=div/10;
					
			}
			
			ans+=quo;
		
			if(ans==X){
				System.out.println(M);
				break;
			}
			ans=0;
			
		}
	}

}
