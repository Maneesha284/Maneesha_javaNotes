package Material;

import java.util.Scanner;

public class ShirtMaterial {

	
		public static void main(String[] args) {
			Scanner sr = new Scanner(System.in);
			Shirt obj1 = new Shirt();
			obj1.displayDetails();

			
			System.out.println("Enter Shirt collarSize and length");
			Shirt obj2 = new Shirt(sr.nextFloat(), sr.nextFloat(), MaterialEnum.POLYSTER);
			obj2.displayDetails();

		}
	

}
