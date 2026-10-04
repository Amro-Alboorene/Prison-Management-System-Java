public class Guard extends Person {

    private String rank;

    public Guard(String name, int id, int age, String gender, String address, String phoneNumber, String rank) {

        super(name, id, age, gender, address, phoneNumber);
        this.rank = rank;

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRank: " + getRank();
    }
}