package HW1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import HW1.Drinks.Lemonade;
import HW1.Foodstuff.Bread;
import HW1.Foodstuff.Eggs;
import HW1.Foodstuff.Milk;
import HW1.ForChildren.Nappies;
import HW1.ForChildren.Nipple;
import HW1.HygieneItems.Masks;
import HW1.HygieneItems.ToiletPaper;

public class Program {
    public static void main(String[] args) {
        ArrayList<Goods> goods = new ArrayList<>();
        goods.add(new Milk("Домик в деревне", 89.9, 5, "шт", new GregorianCalendar(2023, Calendar.MARCH, 20), 3.2));
        goods.add(new Lemonade("Pepsi", 99.9, 1, "шт", 1.25));
        goods.add(new Bread("Бородинский", 54.99, 10, "шт", new GregorianCalendar(2023, Calendar.MARCH, 10),
                "ржаная/пшеничная"));
        goods.add(new Eggs("Яйца куриные Авдон Деревенские С1,", 75.9, 15, "шт",
                new GregorianCalendar(2023, Calendar.MARCH, 30), 10));
        goods.add(new Masks("Маска для лица CONSLY Darker Than Black Anti Blackheads Mask Sheet", 59.9, 100, "шт", 1));
        goods.add(new ToiletPaper("Zeva Delux", 229, 1, "упаковка", 8, 3));
        goods.add(new Nappies("Подгузники Merries NB", 1999.99, 25, "упаковка", 0,true, 1, 0, 5, 
                "Для мальчиков и девочек"));
        goods.add(new Nipple("Пустышка Ultra Air Lime", 859.99, 1, "упаковка", 0.5, true));
        printGoods(goods);
    }

    static void printGoods(ArrayList<Goods> goods) {
        for (Goods item : goods) {
            System.out.println(item);
        }
    }
}
