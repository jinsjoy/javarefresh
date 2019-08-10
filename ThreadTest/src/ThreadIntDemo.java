
public class ThreadIntDemo {
	
	public static void main(String args[]) {
	
	ThreadTask tt = new ThreadTask();
	Thread t1 = new Thread(tt);
	t1.start();
	}
}


class ThreadTask implements Runnable{	
	public void run() {
		System.out.println("Hi Jins");
	}
}
