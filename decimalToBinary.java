public class decimalToBinary{

	public static int dectob(int n){
	    int bin;
	    int ret;
	    int eq = n;
	    if(n==0){
	        bin=0;
	        ret=0;
	    }
	    else{
	        bin=1;
	        ret=1;
	        n/=2;
	    }
	    while(true){
	        bin = n%2;
	        if(n==1 && eq%2==0)
	            bin=0;
	        if (bin==0)
	            ret*=10;
	        else if(bin==1)
	            ret=(ret*10)+1;
	        if(n/2==0) 
	            break;
	        n/=2;
	    }
	    return ret;
	} 
	public static void main(String[] args){
		int a = dectob(35);
		System.out.println(a);
		a = dectob(65);
		System.out.println(a);
		a = dectob(121);
		System.out.println(a);
	}
}