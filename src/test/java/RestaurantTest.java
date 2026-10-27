
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {

    @Test
    void testBurgerPriceAndDescription(){
    Priceable burger = new Burger();

    assertEquals(5.50, burger.calculatePrice());
    assertEquals("Burger", burger.getItemDescription());
}

    @Test
    void testFriesPriceAndDescription(){
    Priceable fries = new Fries();

    assertEquals(2.75, fries.calculatePrice());
    assertEquals("Fries", fries.getItemDescription());
}

    @Test
    void testHotdogPriceAndDescription(){
    Priceable hotdog = new Hotdog();

    assertEquals(4.25, hotdog.calculatePrice());
    assertEquals("Hotdog", hotdog.getItemDescription());
}

    @Test
    void testSingleToppingCheese(){
        Priceable burgerWithCheese = new CheeseTopping(new Burger());
        assertEquals(6.5, burgerWithCheese.calculatePrice());
        assertEquals("Burger, Cheese", burgerWithCheese.getItemDescription());
    }

    @Test
    void testSingleToppingOnion(){
        Priceable hotdogWithOnion = new OnionTopping(new Hotdog());
        assertEquals(4.75, hotdogWithOnion.calculatePrice());
        assertEquals("Hotdog, Onion", hotdogWithOnion.getItemDescription());
    }

    @Test
    void testSingleToppingTomato(){
        Priceable friesWithTomato = new TomatoTopping(new Fries());
        assertEquals(3.50, friesWithTomato.calculatePrice());
        assertEquals("Fries, Tomato", friesWithTomato.getItemDescription());
    }

    @Test
    void testMultipleToppings(){
        Priceable fullBurger = new Burger();
        fullBurger = new TomatoTopping(fullBurger);
        fullBurger = new OnionTopping(fullBurger);
        fullBurger = new CheeseTopping(fullBurger);
        assertEquals(7.75, fullBurger.calculatePrice());
    }

    @Test
    void testEmptyOrder(){
        Order emptyOrder = new Order();
        assertEquals(0.0, emptyOrder.calculateOrderTotal());
    }

    @Test
    void testOrderAddItemAndCalculateTotal(){
        Order order = new Order();

        order.addItems(new Hotdog());
        order.addItems(new OnionTopping(new Fries()));

        assertEquals(7.50, order.calculateOrderTotal());
    }

    @Test
    void testPrintOrderSummary(){
        Order order = new Order();

        order.addItems(new CheeseTopping(new Burger()));

        assertDoesNotThrow(order::printOrderSummary);
    }

    @Test
    void testLoyaltyProgramTierName(){
        LoyaltyProgram goldTier = new LoyaltyProgram("Gold", 0.1);
        assertEquals("Gold", goldTier.getTierName());
    }

    @Test
    void testLoyaltyProgramDiscount(){
        LoyaltyProgram diamondTier = new LoyaltyProgram("Diamond", 0.25);
        double totalCost = 10.00;

        double discountedTotal = diamondTier.applyDiscount(totalCost);
        assertEquals(7.5, discountedTotal);
    }

}
