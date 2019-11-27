
public class Dane{
	public static void main(String[] args){
		int len = args.length;
		System.out.println("Liczba slow: "+len);
		int i = 0;
		while(i<len){
			System.out.println(args[i]);
			i++;
		}
	}
}