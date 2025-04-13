import java.net.*;
import java.io.*;


public class client {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 4999);

		// client to server
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("is it working?");
		pr.flush();

		// server to client
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

		String str = bf.readLine();
		System.out.println("server : " + str);

	}
}