package no.hvl.dat100;

public class Nfakultet {

	public static void main(String[] args) {
		for (int l = 0; l < 1; l++) {
			String tall = javax.swing.JOptionPane.showInputDialog("Heltall?");
			int num = Integer.parseInt(tall);
			if (num < 0 || num > 20) {
				// Brukte tall opp til 20 for at hvis du bruker 21 eller høyere vil det gå til minus
				// siden long ikke kan skrive positive tall høyere enn 9223372036854775807, kan dog
				// bruke andre metoder for å skrive større tall. Det vil også være rart å bruke
				// fakultet på større enn 20 fordi man da vil få så ekstremt store tall at man 
				// ikke vil forstå det uansett...
				javax.swing.JOptionPane.showMessageDialog(null, "Venligst skriv inn tall fra 1 til 20!");
				l = l - 1;
			} else {
				long fakultet = 1;
				for (int i = 1; i <= num; ++i) {
					fakultet *= i;
				}
				System.out.println("Fakultet av " + num + " er: " + fakultet);
			}
		}
	}
}