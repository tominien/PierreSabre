package personnages;

public class Humain {
	private String nom;
	protected String boissonFavorite;
	protected int argent = 0;
	protected int nbConnaissances = 0;
	protected Humain[] memoire = new Humain[30];

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
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix >= 0 && prix <= argent) {
			perdreArgent(prix); // Renvoie systématiquement "true" car on a passé la condition "prix >= 0".
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
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

	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	private void memoriser(Humain humain) {
		memoire[nbConnaissances % 30] = humain;
		nbConnaissances++;
	}

	public void listerConnaissances() {
		if (nbConnaissances == 0) {
			System.out.println("Je ne connais parsonne...");
		} else {
			String personnes_connues = "";
			int nbConnaissancesActuelles = nbConnaissances % 30; // Afin d'éviter de recalculer nbConnaissances%30 plein
																	// de fois.
			for (int index = 0; index < nbConnaissancesActuelles; index++) {
				personnes_connues += index != nbConnaissancesActuelles - 1 ? memoire[index].getNom() + ", "
						: memoire[index].getNom();
			}
			System.out.println("Je connais beaucoup de monde dont : " + personnes_connues);
		}
	}
}
