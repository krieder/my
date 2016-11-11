package pac;

import java.util.ArrayList;
import java.util.Random;

public class urok17 {
	private static ArrayList<mob> mob = new ArrayList<mob>();
	private static Random R=new Random();

	public static void main(String[] args) {
		for (int i = 0; i < 300; i++) {
			mob.add(new mob(R.nextInt(9999999), "Номер"));
		}
		for(mob m: mob){
			System.out.println(m.getNum()+" "+m.getName());
		}
	}

}
