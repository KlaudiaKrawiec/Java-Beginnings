
/**
 * Write a description of class Lokator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lokator
{
    // instance variables - replace the example below with your own
    private String imie;
    private String nazwisko;
    private boolean zameldowany;
    
    public Lokator(String imie, String nazwisko, boolean zameldowany)
    {
      this.imie = imie;
      this.nazwisko = nazwisko;
      this.zameldowany = zameldowany;
    }

    public String toString(){
        String stan = zameldowany ? "zameldowany" : "nezameldowany";
        return stan;
        
    }
}
