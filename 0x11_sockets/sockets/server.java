import java.net.*;
import java.io.*;

public class server {
	public static void main(String[] main) throws IOException {
		ServerSocket ss = new ServerSocket(4999);
		Socket s = ss.accept();

		System.out.println("client connected...");

		// client to server
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

		String str = bf.readLine();
		System.out.println("client said : " + str);

		// server to client
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("yes!!!");
		pr.flush();
	}
}