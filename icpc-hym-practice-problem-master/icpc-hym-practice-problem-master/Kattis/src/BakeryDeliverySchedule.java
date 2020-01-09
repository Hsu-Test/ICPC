import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BakeryDeliverySchedule {


	private static List<Integer> list1=new ArrayList<>();
	private static List<Integer> list2=new ArrayList<>();
	private static int dist=0;
	public static void main(String[]args){


		Scanner sc=new Scanner(System.in);


		int n=sc.nextInt();
		System.out.println(System.currentTimeMillis());
		while(n>0){
			list1.clear();
			list2.clear();
			int a=sc.nextInt();
			while(a!=-999)
			{

				list1.add(a);
				a=sc.nextInt();
			}
			dist=sc.nextInt();        //distance
			list1.add(dist);
			Collections.sort(list1);

			int position = Collections.binarySearch(list1, dist);

			/**
			 * upward
			 */

			for(int i=position+1;i<list1.size();i++){
				list2.add(list1.get(i));
			}
			for(int i=position-1;i>=0;i--){
				list2.add(list1.get(i));
			}
			int upw = calcDist(list2);


			/**
			 * downward
			 */

			list2.clear();
			for(int i=position-1;i>=0;i--){
				list2.add(list1.get(i));
			}
			for(int i=position+1;i<list1.size();i++){
				list2.add(list1.get(i));
			}
			int dow = calcDist(list2);


			if(upw>=dow){
				System.out.println("Downward First");
				System.out.println(dow);
			}
			else{
				System.out.println("Upward First");
				System.out.println(upw);
			}





				n--;
		}
		System.out.println(System.currentTimeMillis());
	}
	public static int calcDist(List<Integer> l){
		int d=0;
		if(dist>=list2.get(0)){
			d = dist - list2.get(0);
		}
		else
			d = list2.get(0) -dist;

		for(int i=0;i<list2.size()-1;i++){

			if(list2.get(i)>=list2.get(i+1)){
				d+= list2.get(i)-list2.get(i+1);
			}
			else{
				d+= list2.get(i+1)-list2.get(i);
			}


		}
		return d;
	}
}
