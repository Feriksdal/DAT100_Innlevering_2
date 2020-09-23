package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] tab : matrise) {
			for (int verdi : tab) {
				System.out.print(verdi + " ");
			}
			System.out.println();
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

		int[][] mir = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			mir[i] = new int[matrise[i].length];

			for (int g = 0; g < matrise.length; g++) {
				mir[i][g] = matrise[g][i];
			}

		}
		return mir;
//		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] c = new int[a.length][];

		for (int i = 0; i < a.length; i++) {
			//lager arrays			
			c[i] = new int[a.length];
			
			//fører verdi inn i arrays
			for (int k = 0; k < a.length; k++) {

				int sum = 0;
				
				//beregner sum til verdi
				for (int g = 0; g < b[i].length; g++) {
					sum += a[i][g] * b[g][k];}
				
				c[i][k] = sum;
			}

		}
		return c;
//		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
