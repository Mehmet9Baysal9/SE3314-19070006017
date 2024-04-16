package org.example;

/**
 * Main
 *
 */
public class App
{
    public static void main(String[] args) {

        LuxuryCar luxuryCar = new LuxuryCar("BMW", "X5", "ABC123", true, true);
        EconomyCar economyCar = new EconomyCar("Toyota", "Prius", "DEF456", true);

        System.out.println("Luxury Car rental price for 3 days: $" + luxuryCar.calculateRentalPrice(3));
        System.out.println("Economy Car rental price for 5 days: $" + economyCar.calculateRentalPrice(5));
    }
}
