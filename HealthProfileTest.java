import java.util.Scanner;

public class HealthProfileTest {
//This class gathers values for calculations in the HealthProfile class
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Constructor
		{
			double height;
			double weight;
			double DayOB;
			double MOB;
			double YOB;
			double CurrentDay;
			double CurrentMonth;
			double CurrentYear;
			//These next lines ask for and recieve values from the user
			System.out.println("Enter the user's height.");
			height = scan.nextDouble();
			System.out.println("Enter the user's weight.");
			weight = scan.nextDouble();
			System.out.println("Enter the user's Day of Birth.");
			DayOB = scan.nextDouble();
			System.out.println("Enter the user's Month of Birth.");
			MOB = scan.nextDouble();
			System.out.println("Enter the user's Year of Birth.");
			YOB = scan.nextDouble();
			System.out.println("Enter the user's gender.");
			String Gender = scan.next();
			System.out.println("Enter the user's First Name.");
			String FName = scan.next();
			System.out.println("Enter the user's Last Name.");
			String LName = scan.next();
			System.out.println("Enter the current day.");
			CurrentDay = scan.nextDouble();
			System.out.println("Enter the current month.");
			CurrentMonth = scan.nextDouble();
			System.out.println("Enter the current year.");
			CurrentYear = scan.nextDouble();
			//This next line sends values to the HealthProfile class
			HealthProfile HealthProfileTest = new HealthProfile( height , weight , DayOB , MOB , YOB , CurrentDay , CurrentMonth , CurrentYear );
			HealthProfileTest.HealthProfileCalc();
			System.out.println("The user's name is " + FName + " " + LName);
			System.out.println("The user's gender is " + Gender);
		}
	}
}
