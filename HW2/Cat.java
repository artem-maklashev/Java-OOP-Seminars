package HW2;

public class Cat extends Pet {
    private boolean haveFur = true;

    protected void setHaveFur(boolean haveFur) {
        this.haveFur = haveFur;
    }

    public Cat() {
    }

    public Cat(int height, int weight, String eyeColor, String name, String breed, boolean vaccinations, String color,
            String birthday, boolean haveFur) {
        super(height, weight, eyeColor, name, breed, vaccinations, color, birthday);
        this.haveFur = haveFur;
    }

    public boolean isHaveFur() {
        return haveFur;
    }

    @Override
    public void affection() {
        System.out.println("Я ласкаюсь");

    }

    @Override
    public String printInfo() {
        return super.printInfo() + ",\n haveFur=" + haveFur;
    }

    @Override
    public void voice() {
        System.out.println("Мяу");

    }

}
