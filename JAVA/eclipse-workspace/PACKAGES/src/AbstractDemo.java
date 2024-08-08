abstract class Animal {
	//creating idea
	abstract void soundOfAnimal();
	void display() {
		System.out.println("Display method");
	}
}
class Cat extends Animal {
	//Implementation idea
	@Override
	void soundOfAnimal() {
		System.out.println("Meoh Meoh");
	}
}
class Dog extends Animal {
	//Implementation idea
	@Override
	void soundOfAnimal() {
		System.out.println("Bow Bow");
	}
}
public class AbstractDemo {
	
	public static void main(String[] args) {
		Animal obj = new Cat();
		obj.soundOfAnimal();
		obj.display();
		obj = new Dog();
		obj.soundOfAnimal();
		obj.display();
	}

}
