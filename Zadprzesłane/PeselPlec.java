import java.util.Scanner;

public class PeselPlec{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String pesel = sc.nextLine();
		int sub = Integer.parseInt(pesel.substring(9,10));
		if (sub%2 == 0)
			System.out.println("P³eæ: Kobieta");
		else
			System.out.println("P³eæ: Mê¿czyzna");
	}
}