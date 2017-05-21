package pokechip;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class PokeChip implements PokeChipConstants{

	public int color;
	public int dexNumber;
	public String name;
	public int attackStrength;
	public int powerPoints;
	private String url;
	private ImageView imageView;
	private Text chipName; 
	public AnchorPane anchorPane = new AnchorPane();
	private StackPane stackPane;
	
	public PokeChip(int color, int dexNumber, String name, int attackStrength, int powerPoints, int background) {
		//setRadius(30);
		//this.setHeight(200);
		//this.setWidth(200);
		this.color = color;
		this.dexNumber = dexNumber;
		this.name = name;
		this.attackStrength = attackStrength;
		this.powerPoints = powerPoints;
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
		 

		
		//create a textbox centered
		stackPane = new StackPane();
		Rectangle textBox = new Rectangle(80, 15, Color.WHITE);
		chipName = new Text("#"+this.dexNumber+" "+this.name);
		stackPane.setStyle("-fx-background-color: white;");
		chipName.setTextAlignment(TextAlignment.CENTER);		
		stackPane.getChildren().addAll(textBox, chipName);
		stackPane.setLayoutY(60);
		stackPane.setVisible(false);
		
		imageView.setOnMouseEntered(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent t) {
				stackPane.setVisible(true);				
			}
			
			
			
		});
		
		imageView.setOnMouseExited(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent t) {
				stackPane.setVisible(false);				
			}
			
			
			
		});
		
		//this.anchorPane.setStyle("-fx-background-color: #2C8EB1"); 
		this.anchorPane.getChildren().addAll(imageView,stackPane);
		
		//anchorPane.setClip(new Circle(40, 40, 50));
		
}
	
	
	
}
