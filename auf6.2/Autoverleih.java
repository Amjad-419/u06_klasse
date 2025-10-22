// u06_klasse

public class Autoverleih
{
   public static void main(String[] args)
   {
      Auto  auto1;
      Auto  auto2;
      Auto  auto3;
      Kunde kunde1;
      
      kunde1 = new Kunde();
      auto1  = new Auto();
      auto2  = new Auto();
      auto3  = new Auto();
      
      kunde1.name = "Schindler";
      
      auto1.autonummer ="HH-AA";
      auto1.farbe      = Farbe.rot;
      auto1.tagespreis = 20;
      
      auto2.autonummer ="HH-BB";
      auto2.farbe      = Farbe.blau;
      auto2.tagespreis = 19;
      
      auto3.autonummer ="HH-CC";
      auto3.farbe      = Farbe.gelb;
      auto3.tagespreis = 23;
      
      Darsteller.zeige(auto1, auto2, auto3, kunde1);
   }
}
