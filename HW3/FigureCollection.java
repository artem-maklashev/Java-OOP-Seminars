package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import HW3.Figures.Circule;
import HW3.Figures.Polygones.Rectangle;
import HW3.Figures.Polygones.Square;
import HW3.Figures.Polygones.Triangle;

public class FigureCollection extends Figure implements Comparator<Figure> {
    ArrayList<Figure> figCollection = new ArrayList<>();

    public FigureCollection(ArrayList<Figure> figCollection) {
        this.figCollection = figCollection;
    }

    // public void addFigure(Figure figure) {
    //     figCollection.add(figure);
    // }

    public void deleteFigure(int index) {
        if (index >= 0 && index < figCollection.size()) {
            figCollection.remove(index);
        }
    }

    public void editFigure(int index) {
        if (index >= 0 && index < figCollection.size()) {
            Figure figure = figCollection.get(index);
            if (figure instanceof Triangle) {
                int a = getInt("Введите длину стороны А");
                int b = getInt("Введите длину стороны B");
                int c = getInt("Введите длину стороны C");
                figCollection.set(index, new Triangle(a, b, c));
            } else if (figure instanceof Square) {
                int a = getInt("Введите длину стороны квадрата");
                figure = new Square(a);
                figCollection.set(index, figure);
            } else if (figure instanceof Rectangle) {
                int a = getInt("Введите длину стороны А");
                int b = getInt("Введите длину стороны B");
                figure = new Rectangle(a, b);
                figCollection.set(index, figure);
            } else if (figure instanceof Circule) {
                int radius = getInt("Введите радиус окружности");
                figure = new Circule(radius);
                figCollection.set(index, figure);
            }
        }
    }

    private int getInt(String string) {
        System.out.printf("%s ", string);
        int value = Program.scanner.nextInt();
        return value;
    }

    public void sort() {
        Collections.sort(figCollection);
    }

    public void printFigureCollection() {
        for (Figure figure : figCollection) {
            System.out.println(figure);
        }
    }

    @Override
    public int compare(Figure o1, Figure o2) {
        if (o1.area() > o2.area())
            return 1;
        else if (o1.area() < o2.area())
            return -1;
        else
            return 0;
    }

    @Override
    public double area() {
        double area = 0;
        for (int i = 0; i < figCollection.size(); i++) {
            area += figCollection.get(i).area();
        }
        return area;
    }
}
