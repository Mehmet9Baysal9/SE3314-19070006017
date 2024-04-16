package org.example;

/**
 * Represents an economy car that extends the {@link Car} class.
 */
public class EconomyCar extends Car {
    private boolean isHybrid;

    /**
     * Constructs a new EconomyCar object with the specified attributes.
     *
     * @param brand        the brand of the car
     * @param model        the model of the car
     * @param licensePlate the license plate of the car
     * @param isHybrid     true if the car is a hybrid, false otherwise
     */
    public EconomyCar(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate, 50);
        this.isHybrid = isHybrid;
    }

    /**
     * Calculates the rental price for the economy car based on the rental period.
     *
     * @param rentalDays the number of days the car will be rented
     * @return the total rental price for the economy car
     */
    @Override
    public double calculateRentalPrice(int rentalDays) {
        double total = getBaseRentalPrice() * rentalDays;
        if (isHybrid) {
            total += 10 * rentalDays;
        }
        return total;
    }
}
