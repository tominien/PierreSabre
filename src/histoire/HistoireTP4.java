package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	private static void scenarioPartie1TP4() {
		// Créer l'humain "Prof", de boisson préférée "kombucha" et avec 54 sous en
		// poche :
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();

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
		// Créer le commerçant "Marco", avec 15 sous en poche.
		Commercant marco = new Commercant("Marco", 15);
		marco.direBonjour();

		// Se faire extorquer :
		marco.seFaireExtorquer();

		// Recevoir une donation de 15 sous :
		marco.recevoir(15);

		// Boire :
		marco.boire();
	}

	private static void scenarioPartie2Question2TP4() {
		// Créer le Yakuza "Yaku Le Noir", de boisson préférée "whisky" et avec 30 sous
		// en poche :
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();

		// Créer le commerçant "Marco", avec 15 sous en poche.
		Commercant marco = new Commercant("Marco", 15);

		// Extorquer Marco :
		yaku.extorquer(marco);
	}

	public static void main(String[] args) {
		scenarioPartie2Question2TP4();
	}
}
