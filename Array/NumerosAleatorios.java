package Array;

import java.util.Random;

///programa que leia 20 numeros aleatorios entre 0 e 100 armazene num vetor e depois mostre seus sucessores.
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] NumerosAleatorios = new int[20];

        for(int i = 0; i < NumerosAleatorios.length; i++){

            int numero = random.nextInt(100);
            NumerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios");
        for (int numero : NumerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("Sucessores dos Numeros Aleatorios");
        for (int numero : NumerosAleatorios) {
            System.out.println((numero+1) + " ");
        }

    }
}
