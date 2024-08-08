package shapePackage;

import java.util.Scanner;

public abstract class Shape {
	public static float area=0;
	public abstract void getArea();
	public abstract void getPerimeter();
	Scanner sr =new Scanner(System.in);
	public static void main(String args[]) {
		Shape obj= new Circle();
		obj.getArea();
		obj.getPerimeter();
		obj=new Rectangle();
		obj.getArea();
		obj.getPerimeter();
		obj=new Square();
		obj.getArea();
		obj.getPerimeter();
	}
	
}
