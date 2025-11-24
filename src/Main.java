

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



        //PROSIT 10
        DepartementHashSet dhs = new DepartementHashSet();

        Departement d1 = new Departement(1, "IT", 50);
        Departement d2 = new Departement(2, "Finance", 20);
        Departement d3 = new Departement(3, "RH", 30);

        dhs.ajouterDepartement(d1);
        dhs.ajouterDepartement(d2);
        dhs.ajouterDepartement(d3);

        System.out.println("**Liste des départements :**");
        dhs.displayDepartement();

        System.out.println("**Recherche du département 'IT' :** " + dhs.rechercherDepartement("IT"));

        System.out.println("**Tri par ID :** ");
        for (Departement d : dhs.trierDepartementById()) {
            System.out.println(d);
        }
        //Prosit 11

        AffectationHashMap af = new AffectationHashMap();

        af.ajouterEmployeDepartement(e1, d1);
        af.ajouterEmployeDepartement(e2, d2);
        af.ajouterEmployeDepartement(e3, d3);

        af.ajouterEmployeDepartement(e1, d3);

        System.out.println("** Employés et Départements **");
        af.afficherEmployesEtDepartements();

        af.supprimerEmploye(e2);

        System.out.println("**Après suppression e2 **");
        af.afficherEmployesEtDepartements();

        System.out.println("Recherche e1 : " + af.rechercherEmploye(e1));
        System.out.println("Recherche département RH : " + af.rechercherDepartement(d3));

        System.out.println("** Map triée par ID Employé **");
        System.out.println(af.trierMap());
    }
}

