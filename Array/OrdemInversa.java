package Array;

public class OrdemInversa {
    public static void main(String[] args) {
        //criar um vetor de 6 numeros inteiro e mostre a ordem inversa

        //vetor sempre começa na posição 0
        int[] vetor = {0, -5, 15, 33, 9, 4};

        //tamanho do vetor
      //  System.out.println(vetor.length);

        System.out.println("Vetor: ");
        int count =0;
        //lenght retorna o tamanho do array
        while(count < (vetor.length)){
            System.out.println(vetor[count] + "");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i] + "");
        }
    }
}
