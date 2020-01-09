package KattisProblems;

public class Passwd {
	public static void main(String[]args){
		//String sen="I am a girl";
		String sub="Imgr";
		
		int len=sub.length();
		String []a= new String[len];
		char []b = new char [len];
		for(int i=0;i<len;i++){
			b[i]=sub.charAt(i);
		}
		for(int i=0;i<b.length;i++){
			a[i]=String.valueOf(b[i]);
			//a[i]=b[i].toString();
			System.out.println(a[i]);
		}
		//String jjj=String.valueOf(b[0]);
		//System.out.print(jjj);
		
		
	}

}
