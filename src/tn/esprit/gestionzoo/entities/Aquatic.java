package tn.esprit.gestionzoo.entities;
import java.util.Objects;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }


    //  Prosit 6
    public abstract void swim();
    public abstract float getSwimmingDepth();
    public abstract String getType();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Aquatic other = (Aquatic) obj;

        return Objects.equals(this.getName(), other.getName())
                && this.getAge() == other.getAge()
                && Objects.equals(this.habitat, other.habitat);
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
