package HW2;

public abstract class Bird extends Animal {
    protected int flyHight;

    public Bird() {
    }


    protected Bird(int height, int weight, String eyeColor, int flyHight) {
        super(height, weight, eyeColor);
        this.flyHight = flyHight;
    }
    

    @Override
    public String printInfo() {
        return super.printInfo() + ",\n flyHight=" + flyHight;
    }

}
