package KattisProblems;

public class ReverseRot {
	public static void main(String[]args){
		String a="ABCD";
		int len=a.length();
		char[]arr=new char[len+1];
		char temp;
		int i=0;
		for(i=0;i<len;i++){
			arr[i]=a.charAt(i);	
			System.out.print(arr[i]);
		}
		temp=arr[0];
		int l=len;
		for(i=0;i<len;i++){
			
			arr[i]=arr[l];
			l--;
		}
		arr[i]=temp;
		for(i=0;i<len;i++){
			System.out.print("\n"+arr[i]);		
		}
	}

}
