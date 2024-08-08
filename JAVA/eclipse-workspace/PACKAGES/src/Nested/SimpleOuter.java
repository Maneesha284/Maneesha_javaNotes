package Nested;

public class SimpleOuter {
	int num1 = 10;
	class Inner {
		int num2 = 20;
		Inner(){
			System.out.println("Inner class num1: "+num1 +"  num2: "+num2);
		}
	}
	SimpleOuter(){
		System.out.println("Outer class num1: "+num1);
	}
	public static void main(String[] args) {
		
		SimpleOuter obj1 = new SimpleOuter();
		SimpleOuter.Inner obj2=obj1.new Inner(); 

	}

}
