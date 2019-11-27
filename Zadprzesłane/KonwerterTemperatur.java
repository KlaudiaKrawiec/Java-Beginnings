import java.util.Scanner;

public class KonwerterTemperatur {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// odczytaj wartoœæ temperatury w stopniach Celsjusza
		System.out.print("Podaj wartoœæ temperatury w stopniach Celsjusza: ");
		double tempC = sc.nextInt(); // Celsjusz
		// oblicz wartoœæ temperatury na pozosta³ych skalach
		double tempF = 32 + (9/5d)*tempC; // Fahrenheit
		double tempK = tempC + 273.15; // Kelvin
		// wyœwietl rezultaty obliczeñ, z dok³adnoœci¹ do pe³nych stopni
		System.out.println("* temperatura w stopniach C: " + (int)tempC);
		System.out.println("* temperatura w stopniach F: " + (int)tempF);
		System.out.println("* temperatura w stopniach K: " + (int)tempK);
	}
}