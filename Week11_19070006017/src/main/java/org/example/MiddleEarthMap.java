package org.example;

/**
 * Represents a map of Middle Earth for navigation.
 */
public class MiddleEarthMap {

    /**
     * Constructs a MiddleEarthMap object.
     */
    public MiddleEarthMap() {
        // Constructor implementation goes here (if needed)
    }

    /**
     * Navigates to the specified location in Middle Earth.
     *
     * @param location The location to navigate to.
     * @param isSecretPassage Indicates whether to use a secret passage.
     */
    public void navigate(String location, boolean isSecretPassage) {
        // İstenilen lokasyonlar ve özelliklerine göre navigasyon sağlanacak
        if (location.equals("Mordor")) {
            System.out.println("Navigating to Mordor");
            if (isSecretPassage) {
                System.out.println("Taking a secret passage");
            }
        } else if (location.equals("Shire")) {
            System.out.println("Navigating to the Shire");
            // FallThrough violation - Missing break
            // "Shire" lokasyonuna gidildiğinde "Gondor" lokasyonuna da geçilebilir.
            // Bu durumda "Gondor" lokasyonuna da gidilecek.
            System.out.println("Navigating to Gondor");
            return; // "Shire" lokasyonunda işlem sonlandırılıyor.
        } else if (location.equals("Gondor")) {
            System.out.println("Navigating to Gondor");
            return; // "Gondor" lokasyonunda işlem sonlandırılıyor.
        } else if (location.equals("Lothlórien")) {
            System.out.println("Navigating to Lothlórien");
        } else {
            System.out.println("Unknown location");
        }

        // İlave kontroller ve çıktılar
        String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }
}
