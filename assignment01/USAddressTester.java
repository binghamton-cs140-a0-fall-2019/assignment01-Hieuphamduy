package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
    //In the main method make 2 objects,
    //one with an empty String for address2
    //and print them to see that one object prints with 3 lines
    //and the other with 2 lines.
		StreetUSAddress address1 = new StreetUSAddress("Vestal","","Binghamton", "NY", "13902");
		StreetUSAddress address2 = new StreetUSAddress("Course Street","Downtown","Binghamton", "NY", "13902");
		System.out.println(address1);
		System.out.println(address2);

		try(var output =new PrintWriter(new FileOutputStream(
					    new File("output.txt"), true /* true means append to file */))) {
					output.println("\nTESTS FOR StreetUSAddress.java:");
				//Copy all your lines above, add an extra "2" to every variable name
				// and replace every System.out.print or System.out.println
				// by output.print or output.println
				StreetUSAddress address12 = new StreetUSAddress("Vestal","","Binghamton", "NY", "13902");
				StreetUSAddress address22 = new StreetUSAddress("Course Street","Downtown","Binghamton", "NY", "13902");
				output.println(address1);
				output.println(address2);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
		}
}
