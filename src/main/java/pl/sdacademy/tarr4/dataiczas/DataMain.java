package pl.sdacademy.tarr4.dataiczas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.LockSupport;

/**
 * DataMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.02.2019 20:10
 **/
public class DataMain {
    public static void main(String[] args) {
        {
            String dataString = "2016-03-04 11:30";
            String formatDaty = "yyyy-MM-dd HH:mm";

            DateTimeFormatter formaterDaty = DateTimeFormatter.ofPattern(formatDaty);
            LocalDateTime dataObiekt = LocalDateTime.parse(dataString, formaterDaty);
        }
        {
            LocalDateTime obecnaData = LocalDateTime.now();
            String formatDaty = "yyyy-MM-dd HH:mm:ss";
            DateTimeFormatter formaterDaty = DateTimeFormatter.ofPattern(formatDaty);
            String dataSformatowanaJakoNapis = obecnaData.format(formaterDaty);

            System.out.println("Data sformatowana: " + dataSformatowanaJakoNapis);
            System.out.println("Format daty: " + formatDaty);
            System.out.println("Data obiekt: " + obecnaData);
        }
        {
            /**
             * Zadanie: Wyświetl obecną datę w formacie „12:23 01/08/2018”
             */
            String formatDaty = "HH:mm dd/MM/yyyy";
            String dataZZaadnia = dataJakoNapis(formatDaty);

            System.out.println("Data w formacie z zadania: " + dataZZaadnia);
        }
        }

    /**
     * Metoda zwraca date obecna jako napis
     * @param formatDaty
     * @return
     */
    private static String dataJakoNapis(String formatDaty) {
        LocalDateTime obecnaData = LocalDateTime.now();
        DateTimeFormatter formaterDaty = DateTimeFormatter.ofPattern(formatDaty);
        return obecnaData.format(formaterDaty);
    }

}
