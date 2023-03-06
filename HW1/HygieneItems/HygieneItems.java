package HW1.HygieneItems;

import HW1.Goods;

public class HygieneItems extends Goods {
    protected int quantityInPack;

    public HygieneItems(String name, double price, double quantity, String unit, int quantityInPack) {
        super(name, price, quantity, unit);
        this.quantityInPack = quantityInPack;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n Количество в упаковке: "+ quantityInPack;
    }
}
