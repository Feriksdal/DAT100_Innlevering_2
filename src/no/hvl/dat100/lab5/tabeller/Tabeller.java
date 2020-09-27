package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("Skrivut: ( ");
		for (int val : tabell) {
			System.out.print(val + " ");
		}
		System.out.println(")");
//		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String utSkr = "[";
		if (tabell.length > 0) {
			for (int i = 0; i < tabell.length - 1; i++) {
				utSkr += (tabell[i] + ",");
			}
			utSkr += (tabell[tabell.length - 1]);
		}
		utSkr += "]";

		return utSkr;

//		throw new UnsupportedOperationException("tilStreng ikke implementert");

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
//
//		for (int val : tabell) {
//			sum += val;
//		}
		
//		for (int i = 0; i < tabell.length; i++) {
//			sum += tabell[i];
//		}
		
		int i = 0;
		while (i  < tabell.length ) {
			sum += tabell[i];
			i++;
		}
		
		
		
		return sum;
		
//		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int val : tabell) {
			if (tall == val) {
				return true;
			}
		}
		return false;
//		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

//		int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;

			}

		}
//		throw new UnsupportedOperationException("posisjonTall ikke implementert");
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] tabRev = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			tabRev[i] = tabell[tabell.length - 1 - i];

		}
		return tabRev;
//		throw new UnsupportedOperationException("reverser ikke implementert");

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++) {

			if (tabell[i] > (tabell[i + 1])) {
				return false;
			}

		}
		return true;
//		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] saman = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			saman[i] = tabell1[i];
		}
		for (int g = 0; g < tabell2.length; g++) {
			saman[tabell1.length + g] = tabell2[g];
		}
		return saman;

//		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
