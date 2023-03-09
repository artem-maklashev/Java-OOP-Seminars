package HW2;


public class Wolf extends WildAnimal {
    private boolean leader;

    public void setLeader(boolean leader) {
        this.leader = leader;
    }

    public Wolf() {
    }

    public Wolf(int height, int weight, String eyeColor, String habitat, String dateOfLocation, boolean leader) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
        this.leader = leader;
    }

    public boolean isLeader() {
        return leader;
    }

    @Override
    public String printInfo() {        
        return super.printInfo() + ",\n leader=" + leader;
    }

    @Override
    public void voice() {
        System.out.println("Уууууууу");        
    } 



}
