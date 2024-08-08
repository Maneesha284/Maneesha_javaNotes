import java.util.Scanner;

class Rectangle {
	double length;
	double breadth;

	double getArea(double length,double breadth) {
		 
		return length *  breadth;
	}

	double getPerimeter(double length,double breadth) {
		return 2 *(length +  breadth);
	}
}

public class MyClass {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle();
		
		System.out.println("Enter length and breadth values for object1:");
		
		obj1.getArea(sr.nextDouble(), sr.nextDouble());
		obj1.getPerimeter(sr.nextDouble(), sr.nextDouble());
		
		System.out.println("Enter length and breadth values for object2:");
		
		obj2.getArea(sr.nextDouble(), sr.nextDouble());
		obj2.getPerimeter(sr.nextDouble(), sr.nextDouble());
		

	}

}
