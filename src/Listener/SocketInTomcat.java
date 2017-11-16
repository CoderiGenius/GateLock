package Listener;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import ConnectionUtil.ConnectThread;
import ConnectionUtil.DetectThread;
import Socket.StartSocket;

/**
 * Application Lifecycle Listener implementation class SocketInTomcat
 *
 */
public class SocketInTomcat implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public SocketInTomcat() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	//Socket.StartSocket.StratListening();
		DetectThread detectSocket = new DetectThread();
		ConnectThread connectSocket = new ConnectThread();
		detectSocket.start();
		connectSocket.run();
	
		
		
    }
	
}
