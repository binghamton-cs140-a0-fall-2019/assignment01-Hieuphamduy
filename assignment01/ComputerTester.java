package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		Computer comp1 = new Computer("Razer", "NA", 2, 2048, true, 100);
		Computer comp2 = new Computer("Razer", "NA", 2, 2048, false, 100);
		Computer comp3 = new Computer("Razer", "NA", 2, 512, true, 100);
		Computer comp4 = new Computer("Razer", "NA", 2, 512, false, 100);
		System.out.println(comp1);
		System.out.println(comp2);
		System.out.println(comp3);
		System.out.println(comp4);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		Computer comp12 = new Computer("Razer", "NA", 2, 2048, true, 100);
		Computer comp22 = new Computer("Razer", "NA", 2, 2048, false, 100);
		Computer comp32 = new Computer("Razer", "NA", 2, 512, true, 100);
		Computer comp42 = new Computer("Razer", "NA", 2, 512, false, 100);
		output.println(comp12);
		output.println(comp22);
		output.println(comp32);
		output.println(comp42);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
