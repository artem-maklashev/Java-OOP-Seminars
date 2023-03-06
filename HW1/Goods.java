package HW1;
public class Goods {

    protected String name;
    protected double price;
    protected double quantity;
    protected String unit;
    protected String className = this.getClass().getName();

    public Goods(String name, double price, double quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return className +"\n Название: " + name + ",\n Цена: " + price + ",\n Количество: " + quantity + ",\n Ед.Изм.: " + unit ;
    }
    
}
