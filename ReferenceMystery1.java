import java.util.Arrays;

public class ReferenceMystery1{
    public static void main(String[] args) {
        int y = 1;
        int x = 3;
        int[] a = new int[4];
        a[y]++;
        System.out.print(Arrays.toString(a));
    }
}