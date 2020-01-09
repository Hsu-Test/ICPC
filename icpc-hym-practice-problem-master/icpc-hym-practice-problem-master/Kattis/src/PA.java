import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PA {
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ca=0;
		
		boolean flag=false;
		while (n!=0){
			int sameIndex=0;
			List<Dimen> list = new ArrayList<Dimen>();
			
			for(int i=0;i<n;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				Dimen d = new Dimen();
				d.setMax(Math.max(Math.max(a, b), c));
				d.setMin(Math.min(Math.min(a, b), c));
				d.calcLen();
				list.add(d);

				//System.out.println(d.len);
			}
			Collections.sort(list,new Comparator<Dimen>() {
				
				public int compare(Dimen d1,Dimen d2){
					//Integer v1 = new Integer(d1.getLen());
					Integer v2 = new Integer(d2.getLen());
					return v2.compareTo(d1.getLen());
					
				}
			});	
			
			/*
			for(Dimen dd:list){
				System.out.println(dd.getLen()+" "+dd.getMax()+" "+dd.getMin());
			}
			*/
			int count = 1;
			int j=0;
			for(int i=0;i<n-1;i++){
				
				
				/**
				 * for equal length case
				 */
				if(list.get(i+1).getLen()==list.get(j).getLen()){
					if(flag!=true){
						sameIndex=i;
					}
					flag = true;
					
					continue;
				}
				
				/**
				 * if there are no same length box before
				 */
				if(flag!=true){
					if(list.get(i+1).getMax()<=list.get(j).getMax()
							&& list.get(i+1).getMin()>=list.get(j).getMin()){
								
						count++;
						j=i+1;  //to map with the box placed
					}
				}
				/**
				 * had same length before this
				 */
				else
				{
					count++;
					for(int k = sameIndex;k<i;k++){
						if(list.get(i).getMax()<=list.get(k).getMax()
								&& list.get(i).getMin()>=list.get(k).getMin()){
									
							count++;
							//j=i;
						}
					}
				}
				
			}
			ca++;
			System.out.println("Case "+ca+": "+count);
			n = sc.nextInt();
		}
		
		
	}
	
}
class Dimen{
	int max;
	int min;
	int len;
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	public void calcLen(){
		len = max - min;
	}
	public int getLen(){
		return len;
	}
	
}
