import java.util.Scanner;

public class Main_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();;
        s= s.concat(scanner.nextLine());
        String f = scanner.nextLine();

        String imput=sortIntegerArrayInsertion(s.split(""));
        String imput2=sortIntegerArrayInsertion(f.split(""));

        if(imput.compareTo(imput2)==0)System.out.println("YES");
        else System.out.println("NO");

    }

    private static String sortIntegerArrayInsertion(String [] array) {

        for (int rojo = 1; rojo < array.length; rojo++) {
            String valorRojo = array[rojo];
            int verde = rojo-1;
            String valorVerde = array[verde];
            while ( verde > -1 && valorVerde.compareTo(valorRojo)>0){

                array[verde+1]=valorVerde;
                verde--;
                if(verde != -1) valorVerde = array[verde];
            }
            array[verde+1]=valorRojo;
        }

        String out="";
        for(String s : array){
            out+=s;
        }

        return  out;
    }
}


