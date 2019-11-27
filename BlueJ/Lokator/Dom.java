
/**
 * Write a description of class Dom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dom implements DodajeLokatora
{
    // instance variables - replace the example below with your own
    private Adres adres;
    private Lokator lokator;

    /**
     * Constructor for objects of class Dom
     */
    public Dom(Adres adres)
    {
        this.adres = adres;
    }

  public String toString(){
      String dom = (this.adres.toString()) + (this.lokator.toString());
      return dom;
  }
  
  public void dodajLokatora(Lokator lokator){
      this.lokator = lokator;
}
}
