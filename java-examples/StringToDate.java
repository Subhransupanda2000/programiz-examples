import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {

    public static void main(String[] args) {

        String string = "2024-03-05";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}