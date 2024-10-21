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

	public void provoquer(Yakuza adversaire) {
		int forceRonin = honneur * 2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fais à ce pauvre marchant !");

		if (forceRonin >= adversaire.getReputation()) {
			parler("Je t'ai eu petit Yakuza !");
			int argentGagne = adversaire.perdre();
			honneur += 1;
		} else {
			parler("J'ai perdu contre ce Yakuza, mon honneur et ma bourse en ont pris un coup.");
			int argentPerdu = argent;
			perdreArgent(argentPerdu);
			adversaire.gagner(argentPerdu);
			honneur -= 1;
		}
	}
}
