package tutorial12;

import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class urok12 {
	static Formatter x;
	static Scanner SC;
	public static void main(String[] args) {
try{
	x = new Formatter("res//1.txt");
	SC = new Scanner(System.in);
	System.out.println("Сколько вам лет?");
	int q =(int)Double.parseDouble(SC.next());
	System.out.println("Как вас зовут?");
	String q1=SC.next();
	System.out.println("Где вы живете?");
	String q2 = SC.next();
	x.format("Имя - Доблестный(ая) %s. \nВозраст - Величественных %d лет. \nГород - легендарный %s.", q1, q, q2);
	x.close();
}catch(Exception e){JOptionPane.showMessageDialog(null, "Чето не так!!! \nПотыкай по новой");};
	}

}
