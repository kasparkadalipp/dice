package dice;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {

		// t�en�osus, et k�ik 5 on need, mida tahtsid
		// sama 4, 3, 2, 1 kohta

		// t�en�osus, et kolmest kaks on need, mida tahtsid
		// t�en�osus, et kaks t�ringut, aga �ks neist v�ib olla emb-kumb

		// k�ik asjad, mida saab "kokku v�tta" (korduvad koodis), eraldi meetodisse

		// kui aega j��b �le, siis ERALDI KLASS (klass v�ib klassi sees ka olla) t�ringu jaoks
		// NB! T�ringul on kuus tahku, t�ringul on nimi v�i number (nt t�ring 1, t�ring 2)
		// vaja l�heb ka getter ja setter meetodeid!!! (neid saab lasta eclipsel ka ise genereerida)


		int die1;
		int die2;
		int die3;
		int die4;
		int die5;
		int rounds = 0;
		int luckyRoll = 0;
		double probability;
		int numberOfSides = 6;
		int numberOfTries = 1; // mitu korda v�imalus t�ringuid visata	
		int numberOfDice=5;
		int numberOfRolls = 100;
		int want1 = 4;
		int want2 = 4;
		int want3 = 4;
		int want4 = 4;
		int want5 = 4;
		int numbers[] = new int[5];
		int result =0;
		int timesToThrow;
		int counter = 0; // mitmes vise , mitu "4", mitu t�ringut veeretasin , tulemus

		// 5t t�ringut viskan 200 tuhat korda
		for(int i = 0; i<numberOfRolls/5; i++){
			// uus viskets�kkel
			timesToThrow=3;
			numberOfDice=5;
			// senikaua viskan kuni visete korrad on otsas v�i pole �htegi t�ringut visata
			while(timesToThrow > 0 || result < 5){
				// viskan nii palju t�ringuid �kshaaval kui on t�ringuid ette n�htud (nt 5 asemel 3)
				numbers = new int[numberOfDice];
				for(int j=0;j<numberOfDice;j++){
					die1 = (int)(Math.random()*numberOfSides)+1;
					numbers[j]=die1;
				} // for
				for(int k : numbers){
					if(k==4){
						result++;
						numberOfDice--;	
					} // if
				} // for
				timesToThrow--;
			} // while
			if(result==5){
				counter++;
			} // if
			System.out.print("mitu korda saan veel visata: " + timesToThrow );
			System.out.println(" tulemused: " + Arrays.toString(numbers) );
			result=0;
		} // for
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
		// vaja n�idata k�ik v�imalused


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
		//		luckyRoll*=numberOfTries;
		//		System.out.println(numberOfDice + " of the same number");
		//		System.out.print("rounds played " + rounds );
		//		System.out.println(" rounds won " + luckyRoll);
		//		System.out.println("probability: " +(double)luckyRoll/rounds*100 + "%" );
	}
}