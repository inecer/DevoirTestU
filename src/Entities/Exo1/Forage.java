package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;

    public Forage(int idCaptage, String nom, int hauteur, int debitMax, int diametre) {
        super(idCaptage, nom, hauteur, debitMax);
        this.diametre = diametre;
    }

    public String getDecription() {

        return null;
    }
    public int getVolume() {

        return 0;
    }
}
