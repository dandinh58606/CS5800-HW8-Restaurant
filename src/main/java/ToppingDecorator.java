public abstract class ToppingDecorator implements Priceable{

    protected Priceable tempFoodItem;

    public ToppingDecorator(Priceable foodItem){
        tempFoodItem = foodItem;
    }

    public double calculatePrice(){
        return tempFoodItem.calculatePrice();
    }

    public String getItemDescription(){
        return tempFoodItem.getItemDescription();
    }

}
