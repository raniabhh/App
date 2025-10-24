package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Zoo myZoo1 = new Zoo("Zoo 1", "Tunis");
        Zoo myZoo2 = new Zoo("Zoo 2", "Sousse");

        System.out.print("Entrez le nom du premier zoo : ");
        String zoo1Name = scanner.nextLine();
        while (zoo1Name.trim().isEmpty()) {
            System.out.print("Le nom du zoo ne doit pas être vide, réessayez : ");
            zoo1Name = scanner.nextLine();
        }

        System.out.print("Entrez le nom du deuxième zoo : ");
        String zoo2Name = scanner.nextLine();
        while (zoo2Name.trim().isEmpty()) {
            System.out.print("Le nom du zoo ne doit pas être vide, réessayez : ");
            zoo2Name = scanner.nextLine();
        }

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

        Zoo[] zoos = {myZoo1, myZoo2};

        System.out.print("Entrez le nom de l’animal à rechercher : ");
        String nameToSearch = scanner.nextLine();
        boolean found = false;

        for (Zoo zoo : zoos) {
            int index = zoo.searchAnimal(new Animal(nameToSearch));
            if (index != -1) {
                System.out.println("L’animal " + nameToSearch + " a été trouvé dans le zoo " + zoo.getName() +
                        " à la position " + index + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("L’animal " + nameToSearch + " n’existe dans aucun zoo.");
        }

        System.out.print("Entrez le nom de l’animal à supprimer : ");
        String nameToRemove = scanner.nextLine();
        boolean removed = false;

        for (Zoo zoo : zoos) {
            if (zoo.removeAnimal(nameToRemove)) {
                System.out.println("L’animal " + nameToRemove + " a été supprimé du zoo " + zoo.getName() + " !");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("L’animal " + nameToRemove + " n’existe dans aucun zoo !");
        }

        for (Zoo zoo : zoos) {
            if (zoo.isZooFull()) {
                System.out.println("Le zoo " + zoo.getName() + " est plein.");
            } else {
                System.out.println("Il reste de la place dans le zoo " + zoo.getName() + ".");
            }
        }


        Zoo zooPlusPeuple = Zoo.comparerZoo(myZoo1, myZoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooPlusPeuple.getName() +
                " avec " + zooPlusPeuple.getAnimalCount() + " animaux.");


        Zoo myZoo = new Zoo("Zoo", "Tunis");
        myZoo.setName("Zoo National");
        myZoo.setCity("Tunis");


        /* PROSIT 5*/

/*
        Aquatic aquatic = new Aquatic();
        aquatic.setName("Nemo");
        aquatic.setAge(3);
        aquatic.setFamily("Aquatic");
        aquatic.setMammal(false);
        aquatic.setHabitat("Océan");
*/
        Terrestrial terrestrial = new Terrestrial();
        terrestrial.setName("Terro");
        terrestrial.setAge(4);
        terrestrial.setFamily("Terrestrial");
        terrestrial.setMammal(true);
        terrestrial.setNbrLegs(4);

        Dolphin dolphin = new Dolphin();
        dolphin.setName("Flipper");
        dolphin.setAge(5);
        dolphin.setFamily("Dolphin");
        dolphin.setMammal(true);
        dolphin.setHabitat("Mer");
        dolphin.setSwimmingSpeed(25.5f);
        dolphin.swim();

        Penguin penguin = new Penguin();
        penguin.setName("Pingu");
        penguin.setAge(2);
        penguin.setFamily("Penguin");
        penguin.setMammal(false);
        penguin.setHabitat("Antarctique");
        penguin.setSwimmingDepth(30.0f);
        penguin.swim();

        /* System.out.println(aquatic);*/
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        /* aquatic.swim(); */

        //  Instruction 26 :
        /* myZoo.addAquaticAnimal(aquatic);*/
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
        // Instruction 27 :
        myZoo.displayAquaticSwim();
        System.out.println("Profondeur maximale des pingouins : " + myZoo.maxPenguinSwimmingDepth());
        // Instruction 30
        myZoo.displayNumberOfAquaticsByType();

        scanner.close();
    }

}
