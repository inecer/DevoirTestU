package Entities.Exo1;

public class Captage implements Comparable
{
    private int idCaptage;
    private String nom;
    private int hauteur;
    private int debitMax;

    public Captage(int idCaptage, String nom, int hauteur, int debitMax) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debitMax = debitMax;
    }

    public int getIdCaptage() {
        return idCaptage;
    }

    @Override
    public int compareTo(Object o) {
        Captage captage = compareTo(Captage);
        return 0;
    }

    public String getDecription() {

        return null;
    }
}
