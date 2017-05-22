package pokeObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Player{

	private int playerNumber;
	private ArrayList <card> cards;
	public AnchorPane anchorPane = new AnchorPane();
	
	
	public Player(int playerNum) {
		
		this.playerNumber = playerNum;
		cards = new ArrayList<card>();

		FileInputStream input;
		ImageView imageView = new ImageView();
		if(this.playerNumber==1){
			try {
				input = new FileInputStream("resources/Ash.png");
				Image image = new Image(input,15,30,false,true);
				imageView = new ImageView(image);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Rectangle rectangle = new Rectangle(15, 34,Color.RED);

			StackPane stackPane = new StackPane(rectangle,imageView);
			anchorPane.getChildren().add(stackPane);
		}
		else{
			try {
				input = new FileInputStream("resources/Misty.png");
				Image image = new Image(input,15,30,false,true);
				imageView = new ImageView(image);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Rectangle rectangle = new Rectangle(15, 34,Color.AQUA);

			StackPane stackPane = new StackPane(rectangle,imageView);
			anchorPane.getChildren().add(stackPane);
		}
		
		
		
		
		
	}
	
	
}
