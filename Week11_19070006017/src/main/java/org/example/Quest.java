package org.example;

/**
 * Represents a quest in the universe.
 */
public class Quest {
    /**
     * The type of the quest.
     */
    private String type;

    /**
     * The difficulty level of the quest.
     */
    private int difficultyLevel;

    /**
     * The number of participants in the quest.
     */
    private int participants;

    /**
     * Constructs a quest with the given type, difficulty level, and number of participants.
     *
     * @param type The type of the quest.
     * @param difficultyLevel The difficulty level of the quest.
     * @param participants The number of participants in the quest.
     */
    public Quest(String type, int difficultyLevel, int participants) {
        this.type = type;
        this.difficultyLevel = difficultyLevel;
        this.participants = participants;
    }

    /**
     * Completes the quest based on the given points and whether the character is the ring bearer.
     *
     * @param points The points earned during the quest.
     * @param isRingBearer Indicates whether the character is the ring bearer.
     * @return true if the quest is successfully completed, false otherwise.
     */
    public boolean completeQuest(int points, boolean isRingBearer) {
        // Quest'in tamamlanma durumunu belirleyen koşullar
        boolean isQualified = points > 0 && isRingBearer || points < -100 || points == 42;

        if (points > 50 && points < 100 && points % 2 == 0 && isQualified) {
            System.out.println("Qualified"); // Quest başarılı oldu
            return true;
        } else {
            return false; // Quest başarısız oldu
        }
    }
}
