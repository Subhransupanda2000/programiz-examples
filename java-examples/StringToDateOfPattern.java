import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDateOfPattern {

    public static void main(String[] args) {
        String string = "2019-01-06";
        DateTimeFormatter date = DateTimeFormatter.ofPattern("YY-MM-DD,locaLe.ENGLISH");
        LocalDate ld = LocalDate.parse(string, date);
        System.out.println(ld);
    }
}