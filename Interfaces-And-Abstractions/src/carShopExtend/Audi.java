package carShopExtend;

public class Audi extends CarImpl implements Rentable {
private Integer minRentDay;
private Double pricePerDay;


    public Audi(String model, String color, int horsePower, String countryProduced,
                Integer minRentDay, Double pricePerDAy) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDAy;
    }


    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return  String.format("Minimum rental period of %d days. Price per day %f\n",
                this.getMinRentDay(), this.getPricePerDay());
    }
}
