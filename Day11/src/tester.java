import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class tester {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		String msg = "";
		Scanner scan = new Scanner(System.in);
		Socket socket = new Socket("192.168.200.114", 4444);
		while(!(msg.equals("X"))){
		try{
		DataOutputStream dStream = new DataOutputStream(socket.getOutputStream());
		msg = scan.nextLine();
		dStream.writeUTF("Binay Says: "+ msg);
		DataInputStream stream = new DataInputStream(socket.getInputStream());
		msg = stream.readUTF();
		System.out.println("Faisal Says: "+ msg);
		}
		catch(IOException ie)
		{
		ie.printStackTrace();
		}
		}
		// "192.168.200.72"

	}

}
