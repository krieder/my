package my;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Calc {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a1,a2;
		String a3;
		System.out.println("Ведите число");
		a1 = sc.nextDouble();
		System.out.println("Введите символ вычисления - *,/,+,-;");
		a3 = sc.next();
		System.out.println("Введите второе число");
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
		case "1": W ="Кусочек сыра для бедной мышки";
		break;
		case "2": W ="Кусочка сыра для бедной мышки";
		break;
		case "3": W ="Кусочка сыра для бедной мышки";
		break;
		case "4": W ="Кусочка сыра для бедной мышки";
		break;
		case "6": W ="Кусочков сыра для бедной мышки";
		break;
		case "7": W ="Кусочков сыра для бедной мышки";
		break;
		case "8": W ="Кусочков сыра для бедной мышки";
		break;
		case "11": W ="Кусочков сыра для бедной мышки";
		break;
		case "12": W ="Кусочков сыра для бедной мышки";
		break;
		case "13": W ="Кусочков сыра для бедной мышки";
		break;
		case "14": W ="Кусочков сыра для бедной мышки";
		break;
		case "15": W ="Кусочков сыра для бедной мышки";
		break;
		case "16": W ="Кусочков сыра для бедной мышки";
		break;
		case "17": W ="Кусочков сыра для бедной мышки";
		break;
		case "18": W ="Кусочков сыра для бедной мышки";
		break;
		case "19": W ="Кусочков сыра для бедной мышки";
		break;
		case "9": W ="Кусочков сыра для бедной мышки";
		break;
		case "0": W ="Кусочков сыра для бедной мышки";
		break;
		}
		return W;
	}
	private static String cus (String q){
		switch (q){
				case "0,1": q =", а ещё кропалик";
				break;
				case "0,2": q =", а ещё крошки";
				break;
				case "0,3": q =", а ещё на развод!!!";
				break;
				case "0,4": q =", а ещё на заначку!";
				break;
				case "0,5": q =", а ещё половинка";
				break;
				case "0,6": q =", а ещё половинка и кропалик -)";
				break;
				case "0,7": q =", а ещё половинка и крошки";
				break;
				case "0,8": q =", а ещё Половинка и На развод!";
				break;
				case "0,0": q =" и усе";
				break;
				case "0,9": q =" норм кароче";
				break;
			
				}
		return q;
	}
}		


	

