package main.java.com.AllanTeone.javacore.chapter18;

import java.util.Arrays;

public class App {

    public static int[][] rotateLeft(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = matrix[j][matrix[j].length - 1 - i];
            }
        }
        return res;
    }
    public static int[][] rotateRight(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return res;
    }

    public static int[][] buildSnailPath(int[][] arr) {
        int ind = 0;
        int i = 0;
        int j = 0;

        int[][] res = new int[arr.length + arr[0].length - 1][];

        res[ind] = arr[0];
        ind++;

        for (; ind < res.length; ind++) {
            if (ind % 2 != 0 && ind >= 3) {
                j++;
            }
            if (ind % 4 == 0) {
                i++;
            }
            arr = rotateLeft(arr);
            res[ind] = Arrays.copyOfRange(arr[i], 1, arr[0].length - j);
        }
        return res;

    }







    public static void main(String[] args) {
        //System.out.println(Arrays.toString(App.generate(14)));
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.deepToString(App.buildSnailPath(matrix)));
    }


}
