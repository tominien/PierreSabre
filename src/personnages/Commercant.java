package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
		parler("Bonjour ! Je m'appelle " + nom + "et j'aime boire du thé.");
	}

	public int seFaireExtorquer() {
		// Quand le commercant se faire arnaquer, il pert tout son argent.
		int argentPerdu = argent;
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		perdreArgent(argentPerdu);
		return argentPerdu;
	}

	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur !");
		gagnerArgent(argent);
	}
}
