package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] tab : matrise) {
			for (int verdi : tab) {
				System.out.print(verdi + ",  ");
			}

		}

//		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String saman = "";

		for (int[] tab : matrise) {
			for (int tall : tab) {
				saman += (tall + " ");
			}
			saman += "\n";
		}
		return saman;
//		throw new UnsupportedOperationException("tilStreng ikke implementert");

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nymatr = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {

			nymatr[i] = new int[matrise[i].length];

			for (int j = 0; j < matrise.length; j++) {
				nymatr[i][j] = matrise[i][j] * tall;

			}

		}
		return nymatr;
//		throw new UnsupportedOperationException("skaler ikke implementert");

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;

		for (int i = 0; i < b.length; i++) {
			for (int g = 0; g < b.length; g++) {
				if (a[i][g] != b[i][g]) {
					return !lik;
				}
			}
		}
		return lik;
//		throw new UnsupportedOperationException("erLik ikke implementert");
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] speil = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			speil[i] = new int[matrise[i].length];

			for (int g = 0; g < matrise.length; g++) {
				speil[i][g] = matrise[g][i];
			}

		}
		return speil;
//		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] mult = new int [b.length][];
		
		for (int i = 0; i < b.length; i++) {
			mult[i]= new int [b[i].length];
			for (int g = 0; g < b.length; g++) {
				mult[i][g] = a[i][g]*b[i][g];
			}
		}
		return mult;
//		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
