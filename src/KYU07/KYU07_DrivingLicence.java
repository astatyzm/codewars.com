package KYU07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class KYU07_DrivingLicence {

	public static String driver(final String[] data) {

		StringBuilder strb = new StringBuilder();
		String surname = "";
		// char 1-5 nazwisko
		if (data[2].length() < 5) {
			surname = data[2].substring(0, data[2].length()).toUpperCase();
			while (data[2].length() < 5) {
				// strb.append("9").append(data[2].substring(0,
				// data[2].length()).toUpperCase());
				surname += "9";
				if (surname.length() == 5) {
					break;
				}
			}
		} else {
			// strb.append(data[2].substring(0, 5).toUpperCase());
			surname = data[2].substring(0, 5).toUpperCase();
		}

		// char 6 - liczba dziesi¹tek z roku
		// strb.append(data[3].charAt(data[3].length() - 2));
		char tenYear = data[3].charAt(data[3].length() - 2);

		// char 7,8 - miesiac urodzenia, +5 je¿eli kobieta
		DateTimeFormatter formatter;
		if (data[3].length() > 11) { // "01-Jan-2000"
			formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("dd-MMMM-yyyy")
					.toFormatter(Locale.ENGLISH);
		} else {
			formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("dd-MMM-yyyy")
					.toFormatter(Locale.ENGLISH);
		}
		LocalDate date = LocalDate.parse(data[3], formatter);
		// System.out.println(date);
		int monthTen = Integer.parseInt(String.valueOf(date).substring(5, 6));
		if (data[4] == "F") {
			monthTen += 5;
		}
		char monthUnity = date.toString().charAt(6);

		// char 9-10 dzieñ urodzenia
		// String day = String.valueOf(date).substring(8, 10);
		String day = date.toString().substring(8, 10);

		// char 11 - liczba jednosci z roku
		char unityYear = date.toString().charAt(3);

		// char 12-13 - pierwsza litera z imienia i drugiego imienia (je¿eli nie ma to
		// 9);
		char firstNameLetter = data[0].charAt(0);
		char secondNameLetter;
		if (data[1].isEmpty()) {
			secondNameLetter = '9';
		} else
			secondNameLetter = data[1].charAt(0);

		// Resutl
		// strb.append(surname).append(tenYear).append(monthTen).append(monthUnity).append(date.toString().charAt(6)).append(day)
		// .append(unityYear).append(firstNameLetter).append(secondNameLetter).append("9AA");
		strb.append(surname).append(tenYear).append(monthTen).append(monthUnity).append(day).append(unityYear)
				.append(firstNameLetter).append(secondNameLetter).append("9AA");

		System.out.println(surname);
		System.out.println(tenYear);
		System.out.println(monthTen);
		System.out.println(monthUnity);
		System.out.println(date.toString().charAt(6));
		System.out.println(day);

		System.out.print(strb);

		return strb.toString();
	}

	public static void main(String[] args) {

		String[] data = { "John", "James", "Smitheeeee", "01-Jan-2000", "M" }; // SMITH001010JJ9AA
		driver(data);
		String[] data1 = { "Johanna", "", "Gibbs", "13-Dec-1981", "F" }; // GIBBS862131J99AA
		// driver(data1);
		String[] data2 = { "Andrew", "Robert", "Lee", "02-September-1981", "M" }; // LEE99809021AR9AA
		// driver(data2);
	}
	/*
	 * spróbowaæ substringów ;)
	 * 
	 * 
	 * 
	 * 
	 * 1–5: The first five characters of the surname (padded with 9s if less than 5
	 * characters)
	 * 
	 * 6: The decade digit from the year of birth (e.g. for 1987 it would be 8)
	 * 
	 * 7–8: The monthTen of birth (7th character incremented by 5 if driver is
	 * female i.e. 51–62 instead of 01–12)
	 * 
	 * 9–10: The date within the month of birth
	 * 
	 * 11: The year digit from the year of birth (e.g. for 1987 it would be 7)
	 * 
	 * 12–13: The first two initials of the first name and middle name, padded with
	 * a 9 if no middle name
	 * 
	 * 14: Arbitrary digit – usually 9, but decremented to differentiate drivers
	 * with the first 13 characters in common. We will always use 9
	 * 
	 * 15–16: Two computer check digits. We will always use "AA"
	 */

}
