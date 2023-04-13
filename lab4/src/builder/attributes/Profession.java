package builder.attributes;

/**
 * Classe enum que representa a profissão do personagem.
 */
public enum Profession {
    WARRIOR, MAGE, ROGUE; // THIEF, PRIEST

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

}