
public class ThreadDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println("Hi Jins");
	}
	
	public static void main(String args[]) {
		ThreadDemo threadTask = new ThreadDemo();
		
		Thread thread1 = new Thread(threadTask);
		
		thread1.start();
	}

}
