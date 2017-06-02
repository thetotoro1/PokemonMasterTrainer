package pokeObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import client.GameConstants;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ItemCard extends Pane implements GameConstants{
	

	

	final int width = 80;
	final int height = 200;
	final int spacing = 80;
	Pane cardPane;
	
	public ItemCard(int cardType) {
		//width / height of pane
		this.setPrefWidth(width);
		this.setPrefHeight(height);

		cardPane = new Pane();
		
		//background card
		Rectangle background = new Rectangle(width, height - spacing);
		background.setFill(Color.WHITE);
		background.setStroke(Color.BLACK);
		background.setStrokeWidth(2);
		background.setArcWidth(15);
		background.setArcHeight(15);
		cardPane.getChildren().add(background);
		
		
		FileInputStream input;
		Image image;
		ImageView imageView = new ImageView();
		imageView.setLayoutY(30);
		
//			input = new FileInputStream("resources/Ash.png");
//			Image image = new Image(input,15,30,false,true);
//			imageView = new ImageView(image);
		
		try{
			switch (cardType) {
			case GREATBALL:
				input = new FileInputStream("resources/Great Ball.png");
				image = new Image(input,width,width,false,true);
				imageView.setImage(image);
				break;
			case ULTRABALL:
				
				break;
			case MASTERBALL:
				
				break;
			case ATTACK1:
				
				break;
			case ATTACK2:
				
				break;
			case ATTACK3:
				
				break;
			case ATTACK4:
				
				break;
			case ATTACK5:
				
				break;
			case TIMEMACHINE:
				
				break;
			case FLY:
				
				break;
			case POTION:
				
				break;
			case POKEDOLL:
				
				break;
	
			default:
				break;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cardPane.getChildren().add(imageView);
		
		
		cardPane.setLayoutY(spacing);
		this.getChildren().add(cardPane);
		
		//setting card shifting
		cardPane.setOnMouseEntered(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent t) {
				cardPane.setLayoutY(0);
			}		
		});
		
		this.setOnMouseExited(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent t) {
				cardPane.setLayoutY(spacing);
			}	
		});
		
		
		
	}
	
}
