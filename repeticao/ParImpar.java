package repeticao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        //usuario digita a quantidade de numeros
        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        //Laço que pede numeros inteiros

        int count = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            //Descobrindo se numero é par ou impar, se o resto da divisão desse numero por 2 é = 0 ele é par
            // se for verdade ele soma aos pares ou impar
            if(numero % 2 == 0){
                quantPares++; // quantPares = quantPares +1
            }else{
                quantImpares++;
            }
            count ++;
            //laço se repete de acordo com a quantidade que digitar em cima
        }while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }
}
