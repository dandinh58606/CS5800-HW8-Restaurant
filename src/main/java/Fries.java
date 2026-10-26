public class Fries implements Priceable{

    private double basePrice;
    private String itemDescription;

    public Fries(){
        basePrice = 3.0;
        itemDescription = "Fries";
    }

    @Override
    public double calculatePrice(){
        return basePrice;
    }

    @Override
    public String getItemDescription(){
        return itemDescription;
    }

}
