package DATA;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateMetodos {
    /**
     * @param args
     */
    public static void main(String[] args) {
         LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);

        //tratamento hora
      //  LocalTime hora = LocalTime.now();
        //hora e data
        LocalDateTime horaData = LocalDateTime.now();
        System.out.println(horaData);

    }
}
