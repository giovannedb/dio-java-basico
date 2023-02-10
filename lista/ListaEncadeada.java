package lista;

public class ListaEncadeada <T> {
    
    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){

        validaIndex(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; 1 < this.size()-1; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    //metodos size -- ele retorna o tamanho da nossa lista
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if(referenciaAux != null){
                //encrementando 1 no tamanho da lista
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    //metodo isEmpty 
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;

    }

    private void validaIndex(int index){
        if(index >= size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("Não eciste conteúdo no indice " + index +" desta lista.  Esta lista só vai até o indice " + ultimoIndice + " . " );
            
        }
    }

}
