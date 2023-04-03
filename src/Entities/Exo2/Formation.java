package Entities.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Formation
{
    private int idFormation;
    private String nomFormation;
    private int prixFormation;

    private ArrayList<Participant> lesParticipants;

    public Formation(int idFormation, String nomFormation, int prixFormation) {
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.prixFormation = prixFormation;
        this.lesParticipants = new ArrayList<>();
    }

    public void AjouterParticipant(Participant unParticipant)
    {
        lesParticipants.add(unParticipant);
    }

    // Cette méthode permet de compter le nombre de participants
    // réellement présents à la formation.
    public int GetNombreDePresents(ArrayList<Participant> lesParticipants)
    {
        int nbParticipants = 0;

        for(Participant participant : lesParticipants) {
            if(participant.isEstPresent()) {
                nbParticipants++;
            }
        }

        return 0;
    }

    // Cette méthode permet de calculer le montant total
    // des frais kilométriques versés pour une formation
    // en ne prenant en compte que les participants présents.
    // On rembourse 1.89 du KM
    public double CalculerFraisRemboursementKilometriques(ArrayList<Participant> lesParticipants)
    {
        double tauxDeRemboursement = 1.89;
        double total = 0.0;

        for(Participant participant : lesParticipants) {
            if(participant.isEstPresent()) {
                double fraisKm = participant.getNbKm() * tauxDeRemboursement;
                total = total + fraisKm;
            }
        }

        return total;
    }

    // Cette méthode permet de calculer le taux de présence
    // par rapport au nombre d'inscrits
    public double TauxDePresence(ArrayList<Participant> lesParticipants)
    {
        int nbInscrits = lesParticipants.size();
        int nbPresent = 0;

        for(Participant participant : lesParticipants){
            if(participant.isEstPresent()){
                nbPresent++;
            }
        }


        return (double) nbPresent / nbInscrits * 100.0;
    }

    // Cette méthode permet de calculer le bénéfice de la formation.
    // Ce dernier se détermine en multipliant le nombre de présents par le prix de la formation moins
    // les frais kilométriques versés
    public double BeneficeFormation()
    {
        double total = 0.0;

        for(Participant participant : lesParticipants) {
            boolean present = participant.isEstPresent();
            if(present) {
                int

            }
        }

        return total;
    }
}
