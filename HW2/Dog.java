package HW2;



public class Dog extends Pet implements Train {
    private boolean trained;

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public Dog() {
    }

    public Dog(int height, int weight, String eyeColor, String name, String breed, boolean vaccinations, String color,
            String birthday, boolean trained) {
        super(height, weight, eyeColor, name, breed, vaccinations, color, birthday);
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }

    @Override
    public void train() {
        System.out.println("Прохожу курс дрессировки");
    }

    @Override
    public String printInfo() {       
        return super.printInfo() + ",\n trained=" + trained;
    }

    @Override
    public void voice() {
        System.out.println("Гав");
        
    }

    @Override
    public void affection() {
        System.out.println("Я не ласкаюсь, я служу");
    }    
}
