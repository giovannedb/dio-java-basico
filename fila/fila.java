package fila;

public class fila {
    
    private No refNoEntradaFila;

    public fila() {
        this.refNoEntradaFila = null;
    }

    //enfileirar -- estou pegando o ultimo NO  da fila e falando que o novoNo é o ultimo da fila agora
    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    //Primeiro NO da fila
    public No first(){
        //testo se a fila está vazia, se não tiver entro na fila
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                //se não for o primeiro ele continua
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();

                }//se for ele para
                else{
                    break;
                }
            }
        }
        return null;
    }

    public No dequeue(){
        
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                //se não for o primeiro ele continua
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();

                }//se for ele para
                else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    //testa se a fila está vazia
    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}] ------>";                
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "Null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }


    

}
