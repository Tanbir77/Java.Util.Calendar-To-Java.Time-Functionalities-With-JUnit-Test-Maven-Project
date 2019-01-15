package naztech.io.JavaUtilCalenderToJavaTime_JUnit_Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.time.Duration;

/**
 * @author Tanbirul Hashan
 */

public class CustomDateTime {

	public static LocalDate getLocalDate() {
		Date date = Calendar.getInstance().getTime();
		LocalDate localDate = LocalDate.parse(new SimpleDateFormat("YYYY-MM-dd").format(date));
		return localDate;
	}

	public static LocalTime getLocalTime() {

		Date date = Calendar.getInstance().getTime();
		LocalTime localTime = LocalTime.parse(new SimpleDateFormat("HH:mm:ss").format(date));
		return localTime;

	}

	public static LocalDateTime getLocalDateTime() {

		LocalDateTime localDateTime = LocalDateTime
				.parse(CustomDateTime.getLocalDate().toString() + "T" + CustomDateTime.getLocalTime().toString());
		return localDateTime;

	}

}
