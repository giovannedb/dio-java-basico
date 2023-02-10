package Array;

import java.util.Scanner;

//Faça um programa que leia um vetor de 6 caracteres e diga consoantes foram lidas e impra elas
public class Consoantes {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoatens = 0;

        int count = 0;
        do{
            System.out.println("Letra: ");
            String letra = sacn.next();

            if( !(letra.equalsIgnoreCase("a") ||
               letra.equalsIgnoreCase("e") ||
               letra.equalsIgnoreCase("i") || 
               letra.equalsIgnoreCase("o") || 
               letra.equalsIgnoreCase("u") )){
                consoantes[count] = letra;
                quantidadeConsoatens++;
            }
            count++;
        } while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null){
                System.out.println(consoante + "");
            }
            System.out.println("Quantade de consoantes: " + quantidadeConsoatens);
            
        }
    }
}
