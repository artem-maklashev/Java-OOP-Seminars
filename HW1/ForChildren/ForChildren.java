package HW1.ForChildren;

import HW1.Goods;

public class ForChildren extends Goods{
    protected double minimalAge;
    protected boolean isHypoallerhenic;
    public ForChildren(String name, double price, double quantity, String unit, double minimalAge,
            boolean isHypoallerhenic) {
        super(name, price, quantity, unit);
        this.minimalAge = minimalAge;
        this.isHypoallerhenic = isHypoallerhenic;
    }
    
    @Override
    public String toString() {
        return super.toString() + ",\n Минимальный возраст: " + minimalAge + ",\n Гипоаллергенный: " + isHypoallerhenic;
    }
}
