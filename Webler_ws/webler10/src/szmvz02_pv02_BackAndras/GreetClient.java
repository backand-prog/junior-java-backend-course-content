package szmvz02_pv02_BackAndras;


import java.io.*;
import java.net.*;

public class GreetClient {

	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	
	public void startConnection(String ip, int port) {
		try {
			clientSocket = new Socket(ip, port);
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String sendMessage(String msg) {
		out.println(msg);
		String response = "";
		try {
			response = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	public void stopConnection() {
		try {
			in.close();
			out.close();
			clientSocket.close();
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
	}
	
	
	
}
