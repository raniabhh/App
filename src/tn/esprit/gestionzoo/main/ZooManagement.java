package tn.esprit.gestionzoo.main;
import java.util.Scanner;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;


public class ZooManagement {
   // int nbrCages;
    //String zooName;

    public static void main(String[] args) {
//Scanner scanner = new Scanner(System.in);
        //ZooManagement zoo1 = new ZooManagement();
        // ZooManagement zoo2 = new ZooManagement();

//System.out.print("Entrez le nom du premier zoo : ");
        //zoo1.zooName = scanner.nextLine();
       /* while (zoo1.zooName.trim().isEmpty()) {
            System.out.print("Le nom du zoo ne doit pas être vide, réessayez : ");
            zoo1.zooName = scanner.nextLine();
        }

        System.out.print("Entrez le nom du deuxième zoo : ");
        zoo2.zooName = scanner.nextLine();
        while (zoo2.zooName.trim().isEmpty()) {
            System.out.print("Le nom du zoo ne doit pas être vide, réessayez : ");
            zoo2.zooName = scanner.nextLine();
        }

        Zoo myZoo1 = new Zoo(zoo1.zooName, "Tunis");
        Zoo myZoo2 = new Zoo(zoo2.zooName, "Sfax");

        Animal lion = new Animal("Lion", "Lilo", 3, true);
        Animal elephant = new Animal("Éléphant", "Ella", 5, true);
        Animal giraffe = new Animal("Girafe", "Gigi", 4, true);
        Animal lion2 = new Animal("Lion", "Elio", 3, true);

        myZoo1.addAnimal(lion);
        myZoo1.addAnimal(elephant);
        myZoo1.addAnimal(lion2);
        myZoo1.addAnimal(giraffe);

        myZoo2.addAnimal(new Animal("Panda", "Pandi", 2, true));
        myZoo2.addAnimal(new Animal("Kangourou", "Kanga", 4, true));

        System.out.print("Entrez le nom de l’animal à rechercher : ");
        String nameToSearch = scanner.nextLine();
        int index = myZoo1.searchAnimal(new Animal(nameToSearch));
        if (index != -1) {
            System.out.println(" L’animal " + nameToSearch + " a été trouvé à la position " + index + ".");
        } else {
            System.out.println(" L’animal " + nameToSearch + " n’existe pas dans le zoo.");
        }

        myZoo1.displayAnimals();

        System.out.print("Entrez le nom de l’animal à supprimer : ");
        String nameToRemove = scanner.nextLine();
        boolean removed = myZoo1.removeAnimal(nameToRemove);
        if (removed) {
            System.out.println("Voici la liste des animaux restants :");
            myZoo1.displayAnimals();
        }

        if (myZoo1.isZooFull()) {
            System.out.println("Le zoo est plein, impossible d’ajouter de nouveaux animaux !");
        } else {
            System.out.println("Il reste de la place dans le zoo.");
        }

        Zoo zooPlusPeuple = Zoo.comparerZoo(myZoo1, myZoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooPlusPeuple.name + " avec " + zooPlusPeuple.animalCount + " animaux.");

        scanner.close();
    }*/

   Zoo myZoo =new Zoo("Zoo","TUNIS",12) ;
   Animal a1 = new Animal("lions","lolo",2,true) ;
   System.out.println(myZoo.);





    }
}
