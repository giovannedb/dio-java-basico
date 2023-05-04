package String;

public class TiposString {
    
    public static void main(String[] args) {
        String nome = "Giovanne";
        String sobreNome = "Dassi";

        //Atribuir variavel no meio do texto
        final var mensagem = String.format("O cliente %s possui sobre nome %s ", nome, sobreNome);
        System.out.println(mensagem);
        //duas casas depois da virgula
        System.out.println(String.format("Numero %.2f", 1.23421d));

        //adicionar string -- USAMOS O  .append do String BUILDER

        

    
        System.out.println(nome);

        var texto = new String ("Minha String ");

        System.out.println("Char na posição " + texto.charAt(5));
        System.out.println("Quantidade = " + texto.length());
        //tira espaço
        System.out.println("Sem trim [" + texto + "]");
        System.out.println("com trim [" + texto.trim() + "]");
        System.out.println("Lower " + texto.toLowerCase());
        System.out.println("Upper " + texto.toUpperCase());
        System.out.println("Contém M? " + texto.contains("M"));
        System.out.println("Contém M? " + texto.contains("X"));

        System.out.println("Replace " + texto.replace("n", "$"));
        System.out.println("Equals? " + texto.equals(" Minha String "));
        //verifica se a string é igual ignorando se é os upper e lower case
        System.out.println("EqualsIgnoreCase " + texto.equalsIgnoreCase(" mInHa StRinG "));
        //em qual string começamos a mostrar na tela
        System.out.println("Substring (1,6) = " + texto.substring(1, 6));


    }
}
