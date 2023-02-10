package repeticao;

import java.util.Scanner;

//calculando o fatorial de um numero inteiro que o usuario digite
//Ex: 5!= 120 (5x4x3x2x1)
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int mutiplicacao = 1;
        System.out.println(fatorial + "! = ");
        for(int i = fatorial; i >= 1; i--){
            
            mutiplicacao = mutiplicacao * i;
            
        }
        System.out.println(mutiplicacao);
    }
}
