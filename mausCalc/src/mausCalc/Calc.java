package mausCalc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public  class Calc extends JFrame {
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bBack, bSum, bDiv, bMul, bStart, bMin;
	JPanel panel;
	JTextArea disp;
	JTextArea Sir;
	String a1,a2;
	double firstValue = 0;
	double secondValue, res;
	String operation;
	Sluw J = new Sluw();
	public Calc(String S) {
		super(S);
		setLayout(new BorderLayout());
	        disp= new JTextArea();
	        disp.setFont(new Font("выасв", Font.PLAIN, 20));
	        Sir = new JTextArea(3,0);
	        Sir.setFont(new Font("выасв", Font.PLAIN, 12));
	        panel = new JPanel();
	        b0 = new JButton("0");
	        b1 = new JButton("1");
	        b2 = new JButton("2");
	        b3 = new JButton("3");
	        b4 = new JButton("4");
	        b5 = new JButton("5");
	        b6 = new JButton("6");
	        b7 = new JButton("7");
	        b8 = new JButton("8");
	        b9 = new JButton("9");
	        bBack = new JButton("Del");
	        bSum = new JButton("+");
	        bDiv = new JButton("/");
	        bMin = new JButton("-");
	        bMul = new JButton("*");
	        bStart = new JButton("=");
	            add(disp,BorderLayout.NORTH);
	            add(panel,BorderLayout.CENTER);
	           // add(bStart,BorderLayout.SOUTH);
	            add(Sir,BorderLayout.SOUTH);
	            panel.setLayout(new GridLayout(5, 3)); 
	        panel.add(b1);
	        panel.add(b2);
	        panel.add(b3);
	        panel.add(bSum);
	        panel.add(b4);
	        panel.add(b5);
	        panel.add(b6);
	        panel.add(bMin);
	        panel.add(b7);
	        panel.add(b8);
	        panel.add(b9);
	        panel.add(bMul);
	        panel.add(bBack);
	        panel.add(b0);
	        panel.add(bStart);
	        panel.add(bDiv);
	        b1.addActionListener(J);
	        b2.addActionListener(J);
	        b3.addActionListener(J);
	        b4.addActionListener(J);
	        b5.addActionListener(J);
	        b6.addActionListener(J);
	        b7.addActionListener(J);
	        b8.addActionListener(J);
	        b9.addActionListener(J);
	        b0.addActionListener(J);
	        bBack.addActionListener(J);
	        bMin.addActionListener(J);
	        bSum.addActionListener(J);
	        bDiv.addActionListener(J);
	        bStart.addActionListener(J);
	        bMul.addActionListener(J);
	}
	
	 public class Sluw implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
	 try{
		 	if(e.getSource()==b1){
		 		disp.setText(disp.getText()+"1");
		 	}
		 	if(e.getSource()==b2){
		 		disp.setText(disp.getText()+"2");	 
		 	}
		 	if(e.getSource()==b3){
		 		disp.setText(disp.getText()+"3");	 
		 	}
		 	if(e.getSource()==b4){
		 		disp.setText(disp.getText()+"4");	 
		 	}
		 	if(e.getSource()==b5){
		 		disp.setText(disp.getText()+"5");
		 	}
		 	if(e.getSource()==b6){
		 		disp.setText(disp.getText()+"6");	 
		 	}
		 	if(e.getSource()==b7){
		 		disp.setText(disp.getText()+"7");	 
		 	}
		 	if(e.getSource()==b8){
		 		disp.setText(disp.getText()+"8");	 
		 	}
		 	if(e.getSource()==b9){
		 		disp.setText(disp.getText()+"9");
		 	}
		 	if(e.getSource()==b0){
		 		disp.setText(disp.getText()+"0");	 
		 	}
		 	if(e.getSource()==bBack){
		 		disp.setText(null);
		 	}
		 	if(e.getSource()==bSum){
		 		firstValue = Integer.valueOf(disp.getText());
                disp.setText("");
                operation = "+";
		 	}
		 	if(e.getSource()==bMin){
		 		firstValue = Integer.valueOf(disp.getText());
                disp.setText("");
                operation = "-";
		 	}
		 	if(e.getSource()==bDiv){
		 		firstValue = Integer.valueOf(disp.getText());
                disp.setText("");
                operation = "/";
		 	}
		 	if(e.getSource()==bMul){
		 		firstValue = Integer.valueOf(disp.getText());
                disp.setText("");
                operation = "*";
		 	}
		 	if(e.getSource()==bStart){
		 		int secondValue = Integer.valueOf(disp.getText());
		 			if("+".equals(operation)){
		 				res=firstValue+secondValue;
		 				double res2=res/0.3;
		 				disp.setText(""+res);
		 				Sir.setText(res2+"\n"+" Кусков сыра для бедненькой мыфки");

		 			}
                    if("-".equals(operation)){
                    	res=firstValue-secondValue;
                    	double res2 = res/0.3;
		 				disp.setText(""+res);
		 				Sir.setText(res2+"\n"+" Кусков сыра для бедненькой мыфки");
	                }
	                if("*".equals(operation)){
	                	res=firstValue*secondValue;
	                	double res2=res/0.3;
		 				disp.setText(""+res);
		 				Sir.setText(res2+"\n"+" Кусков сыра для бедненькой мыфки");
	                }
	                if("/".equals(operation)){
	                	res=firstValue/secondValue;
	                	double res2=res/0.3;
		 				disp.setText(""+res);
		 				Sir.setText(res2+"\n"+" Кусков сыра для бедненькой мыфки");
		 				
 }}}catch(Exception ex){JOptionPane.showMessageDialog(null, "Введи нормальные числа, олень!");
		disp.setText(null);}  
		 }
	 }
 }

		 
