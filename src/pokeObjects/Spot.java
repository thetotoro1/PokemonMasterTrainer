package pokeObjects;

import java.util.ArrayList;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Spot {

	private int action;
	private Circle spotCircle;
	private Circle pokeCircle;
	private Rectangle rectangle;
	private int color;
	
//	public Spot(int action, Circle spotCircle){
//		this.action = action;
//		this.spotCircle = spotCircle;
//		this.pokeCircle = null;
//		this.rectangle = null;
//		this.color = -1;
//	}

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


	
	
	
	
}
