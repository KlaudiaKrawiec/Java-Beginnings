import java.text.MessageFormat;
import java.util.Date;
import java.util.Formatter;

public class FormatowanieAlternatywne {
    public static void main(String[] args) {
        String s;
        Date teraz = new Date();
        Formatter f = new Formatter();
        f.format("%tF", teraz);
        System.out.println(f);
    }
}
