import java.util.Scanner;

class Main_F {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < times; i++) {

            int size = scanner.nextInt();
            scanner.nextLine();

            String[] imput = scanner.nextLine().split(" ");
            int[] skills = new int[size];

            for (int e = 0; e < size; e++) {
                skills[e] = Integer.parseInt(imput[e]);
            }

            sortIntegerArraySelection(skills);
        }
    }

    private static void sortIntegerArraySelection(int [] array){
        int diff=1000000001; //PARA QUE SIEMPRE CAMBIEN EN LA PRIMERA ITERACIÓN

        for(int rojo = 0 ; rojo < array.length-1 ; rojo++) {

            for (int azul = rojo+1; azul < array.length; azul++) {
                if(array[rojo]>array[azul]){

                    if(diff>array[rojo]-array[azul]){

                        diff=array[rojo]-array[azul];
                    }
                } else if(array[azul]>array[rojo]) {

                    if(diff>array[azul]-array[rojo]){

                        diff=array[azul]-array[rojo];

                    }
                }else if (array[rojo]==array[azul]) {
                    diff=0;

                }
            }
        }
        System.out.println(diff);

    }

}
