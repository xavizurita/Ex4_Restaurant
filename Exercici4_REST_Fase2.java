import java.util.*;
public class Exercici4_REST_Fase2 {

	public static void main(String[] args) {

		
		int Bill500=0;
		int Bill200=0;
		int Bill100=0;
		int Bill050=0;
		int Bill020=0;
		int Bill010=0;
		int Bill005=0;
		String plats="";
		double totalmenjar=0;
		String menu[] = new String[2];
		double preu[] = new double[2];
		Scanner valor01 = new Scanner(System.in);
		Scanner valor02 = new Scanner(System.in);
		
		
		for (int hh=0; hh<=menu.length-1; hh++) {
			System.out.println("posa el nom del Menú " + hh + " ");
			System.out.print("");
			menu[hh]=valor01.nextLine();
			// System.out.println("El plat triat es: " + menu[0]);
			System.out.println("Preu del plat: ");
			preu[hh]=valor02.nextDouble();
			// System.out.print("El Preu del plat es: " + preu[0]);			
			// System.out.println("");
		}
		System.out.println(" - - Menus y preus introduits - - ");
		System.out.println("");
		
		
		System.out.println(" - -Taula de Menus y preus - - ");
		for (int hh=0; hh<=menu.length-1; hh++) {
			System.out.println("     Menu "+ hh + " -- " + menu[hh] + "  " + preu[hh]  + "€" );	
		}

		List<Integer> comanda = new ArrayList<Integer>();
		int platdemanat=0;
		int resposta = 0;
		boolean finalcomanda = true ;
		Scanner valor03 = new Scanner(System.in);
		Scanner valor04 = new Scanner(System.in);
		
		
		while (finalcomanda) {
			System.out.println("posa el Codi del plat: ");
			platdemanat = valor03.nextInt();
			comanda.add(platdemanat);
			System.out.println("Vols un altre plat: 1 /si   --  2 /no ");
			resposta = valor04.nextInt();
			if (resposta == 2) {
					finalcomanda = false; 
					System.out.println("resposta es: distinto de 2 "+ resposta);
			}
			
		}
		System.out.println(" ");
		System.out.println("--- final de la comanda ---");
		System.out.println(comanda);
		
	}

}
