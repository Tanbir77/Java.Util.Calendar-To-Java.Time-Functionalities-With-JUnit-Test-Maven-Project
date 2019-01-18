package naztech.io.JavaUtilCalenderToJavaTime_JUnit_Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Tanbirul Hashan
 */

public class CustomDateTime {

	public static LocalDate cnvrtCalDateToLocalDate() {

		return LocalDate.parse(new SimpleDateFormat("YYYY-MM-dd").format(Calendar.getInstance().getTime()));
	}

	public static LocalTime cnvrtCalTimeToLocalTime() {

		return LocalTime.parse(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));

	}

	public static LocalDateTime cnvrtCalDateTimeToLocalDateTime() {

		return LocalDateTime
				.parse(new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss").format(Calendar.getInstance().getTime()));

	}

	public static Date cnvrtLocalDateTimeToCalDateTime() {
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.clear();
		myCalendar.set(LocalDateTime.now().getYear(), LocalDateTime.now().getMonthValue() - 1,
				LocalDateTime.now().getDayOfMonth(), LocalDateTime.now().getHour(), LocalDateTime.now().getMinute(),
				LocalDateTime.now().getSecond());

		return myCalendar.getTime();
	}

	public static OffsetDateTime cnvrtCalZoneTimeToOffsetDateTime() {
		
		return OffsetDateTime.ofInstant(Calendar.getInstance().toInstant(),
				Calendar.getInstance().getTimeZone().toZoneId()) ;

	}

	public static ZonedDateTime cnvrtCalZoneDateTimeToZonedDateTime() {
		
		return OffsetDateTime.now().atZoneSameInstant(Calendar.getInstance().getTimeZone().toZoneId());

	}

	public static OffsetTime cnvrtCalZoneTimeToOffsetTime() {
		Calendar newCal = Calendar.getInstance();
		return OffsetTime.ofInstant(newCal.toInstant(), newCal.getTimeZone().toZoneId());

	}

}
