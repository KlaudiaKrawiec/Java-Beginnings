public class Hogwarts{
	public static void main(String[] args){
		bludger(2001);
	}
	private static void bludger(int y){
		int x = y / 1000;
		int z = (x + y);
		x = q(z,y);
		System.out.println(x+","+y+","+z);
	}
	private static int q(int x, int y){
		int z = s(x+y,y);
		y/=z;
		System.out.println(x+","+","+y+","+z);
		return z;
	}
	private static int s(int x, int y){
		y = x / (x % 10);
		System.out.println(x+ ","+ y);
		return y;
	}
}