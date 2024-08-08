package com.java8;

public class Thread1 {

	public static void main(String[] args) {
		Runnable r=()->{
			System.out.println("run method");
		};
//		Thread t =new Thread(r);
//		t.start();
		
		new Thread(r).start();
	}

}
