public class Program {

	// wprowad� nr zestawu zada�, kt�ry wykonujesz
    public static int nrZestawu = 9;
    
    // wprowad� swoje nazwisko i imi� oraz nr albumu
    public static String daneStudenta(){
    	return "KRAWIEC Klaudia, 206302";
    }

    
    /*****
     * tu mo�esz testowa� swoje metody
     * zawarto�� main() nie b�dzie testowana
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

