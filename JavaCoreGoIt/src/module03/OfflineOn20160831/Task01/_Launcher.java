package module03.OfflineOn20160831.Task01;

public class _Launcher {


    public static void main(String[] args) {
        Worker[] workers = new Worker[100];

        for (int i = 0; i < workers.length; i++) {
            boolean isMan = true;
            if (i % 2 == 0) {
                isMan = false;
            }
            workers[i] = new Worker(isMan,
                    Integer.toString(i) + i + i,
                    Integer.toString(i) + i,
                    i * 3 + 7,
                    "Kyiv",
                    (int) ((double) (i + 1) * (double) (i + 15) * 2.5));
        }


        int total = 0;
        for (Worker worker : workers
                ) {
            int sal = worker.getSalary();
            boolean man = worker.isMan();
            String gender = "";
            total += sal;

            if (man) {
                gender = "Man  ";
            } else {
                gender = "Woman";
            }
            System.out.println(worker.getFirstName() + "\t"+gender+"\t" + sal);
        }
        System.out.println("Total = " + total);
    }
}
