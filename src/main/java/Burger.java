public class Burger implements Priceable{

    private final double basePrice = 5.5;
    private final String itemDescription = "Burger";

    @Override
    public double calculatePrice(){
        return basePrice;
    }

    @Override
    public String getItemDescription(){
        return itemDescription;
    }

}
