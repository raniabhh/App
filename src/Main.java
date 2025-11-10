

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Bhh", "Rania", "IT", 5);
        Employe e2 = new Employe(2, "Ben Ali", "Youssef", "RH", 3);
        Employe e3 = new Employe(3, "Trabelsi", "Jihen", "IT", 4);
        Employe e4 = new Employe(4, "Ouni", "Sami", "Finance", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("** Liste initiale des employés :**");
        societe.displayEmploye();

        System.out.println(" ** Recherche par nom 'Rania' : ** " + societe.rechercherEmploye("Rania"));
        System.out.println(" ** Recherche par objet e1:** " + societe.rechercherEmploye(e2));

        System.out.println(" **Suppression de e4** ");
        societe.supprimerEmploye(e4);

        System.out.println(" ** Liste après suppression :**");
        societe.displayEmploye();

        System.out.println(" ** Tri par ID :**");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println(" ** Tri par Département et Grade :**");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
