package Array;

import java.util.Random;

//Gere e imprima uma matriz 4x4 com valores aleatorios entre 0-9
public class arrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha  : M) {
            for (int coluna : linha) {
                System.out.println(coluna + " ");
            }
            System.out.println();
        }
    }
}
