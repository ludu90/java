
public class HealthProfile {
//This class recieves the variables inputted by the user and calculates results for displaying.
	private double BMI;
	private double Age;
	private double AgeDays;
	private double MaxHR;
	private double TargetHR;
	private double height;
	private double weight;
	private double DayOB;
	private double MOB;
	private double YOB;
	private double CurrentDay;
	private double CurrentMonth;
	private double CurrentYear;
	
	//Constructor 
		public HealthProfile( double xheight , double xweight ,  double xDayOB , double xMOB , double xYOB , double xCurrentDay , double xCurrentMonth , double xCurrentYear)
		{
			height = xheight;
			weight = xweight;
			DayOB = xDayOB;
			MOB = xMOB;
			YOB = xYOB;
			CurrentDay = xCurrentDay;
			CurrentMonth = xCurrentMonth;
			CurrentYear = xCurrentYear;
		}
		
			public void HealthProfileCalc()
			{
			BMI = (weight * 703) / (height * height);
			//Calculates BMI
			AgeDays = ((CurrentYear - 1) * 365 + (CurrentMonth - 1) * 30 + CurrentDay) - ((YOB - 1) * 365 + (MOB - 1) * 30 + DayOB);
			//Calculates Age in days
			Age = AgeDays / 365 ;
			//Converts Age in days into years 
			MaxHR = 220 - Age;
			//Calculates maximum heart rate
			TargetHR = MaxHR * .75;
			//Calculates target heart rate
			
			//These lines print out the results
			System.out.println("The user's date of birth is " + DayOB + "/" + MOB + "/" + YOB);
			System.out.println("The user's height is " + height);
			System.out.println("The user's weight is " + weight);
			System.out.println("The user's age is " + Age);
			System.out.println("The user's maximum heart rate is " + MaxHR);
			System.out.println("The user's target heart rate is " + TargetHR);
			System.out.println("The user's BMI is " + BMI);
			System.out.println("BMI Values Chart:");
			System.out.println("Underweight: less than 18.5");
			System.out.println("Normal: between 18.5 and 24.9");
			System.out.println("Overweight: between 25 and 29.9");
			System.out.println("Obese: 30 or greater");
			}
	}
			