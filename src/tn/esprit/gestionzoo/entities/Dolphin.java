package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() {}

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() { return swimmingSpeed; }
    public void setSwimmingSpeed(float swimmingSpeed) { this.swimmingSpeed = swimmingSpeed; }

    @Override
    public void swim() {
        System.out.println("Ce dauphin nage dans l'océan.");
    }

    @Override
    public float getSwimmingDepth() {
        return 0;
    }

    @Override
    public String getType() {
        return "Dolphin";
    }
    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }
}
