package client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindSpots {

	static List<Integer> spotList;
	

	
	public static int[] checkSpots(int numberRolled, int currentSpot, int otherPlayersSpot, Boolean pastCerulean){
		
		int stepsLeft = numberRolled;
		spotList = new ArrayList<>();
		
		//if special number do special number needs
		
		//System.out.println("Number Rolled: "+numberRolled+" Current Spot "+currentSpot +" other players spot: "+otherPlayersSpot);
		
		
		if(pastCerulean){
		
			if(currentSpot==0){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			else if(currentSpot==23){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,39);
			}
			else if(currentSpot==31){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,74);
			}
			else if(currentSpot==35){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,38);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,40);
			}
			else if(currentSpot==37){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,67);
	
			}
			else if(currentSpot==38){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,35);
			}
			else if(currentSpot==39){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,23);
			}
			else if(currentSpot==40){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,35);
			}
			else if(currentSpot==43){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,47);
			}
			else if(currentSpot==46){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,48);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,49);
			}
			else if(currentSpot==47){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,43);
			}
			else if(currentSpot==48){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,46);
			}
			else if(currentSpot==49){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,46);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,75);
			}
			else if(currentSpot==58){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,68);
			}
			else if(currentSpot==67){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,37);
			}
			else if(currentSpot==68){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,58);
			}
			else if(currentSpot==73){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			else if(currentSpot==74){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,31);
			}
			else if(currentSpot==75){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,49);
			}
			else{
				checkForward(stepsLeft-1,currentSpot, otherPlayersSpot);
				checkBackward(stepsLeft-1,currentSpot, otherPlayersSpot);
			}
		
		}
		else{
			checkOnlyForward(stepsLeft-1,currentSpot,otherPlayersSpot);
		}

		
		int[] array = new int[spotList.size()];
		Iterator<Integer> iterator = spotList.iterator();
		for (int i = 0; i < array.length; i++) {
			array[i] = iterator.next().intValue();
		}
		return array;
		
		

	}
	
	
	
	public static void checkForward(int stepsLeft, int currentSpot, int otherPlayersSpot){
		int previousSpot = currentSpot;
		currentSpot += 1;
		
		//System.out.println("Steps left: "+stepsLeft+" Current Spot: "+currentSpot +" previous spot: "+previousSpot);

		if(currentSpot==otherPlayersSpot){
			System.out.println("passed by otherplayer");
			spotList.add(currentSpot);
		}
		
		
		if(stepsLeft==0&&currentSpot==otherPlayersSpot){
			stepsLeft=1;
		}
		if(stepsLeft==0){
			
			spotList.add(currentSpot);
		}		
		else if(currentSpot==0){
			
			spotList.add(currentSpot);

		}
		else if(currentSpot==23){
			if(previousSpot!=22){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=24){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=39){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,39);
			}
		}
		else if(currentSpot==31){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=74){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,74);
			}
		}
		else if(currentSpot==35){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=38){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,38);

			}
			if(previousSpot!=40){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,40);

			}
		}
		else if(currentSpot==37){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=67){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,67);
			}
		}
		else if(currentSpot==38){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=35){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,35);
			}
		}
		else if(currentSpot==39){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=23){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,23);
			}
		}
		else if(currentSpot==40){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=35){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,35);
			}
		}
		else if(currentSpot==43){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=47){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,47);
			}
		}
		else if(currentSpot==46){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=48){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,48);
			}
			if(previousSpot!=49){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,49);
			}
		}
		else if(currentSpot==47){
			if(previousSpot!=currentSpot+1){
			checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=43){
			checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,43);
			}
		}
		else if(currentSpot==48){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=46){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,46);
			}
		}
		else if(currentSpot==49){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=46){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,46);
			}
			if(previousSpot!=75){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,75);
			}
		}
		else if(currentSpot==58){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=68){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,68);
			}
		}
		else if(currentSpot==67){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=37){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,37);
			}
		}
		else if(currentSpot==68){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=58){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,58);
			}
		}
		else if(currentSpot==73){
			
			spotList.add(currentSpot);

		}
		else if(currentSpot==74){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=31){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,31);

			}
		}
		else if(currentSpot==75){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=49){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,49);

			}
		}
		else{
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1,currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1,currentSpot, otherPlayersSpot);
			}
		}
		
		
	}
	
	public static void checkBackward(int stepsLeft, int currentSpot, int otherPlayersSpot){
		int previousSpot = currentSpot;
		currentSpot -= 1;
		
		//System.out.println("Steps left: "+stepsLeft+" Current Spot: "+currentSpot +" previous spot: "+previousSpot);

		if(currentSpot==otherPlayersSpot){
			spotList.add(currentSpot);
		}
		
		if(stepsLeft==0&&currentSpot==otherPlayersSpot){
			stepsLeft=1;
		}
		
		if(stepsLeft==0){
			
			spotList.add(currentSpot);

		}
		else if(currentSpot==0){
			
			spotList.add(currentSpot);

		}
		else if(currentSpot==23){
			if(previousSpot!=22){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=24){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=39){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,39);
			}
		}
		else if(currentSpot==31){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=74){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,74);
			}
		}
		else if(currentSpot==35){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=38){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,38);

			}
			if(previousSpot!=40){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,40);

			}
		}
		else if(currentSpot==37){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=67){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,67);
			}
		}
		else if(currentSpot==38){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=35){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,35);
			}
		}
		else if(currentSpot==39){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=23){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,23);
			}
		}
		else if(currentSpot==40){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=35){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,35);
			}
		}
		else if(currentSpot==43){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=47){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,47);
			}
		}
		else if(currentSpot==46){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=48){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,48);
			}
			if(previousSpot!=49){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,49);
			}
		}
		else if(currentSpot==47){
			if(previousSpot!=currentSpot+1){
			checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=43){
			checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,43);
			}
		}
		else if(currentSpot==48){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=46){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,46);
			}
		}
		else if(currentSpot==49){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=46){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,46);
			}
			if(previousSpot!=75){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,75);
			}
		}
		else if(currentSpot==58){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=68){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,68);
			}
		}
		else if(currentSpot==67){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=37){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,37);
			}
		}
		else if(currentSpot==68){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=58){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,58);
			}
		}
		else if(currentSpot==73){
			
			spotList.add(currentSpot);

		}
		else if(currentSpot==74){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=31){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,31);

			}
		}
		else if(currentSpot==75){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=49){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,49);

			}
		}
		else{
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1,currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1,currentSpot, otherPlayersSpot);
			}
		}
	}
	
	public static void checkJump(int stepsLeft, int currentSpot, int otherPlayersSpot, int newSpot){
		
		int previousSpot = currentSpot;
		currentSpot = newSpot;
		
		//System.out.println("Steps left: "+stepsLeft+" Current Spot: "+currentSpot +" previous spot: "+previousSpot);

		if(currentSpot==otherPlayersSpot){
			spotList.add(currentSpot);
		}
		
		if(stepsLeft==0&&currentSpot==otherPlayersSpot){
			stepsLeft=1;
		}
		
		if(stepsLeft==0){
			
			spotList.add(currentSpot);

		}		

		else if(currentSpot==0){
			
			spotList.add(currentSpot);

		}
		else if(currentSpot==23){
			if(previousSpot!=22){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=24){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=39){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,39);
			}
		}
		else if(currentSpot==31){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=74){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,74);
			}
		}
		else if(currentSpot==35){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=38){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,38);

			}
			if(previousSpot!=40){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,40);

			}
		}
		else if(currentSpot==37){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=67){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,67);
			}
		}
		else if(currentSpot==38){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=35){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,35);
			}
		}
		else if(currentSpot==39){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=23){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,23);
			}
		}
		else if(currentSpot==40){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=35){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,35);
			}
		}
		else if(currentSpot==43){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=47){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,47);
			}
		}
		else if(currentSpot==46){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=48){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,48);
			}
			if(previousSpot!=49){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,49);
			}
		}
		else if(currentSpot==47){
			if(previousSpot!=currentSpot+1){
			checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=43){
			checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,43);
			}
		}
		else if(currentSpot==48){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=46){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,46);
			}
		}
		else if(currentSpot==49){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=46){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,46);
			}
			if(previousSpot!=75){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,75);
			}
		}
		else if(currentSpot==58){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=68){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,68);
			}
		}
		else if(currentSpot==67){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=37){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,37);
			}
		}
		else if(currentSpot==68){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=58){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,58);
			}
		}
		else if(currentSpot==73){
			
			spotList.add(currentSpot);

		}
		else if(currentSpot==74){
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=31){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,31);

			}
		}
		else if(currentSpot==75){
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1, currentSpot, otherPlayersSpot);

			}
			if(previousSpot!=49){
				checkJump(stepsLeft-1,currentSpot, otherPlayersSpot,49);
			}
		}
		else{
			if(previousSpot!=currentSpot-1){
				checkBackward(stepsLeft-1,currentSpot, otherPlayersSpot);
			}
			if(previousSpot!=currentSpot+1){
				checkForward(stepsLeft-1,currentSpot, otherPlayersSpot);
			}
		}
	}

	public static void checkOnlyForward(int stepsLeft, int currentSpot, int otherPlayersSpot) {
		
		int previousSpot = currentSpot;
		currentSpot += 1;
		
		//System.out.println("Steps left: "+stepsLeft+" Current Spot: "+currentSpot +" previous spot: "+previousSpot);
		if(stepsLeft==0&&currentSpot==otherPlayersSpot){
			stepsLeft=1;
		}
		if(currentSpot==23){
			checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
			checkJump(stepsLeft-1, currentSpot, otherPlayersSpot, 39);
		}
		else{
			checkForward(stepsLeft-1, currentSpot, otherPlayersSpot);
		}
		
	}	
}
