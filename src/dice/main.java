package dice;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int sides = 6; // täringul on 6 tahku
		int dices = 5; // mul on 5 täringut
		int rolls = 5000000; // viskan täringuid miljon korda kokku (per 1 täring)
		int series = rolls / dices; // viskan täringut nii mitu seeriat (nt 5 täringut korraga)
		int rollResult = 0; // ühe veeretuse tulemus
		int numbers[] = new int[5]; // massiiv täringute tulemuse jaoks
		int howManyWantedNumbers = 0; // mitu täringut olen õigesti juba ära visanud
		int tries; // mitu korda võimalus täringuid visata	
		int totalTimesSuccessful = 0; // mitu korda olin edukas oma üldeesmärgi saavutamisel
		
		int howManyOfAll = 1; // mitu õiget peab olema kõigist (kas jahin 5t õiget 5st vmt).
		
		// 5t täringut viskan 200 tuhat korda
		for(int i = 0; i < series; i++){
			// uus visketsükkel ja numbritel reset, kuna uus katse (5 täringut, 3 katset)
			tries = 3; 
			dices = 5;
			// senikaua viskan kuni visete korrad on otsas või pole ühtegi täringut visata
			while(tries > 0 && howManyWantedNumbers < howManyOfAll){ // NB! &&, muidu timestothrow läheb negatiivseks kuna pole veel saanud vajaminevaid tulemusi
				// viskan nii palju täringuid ükshaaval kui on täringuid ette nähtud (nt 5 asemel 3)
				numbers = new int[dices];
				for(int j=0;j<dices;j++){
					rollResult = (int)(Math.random()*sides)+1;
					numbers[j]=rollResult;
				} // for
				for(int wantThisNumber : numbers){
					if(wantThisNumber==4){
						howManyWantedNumbers++;
						dices--;	
					} // if
				} // for
				tries--;
				//System.out.println("timesToThrow " + tries + " result " + result);
				if(howManyWantedNumbers == howManyOfAll){
					totalTimesSuccessful++;
				} // if
			} // END while

			//System.out.print("mitu korda saan veel visata: " + tries );
			//System.out.println(" tulemused: " + Arrays.toString(numbers) );
			howManyWantedNumbers=0;
		} // for
		
		System.out.println("Times reached all 5 of same with 3 throws: " + totalTimesSuccessful);
		System.out.println("Percentage: " +  ((double) totalTimesSuccessful / (double) series * 100) + "%");

	}
}

//int die1;
//int die2;
//int die3;
//int die4;
//int die5;
//int rounds = 0;
//int luckyRoll = 0;
//double probability;

//int want1 = 4;
//int want2 = 4;
//int want3 = 4;
//int want4 = 4;
//int want5 = 4;

// tõenäosus, et kõik 5 on need, mida tahtsid
// sama 4, 3, 2, 1 kohta

// tõenäosus, et kolmest kaks on need, mida tahtsid
// tõenäosus, et kaks täringut, aga üks neist võib olla emb-kumb

// kõik asjad, mida saab "kokku võtta" (korduvad koodis), eraldi meetodisse

// kui aega jääb üle, siis ERALDI KLASS (klass võib klassi sees ka olla) täringu jaoks
// NB! Täringul on kuus tahku, täringul on nimi või number (nt täring 1, täring 2)
// vaja läheb ka getter ja setter meetodeid!!! (neid saab lasta eclipsel ka ise genereerida)




//				System.out.println(Arrays.toString(results));
//			die1 = (int)(Math.random()*numberOfSides)+1;
//			die2 = (int)(Math.random()*numberOfSides)+1;
//			die3 = (int)(Math.random()*numberOfSides)+1;
//			die4 = (int)(Math.random()*numberOfSides)+1;
//			die5 = (int)(Math.random()*numberOfSides)+1;
//			numbers[0]=die1;
//			numbers[1]=die2;
//			numbers[2]=die3;
//			numbers[3]=die4;
//			numbers[4]=die5;






//		int results[] =  new int[numberOfSides];
//		results[4] = 10;
//		results[0]= 3;
// vaja näidata kõik võimalused


//		for(int counter =0; counter<numberOfRolls;counter++){
//			die1 = (int)(Math.random()*numberOfSides)+1;
//			results[counter] = die1;	
//			results[die1-1]++;
//		}
//		System.out.println(Arrays.toString(results));

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

//	if((numberOfDice==5)&&( die1 == 6 && die2 == 6 && die3 == 6 && die4 == 6 && die5 == 6)){
//		luckyRoll++;
//	}else if((numberOfDice==4)&&( die1 == 6 && die2 == 6 && die3 == 6 && die4 == 6)){ 
//		luckyRoll++;
//	}else if((numberOfDice==3)&&( die1 == 6 && die2 == 6 && die3 == 6)){
//		luckyRoll++;
//	}else if ((numberOfDice==2)&&( die1 == 6 && die2 == 6)){
//		luckyRoll++;
//	}else if ((numberOfDice==1)&&( die1 == 6 )){
//		luckyRoll++;
//	}
//}
 */
// for loop
//		luckyRoll*=numberOfTries;
//		System.out.println(numberOfDice + " of the same number");
//		System.out.print("rounds played " + rounds );
//		System.out.println(" rounds won " + luckyRoll);
//		System.out.println("probability: " +(double)luckyRoll/rounds*100 + "%" );