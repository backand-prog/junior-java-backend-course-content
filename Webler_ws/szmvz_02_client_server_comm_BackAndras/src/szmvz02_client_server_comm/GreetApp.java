package szmvz02_client_server_comm;

public class GreetApp {

	public static void main(String[] args) {
		GreetApp greetAppObj = new GreetApp();
		greetAppObj.clientMessageSend();
	}
	
	public void clientMessageSend() {
		GreetClient clientObj = new GreetClient();
		clientObj.startConnection("127.0.0.1", 13333);
		String response = clientObj.sendMessage("hi server");
		System.out.println(response);
	}

}
