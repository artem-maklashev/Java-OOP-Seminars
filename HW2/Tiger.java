package HW2;


public class Tiger extends WildAnimal {

    public Tiger() {
    }

    public Tiger(int height, int weight, String eyeColor, String habitat, String dateOfLocation) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
    }

    @Override
    public void voice() {
        System.out.println("Рррррр");;
    }

}