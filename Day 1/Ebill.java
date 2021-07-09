import java.util.Scanner;

public class Ebill {
	public static void main(String[] args) {
		System.out.println("Generate Electricity Bill!!!");
		System.out.println("");
		float s = 1.20f; // Standard price per unit is Rs. 1.20
		float total = 0.00f;
		
		System.out.print("Enter number of units to calculate the bill: ");
		Scanner sc = new Scanner(System.in);
		float unit = sc.nextFloat();
		System.out.println("");
		
		//number of units less than 100
		if (unit < 100) {
			total = s * unit;
		}
		
		//number of units less than or equal to 300
		else if(unit <= 300 && unit >= 100) {
			total = (s * 100) + (2 * (unit - 100)); 
		}
		
		//number of units greater than 300
		else {
			total = (s * 100) + (2 * 200) + (3 * (unit - 300));
		}
		System.out.println("------Generating Bill------");
		System.out.println("");
		System.out.println("Electricity Bill is " + total);
	}

}
