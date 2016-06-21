package dice;

public class Other {
/*
package dice;

public class main {
	
	public static void main(String[] args) {
		//	ülesanne: on vaja veeretada täringut väga palju kordi (nt 100 000 korda)
		//	selle käigus pane kirja mitu korda tuli tulemusi 
		// täringu tulemused saavad olla 1-6 ja iga numbri koha väljasta mitu korda tuli)
		// seejärel arvuta välja protsent mitu korda esines iga number täringu viskeid kõigist visetest

		// 1) panen kirja mitu korda veeretan
		// 2) loendan
		// 3) 
		// tõnäolsus 5 täringuga
		// java 1.8 how to random
		
//		int a = 1;
//		int b = 3;
//		int sum = a + b;	
//		System.out.println(sum);
		
		// tõenäosus, et kõik 5 on need, mida tahtsid
		// sama 4, 3, 2, 1 kohta
		
		// tõenäosus, et kolmest kaks on need, mida tahtsid
		// tõenäosus, et kaks täringut, aga üks neist võib olla emb-kumb
		
		// kõik asjad, mida saab "kokku võtta" (korduvad koodis), eraldi meetodisse
		
		// kui aega jääb üle, siis ERALDI KLASS (klass võib klassi sees ka olla) täringu jaoks
		// NB! Täringul on kuus tahku, täringul on nimi või number (nt täring 1, täring 2), vaja läheb ka getter ja setter meetodeid!!! (neid saab lasta eclipsel ka ise genereerida)
		
		
		int numberOfDice = 5;
		int n = 10; // visete arv
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		int a1=0;
		int b1=0;
		int c1=0;
		int d1=0;
		int e1=0;
		int f1=0;
		int a2=0;
		int b2=0;
		int c2=0;
		int d2=0;
		int e2=0;
		int f2=0;
		int a3=0;
		int b3=0;
		int c3=0;
		int d3=0;
		int e3=0;
		int f3=0;
		int a4=0;
		int b4=0;
		int c4=0;
		int d4=0;
		int e4=0;
		int f4=0;
		
		
		for(int g4 = 0; g4<n;g4++){
			int p4 = (int)(Math.random()*6)+1;

			
			if (p4 == 1){
				++a4;
			}else if (p4 == 2){
				++b4;
			}else if (p4 == 3){
				++c4;
			}else if (p4 == 4){
				++d4;
			}else if (p4 == 5){
				++e4;
			}else if (p4 == 6){
				++f4;
			}else{
				System.out.println("");
			}
		}
		for(int g = 0; g<n;g++){
			int p = (int)(Math.random()*6)+1;
//			System.out.println(g);
			
			if (p == 1){
				++a;
			}else if (p == 2){
				++b;
			}else if (p == 3){
				++c;
			}else if (p == 4){
				++d;
			}else if (p == 5){
				++e;
			}else if (p == 6){
				++f;
			}else{
				System.out.println("");
			}
			for(int g1 = 0; g1<n;g1++){
				int p1 = (int)(Math.random()*6)+1;

				
				if (p1 == 1){
					++a1;
				}else if (p1 == 2){
					++b1;
				}else if (p1 == 3){
					++c1;
				}else if (p1 == 4){
					++d1;
				}else if (p1 == 5){
					++e1;
				}else if (p1 == 6){
					++f1;
				}else{
					System.out.println("");
				}
			}for(int g2 = 0; g2<n;g2++){
				int p2 = (int)(Math.random()*6)+1;

				
				if (p2 == 1){
					++a2;
				}else if (p2== 2){
					++b2;
				}else if (p2 == 3){
					++c2;
				}else if (p2 == 4){
					++d2;
				}else if (p2 == 5){
					++e2;
				}else if (p2 == 6){
					++f2;
				}else{
					System.out.println("");
				}
			}for(int g3 = 0; g3<n;g3++){
				int p3 = (int)(Math.random()*6)+1;

				
				if (p3 == 1){
					++a3;
				}else if (p3 == 2){
					++b3;
				}else if (p3 == 3){
					++c3;
				}else if (p3 == 4){
					++d3;
				}else if (p3 == 5){
					++e3;
				}else if (p3 == 6){
					++f3;
				}else{
					System.out.println("");
				}
			}
		}
		System.out.println("täring 1");
		System.out.println("1 " + a +" "+ (double)a/n*100 + "%"); 
		System.out.println("2 " + b +" "+ (double)b/n*100 + "%");
		System.out.println("3 " + c +" "+ (double)c/n*100 + "%");
		System.out.println("4 " + d +" "+ (double)d/n*100 + "%");
		System.out.println("5 " + e +" "+ (double)e/n*100 + "%");
		System.out.println("6 " + f +" "+ (double)f/n*100 + "%");
		System.out.println("");
		System.out.println("täring 2");
		System.out.println("1 " + a1 +" "+ (double)a/n*100 + "%"); 
		System.out.println("2 " + b1 +" "+ (double)b/n*100 + "%");
		System.out.println("3 " + c1 +" "+ (double)c/n*100 + "%");
		System.out.println("4 " + d1 +" "+ (double)d/n*100 + "%");
		System.out.println("5 " + e1 +" "+ (double)e/n*100 + "%");
		System.out.println("6 " + f1 +" "+ (double)f/n*100 + "%");
		System.out.println("");
		System.out.println("täring 3");
		System.out.println("1 " + a2 +" "+ (double)a/n*100 + "%"); 
		System.out.println("2 " + b2 +" "+ (double)b/n*100 + "%");
		System.out.println("3 " + c2+" "+ (double)c/n*100 + "%");
		System.out.println("4 " + d2 +" "+ (double)d/n*100 + "%");
		System.out.println("5 " + e2 +" "+ (double)e/n*100 + "%");
		System.out.println("6 " + f2 +" "+ (double)f/n*100 + "%");
		System.out.println("");
		System.out.println("täring 4");
		System.out.println("1 " + a3 +" "+ (double)a/n*100 + "%"); 
		System.out.println("2 " + b3 +" "+ (double)b/n*100 + "%");
		System.out.println("3 " + c3 +" "+ (double)c/n*100 + "%");
		System.out.println("4 " + d3 +" "+ (double)d/n*100 + "%");
		System.out.println("5 " + e3 +" "+ (double)e/n*100 + "%");
		System.out.println("6 " + f3 +" "+ (double)f/n*100 + "%");
		System.out.println("");
		System.out.println("täring 5");
		System.out.println("1 " + a4 +" "+ (double)a/n*100 + "%"); 
		System.out.println("2 " + b4 +" "+ (double)b/n*100 + "%");
		System.out.println("3 " + c4 +" "+ (double)c/n*100 + "%");
		System.out.println("4 " + d4 +" "+ (double)d/n*100 + "%");
		System.out.println("5 " + e4 +" "+ (double)e/n*100 + "%");
		System.out.println("6 " + f4 +" "+ (double)f/n*100 + "%");
		System.out.println("");
//				add(1, 3);

		
		
//		int counter = 0;
				
		
		
//		int die1 =0;
//		int die2 =0;
		
		
//		while(!(die1==1) && !(die2==1)){
//			 die1 =(int)(Math.random()*6)+1;
//			 die2 =(int)(Math.random()*6)+1;
//			counter++;
//		}
//		System.out.println(counter);
	}
//	public static int die1 (){
//		int h = (int)(Math.random()*6)+1;
//		return h;
//	}
	
//		public static void add(int a, int b){ 
//			System.out.println(a+b);
//		}

}
 */
}
