package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public void donner(Commercant beneficiaire) {
		int montantDonne = argent / 10;
		perdreArgent(montantDonne);
		honneur += 1;
		parler(beneficiaire.getNom() + ", prends ces 6 sous.");
		beneficiaire.recevoir(montantDonne);
	}
}
