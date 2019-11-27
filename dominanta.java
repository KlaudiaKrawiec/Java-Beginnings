/**
 * @(#)dominanta.java
 *
 *
 * @author 
 * @version 1.00 2019/1/9
 */


public class dominanta {

    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,3,4,3,3,3};
    	int len = arr.length;
		int max = 0;
		int dominanta = 0;
		int value = 0;
		int count = 0;
    	
    	for(int  i = 0; i<len; i++){
				value = arr[i];
				count = 0;
				for(int j=0;j<len;j++){
					if(arr[j] == value){
						count++;
					}
				}
			}
			if(count>= max){
				max = count;
				dominanta = value;
			}
		System.out.print(dominanta);
    }
    
    
}