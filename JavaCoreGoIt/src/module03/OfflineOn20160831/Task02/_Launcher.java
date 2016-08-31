package module03.OfflineOn20160831.Task02;

public class _Launcher {
    public static void main(String[] args) {
        Converter conv = new Converter(26.51);

        System.out.println("1000 uah \t = \t"+conv.uah2Usd(1300));
        System.out.println("1000 usd \t = \t"+conv.usd2Uah(1300));

    }
}
