package k04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class K0401Server {

	public static void main(String[] args) {
		System.out.println("接続待ちです。");
		
		try(ServerSocket ss=new ServerSocket(50001);
				Socket sock=ss.accept();
				DataOutputStream os=new DataOutputStream(sock.getOutputStream());
				DataInputStream is=new DataInputStream(sock.getInputStream());){
					String no=is.readUTF();
					String name=is.readUTF();
					System.out.println("学籍番号："+no+"氏名："+name);
					os.writeUTF("入力ありがとうございました");
					
		}catch(Exception ex) {
			System.err.println(ex);
		}
		System.out.println("通信終了です。");

	}
}