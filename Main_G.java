import java.util.Scanner;

public class Main_G {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < times; i++) {

            int size = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine();

            String[] imput = scanner.nextLine().split(" ");
            long[] barrels = new long[size];

            for(int e=0; e<imput.length; e++){
                barrels[e]=Long.parseLong(imput[e]);
            }


            barrels=quickSort(barrels, 0, size-1);

            for (int e=0, w=2 ; e<k ; e++ ){
                barrels[size-1]+= barrels[size-w] ;
                w++;
            }

            System.out.println(barrels[size-1]);
        }
    }

    public static long[] quickSort(long[]a, int first, int last){
        long piv = (a[first] + a[last])/2;
        int i = first;
        int j = last;

        while (i<j){
            while (a[i]<piv) i++;
            while (a[j]>piv) j--;
            if(i<=j){
                long x = a[i];
                a[i] = a[j];
                a[j] = x;
                i++;
                j--;
            }
        }
        if(first<j){
            a = quickSort(a, first, j);
        }
        if(last>i){
            a = quickSort(a, i, last);
        }

        return a;
    }

}
