import java.util.Scanner;

public class Main_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();;
        String d= scanner.nextLine();
        sortIntegerArraySelection(d.split(" "),Integer.parseInt(s));

    }
    private static void sortIntegerArraySelection(String [] array, int sizee){
        boolean prob = false , prob2=false;
        int count=0;

        if(array.length != sizee){
            System.out.println(-1);
            prob2=true;

        }else if (array.length == sizee){

            for(int rojo = 0 ; rojo < array.length-1 && prob2!=true ; rojo++){
                prob=false;
                for (int azul = rojo+1; azul < array.length; azul++){
                    if(array[rojo].compareTo(array[azul]) ==0 && !array[rojo].equals("0") && !array[azul].equals("0") ){

                        if(prob!=true){
                            count++;
                            prob= true;
                        }
                        else {
                            System.out.println(-1);
                            prob2=true;
                            break;
                        }
                    }
                }
            }

            if(prob2==false) {
                System.out.println(count);
            }
        }
    }
}
