import java.util.Scanner;

public class FormatRachunku{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Wprowadü numer rachunku bankowego: ");
		String rach = sc.nextLine();
		String sub = rach.substring(0,2);
		System.out.print(sub + " ");
		int i = 2;
		while (i<rach.length()){
			String sub1 = rach.substring(i,i+4);
			System.out.print(sub1 + " ");
			i+=4;
		}
			
		
		
	}
}