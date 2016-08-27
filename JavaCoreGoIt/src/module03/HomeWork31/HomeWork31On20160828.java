package module03.HomeWork31;

public class HomeWork31On20160828 {

    private static String newAct(Bird bird, String act) {
        bird.setAct(act);
        return bird.sing();
    }

    public static void main(String[] args) {
        Bird bird = new Bird();

        System.out.println(newAct(bird, "walking"));
        System.out.println(newAct(bird, "flying"));
        System.out.println(newAct(bird, "singing"));
        System.out.println(newAct(bird, "Bird"));

    }
}
