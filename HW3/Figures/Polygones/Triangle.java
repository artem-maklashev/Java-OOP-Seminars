package HW3.Figures.Polygones;

import java.util.Arrays;

import HW3.Figures.Polygon;

import java.lang.Math;

public class Triangle extends Polygon {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        // super(new ArrayList<Integer>(0));
        try {
            if (!(a < (b + c) && b < (a + c) && c < (a + b)))
                throw new Exception("Стороны треугольника заданы неверно");
            if (a <= 0 || b <= 0 || c <= 0)
                throw new Exception("Стороны не могут быть меньше или равны 0");
            this.a = a;
            this.b = b;
            this.c = c;
            this.sides=Arrays.asList(a,b,c);
            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2.0;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return  square;
    }

    @Override
    public int perimeter() {        
        return super.perimeter();
    }    
}
