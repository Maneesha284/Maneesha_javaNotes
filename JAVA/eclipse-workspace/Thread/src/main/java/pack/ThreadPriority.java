package pack;

public class ThreadPriority extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) // job of thread
		{
			// Thread.currentThread().setName("Mani");
			int maxPriority = Thread.currentThread().MAX_PRIORITY;
		Thread.currentThread().setPriority(maxPriority);
//			Thread.currentThread().setPriority(2);
			System.out.println(Thread.currentThread().getName()+"    "+Thread.currentThread().getPriority() + " " + i);
		}
	}

	public static void main(String[] args) {

		ThreadPriority t = new ThreadPriority();
		// Thread.currentThread().setName("Maneesha");
		t.start();
		int minPriority = Thread.currentThread().MIN_PRIORITY;
		Thread.currentThread().setPriority(minPriority);
	//		Thread.currentThread().setPriority(9);
		for (int i = 0; i < 10; i++) {

			System.out.println(Thread.currentThread().getName()+"    "+Thread.currentThread().getPriority() + " " + i); // executed by main thread
		}
	}
}
