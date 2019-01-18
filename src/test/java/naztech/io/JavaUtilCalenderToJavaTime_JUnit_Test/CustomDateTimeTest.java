/**
 * 
 */
package naztech.io.JavaUtilCalenderToJavaTime_JUnit_Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * @author Tanbirul Hashan
 *
 */
public class CustomDateTimeTest {

	public DateTimeFormatter myFormatter(String formatStyle) {
		return DateTimeFormatter.ofPattern(formatStyle);
	}

	@Test
	public void cnvrtCalTimeToLocalTimeTest() {

		assertFalse(LocalTime.now().equals(CustomDateTime.cnvrtCalTimeToLocalTime()));
		LocalTime localTime = LocalTime.parse(LocalTime.now().format(myFormatter("HH:mm:ss")));
		assertTrue(localTime.equals(CustomDateTime.cnvrtCalTimeToLocalTime()));
	}

	@Test
	public void cnvrtCalDateToLocalDateTest() {

		assertTrue(LocalDate.now().equals(CustomDateTime.cnvrtCalDateToLocalDate()));
	}

	@Test
	public void cnvrtCalDateTimeToLocalDateTimeTest() {
		LocalDateTime localDateTime = LocalDateTime.now();
		assertFalse(localDateTime.equals(CustomDateTime.cnvrtCalDateTimeToLocalDateTime()));
		assertTrue(LocalDateTime.parse(localDateTime.format(myFormatter("YYYY-MM-dd'T'HH:mm:ss")))
				.equals(CustomDateTime.cnvrtCalDateTimeToLocalDateTime()));
	}

	@Test
	public void cnvrtLocalDateTimeToCalDateTimeTest() {
		Date actualDate = CustomDateTime.cnvrtLocalDateTimeToCalDateTime();
		Date expectedDate = Calendar.getInstance().getTime();
		/*
		 * comparison is made in string as Java.util.date equal method return true if
		 * and only if the getTime return same long value for both
		 */
		assertTrue(expectedDate.toString().equals(actualDate.toString()));
	}

	@Test
	public void cnvrtCalZoneTimeToOffsetDateTimeTest() {

		assertFalse(OffsetDateTime.now().isEqual(CustomDateTime.cnvrtCalZoneTimeToOffsetDateTime()));

		assertTrue(OffsetDateTime.now().format(myFormatter("YYYY-MM-dd'T'HH:mm:ss")).equals(
				CustomDateTime.cnvrtCalZoneTimeToOffsetDateTime().format(myFormatter("YYYY-MM-dd'T'HH:mm:ss"))));
	}

	@Test
	public void cnvrtCalZoneDateTimeToZonedDateTimeTest() {

		assertEquals(ZonedDateTime.now().getZone(), CustomDateTime.cnvrtCalZoneDateTimeToZonedDateTime().getZone());
		assertTrue(ZonedDateTime.now().format(myFormatter("YYYY-MM-dd'T'HH:mm:ss")).equals(
				CustomDateTime.cnvrtCalZoneDateTimeToZonedDateTime().format(myFormatter("YYYY-MM-dd'T'HH:mm:ss"))));

	}

	@Test
	public void cnvrtCalZoneTimeToOffsetTimeTest() {

		assertEquals(OffsetTime.now().getOffset(), CustomDateTime.cnvrtCalZoneTimeToOffsetTime().getOffset());
		assertTrue(OffsetTime.now().format(myFormatter("HH:mm:ss"))
				.equals(CustomDateTime.cnvrtCalZoneTimeToOffsetTime().format(myFormatter("HH:mm:ss"))));

	}

}
