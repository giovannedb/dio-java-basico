import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        try{
        System.out.println("Digite seu nome: "); 
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //Imprimindo dados de usuario

        System.out.println("Meu nome é: " + nome + sobrenome);
        System.out.println("Minha idade é: " + idade + " e tenho " + altura + " de altura.");
        scanner.close();
        } 
        //catch (Exception e){
          //  e.printStackTrace();
        //}
        //--declarando um exceção direto que pode dar erro
        catch (InputMismatchException e){
            System.err.println("O campo idade e altura precisam ser numéricos ");
        }


    }
    
}
