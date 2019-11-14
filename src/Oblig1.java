import java.util.Random;

public class Oblig1 {
    private Oblig1() {};

    public static int maks(int[] a){
        if(a.length==0)
            throw new java.util.NoSuchElementException("Tabellen er tom");

        for(int i = 0; i<a.length-1; i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;

            }
        }
        return  a[a.length];
    }

    public static int ombyttinger(int[] a){
        if(a.length==0)
            throw new java.util.NoSuchElementException("Tabellen er tom");

        int teller = 0;
        for(int i = 0; i<a.length-1; i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                teller++;
            }
        }
        return teller;
    }

    public static void bytt(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int[] randPerm(int n){
        int[] a = new int[n];

        for (int i = 0; i<n ; i++) a[i] = i+1;

        Random r = new Random();

        for(int k = n-1 ; k>0 ; k--) {
            int i = r.nextInt(k + 1);
            bytt(a,k,i);
        }
        return a;
    }

}
