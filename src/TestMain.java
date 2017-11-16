import java.io.IOException;

public class TestMain {
public static void main(String[] args) throws Exception{
	
	//启动SocketClient
	
	ConnectThread connectSocket = new ConnectThread();
	System.out.println("Starting server...running in background");
	//StartSocket.StratListening();
	connectSocket.run();
	
	//启动SocketServer
	/*System.out.println("Starting client...");
	try {
		SocketClient.StartClient();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	

}
}
