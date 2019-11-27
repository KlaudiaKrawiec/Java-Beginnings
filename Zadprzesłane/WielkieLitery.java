import java.util.Scanner;

public class WielkieLitery {
	public static void main(String[] args){
		// pobierz tekst z konsoli
		Scanner sc = new Scanner(System.in);
		System.out.print("Wprowadz dowolny tekst: ");
		String tekst = sc.nextLine();
		// wyœwietl tekst, dokonuj¹c konwersji na wielkie litery
		System.out.println(tekst.toUpperCase());
	}
}