class class1{
	
	class1(){
		System.out.println("class1 cons");
	}
}
class class2 extends class1{
	class2(){
		System.out.println("class2 cons");
	}
}
public class class3 extends class2{
	class3(){
		
		System.out.println("class3 cons");
	}
	public static void main(String[] args) {
		class3 o3=new class3();
		

	}

}
