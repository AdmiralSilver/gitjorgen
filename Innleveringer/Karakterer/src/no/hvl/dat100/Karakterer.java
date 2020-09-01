package no.hvl.dat100;

public class Karakterer {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String tallStreng = javax.swing.JOptionPane.showInputDialog("Poengsum?");
			double poeng = Double.parseDouble(tallStreng);
			if (poeng < 0 || poeng > 100) {
				javax.swing.JOptionPane.showMessageDialog(null, "Error!" + "\nSkriv inn en lovlig poengsum");
				i = i - 1;

			} else {
				if (poeng <= 100 && poeng >= 90) {
					System.out.println("Poengsum: " + poeng + " tilsvarer karakteren A");

				} else {
					if (poeng < 90 && poeng >= 80) {
						System.out.println("Poengsum: " + poeng + " tilsvarer karakteren B");

					} else {
						if (poeng < 80 && poeng >= 60) {
							System.out.println("Poengsum: " + poeng + " tilsvarer karakteren C");

						} else {
							if (poeng < 60 && poeng >= 50) {
								System.out.println("Poengsum: " + poeng + " tilsvarer karakteren D");

							} else {
								if (poeng < 50 && poeng >= 40) {
									System.out.println("Poengsum: " + poeng + " tilsvarer karakteren E");

								} else {
									if (poeng < 40 && poeng >= 0) {
										System.out.println("Poengsum: " + poeng + " tilsvarer karakteren F");

									}

								}
							}
						}

					}
				}
			}
		}
	}

}
