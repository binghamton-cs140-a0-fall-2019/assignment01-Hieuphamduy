package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		//5 DateAndPlaceOfBirth objects 3 with birth places in the USA
		//(with a State) and 2 from other countries using the 2nd constructor that
		//does not have a state parameter.
		//Give two objects the same birth date and have another object
		//with the same birthday (day and month) but a different birth year.
		DateAndPlaceOfBirth Birth1 = new DateAndPlaceOfBirth(1997,02, 19, "Binghamton","NY", "USA");
		DateAndPlaceOfBirth Birth2 = new DateAndPlaceOfBirth(1997,02, 19, "Binghamton","NY", "USA");
		DateAndPlaceOfBirth Birth3 = new DateAndPlaceOfBirth(2007,02, 19, "Binghamton","NY", "USA");
		DateAndPlaceOfBirth Birth4 = new DateAndPlaceOfBirth(1997,02, 01, "Hanoi", "Vietnam");
		DateAndPlaceOfBirth Birth5 = new DateAndPlaceOfBirth(2007,02, 02, "Hanoi", "Vietnam");
		System.out.println(Birth1);
		System.out.println(Birth2);
		System.out.println(Birth3);
		System.out.println(Birth4);
		System.out.println(Birth5);

		System.out.println(Birth1.hasSameBirthDayAs(Birth2));
		System.out.println(Birth1.hasSameBirthDayAs(Birth3));
		System.out.println(Birth1.hasSameBirthDayAs(Birth4));
		System.out.println(Birth1.hasSameBirthDayAs(Birth5));
		System.out.println(Birth2.hasSameBirthDayAs(Birth3));
		System.out.println(Birth2.hasSameBirthDayAs(Birth4));
		System.out.println(Birth2.hasSameBirthDayAs(Birth5));
		System.out.println(Birth3.hasSameBirthDayAs(Birth4));
		System.out.println(Birth3.hasSameBirthDayAs(Birth5));
		System.out.println(Birth4.hasSameBirthDayAs(Birth5));

		System.out.println(Birth1.hasSameBirthDateAs(Birth2));
		System.out.println(Birth1.hasSameBirthDateAs(Birth3));
		System.out.println(Birth1.hasSameBirthDateAs(Birth4));
		System.out.println(Birth1.hasSameBirthDateAs(Birth5));
		System.out.println(Birth2.hasSameBirthDateAs(Birth3));
		System.out.println(Birth2.hasSameBirthDateAs(Birth4));
		System.out.println(Birth2.hasSameBirthDateAs(Birth5));
		System.out.println(Birth3.hasSameBirthDateAs(Birth4));
		System.out.println(Birth3.hasSameBirthDateAs(Birth5));
		System.out.println(Birth4.hasSameBirthDateAs(Birth5));


		System.out.println(Birth1.youngerThan(Birth2));
		System.out.println(Birth1.youngerThan(Birth3));
		System.out.println(Birth1.youngerThan(Birth4));
		System.out.println(Birth1.youngerThan(Birth5));
		System.out.println(Birth2.youngerThan(Birth3));
		System.out.println(Birth2.youngerThan(Birth4));
		System.out.println(Birth2.youngerThan(Birth5));
		System.out.println(Birth3.youngerThan(Birth4));
		System.out.println(Birth3.youngerThan(Birth5));
		System.out.println(Birth4.youngerThan(Birth5));

		System.out.println(Birth1.olderThan(Birth2));
		System.out.println(Birth1.olderThan(Birth3));
		System.out.println(Birth1.olderThan(Birth4));
		System.out.println(Birth1.olderThan(Birth5));
		System.out.println(Birth2.olderThan(Birth3));
		System.out.println(Birth2.olderThan(Birth4));
		System.out.println(Birth2.olderThan(Birth5));
		System.out.println(Birth3.olderThan(Birth4));
		System.out.println(Birth3.olderThan(Birth5));
		System.out.println(Birth4.olderThan(Birth5));





		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		DateAndPlaceOfBirth Birth12 = new DateAndPlaceOfBirth(1997,02, 19, "Binghamton","NY", "USA");
		DateAndPlaceOfBirth Birth22= new DateAndPlaceOfBirth(1997,02, 19, "Binghamton","NY", "USA");
		DateAndPlaceOfBirth Birth32 = new DateAndPlaceOfBirth(2007,02, 19, "Binghamton","NY", "USA");
		DateAndPlaceOfBirth Birth42 = new DateAndPlaceOfBirth(1997,02, 01, "Hanoi", "Vietnam");
		DateAndPlaceOfBirth Birth52 = new DateAndPlaceOfBirth(2007,02, 02, "Hanoi", "Vietnam");
		output.println(Birth12);
		output.println(Birth22);
		output.println(Birth32);
		output.println(Birth42);
		output.println(Birth52);

		output.println(Birth12.hasSameBirthDayAs(Birth22));
		output.println(Birth12.hasSameBirthDayAs(Birth32));
		output.println(Birth12.hasSameBirthDayAs(Birth42));
		output.println(Birth12.hasSameBirthDayAs(Birth52));
		output.println(Birth22.hasSameBirthDayAs(Birth32));
		output.println(Birth22.hasSameBirthDayAs(Birth42));
		output.println(Birth22.hasSameBirthDayAs(Birth52));
		output.println(Birth32.hasSameBirthDayAs(Birth42));
		output.println(Birth32.hasSameBirthDayAs(Birth52));
		output.println(Birth42.hasSameBirthDayAs(Birth52));

		output.println(Birth12.hasSameBirthDateAs(Birth22));
		output.println(Birth12.hasSameBirthDateAs(Birth32));
		output.println(Birth12.hasSameBirthDateAs(Birth42));
		output.println(Birth12.hasSameBirthDateAs(Birth52));
		output.println(Birth22.hasSameBirthDateAs(Birth32));
		output.println(Birth22.hasSameBirthDateAs(Birth42));
		output.println(Birth22.hasSameBirthDateAs(Birth52));
		output.println(Birth32.hasSameBirthDateAs(Birth42));
		output.println(Birth32.hasSameBirthDateAs(Birth52));
		output.println(Birth42.hasSameBirthDateAs(Birth52));


		output.println(Birth12.youngerThan(Birth22));
		output.println(Birth12.youngerThan(Birth32));
		output.println(Birth12.youngerThan(Birth42));
		output.println(Birth12.youngerThan(Birth52));
		output.println(Birth22.youngerThan(Birth32));
		output.println(Birth22.youngerThan(Birth42));
		output.println(Birth22.youngerThan(Birth52));
		output.println(Birth32.youngerThan(Birth42));
		output.println(Birth32.youngerThan(Birth52));
		output.println(Birth42.youngerThan(Birth52));

		output.println(Birth12.olderThan(Birth22));
		output.println(Birth12.olderThan(Birth32));
		output.println(Birth12.olderThan(Birth42));
		output.println(Birth12.olderThan(Birth52));
		output.println(Birth22.olderThan(Birth32));
		output.println(Birth22.olderThan(Birth42));
		output.println(Birth22.olderThan(Birth52));
		output.println(Birth32.olderThan(Birth42));
		output.println(Birth32.olderThan(Birth52));
		output.println(Birth42.olderThan(Birth52));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
