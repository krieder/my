package tutorial13;

public class urik13 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new dop("1"));
		Thread t2 = new Thread(new dop("2"));
		Thread t3 = new Thread(new dop("3"));
		t1.start();
		t2.start();
		t3.start();
	}

}
