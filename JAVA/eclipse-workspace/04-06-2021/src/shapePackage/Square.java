package shapePackage;

public class Square extends Shape{
	float side=0;
	
	public float getRadius() {
		return side;
	}

	public void setRadius(float side) {
		this.side = side;
	}
	public Square() {
		System.out.println("Square constructor");
	}
	
	public Square(float side) {
		super();
		this.side = side;
	}
	public void getArea() {
		System.out.println("Enter square value");
		side = sr.nextFloat();
		
	}

	public void getPerimeter() {
		area=side* side;
		System.out.println("Area = "+area);
		
	}

}
