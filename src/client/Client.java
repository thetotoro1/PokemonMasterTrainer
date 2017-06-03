package client;
	
import java.io.IOException;
import java.util.ArrayList;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import pokeObjects.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Polygon;


public class Client extends Application implements GameConstants{
	
	private int PLAYERCOUNT=0;
	private BoardController controller;
	
	@Override
	public void start(Stage primaryStage) {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Board.fxml"));
	    Parent root = new AnchorPane();
	    
		try {
			root = (Parent)fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    controller = fxmlLoader.<BoardController>getController();

	    Scene scene = new Scene(root);
	    primaryStage.setTitle("Pokemon Master Trainer");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    //test receiving item from server
	    //controller.receiveItemCard(POTION);
	    
	    //test receiving pokemon location from server
	    controller.addPokemon(4, 3);
	    
	    //test removing pokemon location from server
	    controller.removePokemon(3);

	    //TO-DO Connect to the server
	    //connectToServer();
	    
		
		
		
		
//		
//		try {
//			
//			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Board.fxml"));
//			AnchorPane root = fxmlLoader.load();
//			Scene scene = new Scene(root);
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
		
//
//			try {
//				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Board.fxml"));
//				AnchorPane root = fxmlLoader.load();
//				Scene scene = new Scene(root);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//

			
			

//
//			
//	        Player player1 = new Player(1,157,649);
//	        root.getChildren().add(player1);
//	        
//	        //to test calling methods from boardcontroller
////	        boardController.sayHi();
////	        System.out.println( boardController.getSpotX(1));
////	        System.out.println( boardController.getSpotX(2));
////	        System.out.println( boardController.getSpotX(3));
//
//			
//			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			root.setOnMouseClicked(new EventHandler<MouseEvent>(){
//				@Override
//				public void handle(MouseEvent event){
//					event.consume();
//					String areaClicked = event.getTarget().toString();
//					String[] objectClicked = areaClicked.split("\\s|,|\\[|\\]|=");
//					System.out.println("Mouse clicked detected: " + objectClicked[0] + " " + objectClicked[2]);
//					
//					
//					if(objectClicked[2].charAt(0)=='s'&&objectClicked[0].charAt(0)=='C'){
//						int spotIdNumber = Integer.parseInt(objectClicked[2].replaceAll("[^0-9]", ""));
//						System.out.println("Spot Clicked");
//						player1.setX(boardController.getSpotX(spotIdNumber));
//						player1.setY(boardController.getSpotY(spotIdNumber));
//					}
//					
//					if(objectClicked[2].charAt(0)=='s'&&objectClicked[0].charAt(0)=='R'){
//						int spotIdNumber = Integer.parseInt(objectClicked[2].replaceAll("[^0-9]", ""));
//						System.out.println("Spot Clicked");
//						player1.setX(boardController.getCitySpotX(spotIdNumber));
//						player1.setY(boardController.getCitySpotY(spotIdNumber));
//					}
//					
//					
//					
//					//System.out.println(boardController.spots[1].getAction());
//
//					
//					//player1.setX(boardController.spots[1].getCircle().getCenterX());
//					//player1.setY(boardController.spots[1].getCircle().getCenterY());
//					
//					
//				}
//			});
//		
//			
//			
//			
//			
//			
//			
//			
//			primaryStage.show();
//			
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
