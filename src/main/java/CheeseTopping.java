public class CheeseTopping extends ToppingDecorator{

    public CheeseTopping(Priceable foodItem){
        super(foodItem);
    }

    @Override
    public double calculatePrice(){
        return tempFoodItem.calculatePrice() + 1.00;
    }

    @Override
    public String getItemDescription() {
        return tempFoodItem.getItemDescription() + ", Cheese";
    }
}
