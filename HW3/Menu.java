package HW3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import HW3.Figures.Circule;
import HW3.Figures.Polygon;
import HW3.Figures.Polygones.Perimetr;
import HW3.Figures.Polygones.Rectangle;
import HW3.Figures.Polygones.Square;
import HW3.Figures.Polygones.Triangle;

public class Menu {

    public Map<Integer, String> menu = new HashMap<>();
    // private ArrayList<String> items = new ArrayList<String>() {};

    public void show() {
        System.out.println("Выберите пункт меню");
        for (Map.Entry<Integer, String> entry : menu.entrySet()) {
            System.out.printf("%d - %s\n", entry.getKey(), entry.getValue());
        }
    }

    public void createMenu(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++) {
            this.menu.put(i + 1, items.get(i));
        }
    }

    public String getValue(int key) {
        return this.menu.get(key);
    }

    public void addFigure(ArrayList<Figure> figureList) {
        String[] figures = { "Треугольник", "Квадрат", "Прямоугольник", "Круг" };
        for (int i = 0; i < figures.length; i++) {
            System.out.printf("%d - %s\n", i + 1, figures[i]);
        }
        int selection = Program.scanner.nextInt();
        if (selection == 1) {
            int a = getSide("Введите длину стороны А");
            int b = getSide("Введите длину стороны B");
            int c = getSide("Введите длину стороны C");
            Figure triangle = new Triangle(a, b, c);
            figureList.add(triangle);
        } else if (selection == 2) {
            int a = getSide("Введите длину стороны квадрата");
            figureList.add(new Square(a));
        } else if (selection == 3) {
            int a = getSide("Введите длину стороны А");
            int b = getSide("Введите длину стороны B");
            figureList.add(new Rectangle(a, b));
        } else if (selection == 4) {
            int radius = getSide("Введите радиус окружности");
            figureList.add(new Circule(radius));
        }
    }

    int getSide(String message) {
        System.out.printf("%s ", message);
        int value = Program.scanner.nextInt();
        return value;
    }

    public void takePerimeter(ArrayList<Figure> figureList) {
        System.out.println("************************************");
        System.out.println("Периметр или длина окружности фигур: ");
        for (Figure figure : figureList) {
            if (figure instanceof Perimetr) {
                System.out.printf("Периметр %S -> %d\n", figure, ((Polygon) figure).perimeter());
            }
            if (figure instanceof Circule) {
                System.out.printf("Длина окружности %S -> %.2f\n", figure, ((Circule) figure).circumference());
            }
        }
        System.out.println("************************************");
    }

    public void takeArea(ArrayList<Figure> figureList) {
        System.out.println("**************");
        System.out.println("Площадь фигур: ");
        for (Figure figure : figureList) {
            System.out.printf("%S -> %.2f\n", figure, figure.area());           
        }
        System.out.println("**************");
    }

    public void runMenu(int selection, ArrayList<Figure> figureList) {
        switch (selection) {
            case 1:
                this.addFigure(figureList);
                break;
            case 2:
                this.takePerimeter(figureList);
                break;
            case 3:
                this.takeArea(figureList);

            default:
                break;
        }
    }

    public void runSecondMenu(int selection, FigureCollection fc) {
        switch (selection) {
            case 1:
                fc.printFigureCollection();
                break;
            case 2:                
                this.addFigure(fc.figCollection);
                break;
            case 3:
                int sel = getSide("Введите индекс элемента для удаления");
                fc.deleteFigure(sel);
                break;
            case 4:
                sel = getSide("Введите индекс элемента для редактирования");
                fc.editFigure(sel);
                break;
            case 5:
                fc.sort();
                break;
            default:
                break;
        }
    }
}
