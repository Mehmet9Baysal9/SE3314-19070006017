package org.example;

/**
 * Represents a luxury car that extends the {@link Car} class.
 */
public class LuxuryCar extends Car {
    private boolean hasGPS;
    private boolean hasLeatherSeats;

    /**
     * Constructs a new LuxuryCar object with the specified attributes.
     *
     * @param brand           the brand of the car
     * @param model           the model of the car
     * @param licensePlate    the license plate of the car
     * @param hasGPS          true if the car has GPS, false otherwise
     * @param hasLeatherSeats true if the car has leather seats, false otherwise
     */
    public LuxuryCar(String brand, String model, String licensePlate, boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate, 100);
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
    }

    /**
     * Calculates the rental price for the luxury car based on the rental period.
     *
     * @param rentalDays the number of days the car will be rented
     * @return the total rental price for the luxury car
     */
    @Override
    public double calculateRentalPrice(int rentalDays) {
        double total = getBaseRentalPrice() * rentalDays;
        if (hasGPS) {
            total += 20 * rentalDays;
        }
        if (hasLeatherSeats) {
            total += 30 * rentalDays;
        }
        return total;
    }
}
