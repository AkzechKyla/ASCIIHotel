public class Player {
    private String name;
    private double money;
    private int currentDay;

    Player(String name, double money, int currentDay) {
        this.name = name;
        this.money = money;
        this.currentDay = currentDay;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getCurrentDay() {
        return currentDay;
    }
}
