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
	System.out.println("������� ��� ���?");
	int q =(int)Double.parseDouble(SC.next());
	System.out.println("��� ��� �����?");
	String q1=SC.next();
	System.out.println("��� �� ������?");
	String q2 = SC.next();
	x.format("��� - ����������(��) %s. \n������� - �������������� %d ���. \n����� - ����������� %s.", q1, q, q2);
	x.close();
}catch(Exception e){JOptionPane.showMessageDialog(null, "���� �� ���!!! \n������� �� �����");};
	}

}
