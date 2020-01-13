public class Passenger {
    private String name;
    private Integer numberOfBags;

    public Passenger(String name, Integer bags) {
        this.name = name;
        this.numberOfBags = bags;
    }

    public String getName() {
        return this.name;
    }

    public int getBags() {
        return this.numberOfBags;
    }
}
