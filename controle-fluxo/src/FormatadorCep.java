public class FormatadorCep {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("211252482");
            System.out.println(cepFormatado);
        }
        catch (CepInvation e){
            //se o cep tiver mais que 8 numeros
            System.out.println("O cep nao corresponde com as regras de negocio.");
        }
    }
    static String formatarCep(String cep) throws CepInvation{
        if(cep.length() != 8)
        throw new CepInvation();

        return "23.312-921";
    }
    
}
