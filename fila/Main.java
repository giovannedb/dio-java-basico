package fila;

public class Main {
    public static void main(String[] args) {
        
        fila<String> minhaFila = new fila();
        
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);
        System.out.println("-----------------");
        //retirando o primeiro da fila
        System.out.println(minhaFila.dequeue());
        System.out.println("-----------------");
        System.out.println(minhaFila);
        //acrescentando o utilmo da fila
        minhaFila.enqueue("ultimo");
        System.out.println("-----------------");
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println("-----------------");
        System.out.println(minhaFila);
    }
    
}
