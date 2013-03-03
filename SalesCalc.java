import javax.swing.JOptionPane;

public class SalesCalc {
private int p1sales;
private int p2sales;
private int p3sales;
private int p4sales;
private int p5sales;
private int totalsales = 0;
private double p1price = 2.98;
private double p2price = 4.50;
private double p3price = 9.98;
private double p4price = 4.49;
private double p5price = 6.87;
private double p1rev;
private double p2rev;
private double p3rev;
private double p4rev;
private double p5rev;
private double totalrev = 0;

	public SalesCalc( int xp1sales , int xp2sales , int xp3sales , int xp4sales , int xp5sales)
	{
		p1sales = xp1sales;
		p2sales = xp2sales;
		p3sales = xp3sales;
		p4sales = xp4sales;
		p5sales = xp5sales;
	}
		public void Calc()
		{
			p1rev = p1price * p1sales;
			p2rev = p2price * p2sales;
			p3rev = p3price * p3sales;
			p4rev = p4price * p4sales;
			p5rev = p5price * p5sales;
			totalrev = p1rev + p2rev + p3rev + p4rev + p5rev;
			totalsales = p1sales + p2sales + p3sales + p4sales + p5sales;
		
			JOptionPane.showMessageDialog(null , "Revenue from Product 1 is " + p1rev + "\nRevenue from Product 2 is " + p2rev + "\nRevenue from Product 3 is " + p3rev + "\nRevenue from Product 4 is " + p4rev + "\nRevenue from Product 5 is " + p5rev + "\nTotal Revenue is " + totalrev + "\nTotal sales is " + totalsales);
		}
}
