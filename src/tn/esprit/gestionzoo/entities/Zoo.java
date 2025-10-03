package tn.esprit.gestionzoo.entities;

public class Zoo {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() == false ) {
            this.name = name;

        }
        else {
                    System.out.println("nom vide!");
            ;}

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    private String name;
    private String city;
    private final int nbrCages=25;
    private Animal[] animals;
    private int animalCount = 0;

    public Zoo(String city, String name, int animalCount) {
        this.city = city;
        this.name = name;
        this.animalCount = animalCount;
    }


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;

    }
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
    /*
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println(" Impossible d’ajouter " + animal.name + " : le zoo est plein !");
            return false;
        }

        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equalsIgnoreCase(animal.name)) {
                System.out.println(" L’animal " + animal.name + " existe déjà dans le zoo !");
                return false;
            }
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println(" L’animal " + animal.name + "a été ajouté avec succès !");
        return true;
    }

     */
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            System.out.println("Animaux du zoo " + name + " :");
            for (int i = 0; i < animalCount; i++) {
                System.out.println("- " + animals[i]);
            }
        }
    }
  /*  public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equalsIgnoreCase(animal.name)) {
                return i;
            }
        }
        return -1;
    }*/
/*
    public boolean removeAnimal(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equalsIgnoreCase(name)) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                System.out.println("L’animal " + name + " a été supprimé du zoo !");
                return true;
            }
        }
        System.out.println(" L’animal " + name + " n’existe pas dans le zoo !");
        return false;
    }
*/
    public boolean isZooFull()
    {
        return animalCount >= nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + ", animalCount=" + animalCount + "}";
    }
}
