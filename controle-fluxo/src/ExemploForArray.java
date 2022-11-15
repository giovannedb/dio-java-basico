public class ExemploForArray {
    
    public static void main(String[] args) {
        String alunos [] = {"Giovanne", "Bruno", "Felipe"};

        //for (int x=0; x < alunos.length; x++){
         //   System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        //}

        // usando FOR / EACH
            for (String aluno : alunos){
                System.out.println("Nome do aluno é: " + aluno);
            }
    }
}
