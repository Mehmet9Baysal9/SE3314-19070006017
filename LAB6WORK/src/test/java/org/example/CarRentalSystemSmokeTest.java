package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

import junit.framework.TestCase;

public class CarRentalSystemSmokeTest extends TestCase {
    @Test
    public void testLuxuryCarCreation() {
        LuxuryCar luxuryCar = new LuxuryCar("BMW", "X5", "ABC123", true, true);
        assertNotNull(luxuryCar);
    }

    @Test
    public void testEconomyCarCreation() {
        EconomyCar economyCar = new EconomyCar("Toyota", "Prius", "DEF456", true);
        assertNotNull(economyCar);
    }

    @Test
    public void testLuxuryCarRentalPrice() {
        LuxuryCar luxuryCar = new LuxuryCar("BMW", "X5", "ABC123", true, true);
        assertEquals(270.0, luxuryCar.calculateRentalPrice(3), 0.001);
    }

    @Test
    public void testEconomyCarRentalPrice() {
        EconomyCar economyCar = new EconomyCar("Toyota", "Prius", "DEF456", true);
        assertEquals(80.0, economyCar.calculateRentalPrice(2), 0.001);
    }
}
