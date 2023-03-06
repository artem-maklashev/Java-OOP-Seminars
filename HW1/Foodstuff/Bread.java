package HW1.Foodstuff;

import java.util.Calendar;


public class Bread extends Foodstuff{
    private String flour;

    public Bread(String name, double price, double quantity, String unit, Calendar expirationDate, String flour) {
        super(name, price, quantity, unit, expirationDate);
        this.flour = flour;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n Тип муки: " + flour;
    }
}
