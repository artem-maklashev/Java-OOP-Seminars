package HW1.HygieneItems;

public class ToiletPaper extends HygieneItems{
    private int numberOfLayers;

    public ToiletPaper(String name, double price, double quantity, String unit, int quantityInPack,
            int numberOfLayers) {
        super(name, price, quantity, unit, quantityInPack);
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n Количество слоев: " + numberOfLayers;
    }
    
}
