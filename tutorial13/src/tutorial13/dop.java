package tutorial13;

import java.util.*;

class  dop implements Runnable{
	int t;
	String N;
	Random r = new Random();
	public dop(String N){
		this.N = N;
		t = r.nextInt(999);

		
	}
	public void run() {
		System.out.printf("Поток %s, спит %d\n", N, t);
		try{Thread.sleep(t);
		}catch(Exception e){}
		System.out.printf("Поток %s, проснулся и закончился\n", N);

}
}
