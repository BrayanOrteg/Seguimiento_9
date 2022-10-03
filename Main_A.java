import java.util.Scanner;

public class Main_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();;

        sortIntegerArrayInsertion(s.split("\\+"));



    }

    private static void sortIntegerArrayInsertion(String[] array) {
        String out="";
        for (int rojo = 1; rojo < array.length; rojo++) {
            String valorRojo = array[rojo];
            int verde = rojo - 1;
            String valorVerde = array[verde];
            while (verde > -1 && valorVerde.compareTo(valorRojo) > 0) {


                array[verde + 1] = valorVerde;
                verde--;
                if (verde != -1) valorVerde = array[verde];
            }
            array[verde + 1] = valorRojo;

        }
        for (String s : array) {
            if (s == array[array.length - 1]) out += s;
            else out += s + "+";
        }
        System.out.println(out);
    }
}
