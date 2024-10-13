package flower.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), 
    BLUE("#0000FF"),
    YELLOW("#FFFF00");

    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    public String getColorCode() {
        return stringRepresentation;
    }
}
