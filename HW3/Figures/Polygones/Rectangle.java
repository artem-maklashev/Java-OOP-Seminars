package HW3.Figures.Polygones;

import java.util.Arrays;

import HW3.Figures.Polygon;

public class Rectangle extends Polygon {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        // super(new ArrayList<Integer>(0));
        try {
            if (b <= 0 || a <= 0)
                throw new Exception("Сторона меньше или равна 0");
            // if (a == b)
            //     throw new Exception("Стороны равны. Это квадрат.");
            this.a = a;
            this.b = b;
            this.sides = Arrays.asList(a, b, a, b);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public double area() {
        return a * b;
    }

}