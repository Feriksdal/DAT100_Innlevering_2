package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("Skrivut: (  ");
		for (int val : tabell) {
			System.out.print(val + "  ");
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

		System.out.println(utSkr);
		return utSkr;

//		throw new UnsupportedOperationException("tilStreng ikke implementert");

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {

			sum += tabell[i];

		}
		return sum;
//		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean fins = false;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				fins = true;
			}
		}
		return fins;
//		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				pos = i;
			}

		}
		return pos;
//		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] rev = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			rev[i] = tabell[tabell.length - 1 - i];

		}
		return rev;
//		throw new UnsupportedOperationException("reverser ikke implementert");

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sorted = false;
		// 0 5 8
		// tab0 < tab1
		if (tabell.length <= 1) {
			sorted = true;
			return sorted;
		}
		for (int i = 0; i < tabell.length - 1; i++) {

			if (tabell[i] < (tabell[i + 1])) {
				sorted = true;
			}

		}
		return sorted;
//		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[]saman = new int [tabell1.length + tabell2.length];
		
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
