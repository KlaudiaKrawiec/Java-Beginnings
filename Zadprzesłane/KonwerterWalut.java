import java.text.MessageFormat;

public class KonwerterWalut{
	public static void main(String[] args){
		double euro;
		String s;
		int usd = Integer.parseInt(args[0]);
		double kurs = Double.parseDouble(args[1]);
		euro = usd*kurs;
		s = MessageFormat.format("W euro: {0}",euro);
		System.out.println(s);
	}
}