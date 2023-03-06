package HW1.Foodstuff;

import java.util.Calendar;


public class Milk extends Foodstuff{
    private double fat;
    // private Date expirationDate;

    public Milk(String name, double price, double quantity, String unit, Calendar expirationDate, double fat) {
        super(name, price, quantity, unit, expirationDate);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n Жирность: "+fat;
        // return className + " Название: " + name + ", Цена: " + price + ", Количество: " + quantity + ", Ед.Изм.: "
        //         + unit + ", Срок годности: " + expirationDate.getTime() + ", Жирность: "+fat;
    }
}
