package module06.practice20160919;

public abstract class Utils {
    public static String removeChars(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=ch) result+=str.charAt(i);
        }
        return result;
    }


}
