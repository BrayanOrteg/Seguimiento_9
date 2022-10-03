import java.util.Scanner;

class Main_E {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int times= scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i< times; i++){

            int size = scanner.nextInt();
            scanner.nextLine();

            String[] s = scanner.nextLine().split(" ");
            String[] d= scanner.nextLine().split(" ");

            int[] weights = new int[size];
            int [] jumps= new int [size];
            int out=0;

            for (int e = 0; e < size; e++) {

                weights[e] = Integer.parseInt(s[e]);
                jumps[e] = Integer.parseInt(d[e]);

            }

            if (size==2){

                if(weights[0]==2){
                    if(jumps[0]==1)out=2;
                    else out=1;
                }
            }

            if (size==3){

                int [] first = searchNumber(weights,jumps,1);
                int [] second= searchNumber(weights,jumps,2);
                int [] third= searchNumber(weights,jumps,3);

                while(second[0]<=first[0]){
                    second[0]+=second[1];
                    out++;
                }

                while (third[0]<=second[0]){
                    third[0]+=third[1];
                    out++;
                }
            }

            if (size==4){

                int [] first = searchNumber(weights,jumps,1);
                int [] second= searchNumber(weights,jumps,2);
                int [] third= searchNumber(weights,jumps,3);
                int [] quarter= searchNumber(weights,jumps,4);

                while(second[0]<=first[0]){
                    second[0]+=second[1];
                    out++;
                }

                while (third[0]<=second[0]){
                    third[0]+=third[1];
                    out++;
                }

                while (quarter[0]<=third[0]){
                    quarter[0]+=quarter[1];
                    out++;
                }
            }
            System.out.println(out);
        }
    }
    public static int[] searchNumber(int [] weights, int [] jumps, int n){
        int [] returnet= new int[2];
        for(int i = 0; i< weights.length; i++ ){
            if(weights[i]==n){
                returnet[0]=i;
                returnet[1]=jumps[i];
                break;
            }
        }
        return returnet;
    }
}
