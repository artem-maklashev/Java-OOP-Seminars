package HW2;

public class Stork extends Bird implements Fly {

    public Stork() {
    }

    protected Stork(int height, int weight, String eyeColor, int flyHight) {
        super(height, weight, eyeColor, flyHight);

    }

    @Override
    public void voice() {
        System.out.println("Журавль как то кричит");

    }
    
    @Override
    public void fly() {
        System.out.printf("Я лечу на %d метрах\n", flyHight);
    }

}
