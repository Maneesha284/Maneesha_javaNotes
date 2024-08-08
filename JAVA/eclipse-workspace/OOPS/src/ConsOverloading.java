
public class ConsOverloading {
	ConsOverloading(){
		System.out.println("default parameterized constructor");
	}
	ConsOverloading(int a){
		this();
		System.out.println("one parameterized constructor");
	}
	ConsOverloading(int a, int b){
		this(10);
		System.out.println("Two parameterized constructor");
	}
	ConsOverloading(int a, int b, int c){
		this(10,20);
		System.out.println("Three parameterized constructor");
	}
	public static void main(String[] args) {
		ConsOverloading obj = new ConsOverloading(1,2,3);
	}

}
