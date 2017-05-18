package server;
	
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketImpl;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Server extends Application {
	private static final int PORT = 8003;
	ServerController controller;
	ServerSocket serverSocket;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Server.fxml"));
			AnchorPane root = fxmlLoader.load();

			controller = (ServerController) fxmlLoader.getController();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
			
		new Thread( () -> {
		      try {
		        // Create a server socket
		        serverSocket = new ServerSocket(PORT);
		  
		        // Listen for a connection request
		        Socket socket = serverSocket.accept();
		  
		        // Create data input and output streams
		        DataInputStream inputFromClient = new DataInputStream(
		          socket.getInputStream());
		        DataOutputStream outputToClient = new DataOutputStream(
		          socket.getOutputStream());
		        
		        
		  
		        while (true) {
		          // Receive radius from the client
		          double number = inputFromClient.readDouble();
		          
		          controller.appendText(number);
		        }
		      }
		      catch(IOException ex) {
				System.out.println("Error in server thread");

		        ex.printStackTrace();
		      }
		    }).start();
		
	}
	
	@Override
	public void stop(){
	    System.out.println("Stop ran");
	    try {
			serverSocket.close();
		} catch (IOException e) {
			System.out.println("Error in server stop method");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
