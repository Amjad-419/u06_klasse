// u06_klasse

public class Lehrgang
{
      public static void main(String[] args)
   {
      Teilnehmer teilnehmer1;
      Teilnehmer teilnehmer2;
      Teilnehmer teilnehmer3;
      Teilnehmer teilnehmer4;
      Teilnehmer teilnehmer5;
      
      teilnehmer1 = new Teilnehmer();
      teilnehmer2 = new Teilnehmer();
      teilnehmer3 = new Teilnehmer();
      teilnehmer4 = new Teilnehmer();
      teilnehmer5 = new Teilnehmer();
      
      teilnehmer1.name = "Issa";
      teilnehmer1.vorname = "Ahmad";
      teilnehmer1.alter = 22;
      teilnehmer1.fachrichtung = "Ahmad";
      
      teilnehmer2.name = "Issa";
      teilnehmer2.vorname = "Ahmad";
      teilnehmer2.alter = 22;
      teilnehmer2.fachrichtung = "Anwendungsentwicklung";
      
      teilnehmer3.name = "Halabi";
      teilnehmer3.vorname = "Hassan";
      teilnehmer3.alter = 27;
      teilnehmer3.fachrichtung = "Systmintegration";
      
      teilnehmer4.name = "Homsi";
      teilnehmer4.vorname = "Ammar";
      teilnehmer4.alter = 37;
      teilnehmer4.fachrichtung = "SiberScurity";
      
      teilnehmer1.name = "Othman";
      teilnehmer1.vorname = "Ali";
      teilnehmer1.alter = 42;
      teilnehmer1.fachrichtung = "Systmintegration";
      
      teilnehmer5.name = "Ali";
      teilnehmer5.vorname = "Wael";
      teilnehmer5.alter = 33;
      teilnehmer5.fachrichtung = "Anwendungsentwicklung";
      
      System.out.printf("%-5s %-7s %-7s %-7s %-3s %2d %-8s %-8s%n", "Name:", teilnehmer1.name , "Vorname:" , teilnehmer1.vorname, "Alter:", teilnehmer1.alter, "Fachrictung:" , teilnehmer1.fachrichtung );
      System.out.printf("%-5s %-7s %-7s %-7s %-3s %2d %-8s %-8s%n", "Name:", teilnehmer2.name , "Vorname:" , teilnehmer2.vorname, "Alter:", teilnehmer2.alter, "Fachrictung:" , teilnehmer2.fachrichtung );
      System.out.printf("%-5s %-7s %-7s %-7s %-3s %2d %-8s %-8s%n", "Name:", teilnehmer3.name , "Vorname:" , teilnehmer3.vorname, "Alter:", teilnehmer3.alter, "Fachrictung:" , teilnehmer3.fachrichtung );
      System.out.printf("%-5s %-7s %-7s %-7s %-3s %2d %-8s %-8s%n", "Name:", teilnehmer4.name , "Vorname:" , teilnehmer4.vorname, "Alter:", teilnehmer4.alter, "Fachrictung:" , teilnehmer4.fachrichtung );
      System.out.printf("%-5s %-7s %-7s %-7s %-3s %2d %-8s %-8s%n", "Name:", teilnehmer5.name , "Vorname:" , teilnehmer5.vorname, "Alter:", teilnehmer5.alter, "Fachrictung:" , teilnehmer5.fachrichtung );
   }
}
