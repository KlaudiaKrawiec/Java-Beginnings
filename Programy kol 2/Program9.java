public class Program {

	// wprowadŸ nr zestawu zadañ, który wykonujesz
    public static int nrZestawu = 9;
    
    // wprowadŸ swoje nazwisko i imiê oraz nr albumu
    public static String daneStudenta(){
    	return "KRAWIEC Klaudia, 206302";
    }

    
    /*****
     * tu mo¿esz testowaæ swoje metody
     * zawartoœæ main() nie bêdzie testowana
     */
    public static void main(String[] args){
    	// kod programu do testowania
    	// ...
    }
    
    
    /*****
     * zdefiniuj metody
     */
     public static boolean analizaTekstu(String tekst){
     	int len = tekst.length();
     	boolean ret =  false;
     	if(len>=5 && len<=30)
     		ret = true;
     	return ret;	
     }
     public static boolean analizaTekstu(String tekst, char test){
     	boolean ret = false;
     	if(test == 'S'){
     		for(char c : tekst.toCharArray()){
     			if(c == ' ')
     				ret = true;
     		}
     	}
     	else if(test == 'C'){
     		ret = true;
     		for(char c : tekst.toCharArray()){
     			if(c >= '0' && c <= '9')
     				ret = false;
     		}
     	}
     	return ret;
	}


}

