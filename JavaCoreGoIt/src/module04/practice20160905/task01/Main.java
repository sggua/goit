package module04.practice20160905.task01;

public class Main {
    public static void main(String[] args) {
        MoneyConverter moneyConverter = new Calc();

        demonstrate(moneyConverter, 10);
        demonstrate(moneyConverter, 15);
        demonstrate(moneyConverter, 18);
    }

    private static void demonstrate(MoneyConverter moneyConverter, int moneyCount) {
        System.out.println(moneyConverter.convertFromUsd(moneyCount));
    }
}
