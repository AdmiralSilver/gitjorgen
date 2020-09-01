package no.hvl.dat100;

public class Trinnskatt {

	public static void main(String[] args) {

		String tallStreng = javax.swing.JOptionPane.showInputDialog("Brutto lønn?");
		double brutto = Integer.parseInt(tallStreng);
		int trinn1, trinn2, trinn3, trinn4;
		trinn1 = 180800;
		trinn2 = 254500;
		trinn3 = 639750;
		trinn4 = 999550;
		if (brutto < 180800) {
			double skatt = brutto / 100 * 0;
			double netto = brutto - skatt;
			System.out.println("Skattetrinn 0:" + "\nBrutto: " + brutto + "\nSkatt: " + skatt + "\nNetto: " + netto);

		} else {
			if (brutto > 180801 && brutto <= 254500) {
				double skatt = (brutto - trinn1) / 100 * 1.9 + trinn1 / 100 * 0;
				double netto = brutto - skatt;
				System.out
						.println("Skattetrinn 1:" + "\nBrutto: " + brutto + "\nSkatt: " + skatt + "\nNetto: " + netto);
			} else {
				if (brutto > 254500 && brutto <= 639750) {
					double skatt = (brutto - trinn2) / 100 * 4.2 + trinn1 / 100 * 0 + trinn2 / 100 * 1.9;
					double netto = brutto - skatt;
					System.out.println(
							"Skattetrinn 2:" + "\nBrutto: " + brutto + "\nSkatt: " + skatt + "\nNetto: " + netto);
				} else {
					if (brutto > 639750 && brutto <= 999550) {
						double skatt = (brutto - trinn3) / 100 * 13.2 + trinn1 / 100 * 0 + trinn2 / 100 * 1.9
								+ trinn3 / 100 * 4.2;
						double netto = brutto - skatt;
						System.out.println(
								"Skattetrinn 3:" + "\nBrutto: " + brutto + "\nSkatt: " + skatt + "\nNetto: " + netto);
					} else {
						if (brutto > 999550) {
							double skatt = (brutto - trinn4) / 100 * 16.2 + trinn1 / 100 * 0 + trinn2 / 100 * 1.9
									+ trinn3 / 100 * 4.2 + trinn4 / 100 * 13.2;
							double netto = brutto - skatt;
							System.out.println("Skattetrinn 4:" + "\nBrutto: " + brutto + "\nSkatt: " + skatt
									+ "\nNetto: " + netto);

						}
					}
				}
			}

		}

	}

}