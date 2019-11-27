import java.text.MessageFormat;
import java.util.Date;

public class FormatowanieRezultatow{
	
public static void main(String[] args){
	String s;
	Date teraz = new Date();
	String miejsce = "Krak�w";
	int mila = 1852;
	double vat = 0.22;
	double cena = 31560.76;
	s = MessageFormat.format("{0}, {1,date,short}, godz. {1,time,short}",
	miejsce, teraz);
	System.out.println(s);
	s = MessageFormat.format("{0}kB to {1}B", 256,256*1024);
	System.out.println(s);
	s = MessageFormat.format("{0} x {0} x {0} = {1}", 7, 7*7*7);
	System.out.println(s);
	s = MessageFormat.format("{0,number,currency} + VAT({1,number,percent})",
	cena, vat);
	System.out.println(s);
	s = MessageFormat.format("{0} {1} to w przybli�eniu {2}m", 1,
	"mila morska", mila);
	System.out.println(s);
}
}