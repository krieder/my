package mausCalc;
import javax.swing.JFrame;
//import java.awt.*;
public class Start {
	public static void main(String[] args) {
		Calc C = new  Calc("Ўл€па");{
			C.setBounds(200,300,300,250);
		       C.setVisible(true);
		       C.setResizable(false);
		       C.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		       C.setLocationRelativeTo(null);
		}
	}
}
