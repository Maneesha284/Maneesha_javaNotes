package shapePackage;

public class Circle extends Shape{
	float radius=0;
	
	

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	public Circle() {
		System.out.println("Circle constructor");
	}
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	public void getArea() {
		System.out.println("Enter radius value");
		radius = sr.nextFloat();
	}

	public void getPerimeter() {
		area=radius* radius;
		System.out.println("Area = "+area);
		
	}

}
