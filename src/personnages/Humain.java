package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	protected int argent;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

	private String prendreParole() {
		return nom + " : ";
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + " !");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix >= 0 && prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix); // Renvoie systématiquement "true" car on a passé la condition "prix >= 0".
		} else {
			parler("je n'ai plus que " + argent + " sous en poche. je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous.");
		}
	}

	protected boolean gagnerArgent(int gain) {
		// Cette méthode renvoie un booléen car le gain doit être un entier positif.
		// Si c'est un entier négatif, on ne met pas à jour argent.
		if (gain >= 0) {
			argent += gain;
			return true;
		}

		return false;
	}

	protected boolean perdreArgent(int perte) {
		// Cette méthode renvoie un booléen car la perte doit être un entier positif.
		// Si c'est un entier négatif, on ne met pas à jour argent.
		if (perte >= 0) {
			argent -= perte;
			return true;
		}

		return false;
	}
}
