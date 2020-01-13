public enum PlaneType {
    BOEING747(660, 183500),
    BOEING767(375, 17240),
    BOEING777(368,168560);

    private final Integer capacity;
    private final Integer weight;

    private PlaneType(Integer capacity, Integer weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getWeight() {
        return weight;
    }
}
