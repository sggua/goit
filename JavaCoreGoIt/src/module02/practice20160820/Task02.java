package module02.practice20160820;


class Task02 {

    private static int countN(int[] arr, int n) {
        int q=0;
        for ( int i: arr ) if (i == n) q++;
        return q;
    }
    public static void main(String[] args) {
        int[] array = {13, 24,46,989,42, 42, 53};
        int n = 42;

        int result=countN(array,n);
        if (result==1)  System.out.println("yes");
        else if (result==0)  System.out.println("no");
        else if (result>1)  System.out.println(result);


    }

}
