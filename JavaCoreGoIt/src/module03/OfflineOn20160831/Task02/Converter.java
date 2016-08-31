package module03.OfflineOn20160831.Task02;


public class Converter {
    private final double rate;

    public Converter() {
        this(1);
    }

    public Converter(double rate) {
        this.rate = rate;
    }

    double uah2Usd(double amount) {
        return (int) (100 * amount / rate) / 100.0;
    }

    double usd2Uah(double amount) {
        return (int) (100 * amount * rate) / 100.0;
    }
}
