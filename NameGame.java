import java.util.Scanner;
public class NameGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String person = sc.nextLine();
        String[] name = person.split(" ");
        String Bn = (name[0]).replaceFirst("[A-Z]","B");
        System.out.println(name[0]+", "+name[0]+", bo-"+Bn );
        
    }
}