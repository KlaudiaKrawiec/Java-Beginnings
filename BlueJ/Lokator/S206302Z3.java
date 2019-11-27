
public class S206302Z3
{
    public static void main(String[] args){
        Dom dom1 = new Dom(new Adres("Kraków","ul.Rakowicka","3"));
        dom1.dodajLokatora(new Lokator("Piotr","Nowakowski",true));
        System.out.print(dom1.toString());
    }
}
