package HW1.Foodstuff;

import java.util.Calendar;
import java.util.GregorianCalendar;

import HW1.Goods;

public class Foodstuff extends Goods{
    protected Calendar expirationDate = new GregorianCalendar();

    public Foodstuff(String name, double price, double quantity, String unit, Calendar expirationDate2) {
        super(name, price, quantity, unit);
        this.expirationDate = expirationDate2;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n Срок годности: " + expirationDate.getTime();
    }
}
