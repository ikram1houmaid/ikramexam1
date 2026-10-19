package ev;



public class Main {
    public static void main(String[] args) {

        Ingenieur i1 = new Ingenieur("I01", "ikram", 500, 4);
        Ingenieur i2 = new Ingenieur("I02", "houmaid", 350, 2);

        Commercial c1 = new Commercial("C01", "aymane", 300, 0.10);
        Commercial c2 = new Commercial("C02", "ay", 400, 0.15);

        Employe[] employes = {i1, i2, c1, c2};

        Projet p1 = new Projet("P01", "Java");
        Projet p2 = new Projet("P02", "Entreprise");

        i2.setSuperieur(i1);
        c1.setSuperieur(i1);
        c2.setSuperieur(c1);

        System.out.println("LISTE DES EMPLOYES");

        for (int i = 0; i < employes.length; i++) {
            employes[i].afficherDetails();

            if (employes[i].getSuperieur() != null) {
                System.out.println("Superieur : "
                    + employes[i].getSuperieur().getNom());
            } else {
                System.out.println("Superieur : Aucun");
            }

            System.out.println("--------------------");
        }

        Mission[] missions = {
            new Mission(i1, p1, 3),
            new Mission(i2, p1, 2),
            new Mission(c1, p2, 4),
            new Mission(c2, p2, 2)
        };
         System.out.println("LES MISSIONS");

        double montantTotal = 0;

        for (int i = 0; i < missions.length; i++) {
            missions[i].afficherRecapitulatif();
            montantTotal += missions[i].calculerMontant();
        }

        System.out.println("Montant total : "+ montantTotal + " DH");

        int compteur = 0;

        for (int i = 0; i < employes.length; i++) {
            if (employes[i].getSuperieur() == i1) {
                compteur++;
            }
        }

        System.out.println(
            "Employes supervises directement par "
            + i1.getNom() + " : " + compteur
        );
    }
}
