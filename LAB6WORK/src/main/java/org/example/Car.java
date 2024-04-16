package org.example;

/**
 * Represents a generic car.
 */
public abstract class Car {
    private String brand;
    private String model;
    private String licensePlate;
    private double baseRentalPrice;

    /**
     * Constructs a new Car object with the specified attributes.
     *
     * @param brand           the brand of the car
     * @param model           the model of the car
     * @param licensePlate    the license plate of the car
     * @param baseRentalPrice the base rental price of the car
     */
    public Car(String brand, String model, String licensePlate, double baseRentalPrice) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.baseRentalPrice = baseRentalPrice;
    }

    /**
     * Gets the brand of the car.
     *
     * @return the brand of the car
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Gets the model of the car.
     *
     * @return the model of the car
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the license plate of the car.
     *
     * @return the license plate of the car
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Gets the base rental price of the car.
     *
     * @return the base rental price of the car
     */
    public double getBaseRentalPrice() {
        return baseRentalPrice;
    }

    /**
     * Calculates the rental price for the car based on the rental period.
     *
     * @param rentalDays the number of days the car will be rented
     * @return the total rental price for the car
     */
    public abstract double calculateRentalPrice(int rentalDays);
}
