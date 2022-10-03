import java.util.Scanner;
class Main_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String T = scanner.nextLine();

        for(int e=0; e < Integer.parseInt(T); e++) {

            int diferencia=0;
            String [] nkString=scanner.nextLine().split(" ");
            String [] objectString=scanner.nextLine().split(" ");
            int [] nk=new int[2];

            for(int i= 0; i<nkString.length;i++) {
                nk[i]=Integer.parseInt(nkString[i]);
            }

            int [] objects = new int[nk[0]];


            for (int i=0; i<nk[0]; i++){
                objects [i]= Integer.parseInt(objectString[i]);
            }

            objects=sortIntegerArrayInsertion(objects);

            if(nk[1] <= nk[0]-nk[1]) {

                for (int i = 0; i < nk[0]; i++) {
                    if (i < nk[1]) diferencia -= objects[i];
                    else diferencia += objects[i];
                }
            }else if (nk[1] > nk[0]-nk[1]){
                for (int i = 0; i < nk[0]; i++) {
                    if (i < nk[0]-nk[1]) diferencia -= objects[i];
                    else diferencia += objects[i];
                }
            }
            System.out.println(diferencia);
        }

    }

    private static int [] sortIntegerArrayInsertion(int [] array) {
        for (int rojo = 1; rojo < array.length; rojo++) {
            int valorRojo = array[rojo];
            int verde = rojo-1;
            int valorVerde = array[verde];
            while ( verde > -1 && valorVerde>valorRojo ) {


                array[verde+1]=valorVerde;
                verde--;
                if(verde != -1) valorVerde = array[verde];
            }
            array[verde+1]=valorRojo;

        }
        return array;
    }
}
