package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import pokeObjects.Player;
import pokeObjects.Spot;
import pokeObjects.SpotConstants;
import pokechip.PokeChip;
import pokechip.PokeChipConstants;

public class BoardController implements Initializable, PokeChipConstants, SpotConstants, GameConstants{

	
	
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
	
	//the main anchorPane
	@FXML
	private AnchorPane anchorPane;
	
	@FXML
	private Pane diePane;
	
	@FXML
	private Rectangle dieRectangle;
	
	@FXML
	private Circle die1;
	
	@FXML
	private Circle die2;
	
	@FXML
	private Circle die3;
	
	@FXML
	private Circle die4;
	
	@FXML
	private Circle die5;
	
	@FXML
	private Circle die6;
	
	@FXML
	private Circle die7;
	
	@FXML
	private Pane beltPane;
	
	@FXML
	private TilePane beltTilePane;
	
	@FXML
	private Pane pokeballPane;
	
	@FXML
	private Label pokeballLabel;
	
	@FXML
	private Label pokeballDiscription;
	
	@FXML
	private Polygon pokeballLeftTriangle;
	
	@FXML
	private ImageView pokeballPokemon;
	
	@FXML
	private Label pokeballCount;
	
	@FXML
	private ImageView pokeballImage;

	@FXML 
	private Rectangle pokeballBackground;
	
	@FXML
	private ImageView pokeballDie1;
	@FXML
	private ImageView pokeballDie2;
	@FXML
	private ImageView pokeballDie3;
	@FXML
	private ImageView pokeballDie4;
	@FXML
	private ImageView pokeballDie5;
	@FXML
	private ImageView pokeballDie6;
	
	@FXML
	private ImageView pokeball1;
	@FXML
	private ImageView pokeball2;
	@FXML
	private ImageView pokeball3;
	@FXML
	private ImageView pokeball4;
	@FXML
	private ImageView pokeball5;
	@FXML
	private ImageView pokeball6;
	
	@FXML
	private Label pokeballInfo;
	@FXML
	private Label pokeballMessage;
	
	static private Spot[] spots = new Spot[76];
	

	DataOutputStream toServer = null;
	DataInputStream fromServer = null;

	Player player1, player2;
	static Player[] players;

	static int player;

	private boolean pastCerulean = false;
	private boolean isCatching = false;

	private boolean isMoving;

	private int currentSpot = 0;
	
	private ArrayList <PokeChip> myPokemon = new ArrayList<PokeChip>();
	private ArrayList <PokeChip> theirPokemon = new ArrayList<PokeChip>();
	private int[] myItemCards = {0,0,0,0,0,0,0,0,0,0,0,0};

	int pokeballIndex = 0;
	
	int pokeballColor = PINK;

	ImageView[] pokeballDice;

	private boolean hasUsedTimeMachine = false;
	private boolean pokeballPaneExit = false;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//System.out.println("Board initialized");	
		
		spots[0] = new Spot(none, spot0);
		spots[1] = new Spot(catchPokemon,spot1,pokeSpot1,pink);
		spots[2] = new Spot(eventCard,spot2,pink);
		spots[3] = new Spot(catchPokemon,spot3,pokeSpot3,pink);
		spots[4] = new Spot(citySpot,spot4);
		spots[5] = new Spot(eventCard,spot5,pink);
		spots[6] = new Spot(catchPokemon,spot6, pokeSpot6,pink);
		spots[7] = new Spot(catchPokemon,spot7, pokeSpot7,pink);
		spots[8] = new Spot(eventCard,spot8,pink);
		spots[9] = new Spot(catchPokemon,spot9, pokeSpot9,pink);
		spots[10] = new Spot(catchPokemon,spot10, pokeSpot10,pink);
		spots[11] = new Spot(catchPokemon,spot11, pokeSpot11,pink);
		spots[12] = new Spot(citySpot,spot12);
		spots[13] = new Spot(eventCard,spot13,pink);
		spots[14] = new Spot(catchPokemon,spot14, pokeSpot14,pink);
		spots[15] = new Spot(eventCard,spot15,pink);
		spots[16] = new Spot(catchPokemon,spot16, pokeSpot16,pink);
		spots[17] = new Spot(catchPokemon,spot17, pokeSpot17,pink);
		spots[18] = new Spot(catchPokemon,spot18, pokeSpot18,green);
		spots[19] = new Spot(eventCard,spot19,green);
		spots[20] = new Spot(catchPokemon,spot20, pokeSpot20,green);
		spots[21] = new Spot(catchPokemon,spot21, pokeSpot21,green);
		spots[22] = new Spot(eventCard,spot22,green);
		spots[23] = new Spot(pokecenter,spot23);
		spots[24] = new Spot(catchPokemon,spot24, pokeSpot24,green);
		spots[25] = new Spot(eventCard,spot25,green);
		spots[26] = new Spot(catchPokemon,spot26, pokeSpot26,green);
		spots[27] = new Spot(catchPokemon,spot27, pokeSpot27,green);
		spots[28] = new Spot(eventCard,spot28,green);
		spots[29] = new Spot(catchPokemon,spot29, pokeSpot29,green);
		spots[30] = new Spot(eventCard,spot30,green);
		spots[31] = new Spot(citySpot,spot31);
		spots[32] = new Spot(eventCard,spot32,green);
		spots[33] = new Spot(catchPokemon,spot33, pokeSpot33,green);
		spots[34] = new Spot(eventCard,spot34,green);
		spots[35] = new Spot(citySpot,spot35);
		spots[36] = new Spot(catchPokemon,spot36, pokeSpot36,green);
		spots[37] = new Spot(eventCard,spot37,green);
		spots[38] = new Spot(catchPokemon,spot38, pokeSpot38,green);
		spots[39] = new Spot(eventCard,spot39,green);
		spots[40] = new Spot(eventCard,spot40,blue);
		spots[41] = new Spot(catchPokemon,spot41, pokeSpot41,blue);
		spots[42] = new Spot(pokecenter,spot42);
		spots[43] = new Spot(eventCard,spot43,blue);
		spots[44] = new Spot(eventCard,spot44,blue);
		spots[45] = new Spot(catchPokemon,spot45, pokeSpot45,blue);
		spots[46] = new Spot(eventCard,spot46,blue);
		spots[47] = new Spot(catchPokemon,spot47, pokeSpot47,blue);
		spots[48] = new Spot(eventCard,spot48,blue);
		spots[49] = new Spot(catchPokemon,spot49, pokeSpot49,blue);
		spots[50] = new Spot(catchPokemon,spot50, pokeSpot50,blue);
		spots[51] = new Spot(eventCard,spot51,blue);
		spots[52] = new Spot(catchPokemon,spot52, pokeSpot52,blue);
		spots[53] = new Spot(catchPokemon,spot53, pokeSpot53,blue);
		spots[54] = new Spot(eventCard,spot54,blue);
		spots[55] = new Spot(catchPokemon,spot55, pokeSpot55,blue);
		spots[56] = new Spot(eventCard,spot56,blue);
		spots[57] = new Spot(eventCard,spot57,blue);
		spots[58] = new Spot(citySpot,spot58);
		spots[59] = new Spot(eventCard,spot59,red);
		spots[60] = new Spot(catchPokemon,spot60, pokeSpot60,red);
		spots[61] = new Spot(eventCard,spot61,red);
		spots[62] = new Spot(catchPokemon,spot62, pokeSpot62,red);
		spots[63] = new Spot(eventCard,spot63,red);
		spots[64] = new Spot(catchPokemon,spot64, pokeSpot64,red);
		spots[65] = new Spot(catchPokemon,spot65, pokeSpot65,red);
		spots[66] = new Spot(catchPokemon,spot66, pokeSpot66,red);
		spots[67] = new Spot(citySpot,spot67);
		spots[68] = new Spot(catchPokemon,spot68, pokeSpot68,red);
		spots[69] = new Spot(catchPokemon,spot69, pokeSpot69,red);
		spots[70] = new Spot(eventCard,spot70,red);
		spots[71] = new Spot(eventCard,spot71,red);
		spots[72] = new Spot(eventCard,spot72,red);
		spots[73] = new Spot(finalSpot,spot73);
		spots[74] = new Spot(catchPokemon,spot74, pokeSpot74,blue);
		spots[75] = new Spot(eventCard,spot75,blue);
		
		//create player objects
		player1 = new Player(1);
		player2 = new Player(2);
		players = new Player[3];
		players[1] = player1;
		players[2] = player2;
		
		pokeballDice = new ImageView[6];
		pokeballDice[0] = pokeballDie1;
		pokeballDice[1] = pokeballDie2;
		pokeballDice[2] = pokeballDie3;
		pokeballDice[3] = pokeballDie4;
		pokeballDice[4] = pokeballDie5;
		pokeballDice[5] = pokeballDie6;
		
		//TO-DO this should be done by opening socket connections. server sends which player and this is set
		player = 1;
		
		//add players to board
		anchorPane.getChildren().addAll(player1.anchorPane,player2.anchorPane);
		
		//set beltpane spot
		beltPane.setLayoutX(0);
		//beltPane.setLayoutY(450);
		
		//set player spots to starting town
		setSpot(0,1);
		setSpot(12,2);
		
		//set die
		setDie(1);
		
		// this is set through when you accept moving past cerulean on the board.
		pastCerulean= true;
		
		//test spots highlighter
		highlightSpotsOn(6);
		
		//TO-DO this is set after a roll
		isMoving=true;

		//give some pokeballs
		myItemCards[GREATBALL]=3;
		myItemCards[ULTRABALL]=0;
		myItemCards[MASTERBALL]=4;
		
		//test pokeball pane
		//PokeChip pokeballPokemon = new PokeChip(149);
		//openPokeballPane(pokeballPokemon);
		
		//test pokemon catching
		isCatching=true;
		
		
		

		
		//test pokebelt
//		PokeChip myPokemon[] = new PokeChip[151];
//		
//		for (int i = 0, j = 0; i <100; i++) {
//			
//		
//		myPokemon[i] = new PokeChip(i+1);
//		
//		beltTilePane.getChildren().add(myPokemon[i].anchorPane);
//		
//		
//		if(i%4==3){
//			j++;
//		}
//		}
		
		

		
//		//create the pokemon belt
//		Pane beltPane = new Pane();
//		
//		
//		//belt rectangle
//		Rectangle beltRectangle = new Rectangle(500, 350);
//		beltRectangle.setStyle("-fx-arc-height: 20;"
//				+ "-fx-arc-width: 20;");
//		Stop[] stops = new Stop[] { new Stop(0, Color.GREY), new Stop(.8, Color.WHITE)};
//		LinearGradient lg1 = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, stops);
//		//beltRectangle.setFill(lg1);
//		
//		//belt image
//		FileInputStream input;
//		ImageView beltImage = new ImageView();
//		try {
//			input = new FileInputStream("resources/pokeballLight.png");
//			Image image = new Image(input,300,300,false,true);
//			beltImage = new ImageView(image);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		<LinearGradient endX="1.0" endY="1.0" startX="1.0" startY="0.04761904761904763">
//        <stops>
//           <Stop color="#686868" />
//           <Stop color="WHITE" offset="1.0" />
//        </stops>
//     </LinearGradient>
		
//		beltPane.getChildren().addAll(beltRectangle,beltImage);
//		anchorPane.getChildren().add(beltPane);
		
	}
	
	//checks which action is landed on
	private void checkSpotAction(int spotNumber) {
			if(spots[spotNumber].getAction()==catchPokemon){
				System.out.println("Landed on a catch pokemon spot");
				if(spots[spotNumber].pokemon==null){
					System.out.println("spot empty filling with pokemon");

					//send catchpokemon action to server with color.
					
					//receive which pokemon from server. add pokemon to board
					
					//testing pokemon
					addPokemon(10, 6);
					
				}
				else{
					System.out.println("pokemon is here. trying to catch");
				}
					openPokeballPane(spots[players[player].currentSpot].pokemon);
				
				
				//try and catch pokemon
				
			}
			else if(spots[spotNumber].getAction()==eventCard){
				System.out.println("Landed on a event card spot");

				//send eventCard action to server
				
				//receive which type of card back from server twice. add cards to player's hand
				
				
			}
			else if(spots[spotNumber].getAction()==pokecenter){
				System.out.println("Landed on a pokecenter spot");

				//start little game to heal pokemon
				
			}
			else if(spots[spotNumber].getAction()==citySpot){
				System.out.println("Landed on a city draw 2 spot");

				//send drawCards action to server
				
				//receive which type of card back from server twice. add cards to player's hand
			}
			else if(spots[spotNumber].getAction()==finalSpot){
				System.out.println("Landed on the final spot");

				//send eventCard action to server
				
				//receive which type of card back from server twice. add cards to player's hand

				//check to see if player has enough points to enter. if so set flag for indigo warp
			}
			else{
				
			}
		}
	
	private void testAllSpots(){
		//this fills in every spot
		for(int index=0, i=1;index<76;index++,i++){
			
			PokeChip pokeChip = new PokeChip(i);

			

		if(spots[index].getAction()==catchPokemon){
			
			pokeChip.anchorPane.setLayoutX(spots[index].getPokeCircle().getLayoutX()-40);
			pokeChip.anchorPane.setLayoutY(spots[index].getPokeCircle().getLayoutY()-40);
			anchorPane.getChildren().add(pokeChip.anchorPane);
			
			Player player1 = new Player(1);
			player1.anchorPane.setLayoutX(spots[index].getSpotCircle().getLayoutX()-17);
			player1.anchorPane.setLayoutY(spots[index].getSpotCircle().getLayoutY()-16);
			anchorPane.getChildren().add(player1.anchorPane);
			
			Player player2 = new Player(2);
			player2.anchorPane.setLayoutX(spots[index].getSpotCircle().getLayoutX()+2);
			player2.anchorPane.setLayoutY(spots[index].getSpotCircle().getLayoutY()-16);
			anchorPane.getChildren().add(player2.anchorPane);
			
		}
		else if(spots[index].getAction()==eventCard){
			
			Player player1 = new Player(1);
			player1.anchorPane.setLayoutX(spots[index].getSpotCircle().getLayoutX()-17);
			player1.anchorPane.setLayoutY(spots[index].getSpotCircle().getLayoutY()-16);
			anchorPane.getChildren().add(player1.anchorPane);
			
			Player player2 = new Player(2);
			player2.anchorPane.setLayoutX(spots[index].getSpotCircle().getLayoutX()+2);
			player2.anchorPane.setLayoutY(spots[index].getSpotCircle().getLayoutY()-16);
			anchorPane.getChildren().add(player2.anchorPane);
			
		}
		else{
			Player player1 = new Player(1);
			player1.anchorPane.setLayoutX(spots[index].getRectangle().getLayoutX()+23);
			player1.anchorPane.setLayoutY(spots[index].getRectangle().getLayoutY()+10);
			anchorPane.getChildren().add(player1.anchorPane);
			
			Player player2 = new Player(2);
			player2.anchorPane.setLayoutX(spots[index].getRectangle().getLayoutX()+78);
			player2.anchorPane.setLayoutY(spots[index].getRectangle().getLayoutY()+10);
			anchorPane.getChildren().add(player2.anchorPane);
		}
	}
	}
	
	@FXML
	private void handleBoard(MouseEvent clickedSpot){
		
		String areaClicked = clickedSpot.getTarget().toString();
		//System.out.println("spot clicked " + areaClicked);
		if(isMoving){
			
			areaClicked = areaClicked.replaceAll("[^\\d .]", "");
			//System.out.println("area: " + areaClicked);
			String[] split = areaClicked.split("\\ ");
			int spotNumber = Integer.parseInt(split[0]);
			//System.out.println("spot number: " + spotNumber);
			
			//if the spot is open for movement
			if(spots[spotNumber].getSpotOpen()==true){
				
				//move character and set currentSpot var
				setSpot(spotNumber, player);
				players[player].currentSpot = spotNumber;
				hightlightSpotsOff();
				
				if(spotNumber>=23){
					pastCerulean = true;
				}
				
				checkSpotAction(spotNumber);
				//to test movement
				//highlightSpotsOn(1);
			}

			
		}
		
	}
	
	private void openPokeballPane(PokeChip pokemon){
		
		resetPokemonPane();
		
		//set pokemon image
		Image image = new Image(pokemon.url,475,475,false,true);
		pokeballPokemon.setImage(image);
		
		//get info about pokemon
		
		pokeballInfo.setText(pokemon.name+ " #"+pokemon.dexNumber+"\n"
						+ "Power Points: "+pokemon.powerPoints+"\n"
								+ "Attack Power: "+pokemon.attackStrength);
		
		pokeballMessage.setText("A wild "+pokemon.name+"\n"
				+ "has appeared!");
		
		
		
		int[] pokeballDice = {0,0,0,0,0,0};
		
		
		
		//set background color and dice array
		//System.out.println("Pokemon Color: " + pokemon.color);
		
		if(pokemon.color.equals("Pink")){
			pokeballBackground.setFill(Color.rgb(255, 76, 123));
			pokeballDice[2] = 1;	//3 4 5
			pokeballDice[3] = 1;
			pokeballDice[4] = 1;
			pokeballColor = PINK;
		}
		else if(pokemon.color.equals("Green")){
			pokeballBackground.setFill(Color.rgb(24, 103, 24));
			pokeballDice[3] = 1;	//4 5
			pokeballDice[4] = 1;
			pokeballColor = GREEN;

		}
		else if(pokemon.color.equals("Blue")){
			pokeballBackground.setFill(Color.rgb(0, 55, 144));
			pokeballDice[2] = 1;	//3 4
			pokeballDice[3] = 1;
			pokeballColor = BLUE;
		}
		else if(pokemon.color.equals("Red")){
			pokeballBackground.setFill(Color.rgb(210, 15, 45));
			pokeballDice[4] = 1;	//5
			pokeballColor = RED;

		}
		else if(pokemon.color.equals("Legendary")){
			pokeballBackground.setFill(Color.rgb(225, 174, 45));
			pokeballDice[5] = 1;	//6
			pokeballColor = LEGENDARY;


		}
		
		setDiceOpacity(pokeballDice);
		
		
		pokeballPane.setLayoutX(425);
		pokeballPane.setLayoutY(150);
		pokeballPane.toFront();
	}
	
	private void resetPokemonPane() {
		//set image to pokeball
		FileInputStream input;
		try {
			input = new FileInputStream("resources/Poke Ball.png");
			Image pokeImage = new Image(input,200,200,false,true);
			pokeballImage.setImage(pokeImage);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//reset index
		pokeballIndex = 0;
		
		
		pokeballImage.setOpacity(1);

		//set texts
		pokeballLabel.setText("Pok"+pokemonE+"ball");
		pokeballDiscription.setText("Click the ball to try to catch this\n"
				+ "pok"+pokemonE+"mon. Normal pok"+pokemonE+"balls\n"
						+ "do not alter your roll. Use the\n"
						+ "arrows to change your pok"+pokemonE+"ball.");
		pokeballCount.setText("∞");
	
		pokeball1.setVisible(false);
		pokeball2.setVisible(false);
		pokeball3.setVisible(false);
		pokeball4.setVisible(false);
		pokeball5.setVisible(false);
		pokeball6.setVisible(false);

	}

	//pokeball catching pane and handles
	@FXML
	private void handlePokeball(MouseEvent clickedSpot){
		
		if(isCatching){
		
			String areaClicked = clickedSpot.getTarget().toString();
			//System.out.println("spot clicked " + areaClicked);
			
			int[] pokeballDice = {0,0,0,0,0,0};
			
			//cycle through balls
			if(clickedSpot.getTarget()==pokeballLeftTriangle){
				//System.out.println("clicked left");
				if (pokeballIndex==0) {
					pokeballIndex=3;
				}
				else{
					pokeballIndex--;
				}
				
			}
			else{
				//System.out.println("clicked right");
				if (pokeballIndex==3) {
					pokeballIndex=0;
				}
				else{
					pokeballIndex++;
				}
			}
			
			
			
			
				//System.out.println("pokemon color: "+ pokeballColor);
			//set up switch dice array
			switch (pokeballColor) {
			case PINK:
				System.out.println("in pink pokeballIndex: "+pokeballIndex);
	
				switch (pokeballIndex) {
				case 0://pokeball
					System.out.println("in pokeball pink");
	
					pokeballDice[2] = 1;	//3 4 5
					pokeballDice[3] = 1;
					pokeballDice[4] = 1;
					break;
				case 1://greatball
					pokeballDice[1] = 1;	//2
					pokeballDice[2] = 1;	//3 4 5
					pokeballDice[3] = 1;
					pokeballDice[4] = 1;
					pokeballDice[5] = 1;	//6
					break;
				case 2://ultraball
					pokeballDice[0] = 1;	//1
					pokeballDice[1] = 1;	//2
					pokeballDice[2] = 1;	//3 4 5
					pokeballDice[3] = 1;
					pokeballDice[4] = 1;
					break;
				case 3://masterball
					pokeballDice[0] = 1;	//1
					pokeballDice[1] = 1;	//2
					pokeballDice[2] = 1;	//3 4 5
					pokeballDice[3] = 1;
					pokeballDice[4] = 1;
					break;
				default:
					break;
				}
				break;
			case GREEN:
				switch (pokeballIndex) {
				case 0://pokeball
					pokeballDice[3] = 1;	//4 5
					pokeballDice[4] = 1;
					break;
				case 1://greatball
					pokeballDice[2] = 1;	//3
					pokeballDice[3] = 1;	//4 5
					pokeballDice[4] = 1;
					pokeballDice[5] = 1;	//6
					break;
				case 2://ultraball
					pokeballDice[1] = 1;	//2
					pokeballDice[2] = 1;	//3
					pokeballDice[3] = 1;	//4 5
					pokeballDice[4] = 1;
					break;
				case 3://masterball
					pokeballDice[0] = 1;	//1
					pokeballDice[1] = 1;	//2
					pokeballDice[2] = 1;	//3
					pokeballDice[3] = 1;	//4 5
					pokeballDice[4] = 1;
					break;
				default:
					break;
				}
				break;
			case BLUE:
				switch (pokeballIndex) {
				case 0://pokeball
					pokeballDice[2] = 1;	//3 4
					pokeballDice[3] = 1;
					break;
				case 1://greatball
					pokeballDice[1] = 1;	//2
					pokeballDice[2] = 1;	//3 4
					pokeballDice[3] = 1;
					pokeballDice[4] = 1;	//5
					break;
				case 2://ultraball
					pokeballDice[0] = 1;	//1
					pokeballDice[1] = 1;	//2
					pokeballDice[2] = 1;	//3 4
					pokeballDice[3] = 1;
					break;
				case 3://masterball
					pokeballDice[0] = 1;	//1
					pokeballDice[1] = 1;	//2
					pokeballDice[2] = 1;	//3 4
					pokeballDice[3] = 1;
					break;
				default:
					break;
				}
				break;
			case RED:
				switch (pokeballIndex) {
				case 0://pokeball
					pokeballDice[4] = 1;	//5
					break;
				case 1://greatball
					pokeballDice[3] = 1;	//4
					pokeballDice[4] = 1;	//5
					pokeballDice[5] = 1;	//6
					break;
				case 2://ultraball
					pokeballDice[2] = 1;	//3
					pokeballDice[3] = 1;	//4
					pokeballDice[4] = 1;	//5
					break;
				case 3://masterball
					pokeballDice[0] = 1;	//1
					pokeballDice[1] = 1;	//2
					pokeballDice[2] = 1;	//3
					pokeballDice[3] = 1;	//4
					pokeballDice[4] = 1;	//5
					break;
				default:
					break;
				}
				break;
			case LEGENDARY:
				switch (pokeballIndex) {
				case 0://pokeball
					pokeballDice[5] = 1;	//6
					break;
				case 1://greatball
					pokeballDice[4] = 1;	//5
					pokeballDice[5] = 1;	//6
					break;
				case 2://ultraball
					pokeballDice[3] = 1;	//4
					pokeballDice[4] = 1;	//5
					pokeballDice[5] = 1;	//6
					break;
				case 3://masterball
					pokeballDice[1] = 1;	//2
					pokeballDice[2] = 1;	//3
					pokeballDice[3] = 1;	//4
					pokeballDice[4] = 1;	//5
					pokeballDice[5] = 1;	//6
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
			setDiceOpacity(pokeballDice);
			
			//change ball image and text
			FileInputStream input;
			
			switch (pokeballIndex) {
			case 0:
				resetPokemonPane();
				break;
			case 1:
				try {
					input = new FileInputStream("resources/Great Ball.png");
					Image image = new Image(input,200,200,false,true);
					pokeballImage.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				//set texts
				pokeballLabel.setText("Great Ball");
				pokeballDiscription.setText("This pok"+pokemonE+"ball will\n"
						+ "add 1 to (or subtract\n"
								+ "1 from) your roll.");
				
				//set counter
				pokeballCount.setText(""+myItemCards[GREATBALL]);
				if(myItemCards[GREATBALL]>0){
					pokeballImage.setOpacity(1);
				}
				else{
					pokeballImage.setOpacity(.33);
				}
				
				
				break;
			case 2:
				try {
					input = new FileInputStream("resources/Ultra Ball.png");
					Image image = new Image(input,200,200,false,true);
					pokeballImage.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				//set texts
				pokeballLabel.setText("Ultra Ball");
				pokeballDiscription.setText("This pok"+pokemonE+"ball will\n"
						+ "add 1 or 2\n"
								+ "to your roll.");
				
				//set counter
				pokeballCount.setText(""+myItemCards[ULTRABALL]);
				if(myItemCards[ULTRABALL]>0){
					pokeballImage.setOpacity(1);
				}
				else{
					pokeballImage.setOpacity(.33);
				}
				
				break;
			case 3:
				try {
					input = new FileInputStream("resources/Master Ball.png");
					Image image = new Image(input,200,200,false,true);
					pokeballImage.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				//set texts
				pokeballLabel.setText("Master Ball");
				pokeballDiscription.setText("This pok"+pokemonE+"ball will\n"
						+ "add 1, 2, 3, or 4\n"
								+ "to your roll.");
				
				//set counter
				pokeballCount.setText(""+myItemCards[MASTERBALL]);
				if(myItemCards[MASTERBALL]>0){
					pokeballImage.setOpacity(1);
				}
				else{
					pokeballImage.setOpacity(.33);
				}
				
				break;
			default:
				break;
			}
		}
	}

	@FXML
	private void handleCatch(MouseEvent clickedSpot){
		if(isCatching){
			clickedSpot.consume();
			String areaClicked = clickedSpot.getTarget().toString();
			System.out.println("spot clicked " + areaClicked);
			System.out.println("current ball index " + pokeballIndex);
			
			switch (pokeballIndex) {
			case 0:
				isCatching=false;
				rollToCatch();
				break;
			case 1:
				if(myItemCards[GREATBALL]>0){
					isCatching=false;
					rollToCatch();
					myItemCards[GREATBALL]--;
					pokeballCount.setText(""+myItemCards[GREATBALL]);
				}
				break;
			case 2:
				if(myItemCards[ULTRABALL]>0){
					isCatching=false;
					rollToCatch();
					myItemCards[ULTRABALL]--;
					pokeballCount.setText(""+myItemCards[ULTRABALL]);

				}
				break;
			case 3:
				if(myItemCards[MASTERBALL]>0){
					isCatching=false;
					rollToCatch();
					myItemCards[MASTERBALL]--;
					pokeballCount.setText(""+myItemCards[MASTERBALL]);

				}
				
				break;
				
	
			default:
				break;
			}
		}
	}
	
	private void rollToCatch() {
		//randomly pick number 1-6
		int randomNumber = ThreadLocalRandom.current().nextInt(1, 6 + 1);

		//randomNumber = 4;
		
		
		FileInputStream input;

		switch (randomNumber) {
		case 1:
			if(pokeballIndex==0){
				try {
					input = new FileInputStream("resources/Poke Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball1.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==1){
				try {
					input = new FileInputStream("resources/Great Ball.png");
					Image image = new Image(input,200,200,false,true);
					pokeball1.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==2){
				try {
					input = new FileInputStream("resources/Ultra Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball1.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==3){
				try {
					input = new FileInputStream("resources/Master Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball1.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			pokeball1.setVisible(true);
			break;
		case 2:
			if(pokeballIndex==0){
				try {
					input = new FileInputStream("resources/Poke Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball2.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==1){
				try {
					input = new FileInputStream("resources/Great Ball.png");
					Image image = new Image(input,200,200,false,true);
					pokeball2.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==2){
				try {
					input = new FileInputStream("resources/Ultra Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball2.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==3){
				try {
					input = new FileInputStream("resources/Master Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball2.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			pokeball2.setVisible(true);

			break;
		case 3:
			if(pokeballIndex==0){
				try {
					input = new FileInputStream("resources/Poke Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball3.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==1){
				try {
					input = new FileInputStream("resources/Great Ball.png");
					Image image = new Image(input,200,200,false,true);
					pokeball3.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==2){
				try {
					input = new FileInputStream("resources/Ultra Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball3.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==3){
				try {
					input = new FileInputStream("resources/Master Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball3.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			pokeball3.setVisible(true);

			break;
		case 4:
			if(pokeballIndex==0){
				try {
					input = new FileInputStream("resources/Poke Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball4.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==1){
				try {
					input = new FileInputStream("resources/Great Ball.png");
					Image image = new Image(input,200,200,false,true);
					pokeball4.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==2){
				try {
					input = new FileInputStream("resources/Ultra Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball4.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==3){
				try {
					input = new FileInputStream("resources/Master Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball4.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			pokeball4.setVisible(true);

			break;
		case 5:
			if(pokeballIndex==0){
				try {
					input = new FileInputStream("resources/Poke Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball5.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==1){
				try {
					input = new FileInputStream("resources/Great Ball.png");
					Image image = new Image(input,200,200,false,true);
					pokeball5.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==2){
				try {
					input = new FileInputStream("resources/Ultra Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball5.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==3){
				try {
					input = new FileInputStream("resources/Master Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball5.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			pokeball5.setVisible(true);

			break;
		case 6:
			if(pokeballIndex==0){
				try {
					input = new FileInputStream("resources/Poke Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball6.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==1){
				try {
					input = new FileInputStream("resources/Great Ball.png");
					Image image = new Image(input,200,200,false,true);
					pokeball6.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==2){
				try {
					input = new FileInputStream("resources/Ultra Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball6.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(pokeballIndex==3){
				try {
					input = new FileInputStream("resources/Master Ball.png");
					Image image = new Image(input,30,30,false,true);
					pokeball6.setImage(image);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			pokeball6.setVisible(true);

			break;
		default:
			break;
		}
		
		
		//check to see if that die is opaque or not
		if(pokeballDice[randomNumber-1].getOpacity()>=1){
			//catch the pokemon 
			System.out.println("Pokemon Caught");
			pokeballMessage.setText("You caught a\n"
					+ spots[players[player].currentSpot].pokemon.name+"\n"
					+ "Click anywhere to\n"
					+ "continue.");
			
			//add pokemon from spot to belt.
			myPokemon.add(spots[players[player].currentSpot].pokemon);
			beltTilePane.getChildren().add(myPokemon.get(myPokemon.size()-1).anchorPane);
			
			
			pokeballPaneExit = true;
			
			//tell server pokemon was removed from the board and added to players belt
			
		}
		else{
			//check to see if player has a time machine
			if(myItemCards[TIMEMACHINE]>0&&hasUsedTimeMachine ==false){
				//show timemachine pane
				
			}
			else{
				//pokemon fled
				System.out.println("Pokemon Fled");
				pokeballMessage.setText(spots[players[player].currentSpot].pokemon.name+" has fled!\n"
						+ "Click anywhere to\n"
						+ "continue.");

				pokeballPaneExit = true;

			}
		}
		
		
	}

	@FXML
	private void exitPokeballPane(){
		if(pokeballPaneExit){
		System.out.println("Exiting pokemon catching pane");
		pokeballPane.setLayoutY(1000);
		}
	}
	
	//takes in dice array and sets opaque or translucent
	private void setDiceOpacity(int[] pokeballDice) {
		if(pokeballDice[0]==1){	//1
			pokeballDie1.setOpacity(1);
		}
		else{
			pokeballDie1.setOpacity(.33);
		}
		if(pokeballDice[1]==1){ //2
			pokeballDie2.setOpacity(1);
		}
		else{
			pokeballDie2.setOpacity(.33);
		}
		if(pokeballDice[2]==1){ //3
			pokeballDie3.setOpacity(1);
		}
		else{
			pokeballDie3.setOpacity(.33);
		}
		if(pokeballDice[3]==1){ //4
			pokeballDie4.setOpacity(1);
		}
		else{
			pokeballDie4.setOpacity(.33);
		}
		if(pokeballDice[4]==1){ //5
			pokeballDie5.setOpacity(1);
		}
		else{
			pokeballDie5.setOpacity(.33);
		}
		if(pokeballDice[5]==1){ //6
			pokeballDie6.setOpacity(1);
		}
		else{
			pokeballDie6.setOpacity(.33);
		}
	}

	//move player pane to correct spot
	private void setSpot(int spotNumber, int playerNumber){
		//System.out.println("Spot set to: "+spotNumber +" for player "+playerNumber);

		//if a city spot
		if(spots[spotNumber].getAction()==citySpot||spots[spotNumber].getAction()==pokecenter||spots[spotNumber].getAction()==none||spots[spotNumber].getAction()==finalSpot){
			if(playerNumber==1){
				player1.currentSpot = spotNumber;
				player1.anchorPane.setLayoutX(spots[spotNumber].getRectangle().getLayoutX()+23);
				player1.anchorPane.setLayoutY(spots[spotNumber].getRectangle().getLayoutY()+10);
			}
			else{
				player2.currentSpot = spotNumber;
				player2.anchorPane.setLayoutX(spots[spotNumber].getRectangle().getLayoutX()+78);
				player2.anchorPane.setLayoutY(spots[spotNumber].getRectangle().getLayoutY()+10);
			}
		}
		else{
			if(playerNumber==1){
				player1.currentSpot = spotNumber;
				player1.anchorPane.setLayoutX(spots[spotNumber].getSpotCircle().getLayoutX()-17);
				player1.anchorPane.setLayoutY(spots[spotNumber].getSpotCircle().getLayoutY()-16);
			}
			else{
				player2.currentSpot = spotNumber;
				player2.anchorPane.setLayoutX(spots[spotNumber].getSpotCircle().getLayoutX()+2);
				player2.anchorPane.setLayoutY(spots[spotNumber].getSpotCircle().getLayoutY()-16);
			}
		}
		
	}
	
	//clears the die and sets it
	private void setDie(int numberRolled){
		
		diePane.setVisible(true);
		
		die1.setVisible(false);
		die2.setVisible(false);
		die3.setVisible(false);
		die4.setVisible(false);
		die5.setVisible(false);
		die6.setVisible(false);
		die7.setVisible(false);
		
		switch (numberRolled) {
		case 1:
			die7.setVisible(true);
			break;
		case 2:
			die3.setVisible(true);
			die4.setVisible(true);
			break;
		case 3:
			die3.setVisible(true);
			die4.setVisible(true);
			die7.setVisible(true);
			break;
		case 4:
			die1.setVisible(true);
			die3.setVisible(true);
			die4.setVisible(true);
			die6.setVisible(true);
			break;
		case 5:
			die1.setVisible(true);
			die3.setVisible(true);
			die4.setVisible(true);
			die6.setVisible(true);
			die7.setVisible(true);
			break;
		case 6:
			die1.setVisible(true);
			die2.setVisible(true);
			die3.setVisible(true);
			die4.setVisible(true);
			die5.setVisible(true);
			die6.setVisible(true);
			break;

		default:
			break;
		}
		
		
	}

	//highlight on/off open spots
	private void highlightSpotsOn(int numberRolled){	
		
		int[] openSpots;
		//System.out.println("Number rolled "+numberRolled+" p1 spot: "+player1.currentSpot +" p2 spot: "+player2.currentSpot);
		if(player==1){
			
			if(pastCerulean){
			openSpots = FindSpots.checkSpots(numberRolled, player1.currentSpot, player2.currentSpot, true);
			}
			else{
			openSpots = FindSpots.checkSpots(numberRolled, player1.currentSpot, player2.currentSpot, false);
			}
		}
		else{
			if(pastCerulean){
				openSpots = FindSpots.checkSpots(numberRolled, player2.currentSpot, player1.currentSpot, true);
			}
			else{
				openSpots = FindSpots.checkSpots(numberRolled, player2.currentSpot, player1.currentSpot, false);
			}
		}
		
		for (int i = 0; i < openSpots.length; i++) {
			//System.out.println("open spot: " + openSpots[i]);
			if(players[player].currentSpot != openSpots[i]){
			spots[openSpots[i]].highlight();
			}
		}
		
		
		
	}

	private void hightlightSpotsOff(){
		for (int i = 0; i < spots.length; i++) {
			spots[i].highlightOff();
		}
	}
	
	//receive item number from server deck
	public static void receiveItem(int itemType){
		
		//add indicating integer to itemCard list
		players[player].itemCards.add(itemType);
		
		//TO-DO create and add card to card display
		
	}
		
	//add/remove pokemon from board
	public void addPokemon(int dexNumber, int spotNumber){
		PokeChip pokemon = new PokeChip(dexNumber);
		spots[spotNumber].pokemon = pokemon;	
		pokemon.anchorPane.setLayoutX(spots[spotNumber].getPokeCircle().getLayoutX()-40);
		pokemon.anchorPane.setLayoutY(spots[spotNumber].getPokeCircle().getLayoutY()-40);
		anchorPane.getChildren().add(pokemon.anchorPane);
	}
	
	public void removePokemon(int spotNumber){	
		anchorPane.getChildren().remove(spots[spotNumber].pokemon.anchorPane);
		spots[spotNumber].pokemon = null;
	}
	
	//show/hide pokebelt
	public void showMyPokemon(){
		System.out.println("showing pokemon");
		beltPane.toFront();
		beltPane.setLayoutY(500);
	}
	
	public void hideMyPokemon(){
		beltPane.toBack();
		beltPane.setLayoutY(1000);
	}
	
	
}


