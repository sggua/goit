package module02.practice20160820;

public class Task01 {

    static int balancesSum(int[] ints){
        int sum=0;
        for (int anInt : ints) {
            if (anInt > 1000 && anInt < 5000) {
                sum += anInt;
            }
        }
        return(sum);
    }

    static String[] getOwnerNames (int[] balances, String[] names){
        int len = balances.length;
        int resCount=0;
        String[] result1 =new String[len];
        for (int i=0; i<len ; i++) {
            if (balances[i] > 1000 && balances[i] < 5000) {
                result1[resCount++]=names[i];
            }
        }

        String[] result2 = new String[resCount];
        for (int i=0; i<resCount; i++) {
            result2[i]=result1[i];
        }

        return result2;
    }

    public static void main(String[] args) {
        int variable = 4;

        String [] ownerNames = {"Alex","Bob","Caren","Dude","Eagle","Foo","Gine","Hook","Irene","Joe" };
        int[] balances = {  2341,2305,  1456, 239,456, 5674, 347, 87653,2345,567};
        int[] balances2 = {  20341,205,  2456, 1239,4056, 574, 47, 1653,235,5267};

/////////////////////////////////////////////////////////////
        int sum=0;
        for (int i=0; i<balances.length ; i++) {
            if (balances[i]>1000 && balances[i]<5000) {
                sum+=balances[i];
            }
        }
        System.out.println(sum);
/////////////////////////////////////////////////////////////
        sum=0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        System.out.println(sum);
/////////////////////////////////////////////////////////////

        System.out.println(balancesSum(balances));
        System.out.println(balancesSum(balances2));

/////////////////////////////////////////////////////////////


        for (String n: getOwnerNames(balances, ownerNames) ) {
            System.out.println(n);
        }


    }

}
