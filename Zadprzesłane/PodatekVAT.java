import java.text.MessageFormat;

public class PodatekVAT{
	public static void main(String[] args){
		final double VAT = 0.22 ;
		double brutto;
		String s;
		String nazwa = args[0];
		double netto = Double.parseDouble(args[1]);
		brutto = netto*(1+VAT);
		s = MessageFormat.format("{0}  cena brutto: {1} cena netto: {2} podatek VAT: {3}%", nazwa,brutto,netto,(VAT*100));
		System.out.println(s);
	}
}