package dice;

public class main {
	// ...
	public static void main(String[] args) {
		//	�lesanne: on vaja veeretada t�ringut v�ga palju kordi (nt 100 000 korda)
		//	selle k�igus pane kirja mitu korda tuli tulemusi 
		// t�ringu tulemused saavad olla 1-6 ja iga numbri koha v�ljasta mitu korda tuli)
		// seej�rel arvuta v�lja protsent mitu korda esines iga number t�ringu viskeid k�igist visetest

		// 1) panen kirja mitu korda veeretan
		// 2) loendan
		// 3) 
		// t�n�olsus 5 t�ringuga
		// java 1.8 how to random
		
//		int a = 1;
//		int b = 3;
//		int sum = a + b;	
//		System.out.println(sum);
		
		int n = 1000000;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		
		for(int counter = 1; counter<n;counter++){
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
				System.out.println("wut");
			}
			
		}
		System.out.println("1 " + a +" "+ (double)a/n*100 + "%"); // a/n*100 + "%"
		System.out.println("2 " + b +" "+ (double)b/n*100 + "%");
		System.out.println("3 " + c +" "+ (double)c/n*100 + "%");
		System.out.println("4 " + d +" "+ (double)d/n*100 + "%");
		System.out.println("5 " + e +" "+ (double)e/n*100 + "%");
		System.out.println("6 " + f +" "+ (double)f/n*100 + "%");
//				add(1, 3);

	}
	public static double pre(int a, int n){
		return a/n*100;
	}
//		public static void add(int a, int b){ 
//			System.out.println(a+b);
//		}
}
