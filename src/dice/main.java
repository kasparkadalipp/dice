package dice;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {

		// tõenäosus, et kõik 5 on need, mida tahtsid
		// sama 4, 3, 2, 1 kohta

		// tõenäosus, et kolmest kaks on need, mida tahtsid
		// tõenäosus, et kaks täringut, aga üks neist võib olla emb-kumb

		// kõik asjad, mida saab "kokku võtta" (korduvad koodis), eraldi meetodisse

		// kui aega jääb üle, siis ERALDI KLASS (klass võib klassi sees ka olla) täringu jaoks
		// NB! Täringul on kuus tahku, täringul on nimi või number (nt täring 1, täring 2)
		// vaja läheb ka getter ja setter meetodeid!!! (neid saab lasta eclipsel ka ise genereerida)


		int die1;
		int die2;
		int die3;
		int die4;
		int die5;
		int rounds = 0;
		int luckyRoll = 0;
		double probability;
		int numberOfSides = 6;
		int numberOfTries = 1; // mitu korda võimalus täringuid visata	
		int numberOfDice=5;
		int results[] =  new int[numberOfSides];
//		results[4] = 10;
//		results[0]= 3;
		// vaja näidata kõik võimalused


		for(int counter =0; counter<numberOfDice;counter++){
			die1 = (int)(Math.random()*numberOfSides)+1;
//			results[counter] = die1;	
			results[die1-1]++;
		}
		System.out.println(Arrays.toString(results));

		/*
		for(int counter =0; counter<1000000;counter++){
			die1 = (int)(Math.random()*numberOfSides)+1;
			die2 = (int)(Math.random()*numberOfSides)+1;
			die3 = (int)(Math.random()*numberOfSides)+1;
			die4 = (int)(Math.random()*numberOfSides)+1;
			die5 = (int)(Math.random()*numberOfSides)+1;
			rounds++;
			if(die1 == 6){
				results++;
			}

//			if((numberOfDice==5)&&( die1 == 6 && die2 == 6 && die3 == 6 && die4 == 6 && die5 == 6)){
//				luckyRoll++;
//			}else if((numberOfDice==4)&&( die1 == 6 && die2 == 6 && die3 == 6 && die4 == 6)){ 
//				luckyRoll++;
//			}else if((numberOfDice==3)&&( die1 == 6 && die2 == 6 && die3 == 6)){
//				luckyRoll++;
//			}else if ((numberOfDice==2)&&( die1 == 6 && die2 == 6)){
//				luckyRoll++;
//			}else if ((numberOfDice==1)&&( die1 == 6 )){
//				luckyRoll++;
//			}
//	}
		 */
		// for loop
		luckyRoll*=numberOfTries;
		System.out.println(numberOfDice + " of the same number");
		System.out.print("rounds played " + rounds );
		System.out.println(" rounds won " + luckyRoll);
		System.out.println("probability: " +(double)luckyRoll/rounds*100 + "%" );
	}
}