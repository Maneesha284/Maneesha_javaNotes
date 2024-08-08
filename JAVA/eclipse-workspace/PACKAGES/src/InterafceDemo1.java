import java.util.Scanner;

interface Shape{
	void accept(Scanner sr);
	void callArea();
	void display();
}
class Rectangle implements Shape{
	double length, breadh, area = 0;
	@Override
	public void accept(Scanner sr) {
		System.out.println("Enter length, breadh vaues");
		length = sr.nextDouble();
		breadh = sr.nextDouble();
		
	}

	@Override
	public void callArea() {
		area=length* breadh;
		
	}

	@Override
	public void display() {
		System.out.println("Area = "+area);
		
	}
	
}
class Square implements Shape{
	double sq, area = 0;
	@Override
	public void accept(Scanner sr) {
		System.out.println("Enter square vaues");
		sq = sr.nextDouble();
		
		
	}

	@Override
	public void callArea() {
		area=sq* sq;
		
	}

	@Override
	public void display() {
		System.out.println("Area = "+area);
		
	}
	
}
public  class InterafceDemo1 {

	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		Shape obj = new Rectangle();
		obj.accept(sr);
		obj.callArea();
		obj.display();
		obj = new Square();
		obj.accept(sr);
		obj.callArea();
		obj.display();

	}

}
