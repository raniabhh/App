package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private final int nbrCages = 3;
    private Animal[] animals;
    private int animalCount = 0;

    //  Prosit 6
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticCount = 0;
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("nom vide!");
        }
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

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println(" Impossible d’ajouter " + animal.getName() + " : le zoo est plein !");
            return false;
        }

        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                System.out.println(" L’animal " + animal.getName() + " existe déjà dans le zoo !");
                return false;
            }
        }

        animals[animalCount] = animal;
        animalCount++;
        System.out.println(" L’animal " + animal.getName() + " a été ajouté avec succès !");
        return true;
    }

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

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                return i;
            }
        }
        return -1;
    }


    public boolean removeAnimal(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }
        return false;
    }


    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }
    // Prosit 6
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount >= aquaticAnimals.length) {
            System.out.println("Impossible d’ajouter " + aquatic.getName() + " : le tableau des animaux aquatiques est plein !");
            return;
        }

        aquaticAnimals[aquaticCount] = aquatic;
        aquaticCount++;
        System.out.println("L’animal aquatique " + aquatic.getName() + " a été ajouté avec succès !");
    }

    //  Prosit 6
    public void displayAquaticSwim() {
        if (aquaticCount == 0) {
            System.out.println("Aucun animal aquatique dans le zoo.");
            return;
        }

        System.out.println(" Les animaux aquatiques nagent ");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;

        if (aquaticAnimals == null) return maxDepth;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null && "Penguin".equals(aquatic.getType())) {
                float depth = aquatic.getSwimmingDepth();
                if (depth > maxDepth)
                    maxDepth = depth;
            }
        }

        return maxDepth;
    }
    // Instruction 30
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                switch (aquatic.getType()) {
                    case "Dolphin":
                        dolphinCount++;
                        break;
                    case "Penguin":
                        penguinCount++;
                        break;
                }
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }




    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + ", animalCount=" + animalCount + "}";
    }
}
