public class OnionTopping extends ToppingDecorator{

    public OnionTopping(Priceable foodItem){
        super(foodItem);
    }

    @Override
    public double calculatePrice(){
        return tempFoodItem.calculatePrice() + 0.5;
    }

    @Override
    public String getItemDescription() {
        return tempFoodItem.getItemDescription() + ", Onion";
    }
}
