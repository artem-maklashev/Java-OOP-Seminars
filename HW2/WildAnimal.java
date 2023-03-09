package HW2;


public abstract class WildAnimal extends Animal{
    protected String habitat;
    protected String dateOfLocation;
    public WildAnimal() {
    }
    public WildAnimal(int height, int weight, String eyeColor, String habitat, String dateOfLocation) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }
    
}
