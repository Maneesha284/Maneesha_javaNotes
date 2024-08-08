package FI.Collection;

//class MyThread implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("run method");
//		
//	}
//}
//public class Thread1 {
//	public static void main(String[] args) {
//		MyThread t1=new MyThread();
//		Thread t2=new Thread(t1);
//		t2.start();
//	}
//}




public class Thread1 {
	public static void main(String[] args) {
		Runnable r1=()->{
			System.out.println("run method...");
		};
		Thread t1=new Thread(r1);
		t1.start();
	}
}


