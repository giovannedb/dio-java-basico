package DATA;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormat {
    public static void main(String[] args) {
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);

        System.out.println(dateToStr);

        Date agoraFormatado = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agoraFormatado);
        System.out.println(dataFormatada);
        
    }
}
