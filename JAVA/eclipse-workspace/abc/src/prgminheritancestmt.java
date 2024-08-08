
  class SuperClass {
    int a = 10;
   // private int b = 20;
 protected   int b = 20;
 SuperClass(){
	 System.out.println("SuperClass cons");
 }
//    public void add() {
//        int c = a + b;
//        System.out.println("Sum: " + c);
//    }
    
    public void m1() {
    	System.out.println("super");
    }
 
}
 
class Multiple extends SuperClass {
	
	Multiple(){
		System.out.println("SubClass cons");
	}
    int d = 30;
    int a = 30;
    int c=2;
 
    public void mul() {
        int r = d * b; // Changed to multiplication for meaningful operation
        System.out.println("Product: " + r);
    }
    
 public void m1() {
	 System.out.println("sub");
    }
}
public class prgminheritancestmt
{
	private int e=100;
	public static void main(String[] args) {
		Multiple m = new Multiple();
		//m.add();
		m.mul();
		System.out.println("a: "+m.a);
		m.m1();
	}
}
 
