package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void swim();
    public abstract float getSwimmingDepth();
    public abstract String getType();

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " mange de la viande dans son habitat " + habitat + ".");
        } else {
            System.out.println(getName() + " ne mange pas de plantes !");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic other = (Aquatic) obj;
        return Objects.equals(getName(), other.getName())
                && getAge() == other.getAge()
                && Objects.equals(habitat, other.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }
}
