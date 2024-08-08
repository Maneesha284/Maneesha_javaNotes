package pack;

public class ThreadName extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++)             //job of thread
        {
		//	Thread.currentThread().setName("Mani");
			System.out.println(Thread.currentThread().getName()+" "+i);
        }
	}

	public static void main(String[] args) {
		System.out.println("main metod 1");
		ThreadName t= new ThreadName();
		//Thread.currentThread().setName("Maneesha");
		t.start();
		
		System.out.println("main metod 2");
		for(int i=0;i<10;i++)   {          
        
            System.out.println(Thread.currentThread().getName()+" "+i);    //executed by main thread
        }
	}
}
