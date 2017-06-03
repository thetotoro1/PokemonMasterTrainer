package pokeObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import client.GameConstants;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class ItemCard extends Pane implements GameConstants{
	

	

	final int width = 80;
	final int height = 230;
	final int spacing = 110;
	public int cardType;
	public Pane cardPane;
	public Boolean isUp = false;
	
	public ItemCard(int cardType) {
		//width / height of pane
		this.setPrefWidth(width);
		this.setPrefHeight(height);
		this.cardType = cardType;
		cardPane = new Pane();
		
		//background card
		Rectangle background = new Rectangle(80, 120);
		background.setFill(Color.WHITE);
		background.setStroke(Color.BLACK);
		background.setStrokeWidth(2);
		background.setArcWidth(15);
		background.setArcHeight(15);
		cardPane.getChildren().add(background);
		
		//for card image
		int imageSize = 75;
		int imageSpacing = (width-imageSize)/2;
		FileInputStream input;
		Image image;
		ImageView imageView = new ImageView();
		imageView.setLayoutX(imageSpacing);
		imageView.setLayoutY(45);
		
		//card name label
		Label label = new Label();
		label.setPrefWidth(80);
		label.setAlignment(Pos.CENTER);
		label.setTextAlignment(TextAlignment.CENTER);
		label.setLayoutY(5);
		
		//label for attacks
		Label attackLabel;
		
		try{
			switch (cardType) {
			case GREATBALL:
				input = new FileInputStream("resources/Great Ball.png");
				image = new Image(input,imageSize,imageSize,false,true);
				imageView.setImage(image);
				
				label.setText("Great Ball");
				break;
			case ULTRABALL:
				input = new FileInputStream("resources/Ultra Ball.png");
				image = new Image(input,imageSize,imageSize,false,true);
				imageView.setImage(image);
				
				label.setText("Ultra Ball");
				break;
			case MASTERBALL:
				input = new FileInputStream("resources/Master Ball.png");
				image = new Image(input,imageSize,imageSize,false,true);
				imageView.setImage(image);
				
				label.setText("Master Ball");
				break;
			case ATTACK1:
				attackLabel = new Label("+1");
				attackLabel.setPrefWidth(width);
				attackLabel.setAlignment(Pos.CENTER);
				attackLabel.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
				attackLabel.setLayoutY(45);
				cardPane.getChildren().add(attackLabel);
				
				label.setText("Attack\nBonus");

				break;
			case ATTACK2:
				attackLabel = new Label("+2");
				attackLabel.setPrefWidth(width);
				attackLabel.setAlignment(Pos.CENTER);
				attackLabel.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
				attackLabel.setLayoutY(45);
				cardPane.getChildren().add(attackLabel);
				
				label.setText("Attack\nBonus");

				
				break;
			case ATTACK3:
				attackLabel = new Label("+3");
				attackLabel.setPrefWidth(width);
				attackLabel.setAlignment(Pos.CENTER);
				attackLabel.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
				attackLabel.setLayoutY(45);
				cardPane.getChildren().add(attackLabel);
				
				label.setText("Attack\nBonus");

				
				break;
			case ATTACK4:
				attackLabel = new Label("+4");
				attackLabel.setPrefWidth(width);
				attackLabel.setAlignment(Pos.CENTER);
				attackLabel.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
				attackLabel.setLayoutY(45);
				cardPane.getChildren().add(attackLabel);
				
				label.setText("Attack\nBonus");

				
				break;
			case ATTACK5:
				attackLabel = new Label("+5");
				attackLabel.setPrefWidth(width);
				attackLabel.setAlignment(Pos.CENTER);
				attackLabel.setFont(Font.font("Helvetica", FontWeight.BOLD, 50));
				attackLabel.setLayoutY(45);
				cardPane.getChildren().add(attackLabel);
				
				label.setText("Attack\nBonus");

				break;
			case TIMEMACHINE:
				input = new FileInputStream("resources/Item/Time Machine.png");
				image = new Image(input,imageSize-10,imageSize-10,false,true);
				imageView.setImage(image);
				imageView.setLayoutX(7.5);
				
				label.setText("Time\nMachine");
				break;
			case FLY:
				input = new FileInputStream("resources/Item/Fly.png");
				image = new Image(input,imageSize,imageSize-10,false,true);
				imageView.setImage(image);
				//imageView.setLayoutX(7.5);
				
				label.setText("Fly");				
				break;
			case POTION:
				input = new FileInputStream("resources/Item/Revive.png");
				image = new Image(input,imageSize-10,imageSize-10,true,true);
				
				imageView.setImage(image);
				imageView.setLayoutX(20);
				
				label.setText("Revive");
				break;
			case POKEDOLL:
				input = new FileInputStream("resources/Item/Pokedoll.png");
				image = new Image(input,60,60,true,true);
				
				imageView.setImage(image);
				imageView.setLayoutX(10);
				
				label.setText("Pok"+pokemonE+"doll");
				break;
	
			default:
				break;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cardPane.getChildren().addAll(imageView,label);
		
		
		cardPane.setLayoutY(spacing);
		this.getChildren().add(cardPane);
		
		//setting card shifting
		cardPane.setOnMouseEntered(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent t) {
				cardPane.setLayoutY(0);
				isUp = true;
			}		
		});
		
		this.setOnMouseExited(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent t) {
				cardPane.setLayoutY(spacing);
				isUp = false;
			}	
		});
		
		
		
	}
	
}
