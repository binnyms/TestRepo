import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;


public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Test.....");
		Calendar cal1 = Calendar.getInstance();
		
		System.out.println("Time 			: " + cal1.getTime() );
		System.out.println("TimeZone 			: " + cal1.getTimeZone() );

		Calendar cal2 = Calendar.getInstance();
		cal2.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
	
		System.out.println("Sydney Local Time	: " + cal2.getTime() );
		System.out.println("TimeZone 			: " + cal2.getTimeZone() );
		
		SimpleDateFormat sdfAus = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");
		TimeZone tzInAus = TimeZone.getTimeZone("Australia/Sydney");
		sdfAus.format(cal1.getTime());
		cal2.set(2015, 6, 10);
		System.out.println("Long Local Time	: " + cal2.getTime().getTime() );
		
	}

}
