package naztech.io.JavaUtilCalenderToJavaTime_JUnit_Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Tanbirul Hashan
 */

public class CustomDateTime {

	public static LocalDate cnvrtCalDateToLocalDate() {
		Date date = Calendar.getInstance().getTime();
		LocalDate localDate = LocalDate.parse(new SimpleDateFormat("YYYY-MM-dd").format(date));
		return localDate;
	}
	
	public static LocalTime cnvrtCalTimeToLocalTime() {

		Date date = Calendar.getInstance().getTime();
		LocalTime localTime = LocalTime.parse(new SimpleDateFormat("HH:mm:ss").format(date));
		return localTime;

	}
	
	public static LocalDateTime cnvrtCalDateTimeToLocalDateTime() {

		LocalDateTime localDateTime = LocalDateTime
				.parse(CustomDateTime.cnvrtCalDateToLocalDate().toString() + "T" + CustomDateTime.cnvrtCalTimeToLocalTime().toString());
		return localDateTime;

	}
	
	public static Calendar  convertLocalDateTime_To_CalenderDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		Calendar myCalendar=Calendar.getInstance();
		myCalendar.clear();
		myCalendar.set(localDateTime.getYear(), localDateTime.getMonthValue(),localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute());
		System.out.println(myCalendar.getTime());
		return Calendar.getInstance();
	}
	
	public static String  cnvrtCalTimeZoneToLocalTimeZone() {
		
	    Calendar.getInstance().getTimeZone();
		return "";
	
	}
	
	public static String  cnvrtOffsetDateTimeToCalTimeZone() {
		

		OffsetDateTime offSetTime=OffsetDateTime.now();
		
        System.out.println(Calendar.getInstance().getTimeZone());
		Calendar myCalendar=Calendar.getInstance();
		
		//System.out.println(TimeZone.getDefault().getID());
		
		TimeZone timeZone=new TimeZone() {
			
			@Override
			public boolean useDaylightTime() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void setRawOffset(int offsetMillis) {
				this.setRawOffset(offsetMillis);
				
			}
			
			@Override
			public boolean inDaylightTime(Date date) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getRawOffset() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		myCalendar.clear();
		myCalendar.setTimeZone(timeZone);
		
		System.out.println(myCalendar.getTimeZone());
		return "";
	
		
	}
	public static void main(String []args) {
		CustomDateTime.cnvrtOffsetDateTimeToCalTimeZone();
	}
	

}
