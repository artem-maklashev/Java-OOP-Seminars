package HW1.ForChildren;

public class Nappies extends ForChildren {
    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public Nappies(String name, double price, double quantity, String unit, double minimalAge, boolean isHypoallerhenic,
            int size, int minWeight, int maxWeight, String type) {
        super(name, price, quantity, unit, minimalAge, isHypoallerhenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()
                + ",\n Размер: " + size + ",\n Минимальный вес: " + minWeight + ",\n Максимальный вес: " + maxWeight
                + ",\n Тип: " + type;
    }

}
