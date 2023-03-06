package HW1.Foodstuff;

import java.util.Calendar;


public class Eggs extends Foodstuff{
    private int quantityInPack;

    public Eggs(String name, double price, double quantity, String unit, Calendar expirationDate, int quantityInPack) {
        super(name, price, quantity, unit, expirationDate);
        this.quantityInPack = quantityInPack;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n Количество в упаковке: " + quantityInPack;
    }

}
