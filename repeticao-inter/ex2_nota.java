import java.util.Scanner;

// faça um programa que peça uma nota , entre zero e dez
//mostre uma mensagem caso o valor seja invalido
//e continue pedindo
//até que o usuario informe um valor valido

public class ex2_nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota fora do grupo entre 0 e 10");
            nota = scan.nextInt();
        }
        System.out.println("FIM! NOTA =  " + nota);

    }
}
