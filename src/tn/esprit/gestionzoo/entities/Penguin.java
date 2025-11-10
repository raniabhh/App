package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {}

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    /*
        public float getSwimmingDepth() { return swimmingDepth; }
       */
    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth = swimmingDepth; }

    @Override
    public void swim() {
        System.out.println("Le pingouin nage dans l’eau froide.");
    }

    @Override
    public float getSwimmingDepth() {
        return this.swimmingDepth;
    }

    @Override
    public String getType() {
        return "Penguin";
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
}
