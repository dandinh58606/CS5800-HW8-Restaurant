public class Hotdog implements Priceable{

    private double basePrice;
    private String itemDescription;

    public Hotdog(){
        basePrice = 4.25;
        itemDescription = "Hotdog";
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
