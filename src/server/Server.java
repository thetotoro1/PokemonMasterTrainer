package server;
	
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketImpl;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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
	
	int[] starterPokemon = new int[6]; 
	int[] pinkPokemon = new int[35];
	int[] greenPokemon = new int[41];
	int[] bluePokemon = new int[38];
	int[] redPokemon = new int[26];
	int[] legendary = new int[5]; 
	
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
			
		
		//setup card stacks
		int[] itemCards = {0,0,0,0,0,0,1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,9,9,10,10,10,10,10,11,11,11,11};
		int itemDeckIndex = 0;
		int[] eventCards = {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,2,2,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,6,6,6,6,6,7,7,7};
		int eventDeckIndex = 0;
		//shuffle decks
		shuffleArray(itemCards);
		shuffleArray(eventCards);
		
		//set up pokemon checklist
		
		int spIndex = 0, pIndex = 0, gIndex = 0, bIndex = 0, rIndex = 0, lIndex = 0;
		
		for (int i = 1; i <= 151; i++) {
			String pokemonInformation = "";
			try {
				pokemonInformation = Files.readAllLines(Paths.get("pokemonList.txt")).get(i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String[] pokemonInfoArr = pokemonInformation.split("\\s+");
			//System.out.println(""+pokemonInfoArr[3]);
			switch (pokemonInfoArr[3]) {
			case "Starter":
				starterPokemon[spIndex++] = i;
				break;
			case "Pink":
				pinkPokemon[pIndex++] = i;
				break;
			case "Green":
				greenPokemon[gIndex++] = i;
				break;
			case "Blue":
				bluePokemon[bIndex++] = i;
				break;
			case "Red":
				redPokemon[rIndex++] = i;
				break;
			case "Legendary":
				legendary[lIndex++] =i;		
				break;
	
			default:
				break;
			}
			
		}
		
		new Thread( () -> {
		      try {
		        // Create a server socket
		        serverSocket = new ServerSocket(PORT);
		  
		        // Listen for a connection request
		        Socket socket = serverSocket.accept();
		  
		        // Create data input and output streams
		        DataInputStream fromClient = new DataInputStream(
		          socket.getInputStream());
		        DataOutputStream toClient = new DataOutputStream(
		          socket.getOutputStream());
		        
		        
		  
		        while (true) {
		          // Receive radius from the client
		          double number = fromClient.readDouble();
		          
		          controller.appendText(number);
		          
		          toClient.writeInt((int)number);
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
	
	static void shuffleArray(int[] ar)
	  {
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      int a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	  }
	
}
