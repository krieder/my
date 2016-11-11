package tutorial15;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class urok15 extends JFrame implements Runnable{
	static private Socket  con;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
public static void main(String[] args){
	new Thread(new urok15("Тест")).start();;
	new Thread(new server()).start();;
}
public urok15(String name) {
	super(name);
	setLayout(new FlowLayout());
	setSize(300, 300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setLocationRelativeTo(null);
	//setResizable(false);
	
	final JTextField t1 = new JTextField(10);
	final JButton b1 = new JButton("Send");
	final JLabel l1 =new JLabel("Введите имя");
	add(l1);
	add(t1);
	add(b1);
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent S) {
			if(S.getSource()==b1){
				sendData(t1.getText());
			}
		}
	});
	
}
public void run() {
		try {
			while (true) {
				con = new Socket(InetAddress.getByName("127.0.0.1"),4857);
				output = new ObjectOutputStream(con.getOutputStream());
				input = new ObjectInputStream(con.getInputStream());
				JOptionPane.showMessageDialog(null, (String)input.readObject());
			}
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		} catch (HeadlessException e ) {
		}
}
	private static void sendData(Object obj) {
		try {
			output.flush();
			output.writeObject(obj);
		} catch (IOException e) {}
	}
}
