package learning.youtube.bucky;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Apple("one"));
		Thread t2 = new Thread(new Apple("two"));
		Thread t3 = new Thread(new Apple("three"));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
