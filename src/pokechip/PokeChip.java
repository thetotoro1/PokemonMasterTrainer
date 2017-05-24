package pokechip;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class PokeChip implements PokeChipConstants{

	public String color;
	public int dexNumber;
	public String name;
	public int attackStrength;
	public int powerPoints;
	private String url;
	private ImageView imageView;
	private Text chipName; 
	public AnchorPane anchorPane = new AnchorPane();
	private StackPane nameStack;
	private Text powerPointText;
	
	public PokeChip(int dexNumber) {
		this.dexNumber = dexNumber;
		this.name = "";
		
		//get image
		this.url = "http://assets.pokemon.com/assets/cms2/img/pokedex/full/";
		
		if(dexNumber>=100){
			this.url += "" + dexNumber;
		}
		else if(dexNumber>=10){
			this.url += "0" + dexNumber;

		}
		else{
			this.url += "00" + dexNumber;
		}
		this.url += ".png";
		
		Image image = new Image(url,80,80,false,true);
		

		imageView = new ImageView(image);
		
		//get info about pokemon
		try {
			String pokemonInformation = Files.readAllLines(Paths.get("pokemonList.txt")).get(dexNumber);
			String[] pokemonInfoArr = pokemonInformation.split("\\s+");
			this.name = pokemonInfoArr[0];
			this.powerPoints = Integer.parseInt(pokemonInfoArr[1]);
			this.attackStrength = Integer.parseInt(pokemonInfoArr[2]);
			this.color = pokemonInfoArr[3];
			System.out.println("PP: "+pokemonInfoArr[1]+" AP: "+pokemonInfoArr[2] +" Color "+pokemonInfoArr[3]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		//create a textbox centered for name
		nameStack = new StackPane();
		Rectangle textBox = new Rectangle(80, 15, Color.WHITE);
		chipName = new Text("#"+this.dexNumber+" "+this.name);
		//nameStack.setStyle("-fx-background-color: white;");
		chipName.setTextAlignment(TextAlignment.CENTER);		
		nameStack.getChildren().addAll(textBox, chipName);
		nameStack.setLayoutY(60);
		nameStack.setVisible(false);
		nameStack.setMouseTransparent(true);
		
		//Power point text
		powerPointText = new Text(""+this.powerPoints);
		powerPointText.setStyle("-fx-stroke-width: 2px;"
				+ "-fx-fill: darkgoldenrod;"
				+ "-fx-stroke: black;"
				+ "-fx-font: 40 arial;"
				+ "-fx-font-weight: bold");
		StackPane ppStack = new StackPane(powerPointText);
		ppStack.setMouseTransparent(true);
		ppStack.setLayoutX(50);
		ppStack.setLayoutY(20);
		ppStack.setVisible(false);
		
		Rectangle apTextBox = new Rectangle(80,15,Color.WHITE);
		Text attack = new Text("Attack Power "+this.attackStrength);
		attack.setTextAlignment(TextAlignment.CENTER);
		StackPane apStack = new StackPane(apTextBox,attack);
		apStack.setLayoutY(75);
		apStack.setMouseTransparent(true);
		apStack.setVisible(false);
		
		
		
		
		imageView.setOnMouseEntered(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent t) {
				nameStack.setVisible(true);	
				ppStack.setVisible(true);
				apStack.setVisible(true);
			}
			
			
			
		});
		
		imageView.setOnMouseExited(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent t) {
				nameStack.setVisible(false);	
				ppStack.setVisible(false);
				apStack.setVisible(false);
			}
			
			
			
		});
		
		//this.anchorPane.setStyle("-fx-background-color: #2C8EB1"); 
		this.anchorPane.getChildren().addAll(imageView,nameStack,ppStack,apStack);
		//this.anchorPane.getStylesheets().addAll(getClass().getResource("pokechip.css").toExternalForm());
		//anchorPane.setClip(new Circle(40, 40, 50));
		
}
	
	
	
}
