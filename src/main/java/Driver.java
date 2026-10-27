public class Driver {

    public static void main(String[] args){

        Priceable burger1 = new Burger();
        burger1 = new CheeseTopping(burger1);
        burger1 = new OnionTopping(burger1);
        burger1 = new TomatoTopping(burger1);

        Priceable hotdog1 = new Hotdog();
        hotdog1 = new OnionTopping(hotdog1);
        hotdog1 = new CheeseTopping(hotdog1);

        Priceable fries1 = new Fries();
        fries1 = new CheeseTopping(fries1);

        Order order = new Order();
        order.addItems(burger1);
        order.addItems(hotdog1);
        order.addItems(fries1);

        order.printOrderSummary();

        double subTotal = order.calculateOrderTotal();
        System.out.println("Total: $" + subTotal);

        LoyaltyProgram membership = new LoyaltyProgram("gold", 0.1);
        double finalPrice = membership.applyDiscount(subTotal);
        System.out.println("Final Price with Gold membership discount applied: $" + finalPrice);
    }
}

