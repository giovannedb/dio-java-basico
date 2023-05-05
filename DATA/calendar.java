package DATA;

import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("A data corrente é : " + agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.printf("%tD\n" , agora);

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        //"%tD\n"

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois " + agora.getTime());
    }
}
