public class Guest {

    private String name;
    private double pocketMoney;
    private int numberOfNights;


    public Guest(String name, double pocketMoney, int numberOfNights) {
        this.name = name;
        this.pocketMoney = pocketMoney;
        this.numberOfNights = numberOfNights;
    }

    public String getName() {
        return name;
    }

    public double getPocketMoney() {
        return this.pocketMoney;
    }

    public void pay(double nightlyRate) {
        this.pocketMoney -= nightlyRate;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
}
