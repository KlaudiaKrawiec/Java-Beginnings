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
    	String s = "ala ma KoTa";
    	System.out.print(analizaTekstu(s,"Wielkie"));
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
	public static String analizaTekstu(String tekst, int N){
		char[] arr = tekst.toCharArray();
		for(int i = 0; i < N; i++){
			arr[i] = '*';
		}
		String str = new String(arr);
		return str;
	}
	
	public static String analizaTekstu(String tekst, boolean wspak){
		char[] chars = tekst.toCharArray();
		char[] arr = new char[chars.length];
		String ret;
		if(wspak == true){
			int j = 0;
			for(int i=chars.length - 1 ; i>=0 ;i--){
				arr[j] = chars[i];
				j++;
			}
			String r = new String(arr);
			ret = r;
		}
		else
			ret = tekst;
			
		return ret;
	}
	public static String analizaTekstu(String tekst, String format){
		String ret = tekst;
		if(format.equals("Rozstrzelony")){
			ret = "";
			String[] str = tekst.split("");
			for(int i=0;i<str.length;i++){
				if(i==str.length - 1 || str[i].equals(" ")){
					ret+=str[i];
				}
				else ret+= str[i] + " ";
			}
		}
		else if(format.equals("Wielkie")){
			String[] str = tekst.split(" ");
			for(int i=0;i<str.length;i++){
				String[] s = str[i].split("",2);
				s[0] = s[0].toUpperCase();
				s[1] = s[1].toLowerCase();
				if(i==str.length - 1)	str[i] = s[0] + s[1];
				else str[i] = s[0] + s[1] + " ";
			}
			ret = "";
			for(int n = 0; n<str.length; n++){
				ret += str[n];
			}
		} 
		return ret; 
	}
	
	/*public static String analizaTekstu(String tekst, String format){
		String ret =  tekst;
		if(format.equals("Wielkie")){
			String[] str = tekst.split("");
			for(int i=0;i<str.length;i++){
				String[] s = str[i].split("");
				s[0] = s[0].toUpperCase();
				str[i] = s.toString();
			}
			ret = str.toString();
		}
		return ret;		
	}
    */

}

