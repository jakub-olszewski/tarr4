package pl.sdacademy.tarr4.dataiczas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

            System.out.println("Data: "+dataSformatowanaJakoNapis);
        }
        }
}
