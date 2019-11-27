import java.util.Scanner;

public class LiczbaParzysta {
	public static void main(String[] args) {
		int[] a = {6, 0, -1, 3, -2, 0, 4};
		for (int i=1 ;i<a.length;i++){
			a[i] = a[a.length - 1 - i] - a[i-1];
			System.out.println(a[i]);
		}
		
	}
}