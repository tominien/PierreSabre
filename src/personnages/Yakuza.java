package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentExtorque = victime.seFaireExtorquer();
		gagnerArgent(argentExtorque);
		reputation += 1;
		parler("J'ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + argent
				+ " sous dans ma poche. Hi ! Hi !");
	}

	public int perdre() {
		int argentPerdu = argent;
		perdreArgent(argentPerdu);
		reputation -= 1;
		parler("J'ai perdu mon duel est mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan " + clan + ".");
		return argentPerdu;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1;
		parler("Ce Ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses "
				+ gain + " sous.");
	}
}
