import java.util.Scanner;
public class CaesarCipher{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] alf = new char[26];
        System.out.print("Your message? ");
        String str = sc.nextLine();
        System.out.print("Encoding key? ");
        int key = sc.nextInt();
        char a = 'A';
        int n = 0;
        while(a<='Z'){
            alf[n] = a++;
            n++;
        }
        str = str.toUpperCase();
        char[] st = str.toCharArray();
        System.out.println(st);
        for(int x=0;x<st.length;x++){
            for(int y=0;y<alf.length;y++){
                if(st[x]==alf[y]){
		            int cipher = (y + key) % alf.length;
		            	if(cipher<0)
		            		cipher = alf.length + cipher;
		            st[x] = alf[cipher];
		            break;
                }
            }
        }
        
        System.out.println(st);
    }
}