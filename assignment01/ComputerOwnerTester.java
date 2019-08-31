package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth placeDob = new DateAndPlaceOfBirth(1997,02, 19, "Hanoi", "Vietnam");
		StreetUSAddress address = new StreetUSAddress("Course Street","Downtown","Binghamton", "NY", "13902");
		Person man = new Person("Hieu", "Pham", "123456789", placeDob, address);
		Computer comp1 = new Computer("Razer", "NA", 2, 2048, true, 100);
		Computer comp2 = new Computer("Razer", "NA", 2, 2048, false, 100);
		Computer comp3 = new Computer("Razer", "NA", 2, 512, true, 100);
		Computer comp4 = new Computer("Razer", "NA", 2, 512, false, 100);
		ComputerOwner owner = new ComputerOwner(man);
		owner.addComputer(comp1);
		owner.addComputer(comp2);
		owner.addComputer(comp3);
		owner.addComputer(comp4);
		System.out.println(owner);
		owner.removeComputer(0);
		owner.removeComputer(0);
		System.out.println(owner);

    try(var output =new PrintWriter(new FileOutputStream(
        new File("output.txt"), true /* true means append to file */))) {
      output.println("\nTESTS FOR ComputerOwnerTester.java:");
    //Copy all your lines above, add an extra "2" to every variable name
    // and replace every System.out.print or System.out.println
    // by output.print or output.println
			DateAndPlaceOfBirth placeDob2 = new DateAndPlaceOfBirth(1997,02, 19, "Hanoi", "Vietnam");
			StreetUSAddress address2 = new StreetUSAddress("Course Street","Downtown","Binghamton", "NY", "13902");
			Person man2 = new Person("Hieu", "Pham", "123456789", placeDob2, address2);
			Computer comp12 = new Computer("Razer", "NA", 2, 2048, true, 100);
			Computer comp22 = new Computer("Razer", "NA", 2, 2048, false, 100);
			Computer comp32 = new Computer("Razer", "NA", 2, 512, true, 100);
			Computer comp42 = new Computer("Razer", "NA", 2, 512, false, 100);
			ComputerOwner owner2 = new ComputerOwner(man2);
			owner2.addComputer(comp12);
			owner2.addComputer(comp22);
			owner2.addComputer(comp32);
			owner2.addComputer(comp42);
			output.println(owner2);
			owner2.removeComputer(0);
			owner2.removeComputer(0);
			output.println(owner2);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
