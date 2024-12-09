package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;

public class HistoireTP5 {
	private static void scenarioPartie2Question1TP5() {
		// Créer les différents humains :
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shoshu", 60);

		// Les faire se rencontrer :
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);

		// Lister leurs connaissances :
		marco.listerConnaissances();
		roro.listerConnaissances();
		yaku.listerConnaissances();

	}

	private static void scenarioPartie2Question3TP5() {
		// Créer les différents humains :
		Commercant marco = new Commercant("Marco", 20);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);

		// Les faire se rencontrer :
		marco.faireConnaissanceAvec(akimoto);

		// Akimoto choisit de boisire du thé (méthode boire surchargée) :
		akimoto.boire("thé");

		// Lister leurs connaissances :
		akimoto.listerConnaissances();

	}

	public static void main(String[] args) {
		scenarioPartie2Question3TP5();
	}
}
