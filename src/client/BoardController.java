package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import pokeObjects.Player;
import pokeObjects.Spot;
import pokeObjects.SpotConstants;
import pokechip.PokeChip;
import pokechip.PokeChipConstants;

public class BoardController implements Initializable, PokeChipConstants, SpotConstants{

	
	
	@FXML
	private Rectangle spot0;
	
	@FXML
	private Circle spot1;
	
	@FXML
	private Circle spot2;
	
	@FXML
	private Circle spot3;
	
	@FXML
	private Rectangle spot4;
	
	@FXML
	private Circle spot5;
	
	@FXML
	private Circle spot6;
	
	@FXML
	private Circle spot7;
	
	@FXML
	private Circle spot8;
	
	@FXML
	private Circle spot9;
	
	@FXML
	private Circle spot10;
	
	@FXML
	private Circle spot11;
	
	@FXML
	private Rectangle spot12;
	
	@FXML
	private Circle spot13;
	
	@FXML
	private Circle spot14;
	
	@FXML
	private Circle spot15;
	
	@FXML
	private Circle spot16;
	
	@FXML
	private Circle spot17;
	
	@FXML
	private Circle spot18;
	
	@FXML
	private Circle spot19;
	
	@FXML
	private Circle spot20;
	
	@FXML
	private Circle spot21;
	
	@FXML
	private Circle spot22;

	@FXML
	private Rectangle spot23;
	
	@FXML
	private Circle spot24;
	
	@FXML
	private Circle spot25;
	
	@FXML
	private Circle spot26;
	
	@FXML
	private Circle spot27;
	
	@FXML
	private Circle spot28;
	
	@FXML
	private Circle spot29;
	
	@FXML
	private Circle spot30;
	
	@FXML
	private Rectangle spot31;
	
	@FXML
	private Circle spot32;
	
	@FXML
	private Circle spot33;
	
	@FXML
	private Circle spot34;
	
	@FXML
	private Rectangle spot35;
	
	@FXML
	private Circle spot36;
	
	@FXML
	private Circle spot37;
	
	@FXML
	private Circle spot38;
	
	@FXML
	private Circle spot39;
	
	@FXML
	private Circle spot40;
	
	@FXML
	private Circle spot41;
	
	@FXML
	private Rectangle spot42;
	
	@FXML
	private Circle spot43;
	
	@FXML
	private Circle spot44;
	
	@FXML
	private Circle spot45;
	
	@FXML
	private Circle spot46;
	
	@FXML
	private Circle spot47;
	
	@FXML
	private Circle spot48;
	
	@FXML
	private Circle spot49;
	
	@FXML
	private Circle spot50;
	
	@FXML
	private Circle spot51;
	
	@FXML
	private Circle spot52;
	
	@FXML
	private Circle spot53;
	
	@FXML
	private Circle spot54;
	
	@FXML
	private Circle spot55;
	
	@FXML
	private Circle spot56;
	
	@FXML
	private Circle spot57;
	
	@FXML
	private Rectangle spot58;
	
	@FXML
	private Circle spot59;
	
	@FXML
	private Circle spot60;
	
	@FXML
	private Circle spot61;
	
	@FXML
	private Circle spot62;
	
	@FXML
	private Circle spot63;
	
	@FXML
	private Circle spot64;
	
	@FXML
	private Circle spot65;
	
	@FXML
	private Circle spot66;
	
	@FXML
	private Rectangle spot67;
	
	@FXML
	private Circle spot68;
	
	@FXML
	private Circle spot69;
	
	@FXML
	private Circle spot70;
	
	@FXML
	private Circle spot71;
	
	@FXML
	private Circle spot72;
	
	@FXML
	private Rectangle spot73;
	
	@FXML
	private Circle spot74;
	
	@FXML
	private Circle spot75;
	
	@FXML
	private Circle pokeSpot1;
	
	@FXML
	private Circle pokeSpot3;
	
	@FXML
	private Circle pokeSpot6;
	
	@FXML
	private Circle pokeSpot7;
	
	@FXML
	private Circle pokeSpot9;
	
	@FXML
	private Circle pokeSpot10;
	
	@FXML
	private Circle pokeSpot11;
	
	@FXML
	private Circle pokeSpot14;
	
	@FXML
	private Circle pokeSpot16;
	
	@FXML
	private Circle pokeSpot17;
	
	@FXML
	private Circle pokeSpot18;
	
	@FXML
	private Circle pokeSpot20;
	
	@FXML
	private Circle pokeSpot21;
	
	@FXML
	private Circle pokeSpot24;
	
	@FXML
	private Circle pokeSpot26;
	
	@FXML
	private Circle pokeSpot27;
	
	@FXML
	private Circle pokeSpot29;
	
	@FXML
	private Circle pokeSpot33;
	
	@FXML
	private Circle pokeSpot36;
	
	@FXML
	private Circle pokeSpot38;
	
	@FXML
	private Circle pokeSpot41;
	
	@FXML
	private Circle pokeSpot45;
	
	@FXML
	private Circle pokeSpot47;
	
	@FXML
	private Circle pokeSpot49;
	
	@FXML
	private Circle pokeSpot50;
	
	@FXML
	private Circle pokeSpot52;
	
	@FXML
	private Circle pokeSpot53;
	
	@FXML
	private Circle pokeSpot55;
	
	@FXML
	private Circle pokeSpot60;
	
	@FXML
	private Circle pokeSpot62;
	
	@FXML
	private Circle pokeSpot64;
	
	@FXML
	private Circle pokeSpot65;
	
	@FXML
	private Circle pokeSpot66;
	
	@FXML
	private Circle pokeSpot68;
	
	@FXML
	private Circle pokeSpot69;
	
	@FXML
	private Circle pokeSpot74;
	
	@FXML
	private Circle legendary1;
	
	@FXML
	private Circle legendary2;
	
	@FXML
	private Circle legendary3;
	
	@FXML
	private Circle legendary4;
	
	
	@FXML
	private AnchorPane anchorPane;
	

	static private Spot[] spots = new Spot[76];
	

	 DataOutputStream toServer = null;
	 DataInputStream fromServer = null;



	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Board initialized");	
		
		spots[0] = new Spot(none, spot0);
		spots[1] = new Spot(catchPokemon,spot1,pokeSpot1,pink);
		spots[2] = new Spot(drawCards,spot2,pink);
		spots[3] = new Spot(catchPokemon,spot3,pokeSpot3,pink);
		spots[4] = new Spot(citySpot,spot4);
		spots[5] = new Spot(drawCards,spot5,pink);
		spots[6] = new Spot(catchPokemon,spot6, pokeSpot6,pink);
		spots[7] = new Spot(catchPokemon,spot7, pokeSpot7,pink);
		spots[8] = new Spot(drawCards,spot8,pink);
		spots[9] = new Spot(catchPokemon,spot9, pokeSpot9,pink);
		spots[10] = new Spot(catchPokemon,spot10, pokeSpot10,pink);
		spots[11] = new Spot(catchPokemon,spot11, pokeSpot11,pink);
		spots[12] = new Spot(citySpot,spot12);
		spots[13] = new Spot(drawCards,spot13,pink);
		spots[14] = new Spot(catchPokemon,spot14, pokeSpot14,pink);
		spots[15] = new Spot(drawCards,spot15,pink);
		spots[16] = new Spot(catchPokemon,spot16, pokeSpot16,pink);
		spots[17] = new Spot(catchPokemon,spot17, pokeSpot17,pink);
		spots[18] = new Spot(catchPokemon,spot18, pokeSpot18,green);
		spots[19] = new Spot(drawCards,spot19,green);
		spots[20] = new Spot(catchPokemon,spot20, pokeSpot20,green);
		spots[21] = new Spot(catchPokemon,spot21, pokeSpot21,green);
		spots[22] = new Spot(drawCards,spot22,green);
		spots[23] = new Spot(pokecenter,spot23);
		spots[24] = new Spot(catchPokemon,spot24, pokeSpot24,green);
		spots[25] = new Spot(drawCards,spot25,green);
		spots[26] = new Spot(catchPokemon,spot26, pokeSpot26,green);
		spots[27] = new Spot(catchPokemon,spot27, pokeSpot27,green);
		spots[28] = new Spot(drawCards,spot28,green);
		spots[29] = new Spot(catchPokemon,spot29, pokeSpot29,green);
		spots[30] = new Spot(drawCards,spot30,green);
		spots[31] = new Spot(citySpot,spot31);
		spots[32] = new Spot(drawCards,spot32,green);
		spots[33] = new Spot(catchPokemon,spot33, pokeSpot33,green);
		spots[34] = new Spot(drawCards,spot34,green);
		spots[35] = new Spot(citySpot,spot35);
		spots[36] = new Spot(catchPokemon,spot36, pokeSpot36,green);
		spots[37] = new Spot(drawCards,spot37,green);
		spots[38] = new Spot(catchPokemon,spot38, pokeSpot38,green);
		spots[39] = new Spot(drawCards,spot39,green);
		spots[40] = new Spot(drawCards,spot40,blue);
		spots[41] = new Spot(catchPokemon,spot41, pokeSpot41,blue);
		spots[42] = new Spot(pokecenter,spot42);
		spots[43] = new Spot(drawCards,spot43,blue);
		spots[44] = new Spot(drawCards,spot44,blue);
		spots[45] = new Spot(catchPokemon,spot45, pokeSpot45,blue);
		spots[46] = new Spot(drawCards,spot46,blue);
		spots[47] = new Spot(catchPokemon,spot47, pokeSpot47,blue);
		spots[48] = new Spot(drawCards,spot48,blue);
		spots[49] = new Spot(catchPokemon,spot49, pokeSpot49,blue);
		spots[50] = new Spot(catchPokemon,spot50, pokeSpot50,blue);
		spots[51] = new Spot(drawCards,spot51,blue);
		spots[52] = new Spot(catchPokemon,spot52, pokeSpot52,blue);
		spots[53] = new Spot(catchPokemon,spot53, pokeSpot53,blue);
		spots[54] = new Spot(drawCards,spot54,blue);
		spots[55] = new Spot(catchPokemon,spot55, pokeSpot55,blue);
		spots[56] = new Spot(drawCards,spot56,blue);
		spots[57] = new Spot(drawCards,spot57,blue);
		spots[58] = new Spot(citySpot,spot58);
		spots[59] = new Spot(drawCards,spot59,red);
		spots[60] = new Spot(catchPokemon,spot60, pokeSpot60,red);
		spots[61] = new Spot(drawCards,spot61,red);
		spots[62] = new Spot(catchPokemon,spot62, pokeSpot62,red);
		spots[63] = new Spot(drawCards,spot63,red);
		spots[64] = new Spot(catchPokemon,spot64, pokeSpot64,red);
		spots[65] = new Spot(catchPokemon,spot65, pokeSpot65,red);
		spots[66] = new Spot(catchPokemon,spot66, pokeSpot66,red);
		spots[67] = new Spot(citySpot,spot67);
		spots[68] = new Spot(catchPokemon,spot68, pokeSpot68,red);
		spots[69] = new Spot(catchPokemon,spot69, pokeSpot69,red);
		spots[70] = new Spot(drawCards,spot70,red);
		spots[71] = new Spot(drawCards,spot71,red);
		spots[72] = new Spot(drawCards,spot72,red);
		spots[73] = new Spot(finalSpot,spot73);
		spots[74] = new Spot(catchPokemon,spot74, pokeSpot74,blue);
		spots[75] = new Spot(drawCards,spot75,blue);
		

		
	
		
		
		
		
		//this fills in every spot
//		for(int index=0, i=1;index<76;index++,i++){
//			
//			PokeChip pokeChip = new PokeChip(PINK, i);
//
//			
//
//		if(spots[index].getAction()==catchPokemon){
//			
//			pokeChip.anchorPane.setLayoutX(spots[index].getPokeCircle().getLayoutX()-40);
//			pokeChip.anchorPane.setLayoutY(spots[index].getPokeCircle().getLayoutY()-40);
//			anchorPane.getChildren().add(pokeChip.anchorPane);
//			
//			Player player1 = new Player(1);
//			player1.anchorPane.setLayoutX(spots[index].getSpotCircle().getLayoutX()-17);
//			player1.anchorPane.setLayoutY(spots[index].getSpotCircle().getLayoutY()-16);
//			anchorPane.getChildren().add(player1.anchorPane);
//			
//			Player player2 = new Player(2);
//			player2.anchorPane.setLayoutX(spots[index].getSpotCircle().getLayoutX()+2);
//			player2.anchorPane.setLayoutY(spots[index].getSpotCircle().getLayoutY()-16);
//			anchorPane.getChildren().add(player2.anchorPane);
//			
//		}
//		else if(spots[index].getAction()==drawCards){
//			
//			Player player1 = new Player(1);
//			player1.anchorPane.setLayoutX(spots[index].getSpotCircle().getLayoutX()-17);
//			player1.anchorPane.setLayoutY(spots[index].getSpotCircle().getLayoutY()-16);
//			anchorPane.getChildren().add(player1.anchorPane);
//			
//			Player player2 = new Player(2);
//			player2.anchorPane.setLayoutX(spots[index].getSpotCircle().getLayoutX()+2);
//			player2.anchorPane.setLayoutY(spots[index].getSpotCircle().getLayoutY()-16);
//			anchorPane.getChildren().add(player2.anchorPane);
//			
//		}
//		else{
//			Player player1 = new Player(1);
//			player1.anchorPane.setLayoutX(spots[index].getRectangle().getLayoutX()+23);
//			player1.anchorPane.setLayoutY(spots[index].getRectangle().getLayoutY()+10);
//			anchorPane.getChildren().add(player1.anchorPane);
//			
//			Player player2 = new Player(2);
//			player2.anchorPane.setLayoutX(spots[index].getRectangle().getLayoutX()+78);
//			player2.anchorPane.setLayoutY(spots[index].getRectangle().getLayoutY()+10);
//			anchorPane.getChildren().add(player2.anchorPane);
//		}
//	}
	
		
	}

	
	@FXML
	private void selectSpot(MouseEvent event){
		
		String areaClicked = event.getTarget().toString();
		System.out.println("mouse clicked" + areaClicked);

		
	}
	
	
	static public void sayHi() {
		System.out.println("Hello");
	}

	static public double getSpotX(int spotNumber) {
		return spots[spotNumber].getSpotCircle().getLayoutX();
	}
	
	static public double getSpotY(int spotNumber) {
		return spots[spotNumber].getSpotCircle().getLayoutY()-15;
	}

	static public double getCitySpotX(int spotNumber) {
		return spots[spotNumber].getRectangle().getLayoutX()+50;
		
	}
	

	static public double getCitySpotY(int spotNumber) {
		return spots[spotNumber].getRectangle().getLayoutY()+10;
		
	}
	
}
