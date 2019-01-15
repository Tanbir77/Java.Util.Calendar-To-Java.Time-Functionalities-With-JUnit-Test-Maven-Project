/**
 * 
 */
package naztech.io.JavaUtilCalenderToJavaTime_JUnit_Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

/**
 * @author Tanbirul Hashan
 *
 */
public class CustomDateTimeTest {

	@Test
	public void getLocalTimeTest() {

		assertFalse(LocalTime.now().equals(CustomDateTime.getLocalTime()));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.parse(LocalTime.now().format(formatter));
		assertTrue(localTime.equals(CustomDateTime.getLocalTime()));
	}

	@Test
	public void getLocalDateTest() {

		assertTrue(LocalDate.now().equals(CustomDateTime.getLocalDate()));
	}

	@Test
	public void getLocalDateTimeTest() {
		assertFalse(LocalDateTime.now().equals(CustomDateTime.getLocalDateTime()));
		LocalDateTime localDateTime = LocalDateTime
				.parse(CustomDateTime.getLocalDate().toString() + "T" + CustomDateTime.getLocalTime().toString());
		assertTrue(localDateTime.equals(CustomDateTime.getLocalDateTime()));
	}

}
