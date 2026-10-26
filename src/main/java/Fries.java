public class Fries implements Priceable{

    private final double basePrice = 2.75;
    private final String itemDescription = "Fries";

    @Override
    public double calculatePrice(){
        return basePrice;
    }

    @Override
    public String getItemDescription(){
        return itemDescription;
    }

}
