package HW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static Scanner iScanner = new Scanner(System.in);   

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Menu mMenu = new Menu();
        Animal cat = new Cat(20, 7, "Grey", "Barsik", "bobtail", true, "brown", "2/01/2023", true);
        Animal stork = new Stork(30, 7, "grey", 1500);
        Animal dog = new Dog(50, 40, "Коричневые", "Чаппи", "Метис", false, "Рыжий", "5.06.2015", true);
        zoo.animals.add(cat);
        zoo.animals.add(stork);
        zoo.animals.add(dog);
        
        int selection = 1;
        
        mMenu.createMenu(new ArrayList<>(Arrays.asList("Добавить животное", "Убрать животное",
                "Посмотреть информацию по животному", "Воспроизвести звук жмвотного", "Показать всех животных",
                "Все животные издают звук", "Летать", "Ласкаться", "Дрессировать", "Выход")));
        

        while (selection < 10) {
            mMenu.show();
            selection = iScanner.nextInt();
            if (selection > 0) {
                switch (selection) {
                    case 1:
                        zoo.add();
                        break;
                    case 2:
                        zoo.delete();
                        break;
                    case 3:
                        zoo.printInfo();
                        break;
                    case 4:
                        zoo.voice();
                        break;
                    case 5:
                        zoo.printZoo();
                        break;
                    case 6:
                        zoo.chorus();
                        break;
                    case 7:
                        zoo.fly();
                        break;
                    case 8:
                        zoo.affection();
                        break;
                    case 9:
                        zoo.train();
                        break;
                    default:
                        break;
                }
            }

        }
        iScanner.close();
        Zoo.scanner.close();
    }

}
