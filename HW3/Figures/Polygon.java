package HW3.Figures;

import java.util.List;

import HW3.Figure;
import HW3.Figures.Polygones.Perimetr;


public abstract class Polygon extends Figure implements Perimetr {
    protected List<Integer> sides;

    @Override
    public String toString() {
        return (sides == null) ? "Объект не создан" : super.toString() + String.format("стороны %-20s", sides.toString());
    }

    @Override
    public int perimeter() {
        int perimeter = 0;
        for (Integer side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    
}
