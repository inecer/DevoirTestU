package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    private int longueur;
    private int largeur;

    public Cuve(int idCaptage, String nom, int hauteur, int debitMax, int longueur, int largeur) {
        super(idCaptage, nom, hauteur, debitMax);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public String getDecription() {

        return null;
    }
    public int getVolume() {

        return 0;
    }
}
