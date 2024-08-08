package pack;

public class StartRun extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++)             //job of thread
        {
			System.out.println("start metod override to run method "+i);
        }
	}

	public static void main(String[] args) {
		System.out.println("main metod 1");
		StartRun t= new StartRun();
		t.start();
		t.start();
		//t.run();
		System.out.println("main metod 2");
		for(int i=0;i<30;i++)   {          
        
            System.out.println("main thread "+i);    //executed by main thread
        }
	}
}


//OutPut:1
//main metod 1
//main metod 2
//start metod override to run method 0
//start metod override to run method 1
//main thread 0
//start metod override to run method 2
//main thread 1
//start metod override to run method 3
//start metod override to run method 4
//main thread 2
//start metod override to run method 5
//main thread 3
//start metod override to run method 6
//main thread 4
//start metod override to run method 7
//main thread 5
//start metod override to run method 8
//main thread 6
//start metod override to run method 9
//main thread 7
//main thread 8
//main thread 9
//main thread 10
//main thread 11
//main thread 12
//main thread 13
//main thread 14
//main thread 15
//main thread 16
//main thread 17
//main thread 18
//main thread 19
//main thread 20
//main thread 21
//main thread 22
//main thread 23
//main thread 24
//main thread 25
//main thread 26
//main thread 27
//main thread 28
//main thread 29
//
//
//OutPut:2
//main metod 1
//main metod 2
//start metod override to run method 0
//main thread 0
//start metod override to run method 1
//main thread 1
//start metod override to run method 2
//start metod override to run method 3
//main thread 2
//start metod override to run method 4
//main thread 3
//main thread 4
//start metod override to run method 5
//main thread 5
//main thread 6
//start metod override to run method 6
//start metod override to run method 7
//start metod override to run method 8
//main thread 7
//start metod override to run method 9
//main thread 8
//main thread 9
//main thread 10
//main thread 11
//main thread 12
//main thread 13
//main thread 14
//main thread 15
//main thread 16
//main thread 17
//main thread 18
//main thread 19
//main thread 20
//main thread 21
//main thread 22
//main thread 23
//main thread 24
//main thread 25
//main thread 26
//main thread 27
//main thread 28
//main thread 29
