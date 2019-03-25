
public class TestThread extends Thread {
	
	public void run(){
		for (int i = 0 ; i < 3 ; i ++){
			System.out.println(Thread.currentThread().getName());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		TestThread t3 = new TestThread();
		t1.setName("this is t 1 ");
		t1.start();
		t2.setName("this is t 2 ");
		t2.start();
		t3.setName("this is t 3 ");
		t3.start();
		
	}

}
