import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro numero:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo numero:");
        int parametroDois = terminal.nextInt();

        try{

        } catch (Exception e){
            System.err.println("Erro na execução da contagem.");
            e.printStackTrace();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExpecption{

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosExpecption();
        }

        int contagem = parametroDois - parametroUm;

        for(int x = 0; x < contagem; contagem++){
            System.out.println(x);
        }
        
        
    }
}