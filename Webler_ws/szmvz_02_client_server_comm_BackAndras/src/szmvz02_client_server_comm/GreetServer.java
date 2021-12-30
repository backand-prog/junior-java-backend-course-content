package szmvz02_client_server_comm;

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
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String greeting = in.readLine();
			if (greeting.equals("hi server")) {
				out.println("hi client");
			} else {
				out.println("unrecognised greeting");
			}
		} catch (IOException e) {
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
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		GreetServer serverObj = new GreetServer();
		serverObj.start(13333);
		System.out.println("Server running on port: 13333");
	}
}
