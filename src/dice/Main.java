
package dice;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		boolean debug = false;
		
		// 25%, EI J�TA M�NDA ALLES KUI KA TULI 2 M�NDA P�RAST ESIMEST VEERETAMIST
		
		// MUL ON OLEMAS 2 �IGET, VEERETAN TEISED UUESTI
		// EHK 3 + 3 T�RINGUT VISATA
		// KUI SAAN �HE M�NNA, SIIS SEDA ALLES EI J�TA, �IGED J�TAN!
		// V�IDU TINGIMUSED:
		// 1) SAAN 2 �IGET
		// 2) SAAN 3 �IGET
		// 3) SAAN 2 M�NDA ja 1 �IGE
		// ehk
		// 1) 1 + 1
		// 2) 1 + 1 + 1
		// 3) 6 + 6 + 1
		
		// MUL ON OLEMAS 2 �IGET, M�ND, VEERETAN TEISED UUESTI
		// EHK 2 + 2 T�RINGUT VISATA
		// KUI SAAN TEISE M�NNA, SIIS SELLE J�TAN KA ALLES JA VEERETAN VIIMAST T�RINGUT ERALDI
		// V�IDU TINGIMUSED:
		// 1) M�ND + �IGE
		// 2) �IGE + �IGE (2 �IGET)
		// ehk
		// 1) 6 + 1
		// 2) 1 + 1
		
		// mida veel kontrollida, 3tk 4st �iged ja 1 m�nd k�es, kas on m�tet m�nda alles j�tta
		
		// parameetrid:
		int sides = 6; // t�ringul on 6 tahku
		int dicesOriginal = 3; // 5 // mitu t�ringut (nii mitme t�ringu kaupa viskan (nt 5 korraga))
		int triesOriginal = 2; // 3 // mitu proovi (e mitu korda v�imalus t�ringuid visata)
		//int goalAmount = 2; // mitu �iget (peab olema k�igist (kas jahin 5t �iget 5st vmt))
		int rolls = 10000000; // viskan t�ringuid miljon korda kokku (per 1 t�ring)
		int series = rolls / (dicesOriginal * triesOriginal); // viskan t�ringut nii mitu seeriat (nt 5 t�ringut korraga)
		int wantNumber = 1;
		int jokerNumber = 6;
		
		// ajutised kohahoidjad:
		int dicesTemp;
		int triesTemp;
		int rollResult = 0; // �he veeretuse tulemus
		int numbers[] = new int[5]; // massiiv t�ringute tulemuse jaoks
//		int alreadyCorrect = 0; // mitu t�ringut olen �igesti juba �ra visanud
		
		// l�pptulemused:
		int totalTimesSuccessful = 0; // mitu korda olin edukas oma �ldeesm�rgi saavutamisel
		
		int jokers;
		int wantNumbers;
		
		// 5te t�ringut viskan nt 60 tuhat korda (miljon total vmt)
		// �ks seeria on n�iteks 3 korda 5 t�ringut visata
		for(int i = 0; i < series; i++){
			if(debug){
				System.out.println();
			}
			// uus viskets�kkel ja numbritel reset, kuna uus katse (5 t�ringut, 3 katset)
			triesTemp = triesOriginal; 
			dicesTemp = dicesOriginal;
//			alreadyCorrect = 0;

			wantNumbers = 0;
			// senikaua viskan kuni visete kordi veel on JA veel on vaja saada �igeid t�ringuid juurde
			//while(triesTemp > 0 && alreadyCorrect < goalAmount){ // NB! &&, muidu timestothrow l�heb negatiivseks kuna pole veel saanud vajaminevaid tulemusi
			while(triesTemp > 0){
				jokers = 0;
				// viskan nii palju t�ringuid �kshaaval kui on t�ringuid ette n�htud (nt 5 asemel 3)
				numbers = new int[dicesTemp]; // hoidik tulemuste jaoks, resetin �ra uute jaoks, pikkus vastab t�ringute arvule
				// reaalne t�ringute viskamine nii palju arv kordi, kui on t�ringuid visata
				for(int j=0;j<dicesTemp;j++){
					rollResult = (int)(Math.random()*sides)+1;
					numbers[j]=rollResult;
				} // for
			
				// kontrollin saadud tulemuste massiivi l�bi, kui on tahetud number, siis l�heb korrektsete sekka
				for(int number : numbers){
					if(number == wantNumber){
						wantNumbers++;
						dicesTemp--; // �he v�rra v�hem saan visata t�ringuid
					}else if(number == jokerNumber){
						jokers++;
					}
				}
				// J�TA M�NNAD ALLES:
				
				// J�TAN �HE M�NNA ALLES // KAHANDAB, HALB!
//				if(jokers == 1){ 
//					dicesTemp--;
//					wantNumbers += 0.5;
//				}
				
//				// J�TAN KAKS M�NDA ALLES KUI ESINEB // HEA
//				if(jokers == 2){ 
//					dicesTemp -= 2;
//					wantNumbers++;
//				}
//				// J�TAN KOLMEST KAKS M�NDA ALLES
//				if(jokers == 3){
//					dicesTemp -= 2;
//					wantNumbers++;
//				}
				
				triesTemp--;
				// kui on �igeid nii palju kui vaja, siis olen olnud edukas
				
				// T��TAV KOODI KONTROLL:
				if(debug)System.out.print("Saan veel visata: " + triesTemp);
				if(debug)System.out.println(" tulemused: " + Arrays.toString(numbers));
				
				if(wantNumbers >= 2){ //((jokers == 2 && wantNumbers == 1) || (wantNumbers >= 2)){
					totalTimesSuccessful++;
					if(debug)System.out.println("SUCCESSFUL! \n");
					break;
				}
			} // END while
		} // for
		
		System.out.println("\nKokku t�ringuid visata: " + rolls + " ja see t�hendab, et on seeriaid: " + series);
		System.out.println(triesOriginal + " viset " + dicesOriginal + " t�ringuga " + totalTimesSuccessful); // ja vaja saada "+ goalAmount +" �iget, tulemus: 
		System.out.println("Percentage: " +  ((double) totalTimesSuccessful / (double) series * 100) + "%");

	}
}



//if (){
//	
//}

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

// t�en�osus, et k�ik 5 on need, mida tahtsid
// sama 4, 3, 2, 1 kohta

// t�en�osus, et kolmest kaks on need, mida tahtsid
// t�en�osus, et kaks t�ringut, aga �ks neist v�ib olla emb-kumb

// k�ik asjad, mida saab "kokku v�tta" (korduvad koodis), eraldi meetodisse

// kui aega j��b �le, siis ERALDI KLASS (klass v�ib klassi sees ka olla) t�ringu jaoks
// NB! T�ringul on kuus tahku, t�ringul on nimi v�i number (nt t�ring 1, t�ring 2)
// vaja l�heb ka getter ja setter meetodeid!!! (neid saab lasta eclipsel ka ise genereerida)




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