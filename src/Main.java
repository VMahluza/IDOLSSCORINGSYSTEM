public class Main {

    public static void main(String[] args) {

        int[] x =  {2, 5, 7, 6, 5, 8};

        for ( int i = 0 ; i < x.length; i++)
            print(x[i]);

        print("\n");

        int temp;

        for (int i = x.length -1 ; i > 0 ; i--){

            for (int j = 0 ; j < i; j++){

                //Swapping
                temp = x[j];
                x[j] = x[j+ 1];
                x[j+ 1] = temp;

            }

        }

        System.out.println(
                "After sorting "
        );
        for ( int i = 0 ; i < x.length; i++)
            print(x[i]);


    }

    static void print(String victor){

        System.out.print(victor);

    }
    static void print(int victor){

        System.out.print(victor);

    }

    static int sum(int x, int y){

        return x + y;
    }

}
