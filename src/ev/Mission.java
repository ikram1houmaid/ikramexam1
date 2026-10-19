package ev;


public class Mission {
    private Employe employe;
    private Projet projet;
    private int nbJours;

    public Mission(Employe employe, Projet projet, int nbJours) {
        this.employe = employe;
        this.projet = projet;
        this.nbJours = nbJours;
    }

    public double calculerMontant() {
        return employe.calculerCout(nbJours);
    }

    public void afficherRecapitulatif() {
        System.out.println(" Recapitulatif de la mission ");

        employe.afficherDetails();
        System.out.println("Superieur : " +
            (employe.getSuperieur() != null
                ? employe.getSuperieur().getNom()
                : "Aucun"));

        System.out.println("Projet : " + projet);
        System.out.println("Duree : " + nbJours + " jours");
        System.out.println("Montant : " + calculerMontant() + " DH");
    }
}

