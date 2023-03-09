package HW2;



public abstract class Pet extends Animal implements Affection{
    protected String name;
    protected String breed;
    protected boolean vaccinations;
    protected String color;
    protected String birthday;

    

    public Pet() {
    }



    public Pet(int height, int weight, String eyeColor, String name, String breed, boolean vaccinations, String color,
            String birthday) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.color = color;
        this.birthday = birthday;
    }


    @Override
    public String printInfo() {
        
        return super.printInfo()+",\n name=" + name + ",\n breed=" + breed + ",\n vaccinations=" + vaccinations + ",\n color=" + color
                + ",\n birthday=" + birthday;
    }
    @Override
    public void affection() {
        System.out.println("Я и могу ласкаться");
    }
    
}
