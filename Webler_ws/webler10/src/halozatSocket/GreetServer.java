package halozatSocket;


import java.io.*;
import java.net.*;


public class GreetServer {
	
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	
	public void start(int port) {

		try {
			serverSocket = new ServerSocket(port);
			clientSocket = serverSocket.accept();
			out = new PrintWriter(clientSocket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			String greeting = in.readLine();
			if (greeting.equals("hello server")) {
				out.println("Hello, client");
			} else {
				out.println("unrecognised greeting");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void stop() {
		try {
			in.close();
			out.close();
			clientSocket.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		GreetServer serverObj = new GreetServer();

		serverObj.start(16666);

		System.out.println("Fut a szerver, ezen a porton: 16666");

	}

}
