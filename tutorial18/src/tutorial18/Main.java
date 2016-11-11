package tutorial18;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	private static ArrayList<proF> proF = new ArrayList<proF>();
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		proF = (ArrayList<proF>) dserD("proF");
		System.out.println(proF.size());
proF P =new proF();
P.setName(JOptionPane.showInputDialog(null, "Введите имя"));
P.setSurname(JOptionPane.showInputDialog(null, "Введите фамилию"));
proF.add(P);
for(proF p:proF){
	System.out.println(p.getName()+" "+p.getSurname());
}
System.out.println(proF.size());
serD("proF",proF);
	}

	private static Object dserD(String file_name) {
		Object retObject = null;
		try {
			FileInputStream fileIn = new FileInputStream(file_name + ".ser");
				ObjectInputStream In = new ObjectInputStream(fileIn);
				retObject = In.readObject();
				fileIn.close();
				In.close();
			}catch (ClassNotFoundException e) {
				System.out.println("Класс не найден!");
				System.exit(3);
			}catch (FileNotFoundException e) {
				System.out.println("Файл не найден");
				System.exit(1);
			}catch (IOException e) {
				System.out.println("Ошибка ввода/вывода");
				System.exit(2);
			}
		return retObject;
	}

	private static void serD(String file_name, Object obj) {
		try {
			FileOutputStream fileOut = new FileOutputStream(file_name + ".ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(obj);
				fileOut.close();
				out.close();
			}catch (FileNotFoundException e) {
				System.out.println("Файл не найден");
				System.exit(1);
			}catch (IOException e) {
				System.out.println("Ошибка ввода/вывода");
				System.exit(2);
			}
				
		}
	}


