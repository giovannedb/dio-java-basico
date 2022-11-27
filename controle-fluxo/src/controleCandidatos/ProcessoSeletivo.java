package controleCandidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
    //    analisarCandidato(1900.0);
    //    analisarCandidato(2200.0);
    //    analisarCandidato(2000.0);
    String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
    for(String candidato : candidatos){
        entrandoEmContato(candidato);
    }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato (String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do{
            //Em algum momento, ela precisa sofre alteração
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando){
                tentativasRealizadas++;
            } else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while(continuaTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " NA " + tentativasRealizadas);
        } else{
            System.out.println("Não conseguimos contato com " + candidato + ", Número  maximo de tentativas " + tentativasRealizadas + " da aplicação.");
        }
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informados o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n: " + (indice+1) + " é " + candidatos[indice]);
        }

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA",
        "DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        //enquanto os candidatos selecionados for menor que 5
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){

            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este valor de salario: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            //verificando os proximos salarios
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        //valor random em 1800 e 2200
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
    
}
