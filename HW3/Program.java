package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import HW3.Figures.Circule;
import HW3.Figures.Polygones.Rectangle;
import HW3.Figures.Polygones.Square;
import HW3.Figures.Polygones.Triangle;

public class Program {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Figure> figureList = new ArrayList<>(
                Arrays.asList(new Triangle(8, 12, 14), new Rectangle(5, 6), new Square(60), new Circule(10)));
        Menu mMenu = new Menu();
        ArrayList<String> mMenuItems = new ArrayList<>(
                Arrays.asList("Добавить фигуру", "Посчитать периметр всех фигур", "Посчитать площадь всех фигур",
                        "Выход"));
        mMenu.createMenu(mMenuItems);
        int selection = 1;
        while (selection < 4) {
            mMenu.show();
            selection = scanner.nextInt();
            if (selection > 0) {
                mMenu.runMenu(selection, figureList);
            }
        }

        FigureCollection fc = new FigureCollection(figureList);
        Menu secondMenu = new Menu();
        secondMenu.createMenu(new ArrayList<>(
                Arrays.asList("Показать фигуры", "Добавить фигуру", "Удалить фигуру",
                        "Изменить фигуру", "Отсортировать", "Выход")));
        selection = 1;
        while (selection < 6) {
            secondMenu.show();
            selection = scanner.nextInt();
            if (selection > 0) {
                secondMenu.runSecondMenu(selection, fc);
            }
        }        
        System.out.println("Конец программы");
        scanner.close();
    }
}
