package HW3.Figures;

import HW3.Figure;
import HW3.Figures.Circules.Circumference;

public class Circule extends Figure implements 
    Circumference{
    int radius;

    public Circule(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {        
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;

    }
    
    @Override
    public String toString() {
        
        return super.toString() + String.format(" радиус  %d", radius);
    }
    
}
