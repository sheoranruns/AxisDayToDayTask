import java.util.Scanner;

public class RetailShop implements RetailInterface {

    @Override
    public float getTotalCost(float tax, float cost, float number) {
        float totalcost = (cost*(1+(tax/100)))*number;
        return totalcost;
    }

    @Override
    public float getTotalExtendedCost(float cosmetics, float perfume, float clothes) {
        float totalExtendedCost = cosmetics+perfume+clothes;
        System.out.println("Total cost of all items: " + totalExtendedCost);
        return totalExtendedCost;
    }

    @Override
    public void getDiscountCost(float totalcost) {
        double discountedcost = (totalcost*(0.98));
        System.out.println("Discounted Price is: " + discountedcost);     
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter Quantity of Cosmetics: ");
            float cosmetics = sc.nextFloat();
            System.out.println("Enter Quantity of Perfumes: ");
            float perfume = sc.nextFloat();
            System.out.println("Enter Quantity of Clothes: ");
            float clothes = sc.nextFloat();

            RetailShop s1 = new RetailShop();
            float cost1 = s1.getTotalCost(7, 10000, cosmetics);
            System.out.println("Total Cost of Cosmetics: " + cost1);
            float cost2 = s1.getTotalCost(12, 5000, perfume);
            System.out.println("Total Cost of Cosmetics: " + cost2);
            float cost3 = s1.getTotalCost(4, 7000, clothes);
            System.out.println("Total Cost of Cosmetics: " + cost3);

            float totalcost = s1.getTotalExtendedCost(cost1, cost2, cost3);

            s1.getDiscountCost(totalcost);
        }
    }
    
}
