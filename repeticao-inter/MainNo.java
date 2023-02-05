import javax.print.DocFlavor.STRING;

public class MainNo {
    
    public static void main(String[] args) {
        EncadeamentoDeNo<String> no1 = new EncadeamentoDeNo<String>("Conetudo no1");

        EncadeamentoDeNo<String>  no2 = new EncadeamentoDeNo<String>("Conteudo no2");

        no1.setProximoNo(no2);

        EncadeamentoDeNo<String> no3 = new EncadeamentoDeNo<String>("Conteudo no3");
        no2.setProximoNo(no3);

        EncadeamentoDeNo<String> no4 = new EncadeamentoDeNo<String>("Conteudo no4");
        no3.setProximoNo(no4);

        //no1->no2->no3->no4 -> null

       // System.out.println(no1);
       // System.out.println(no1.getProximoNo());
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        
    }
}
