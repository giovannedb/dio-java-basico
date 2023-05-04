package String.IF;

import fila.fila;

public class IF {
    public static void main(String[] args) {
        
        final var condicao = true;

        if (condicao){
            System.out.println("A condição é verdadeira");
        }else{
            System.out.println("Essa condição é fasa");
        }

        final var ternairo = condicao ? "é verdadeira " : "False";

        System.out.println(ternairo);

        //! a direita, eu nego qualquer tipo de igualdade-- queremos o oposto e não igual
        final var letra = "B";

        if("A".equals(letra)){
            System.out.println("é a letra A");
        }
        if(!letra.equals("A")){
            System.out.println("Não é a letra A");
        }

    }
    
}
