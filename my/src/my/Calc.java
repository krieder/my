package my;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Calc {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a1,a2;
		String a3;
		System.out.println("������ �����");
		a1 = sc.nextDouble();
		System.out.println("������� ������ ���������� - *,/,+,-;");
		a3 = sc.next();
		System.out.println("������� ������ �����");
		a2 = sc.nextDouble();
		double res = 0;
		switch (a3){
		case "+": res =a1 + a2;
		break;
		case "-": res =a1 - a2;
		break;
		case "/": res =a1 / a2;
		break;
		case "*": res =a1 * a2;
		break;
		}
		System.out.println(res);
		double res2 = res/0.3;
		double res3 = res%0.3;
		int res5 = (int) res2;
		int res6 = res5%10;
		String res7 = Integer.toString(res6);
		double res4 = res3/0.3; 
		String n1 ="##0.0";
		DecimalFormat DF1 = new DecimalFormat(n1);
		System.out.println(res5 +" "+ cus1(res7) + cus(DF1.format(res4)));
		sc.next();
	}
	private static String cus1 (String W){
		switch(W){
		case "1": W ="������� ���� ��� ������ �����";
		break;
		case "2": W ="������� ���� ��� ������ �����";
		break;
		case "3": W ="������� ���� ��� ������ �����";
		break;
		case "4": W ="������� ���� ��� ������ �����";
		break;
		case "6": W ="�������� ���� ��� ������ �����";
		break;
		case "7": W ="�������� ���� ��� ������ �����";
		break;
		case "8": W ="�������� ���� ��� ������ �����";
		break;
		case "11": W ="�������� ���� ��� ������ �����";
		break;
		case "12": W ="�������� ���� ��� ������ �����";
		break;
		case "13": W ="�������� ���� ��� ������ �����";
		break;
		case "14": W ="�������� ���� ��� ������ �����";
		break;
		case "15": W ="�������� ���� ��� ������ �����";
		break;
		case "16": W ="�������� ���� ��� ������ �����";
		break;
		case "17": W ="�������� ���� ��� ������ �����";
		break;
		case "18": W ="�������� ���� ��� ������ �����";
		break;
		case "19": W ="�������� ���� ��� ������ �����";
		break;
		case "9": W ="�������� ���� ��� ������ �����";
		break;
		case "0": W ="�������� ���� ��� ������ �����";
		break;
		}
		return W;
	}
	private static String cus (String q){
		switch (q){
				case "0,1": q =", � ��� ��������";
				break;
				case "0,2": q =", � ��� ������";
				break;
				case "0,3": q =", � ��� �� ������!!!";
				break;
				case "0,4": q =", � ��� �� �������!";
				break;
				case "0,5": q =", � ��� ���������";
				break;
				case "0,6": q =", � ��� ��������� � �������� -)";
				break;
				case "0,7": q =", � ��� ��������� � ������";
				break;
				case "0,8": q =", � ��� ��������� � �� ������!";
				break;
				case "0,0": q =" � ���";
				break;
				case "0,9": q =" ���� ������";
				break;
			
				}
		return q;
	}
}		


	

