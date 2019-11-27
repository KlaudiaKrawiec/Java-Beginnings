import java.util.Scanner;

public class ZWielkiejLitery{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj imiê: ");
		String imie = sc.nextLine();
		System.out.print("Podaj nazwisko: ");
		String nazwisko = sc.nextLine();
		String i = imie.substring(0,1); 
		String n = nazwisko.substring(0,1);
		i = i.toUpperCase();
		n = n.toUpperCase();
		System.out.println("Pracownik: " + i + imie.substring(1,imie.length())  + " "+ n + nazwisko.substring(1,nazwisko.length()));
	}
}