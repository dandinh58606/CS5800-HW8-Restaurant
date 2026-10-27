import java.util.List;
import java.util.ArrayList;

public class Order {

    private List<Priceable> foodItems = new ArrayList<>();

    public void addItems(Priceable newItem){
        foodItems.add(newItem);
    }

    public double calculateOrderTotal() {
        double total = 0.0;
        if(foodItems.isEmpty()){
            return total;
        }
        for(Priceable item: foodItems){
            total += item.calculatePrice();
        }
        return total;
    }

    public void printOrderSummary(){
        for(Priceable item: foodItems){
            System.out.println("- " + item.getItemDescription() + ": $" + item.calculatePrice());
        }
    }
}
