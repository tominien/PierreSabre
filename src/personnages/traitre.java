package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}

	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			// Si le traitre a un niveau de traitrise < 3, il ranconne le commerçant :
			int argentCommercant = commercant.getArgent();
			int argentRenconne = argentCommercant * 2 / 10;

			// Mise à jour de l'argent tu traitre et du commerçant :
			commercant.perdreArgent(argentRenconne);
			gagnerArgent(argentRenconne);

			niveauTraitrise++;

			// Dialogue entre le traître et le commerçant :
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRenconne
					+ " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince, je ne peux plus rançonner personne ou un samouraï risque  de me démasquer !");
		}
	}

	public void faireLeGentil() {
		if (nbConnaissances < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			// On tire au hasard un objet humain parmis les connaissances du traitre :
			Random random = new Random();

			Humain ami = memoire[random.nextInt(nbConnaissances)];
			String nomAmi = ami.getNom();

			// Faire un don à notre ami :
			int don = argent * 1 / 20;

			parler("Il faut absolument remonter ma côte de confiance. Je vais faire ami-ami avec " + nomAmi + ".");
			ami.gagnerArgent(don);
			// FINIR --> NON-SAUVEGARDE !
		}
	}
}
