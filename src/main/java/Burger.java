public class Burger implements Priceable{

    private double basePrice;
    private String itemDescription;

    public Burger(){
        basePrice = 5.5;
        itemDescription = "Burger";
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
