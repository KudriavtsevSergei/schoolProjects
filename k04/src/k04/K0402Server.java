package k04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class K0402Server {

	public static void main(String[] args) {
		System.out.println("接続待ちです。");
		String[]user= {"24JN0113","pass01"};
		try (ServerSocket ss = new ServerSocket(50002);
				Socket sock = ss.accept();
				DataOutputStream os = new DataOutputStream(sock.getOutputStream());
				DataInputStream is = new DataInputStream(sock.getInputStream());) {
			String login = is.readUTF();
			String pass = is.readUTF();
			if(login.equals(user[0])&&pass.equals(user[1])){
				System.out.println(login+"がログインしました");
				os.writeUTF("正しくログインできました");
			}else {
			os.writeUTF("ログインできませんでした");
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}
		System.out.println("通信終了です。");

	}

}
