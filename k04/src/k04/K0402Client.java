package k04;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class K0402Client {

	public static void main(String[] args) {
		try(Socket sock=new Socket("localhost",50002);
				DataOutputStream os=new DataOutputStream(sock.getOutputStream());
				DataInputStream is=new DataInputStream(sock.getInputStream());){
					
					System.out.print("IDを入力してください--＞");
					Scanner sc=new Scanner(System.in);
					String login=sc.next();
					os.writeUTF(login);
					System.out.print("パスワルドを入力してください-->");
					String pass=sc.next();
					os.writeUTF(pass);
					String data=is.readUTF();
					System.out.println(data);
		}catch(UnknownHostException ex) {
			System.err.println(ex);
		}catch(Exception ex) {
			System.err.println(ex);
		}
	}

}
