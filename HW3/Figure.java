package HW3;


public abstract class Figure implements Comparable<Figure>{
     

    public abstract double area();
    
    
    @Override
    public String toString() {
        
        return String.format("%-10s ", this.getClass().getSimpleName());//this.getClass().getSimpleName() + String.format(" area: %.2f", area());
    }


    @Override
    public int compareTo(Figure o) {
        if (this.area() > o.area())
            return 1;
        else if (this.area()< o.area())
            return -1;
        else
            return 0;
    }
}
