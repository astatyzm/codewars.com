package KYU07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KYU07_DrivingLicenceTest {

	@Test
	void test() {
		String[] data = { "John", "James", "Smitheeeee", "01-Jan-2000", "M" };
		assertEquals("SMITH001010JJ9AA", KYU07_DrivingLicence.driver(data));
		String[] data1 = { "Johanna", "", "Gibbs", "13-Dec-1981", "F" }; // GIBBS862131J99AA
		assertEquals("GIBBS862131J99AA", KYU07_DrivingLicence.driver(data1));
	}

}
