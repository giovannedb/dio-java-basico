public class EncadeamentoDeNo <T> {
    
    private T conteudo;
    private EncadeamentoDeNo<T> proximoNo;

    public EncadeamentoDeNo(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public EncadeamentoDeNo<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(EncadeamentoDeNo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "EncadeamentoDeNo [conteudo=" + conteudo + "]";
    }

    
    
}
