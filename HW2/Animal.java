package HW2;


public abstract class Animal {
    
    protected int height;
    protected int weight;
    protected String eyeColor;

    public Animal() {
    }

    public Animal(int height, int weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public abstract void voice();

    public String printInfo() {
        return this.getClass().getSimpleName()+"\n height=" + height + ",\n weight=" + weight + ",\n eyeColor=" + eyeColor ;
    }

    
}
