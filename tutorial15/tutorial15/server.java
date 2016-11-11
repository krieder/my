package tutorial15;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class server implements Runnable{
	static private ServerSocket server;
	static private Socket  con;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	@Override
	public void run() {
		try {
			server = new ServerSocket(4857, 10);
			while (true) {
				con =server.accept();
				output = new ObjectOutputStream(con.getOutputStream());
				input = new ObjectInputStream(con.getInputStream());
				output.writeObject("Все будет заебись, "+(String)input.readObject());
			}
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		} catch (HeadlessException e ) {
		}
	}

}
