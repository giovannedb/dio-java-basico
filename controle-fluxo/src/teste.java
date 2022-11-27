import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        String a,b;
        for(int i = 0; i < N; i++){
            a = leitor.next();
    		b = leitor.next();
            if(a.equalsIgnoreCase("testes2") && b.equalsIgnoreCase("tes")){
                System.out.println("teste1");
            }
            else if(a.equalsIgnoreCase("teste2")){
                System.out.println("teste");
            }
        }
    }
}
