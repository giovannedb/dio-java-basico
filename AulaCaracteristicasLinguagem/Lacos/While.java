package AulaCaracteristicasLinguagem.Lacos;

public class While {
    public static void main(String[] args) {
        var x = 0;

        //testa a condição antes
        while(x < 1){
            System.out.println("Dentro do while..");
            x++;
        }

        var y = 0;
        do{
            System.out.println("Dentro do do/while..");
        } while (y++ < 1);
    }
    
}
