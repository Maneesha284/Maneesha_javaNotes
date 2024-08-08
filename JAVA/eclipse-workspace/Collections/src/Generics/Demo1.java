package Generics;

public class Demo1<T> {
	T num;
	Demo1(T num){
		this.num=num;
	}
	T getNum() {
		return num;
	}
	public static void main(String[] args) {
		Demo1<Integer> obj1=new Demo1<Integer>(10);
		System.out.println(obj1.getNum());
		
		Demo1<Float> obj2=new Demo1<Float>(19.34f);
		System.out.println(obj2.getNum());
		
		Demo1<String> obj3=new Demo1<String>("maneesha");
		System.out.println(obj3.getNum());

	}

}
