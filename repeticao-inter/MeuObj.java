public class MeuObj {
    Integer num;

    public void seNum(Integer num){
        this.num = num;
    }

    

    public MeuObj(Integer num) {
        this.num = num;
    }



    @Override
    public String toString() {
        return this.num.toString();
    }

    

}
