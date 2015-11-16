
 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class _7_DaysBetweenTwoDates {
 
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String dateStart = inputScanner.nextLine();
		String dateStop = inputScanner.nextLine();
 
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
 
		Date d1 = null;
		Date d2 = null;
 
		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);
 
			
			long diff = d2.getTime() - d1.getTime();
 
			
			long diffDays = diff / (24 * 60 * 60 * 1000);
 
			System.out.print(diffDays);
		
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		inputScanner.close();
	}
 
}