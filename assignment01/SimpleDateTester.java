package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {
	public static void main(String[] args) {
		//Create one person
		//and see that it prints correctly
		//add similar code to print your test to the output file.
		SimpleDate date = SimpleDate.of(2019,9,1);
		SimpleDate other1 = SimpleDate.of(2019,9,2);
		SimpleDate other2 = SimpleDate.of(2019,10,1);
		SimpleDate other3 = SimpleDate.of(2020,9,1);
		System.out.println(date.before(other1));
		System.out.println(date.before(other2));
		System.out.println(date.before(other3));

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDateTester.java:");
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
			SimpleDate date2 =  SimpleDate.of(2019,9,1);
			SimpleDate other12 =  SimpleDate.of(2019,9,2);
			SimpleDate other22 =  SimpleDate.of(2019,10,1);
			SimpleDate other32 =  SimpleDate.of(2020,9,1);
			output.println(date2.before(other12));
			output.println(date2.before(other22));
			output.println(date2.before(other32));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

public class SimpleDate {
  private int year;
  private int month;
  private int day;

  public static SimpleDate of(int yr, int m, int d){
    SimpleDate returnValue = new SimpleDate();
    returnValue.year = yr;
    returnValue.month = m;
    returnValue.day = d;
    return returnValue;
  }

  public boolean before(SimpleDate other){
    if(year < other.year){
      return true;
    } else if((year == other.year) && (month < other.month)){
      return true;
    } else if((year == other.year) && (month == other.month) &&(day < other.day )){
      return true;
    }else{
      return false;
    }
  }
}
