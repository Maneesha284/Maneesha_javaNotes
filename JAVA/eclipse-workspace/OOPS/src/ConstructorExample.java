class Car{
	Car(){
		System.out.println("Default constructor");
	}
	void Car(){
		System.out.println("Method");
	}
}
public class ConstructorExample {
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.Car();
	}

}
