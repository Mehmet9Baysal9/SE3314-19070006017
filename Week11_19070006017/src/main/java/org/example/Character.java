package org.example;

/**
 * Represents a character in the universe.
 */
public class Character {
    /**
     * The name of the character.
     */
    private String name;

    /**
     * The race of the character.
     */
    private String race;

    /**
     * The age of the character.
     */
    private int age;

    /**
     * The unique attribute of the character.
     */
    private String uniqueAttribute; // Eklendi: Karakterin benzersiz özelliği

    /**
     * Constructs a character with the given name, race, age, and unique attribute.
     *
     * @param name The name of the character.
     * @param race The race of the character.
     * @param age The age of the character.
     * @param uniqueAttribute The unique attribute of the character.
     */
    public Character(String name, String race, int age, String uniqueAttribute) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.uniqueAttribute = uniqueAttribute;
    }

    /**
     * Prints the details of the character.
     */
    public void printDetails() {
        System.out.println("Character Name: " + name);
        System.out.println("Character Race: " + race);
        System.out.println("Character Age: " + age);
        System.out.println("Character Unique Attribute: " + uniqueAttribute);

        // Eklendi: Karakterin yaşına veya adına bağlı özel durumlar
        if (race.equals("Hobbit")) {
            System.out.println("This character is a Hobbit.");
        }

        if (age >= 50) {
            System.out.println("This character is 50 or older.");
        }

        if (name.equals("Frodo")) {
            System.out.println("This character is Frodo.");
        }
    }
}

