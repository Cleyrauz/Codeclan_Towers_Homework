public class Guest {

    private String name;
    private double pocketMoney;


    public Guest(String name, double pocketMoney) {
        this.name = name;
        this.pocketMoney = pocketMoney;
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
}
