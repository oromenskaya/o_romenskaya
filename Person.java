public class Person {
    private String firstName;
    private String lastName;
    private int weight;
    private int growth;
    private int chamber;

    Person () {
        this.firstName = "Ivan";
        this.lastName = "Ivanov";
        this.weight = 70;
        this.growth = 170;
        this.chamber = 12;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getChamber() {
        return chamber;
    }

    public void setChamber(int chamber) {
        this.chamber = chamber;
    }
}

