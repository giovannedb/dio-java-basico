package DATA;

import java.util.Date;

public class Exemplo {
    public static void main(String[] args) {
        
        //dessa forma, utilizamos o momento de agora, o milesegundo de agora
        Date novaData = new Date();
        System.out.println(novaData);

        //Long milesegundo

        Long currenTimeMillis = System.currentTimeMillis();
        System.out.println(currenTimeMillis);

        Date novaDataLong = new Date(currenTimeMillis);
        System.out.println(novaDataLong);

        //METODOS DATE JAVA
        //--after 
        //dataVariavel.after(dataNova)        
        //--before
        //dataVariavel.before(dataNova)
        //--compareTo(Date)
        //comparação de data podendo usar para comparação de linha do tempo de antes ou depois, return -1,1,0
        //--equals(Date)
        //retorna valor booleano
        //--getTime()
        //--setTime(long)
        //--from(instante)
        //--toInstant()
        //formatação de data
    }
    
}
