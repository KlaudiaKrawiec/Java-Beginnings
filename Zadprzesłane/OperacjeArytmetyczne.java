/*
* Przyk³adowe wywo³anie programu:
* java OperacjeArytmetyczne 523 -68
*/
public class OperacjeArytmetyczne {
	public static void main(String[] args){
		// odczyt oraz konwersja liczb do postaci numerycznej
		int liczbaA = Integer.parseInt(args[0]);
		int liczbaB = Integer.parseInt(args[1]);
		// wyœwietlenie rezultatów na konsoli
		System.out.print("A = " + liczbaA);
		System.out.println(", B = " + liczbaB);
		System.out.println("A + B = " + (liczbaA+liczbaB));
		System.out.println("A - B = " + (liczbaA-liczbaB));
		System.out.println("A * B = " + (liczbaA*liczbaB));
		System.out.println("A / B = " + (liczbaA/liczbaB));
		System.out.println("Reaszta z A / B = " + (liczbaA%liczbaB));
	}
}