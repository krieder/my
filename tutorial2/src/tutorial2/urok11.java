package tutorial2;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.File;
public class urok11 {
		static String[][] Y = new String[5][3];
		static Scanner SC;
		public static void main(String args[]){
			openFile();
			reeadfile();
			out();
		}
		private static void out() {
			for(int row=0;row<Y.length;row++){
				for (int col=0;col<Y[row].length;col++){
			System.out.print(Y[row][col]+"  ");
				}
		System.out.println();
		}
		}
		private static void reeadfile() {
			while(SC.hasNext()){
				for(int row=0;row<Y.length;row++){
					for (int col=0;col<Y[row].length;col++){
						Y[row][col] = SC.next();
					}
				}
			}
		}
		private static void openFile() {
			try{
			SC = new Scanner(new File("res//1.txt"));
			}
			catch(Exception e){JOptionPane.showMessageDialog(null,"Файл не найден!");
				}
		}
}
