package halozatSocket;

public class GreetApp {

	public static void main(String[] args) {

		GreetApp greetAppObj = new GreetApp();
		greetAppObj.clientMessageSend();

	}

	public void clientMessageSend() {

		GreetClient clientObj = new GreetClient();

		clientObj.startConnection("127.0.0.1", 16666);
		String response = clientObj.sendMessage("hello server");
		System.out.println(response);

	}
	
}
