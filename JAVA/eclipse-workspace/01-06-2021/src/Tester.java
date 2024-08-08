
class Rectangle {

	int x1, y1, x2, y2;
	int width, height;

	public Rectangle() {
		System.out.println("Default constructor");
	}

	public Rectangle(int width, int height) {
		super();
		x1 = 0;
		y1 = 0;
		x2 = width - x1;
		y2 = height - y1;

	}

	public Rectangle(int x1, int y1, int x2, int y2) {

		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;

	}

	public int getHeight() {

		height = y2 - y1;
		return height;

	}

	public int getWidth() {

		width = x2 - x1;
		return width;

	}

	public int getArea() {
		return ((y2 - y1) * (x2 - x1));

	}

	public int getPerimeter() {
		return (2 * ((y2 - y1) + (x2 - x1)));
	}

	public void move(int deltax, int deltay) {
		x1 += deltax;
		y1 += deltay;
		x2 += deltax;
		y2 += deltay;

	}

	public boolean isPointInside(int pointx, int pointy) {

		int count = 0;

		for (int i = x1; i <= x2; i++) {
			if (i == pointx)
				count++;
		}

		for (int i = y1; i <= y2; i++) {
			if (i == pointy)
				count++;
		}

		if (count == 2)
			return true;
		else
			return false;
	}

}

public class Tester {

	public static void main(String args[]) {

		Rectangle rectangle = new Rectangle(25, 55);
		System.out.println(rectangle.getHeight());
		rectangle.move(3, 6);
		System.out.println(rectangle.isPointInside(3, 6));

	}

}