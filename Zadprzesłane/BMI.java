import java.util.Scanner;

public class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj sw�j wzrost w m : ");
		double wzrost = sc.nextDouble();
		System.out.print("Podaj swoj� wag� w kg : ");
		double waga = sc.nextDouble();
		double BMI = waga / (wzrost * wzrost);
		System.out.println("Twoje BMI wynosi: " + BMI);
	}
}