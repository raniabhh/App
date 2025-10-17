package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal() {
    }
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        setName(name);
        setAge(age);
        this.isMammal = isMammal;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("L'âge ne peut pas être négatif.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setMammal(boolean mammal) {
        this.isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', family='" + family + "', age=" + age +
                ", isMammal=" + isMammal + "}";
    }
}


