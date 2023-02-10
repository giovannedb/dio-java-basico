package repeticao;

import java.util.Scanner;

//Desenvolvendo a tabuada
//o usuario digita de qual tabuada ele quer
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada  = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        //inicia com 1 pq a tabuada vai começar com 1
        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i) );
        }
    }

    
}
