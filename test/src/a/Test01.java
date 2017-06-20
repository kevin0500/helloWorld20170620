package a;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "yyyy-MM-dd HH:mm:ss";
		System.out.println(format(new Date(), pattern));
		
//		System.getenv().get("Username");
		System.getProperty("catalina.home");
		
		System.out.println("fdafaffsd");
		
	}
	
	public static String format(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    } 
}
