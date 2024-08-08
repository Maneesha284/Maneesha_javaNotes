package shapePackage;

public class Rectangle extends Shape{
	float length=0, breadth=0;
	
	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public float getBreadth() {
		return breadth;
	}


	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}


	public Rectangle() {
		System.out.println("Square constructor");
	}
	
	
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	public void getArea() {
		System.out.println("Enter length, breadth  values");
		length = sr.nextFloat();
		breadth = sr.nextFloat();
		
	}

	public void getPerimeter() {
		area=length* breadth;
		System.out.println("Area = "+area);
		
	}

}
