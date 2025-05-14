package k04;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class K0401Client {

	public static void main(String[] args) {
		try(Socket sock=new Socket("localhost",50001);
				DataOutputStream os=new DataOutputStream(sock.getOutputStream());
				DataInputStream is=new DataInputStream(sock.getInputStream());){
					
					System.out.print("学籍番号を入力してください--＞");
					Scanner sc=new Scanner(System.in);
					String no=sc.next();
					os.writeUTF(no);
					System.out.print("名前を入力してください-->");
					String name=sc.next();
					os.writeUTF(name);
					String data=is.readUTF();
					System.out.println(data);
		}catch(UnknownHostException ex) {
			System.err.println(ex);
		}catch(Exception ex) {
			System.err.println(ex);
		}

	}

}
