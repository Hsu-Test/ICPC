package practice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateGuess {
	
	public static void main(String[]args){
		
		String[] days={"","SUN","MON","TUE","WED","Thu","Fri","Sat"};
		
		//Calendar cl=Calendar.getInstance();
		//cl.set(1999, Calendar.JUNE, 01);
		/*Calendar cl = new GregorianCalendar(1999,6,1);
		System.out.println(cl.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cl.get(Calendar.DATE));
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_WEEK));
		*/
			String[] names = new String[]
			{ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
			Calendar calendar = new GregorianCalendar(1999, 6, 1); // 9 August 2010
			// note that month starts from 0, so we need to put 7 instead of 8
			System.out.println(names[calendar.get(Calendar.DAY_OF_WEEK)]); // "Wed"
		
	}

}
