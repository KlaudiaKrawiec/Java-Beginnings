/*
* Przyk³adowe wywo³anie programu:
* java ParametryWierszaPolecen Kowalewski Eugeniusz "ul. Szeroka 15 m.3"
*/
public class ParametryWierszaPolecen {
	public static void main(String[] args){
		System.out.println("nazwisko: " + args[0]);
		System.out.println("imie: " + args[1]);
		System.out.println("adres: " + args[2]);
	}
}