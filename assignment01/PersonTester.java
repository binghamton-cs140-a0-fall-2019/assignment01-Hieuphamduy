package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
		//Create one person
		//and see that it prints correctly
		//add similar code to print your test to the output file.
		DateAndPlaceOfBirth placeDob = new DateAndPlaceOfBirth(1997,02, 19, "Hanoi", "Vietnam");
		StreetUSAddress address = new StreetUSAddress("Course Street","Downtown","Binghamton", "NY", "13902");
		Person man = new Person("Hieu", "Pham", "123456789", placeDob, address);
		System.out.println(man);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
			DateAndPlaceOfBirth placeDob2 = new DateAndPlaceOfBirth(1997,02, 19, "Hanoi", "Vietnam");
			StreetUSAddress address2 = new StreetUSAddress("Course Street","Downtown","Binghamton", "NY", "13902");
			Person man2 = new Person("Hieu", "Pham", "123456789",placeDob2, address2);
			output.println(man2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
