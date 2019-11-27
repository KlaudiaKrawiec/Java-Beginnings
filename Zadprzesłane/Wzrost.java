import java.util.Scanner;

public class Wzrost{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Podaj wzrost w cm : ");
		int wzrost = sc.nextInt();
		double stopy = wzrost * 0.032808;
		double cale = wzrost / 2.54;
		System.out.println("* Wzrost wyra¿ony w stopach (ft): "+ stopy);
		System.out.println("Wzrost Wyra¿ony w calach (\"): "+cale);	
	}
}
