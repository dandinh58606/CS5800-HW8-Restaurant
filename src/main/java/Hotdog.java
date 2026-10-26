public class Hotdog implements Priceable{

    private final double basePrice = 4.25;
    private final String itemDescription = "Hotdog";

    @Override
    public double calculatePrice(){
        return basePrice;
    }

    @Override
    public String getItemDescription(){
        return itemDescription;
    }

}
