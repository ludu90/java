import javax.swing.JOptionPane;
import java.util.Scanner;

public class SalesRevenue {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		

	
	JOptionPane.showMessageDialog(null , "Prepare to input product number and sales for each product.\nInput 1 for product 1\nInput 2 for product 2\nInput 3 for product 3\nInput 4 for product 4\nInput 5 for product 5\nInput 6 to exit when finished.");
	int productnum = 1;
	int p1sales = 0;
	int p2sales = 0;
	int p3sales = 0;
	int p4sales = 0;
	int p5sales = 0;
	
	while (productnum != 6)
		{
		System.out.println("Input product #");
		productnum = scan.nextInt();
			switch(productnum)
			{
			case 1:
				System.out.println("Input sales for Product 1.");
				p1sales = scan.nextInt();
				break;
			case 2:
				System.out.println("Input sales for Product 2.");
				p2sales = scan.nextInt();
				break;
			case 3:
				System.out.println("Input sales for Product 3.");
				p3sales = scan.nextInt();
				break;
			case 4:
				System.out.println("Input sales for Product 4.");
				p4sales = scan.nextInt();
				break;
			case 5:
				System.out.println("Input sales for Product 5.");
				p5sales = scan.nextInt();
				break;
			}
		}
	SalesCalc mySales = new SalesCalc( p1sales , p2sales , p3sales , p4sales , p5sales);
	
	mySales.Calc();
	
	}
}

