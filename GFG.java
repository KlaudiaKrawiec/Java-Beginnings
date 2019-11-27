// Java program to demonstrate working of Arrays.toString() 
import java.io.*; 
import java.util.*; 
  
class GFG { 
    public static void main(String[] args) 
    { 
 
        int[] intArr = new int[4]; 
		int x = 1;
		int y = 3;
		if(x<y){
			intArr[x] = 17;
			x++;
		}
		else
			intArr[y] = 17;
  

        System.out.println(x+" " + y+" "+Arrays.toString(intArr)); 
 
    } 
}