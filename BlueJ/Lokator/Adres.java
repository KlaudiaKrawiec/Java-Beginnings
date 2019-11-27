
/**
 * Write a description of class Adres here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adres
{
    // instance variables - replace the example below with your own
    private String miasto;
    private String ulica;
    private String numer;


   public Adres(String miasto, String ulica, String numer)
    {
       this.miasto = miasto;
       this.ulica = ulica;
       this.numer = numer;
    }
    
public String toString()
{
        String adres = this.miasto + " " + this.ulica + " " +this.numer;
        return adres;
        
}
}
