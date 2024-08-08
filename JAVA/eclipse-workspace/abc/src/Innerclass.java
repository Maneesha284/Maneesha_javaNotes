
public class Innerclass {

	class A {
		int v1 = 10;
		
		void m1(String s1) {
			v1=20;
			v2=50;
			m1("aaa");
			m2("bbb");
			System.out.println("in method");
		}
		
		
//		System.out.println(v1);
		
	}

	int v2 = 20;
	
	void m2(String s2) {
		v2=40;
		//v1=60;
	//	m1("aaa");
		m2("bbb");
		System.out.println("out method");
	}
//	System.out.println();

	public static void main(String[] args) {

	}

}
