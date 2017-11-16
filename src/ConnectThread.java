import java.io.IOException;

public class ConnectThread extends Thread{
	public void run(){
		int count = 1;
		while(true){
			try {
				//心跳包每40秒运行一次
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		try {
			System.out.println("心跳包检测第"+count+"次");
			StartSocket.StratListening();
			count++;
			//SocketClient.StartClient();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	}

}
