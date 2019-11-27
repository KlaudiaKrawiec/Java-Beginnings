import java.util.Scanner;

public class DlugoscNapisow{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Wprowadz pierwszy tekst: ");
		String str1 = sc.nextLine();
		System.out.print("Wprowadz drugi tekst: ");
		String str2 = sc.nextLine();
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 > len2)
			System.out.println(str1);
			
		else
			System.out.println(str2);
			
		
	}
}