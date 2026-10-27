public class LoyaltyProgram {
    private String tierName;
    private double discountPercentage;

    public LoyaltyProgram(String name, double percentage){
        tierName = name;
        discountPercentage = percentage;
    }

    public double applyDiscount(double totalCost){
        double discount = totalCost * discountPercentage;
        return totalCost - discount;
    }

    public String getTierName(){
        return tierName;
    }
}
