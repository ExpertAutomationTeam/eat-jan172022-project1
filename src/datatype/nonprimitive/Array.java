package datatype.nonprimitive;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 1;
        array[1] = 5;
        array[2] = 7;
        array[3] = 9;
        array[4] = 0;

        int[] array2 = {1, 5, 7, 9, 0};

        System.out.println(array2[2]);

        //2D array
        int[][] array2D = new int[2][2];
        array2D[0][0] = 3;
        array2D[0][1] = 5;
        array2D[1][0] = 7;
        array2D[1][1] = 0;
    }
}
