package fila;

public class Main {
    public static void main(String[] args) {
        
        fila minhaFila = new fila();
        
        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);
        System.out.println("-----------------");
        //retirando o primeiro da fila
        System.out.println(minhaFila.dequeue());
        System.out.println("-----------------");
        System.out.println(minhaFila);
        //acrescentando o utilmo da fila
        minhaFila.enqueue(new No("ultimo"));
        System.out.println("-----------------");
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println("-----------------");
        System.out.println(minhaFila);
    }
    
}
