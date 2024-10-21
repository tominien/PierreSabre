package histoire;

import personnages.Humain;

public class HistoireTP4 {
	private static void scenarioPartie1TP4() {
		// Créer le personnage "Prof", de boisson préférée "kombucha" et avec 54 sous en
		// poche :
		Humain prof = new Humain("Prof", "kombucha", 54);

		// Acheter une boisson à 12 sous :
		prof.acheter("boisson", 12);

		// Boire :
		prof.boire();

		// Acheter un jeu à 2 sous :
		prof.acheter("jeu", 2);

		// Essayer d'acheter un kimono à 50 sous :
		prof.acheter("kimono", 50);
	}

	public static void main(String[] args) {
		scenarioPartie1TP4();
	}
}
