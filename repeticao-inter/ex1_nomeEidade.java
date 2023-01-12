import java.util.Scanner;

//faça um programa que leia conjuntos de dois valores,
//o primeior representando o nome do aluno e o segundo representado a sua idade;
//pare o programa inserindo o valor - no campo nome

public class ex1_nomeEidade{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Pausado aqui.");



    }
}