public enum LocationType {
    EDINBURGH("EDI"),
    PARIS("PAR"),
    BARCELONA("BAR");

    private final String shortHand;

    private LocationType(String shortHand) {
        this.shortHand = shortHand;
    }

    public String getShortHand(){
        return shortHand;
    }

}
