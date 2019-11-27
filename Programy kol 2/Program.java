public class Program {

	// wprowadŸ nr zestawu zadañ, który wykonujesz
    public static int nrZestawu = 8;
    
    // wprowadŸ swoje nazwisko i imiê oraz nr albumu
    public static String daneStudenta(){
    	return "KRAWIEC Klaudia, 206302";
    }

    
    /*****
     * tu mo¿esz testowaæ swoje metody
     * zawartoœæ main() nie bêdzie testowana
     */
    public static void main(String[] args){
    	int[] ar = {1,2,3,4,3,4,3,3,3};
    	System.out.print(analizaDanych(ar,"N"));
    }
    
    
    /*****
     * zdefiniuj metody
     */
     public static boolean analizaDanych(int[] arr){
     	int len = arr.length;
     	boolean ret = false;
     	if(len>=5 && len<=10)
     		ret = true;
     	return ret;
     }
     
     public static boolean analizaDanych(int[] arr, char test){
     	int len = arr.length;
     	boolean ret = false;
     	if(test == 'N'){
     		ret = true;
     		for(int i = 0; i<len; i++){
     			if (arr[i]<0)
     				ret = false;
     		}
     	}
     	else if(test == 'S'){
     		int sum = 0;
     		for(int i = 0; i<len; i++){
     			sum += arr[i];
     		}
     		if(sum<100)
     			ret = true;
     	}
     	return ret;
     	
     }
     
     public static boolean analizaDanych(int[] arr1, int[] arr2){
     	boolean ret = true;
     	int len = arr1.length;
     	if(arr1.length!=arr2.length)
     		ret = false;
     	
     	else {
     		for(int i=0; i<len; i++){
     			if(arr1[i]!= arr2[i])
     				ret = false;
     		}
     	}
     	return ret;
     }
	public static int[] analizaDanych(int[] arr, boolean wspak){
		int len = arr.length;
		int[] ret =  new int[len];
		if(wspak = true){
			int j = 0;
			for(int i = len-1; i>=0; i--){
				ret[j] = arr[i];
				j++;
			}
		}
		else
			ret = arr;
			
		return ret;
	}
	public static int analizaDanych(int[] arr, int liczba){
		int len = arr.length;
		int count = 0;
		for(int  i = 0; i<len; i++){
			if(arr[i] == liczba) count++;
		}
		return count;
	}
	public static int analizaDanych(int[] arr, String najczesciej){
		int len = arr.length;
		int max = 0;
		int dominanta = 0;
		int value = 0;
		int count = 0;

		if(najczesciej.equals("N")){
			for(int  i = 0; i<len; i++){
				value = arr[i];
				count = 0;
				for(int j=0;j<len;j++){
					if(arr[j] == value){
						count++;
					}
				}
				if(count>= max){
				max = count;
				dominanta = value;
				}
		    }
		return dominanta;
		}
			
		else{
			return dominanta;
		}
	}
}
