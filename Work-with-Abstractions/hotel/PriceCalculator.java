package hotel;

public class PriceCalculator {

   public static double calculateFinalPrice(double pricePerDay, int numberOfDay,
                                            Season season, DiscountType discountType){
       double price = pricePerDay * numberOfDay;
       price = price * season.getMultiplier();
       price = price * (100 - discountType.getDiscountPercent())/ 100.0;
       return price;

   }
}
