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
		
		
		
		int n = 100000;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		int q=0;
		int w=0;
		int y=0;
		int u=0;
		int i=0;
		int o=0;
		
		for(int h = 0; h<n;h++){
			int p = (int)(Math.random()*6)+1;

			
			if (p == 1){
				++q;
			}else if (p == 2){
				++w;
			}else if (p == 3){
				++y;
			}else if (p == 4){
				++u;
			}else if (p == 5){
				++i;
			}else if (p == 6){
				++o;
			}else{
				System.out.println("wut");
			}
		}
		for(int counter = 0; counter<n;counter++){
			int g = (int)(Math.random()*6)+1;
//			System.out.println(g);
			
			if (g == 1){
				++a;
			}else if (g == 2){
				++b;
			}else if (g == 3){
				++c;
			}else if (g == 4){
				++d;
			}else if (g == 5){
				++e;
			}else if (g == 6){
				++f;
			}else{
				System.out.println("");
			}
		
		}
		System.out.println("1 " + a +" "+ (double)a/n*100 + "%"); 
		System.out.println("2 " + b +" "+ (double)b/n*100 + "%");
		System.out.println("3 " + c +" "+ (double)c/n*100 + "%");
		System.out.println("4 " + d +" "+ (double)d/n*100 + "%");
		System.out.println("5 " + e +" "+ (double)e/n*100 + "%");
		System.out.println("6 " + f +" "+ (double)f/n*100 + "%");
		System.out.println("");
		System.out.println("1 " + q +" "+ (double)q/n*100 + "%"); 
		System.out.println("2 " + w +" "+ (double)w/n*100 + "%");
		System.out.println("3 " + y +" "+ (double)y/n*100 + "%");
		System.out.println("4 " + u +" "+ (double)u/n*100 + "%");
		System.out.println("5 " + i +" "+ (double)i/n*100 + "%");
		System.out.println("6 " + o +" "+ (double)o/n*100 + "%");
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