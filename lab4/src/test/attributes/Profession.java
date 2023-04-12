package test.attributes;

public enum Profession {
    WARRIOR, MAGE, ROGUE;
    // THIEF, PRIEST

    public int getHealthMultiplier() {
        switch (this) {
            case WARRIOR:
                return 10;
            case MAGE:
                return 8;
            case ROGUE:
                return 9;
            default:
                return 0;
        }
    }
    
    // WARRIOR(20, 10, 5, 0, 5),
    // MAGE(5, 5, 20, 10, 0),
    // ROGUE(10, 15, 10, 0, 10);

    // private int maxHealthPoints;
    // private int maxStrength;
    // private int maxDefense;
    // private int maxIntelligence;
    // private int intelligenceLimit;
    // private int maxDexterity;

    // private Profession(int maxHealthPoints, int maxStrength, int maxDefense, int maxIntelligence, int maxDexterity ) {
    //     this.maxHealthPoints = maxHealthPoints;
    //     this.maxStrength = maxStrength;
    //     this.maxIntelligence = maxIntelligence;
    //     this.intelligenceLimit = maxIntelligence / 2;
    //     this.maxDexterity = maxDexterity;
    // }

    // public int getMaxHealthPoints() {
    //     return maxHealthPoints;
    // }

    // public int getMaxStrength() {
    //     return maxStrength;
    // }

    // public int getMaxDefense() {
    //     return maxDefense;
    // }

    // public int getMaxIntelligence() {
    //     return maxIntelligence;
    // }

    // public int getIntelligenceLimit() {
    //     return intelligenceLimit;
    // }

    // public int getMaxDexterity() {
    //     return maxDexterity;
    // }

    // public static Profession fromString(String profession) {
    //     switch (profession.toLowerCase()) {
    //         case "warrior":
    //             return WARRIOR;
    //         case "mage":
    //             return MAGE;
    //         case "rogue":
    //             return ROGUE;
    //         default:
    //             throw new IllegalArgumentException("Invalid profession: " + profession);
    //     }
    // }
    
    // public int getMaxAttribute(AttributeType attributeType) {
    //     switch (attributeType) {
    //         case HEALTH_POINTS:
    //             return getMaxHealthPoints();
    //         case STRENGTH:
    //             return getMaxStrength();
    //         case DEFENSE:
    //             return getMaxDefense();
    //         case INTELLIGENCE:
    //             return getMaxIntelligence();
    //         case DEXTERITY:
    //             return getMaxDexterity();
    //         default:
    //             throw new IllegalArgumentException("Invalid attribute type: " + attributeType);
    //     }
    // }
}

// 