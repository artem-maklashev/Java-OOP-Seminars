package HW1.Drinks;

import HW1.Goods;

public class Drinks extends Goods {
    protected double volume;

    public Drinks(String name, double price, double quantity, String unit, double volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+ ",\n Объем: " + volume;
    }
}
