public class TomatoTopping extends ToppingDecorator{

    public TomatoTopping(Priceable foodItem){
        super(foodItem);
    }

    @Override
    public double calculatePrice(){
        return tempFoodItem.calculatePrice() + 0.75;
    }

    @Override
    public String getItemDescription() {
        return tempFoodItem.getItemDescription() + ", Tomato";
    }
}
