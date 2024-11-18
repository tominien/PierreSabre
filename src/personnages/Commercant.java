package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du thé.");
	}

	public int seFaireExtorquer() {
		// Quand le commercant se faire arnaquer, il pert tout son argent.
		int argentPerdu = argent;
		perdreArgent(argentPerdu);
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return argentPerdu;
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur !");
	}
}
