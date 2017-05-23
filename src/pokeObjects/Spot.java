package pokeObjects;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import pokechip.PokeChip;

public class Spot implements SpotConstants{

	private int action;
	private Circle spotCircle;
	private Circle pokeCircle;
	private Rectangle rectangle;
	private int color;
	public PokeChip pokemon;
	private Boolean spotOpen = false;
	
//	public Spot(int action, Circle spotCircle){
//		this.action = action;
//		this.spotCircle = spotCircle;
//		this.pokeCircle = null;
//		this.rectangle = null;
//		this.color = -1;
//	}

	public Boolean getSpotOpen() {
		return spotOpen;
	}

	public void setSpotOpen(Boolean spotOpen) {
		this.spotOpen = spotOpen;
	}

	public Spot(int action, Rectangle rectangle) {
		this.action = action;
		this.rectangle = rectangle;	
		this.spotCircle = null;
		this.pokeCircle = null;
		this.color = -1;
	}

	public Spot(int action, Circle spotCircle, int color) {
		this.action = action;
		this.spotCircle = spotCircle;
		this.color = color;
	}

	public Spot(int action, Circle spotCircle, Circle pokeCircle, int color) {
		this.action = action;
		this.spotCircle = spotCircle;
		this.pokeCircle = pokeCircle;
		this.color = color;	
	}

	public int getAction() {
		return action;
	}

	public Circle getSpotCircle() {
		return spotCircle;
	}

	public Circle getPokeCircle() {
		return pokeCircle;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public int getColor() {
		return color;
	}

	public void highlight() {
		this.spotOpen = true;
		if(this.action==pokecenter||this.action==none||this.action==citySpot||this.action==finalSpot){
			this.rectangle.setStroke(Color.GOLD);
			this.rectangle.setStrokeWidth(5);
		}
		else{
			this.spotCircle.setStroke(Color.GOLD);
			this.spotCircle.setStrokeWidth(5);
		}
	}



	public void highlightOff() {
		this.spotOpen = false;
		if(this.action==pokecenter||this.action==none||this.action==citySpot||this.action==finalSpot){
			this.rectangle.setStroke(Color.GOLD);
			this.rectangle.setStrokeWidth(0);
		}
		else{
			this.spotCircle.setStroke(Color.GOLD);
			
			this.spotCircle.setStrokeWidth(0);
		}
	}

	public PokeChip getPokemon() {
		return pokemon;
	}

	public void setPokemon(PokeChip pokemon) {
		this.pokemon = pokemon;
	}

	public void removePokemon() {
		this.pokemon = null;		
	}
	
	
	
}
