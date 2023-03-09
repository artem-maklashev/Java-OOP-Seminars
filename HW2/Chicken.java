package HW2;

public class Chicken extends Bird {

    public Chicken() {
    }

    public Chicken(int height, int weight, String eyeColor, int flyHight) {
        super(height, weight, eyeColor, flyHight);
    }

    
    @Override
    public void voice() {
        System.out.println("Ко-ко-ко");
        
    }   
    
}
