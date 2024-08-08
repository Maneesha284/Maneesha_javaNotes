package Nested;
class Food{
	void eat() {
		System.out.println("Hygienic food");
	}
}
public class AnonymousInnerClass {
	Food f = new Food(){
		void eat() {
			super.eat();	//Hygienic food
			System.out.println("Junk food");
		}
	};
	void display() {
		f.eat();	//Junk food
	}
	public static void main(String[] args) {
		AnonymousInnerClass obj = new AnonymousInnerClass();
		obj.display();

	}

}
