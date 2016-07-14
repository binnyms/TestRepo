import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTest2 {
	public static void main(String[] argv) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy HH:mm:ss");

		String dateInString = "22-01-2015 10:15:55";
		//Date date = formatter.parse(dateInString);
		Date date = new Date();
		TimeZone tz = TimeZone.getDefault();

		// From TimeZone Asia/Singapore
		System.out.println("TimeZone : " + tz.getID() + " - " + tz.getDisplayName());
		System.out.println("TimeZone : " + tz);
		System.out.println("Date : " + formatter.format(date));

		// To TimeZone America/New_York
		SimpleDateFormat sdfAmerica = new SimpleDateFormat("dd-M-yyyy HH:mm:ss");
		TimeZone tzInAmerica = TimeZone.getTimeZone("Australia/Sydney");
		sdfAmerica.setTimeZone(tzInAmerica);
		
		String sDateInAmerica = sdfAmerica.format(date); // Convert to String first
		Date dateInAmerica = formatter.parse(sDateInAmerica);

		System.out.println("\nTimeZone : " + tzInAmerica.getID() + 
                                      " - " + tzInAmerica.getDisplayName());
		System.out.println("TimeZone : " + tzInAmerica);
		System.out.println("Date (String) : " + sDateInAmerica);
		System.out.println("Date (Object) : " + formatter.format(dateInAmerica)); 
	}

}