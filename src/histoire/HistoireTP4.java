package histoire;

import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {
	private static void scenarioPartie1TP4() {
		// Créer l'humain "Prof", de boisson préférée "kombucha" et avec 54 sous en
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

	private static void scenarioPartie2Question1TP4() {
		// Créer le commerçant "Marco", avec 0 sous en poche.
		Commercant marco = new Commercant("Marco", 0);

		// Se faire extorquer :
		marco.seFaireExtorquer();

		// Recevoir une donation de 15 sous :
		marco.recevoir(15);

		// Boire :
		marco.boire();
	}

	public static void main(String[] args) {
		scenarioPartie2Question1TP4();
	}
}
