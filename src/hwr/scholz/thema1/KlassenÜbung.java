package hwr.scholz.thema1;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class KlassenÜbung {

    public static void main(String[] args) {

        WunschDatum(02,04,1999);

        AktuellesDatum();

        Artikel Buch = new Artikel(12, "Buch 123", 32);
        Artikel Baum = new Artikel(312, "Baum", 2333);
    }

    public static void WunschDatum (int tag, int monat, int jahr){

        System.out.println(tag + "." + monat + "." + jahr);
    }

    public static void AktuellesDatum(){

        GregorianCalendar cal = new GregorianCalendar();

        int tag = cal.get(Calendar.DATE);
        int monat = cal.get(Calendar.MONTH);
        int jahr = cal.get(Calendar.YEAR);

        System.out.println(tag + "." + monat + "." + jahr);
    }

     public static class Artikel{

        // geforderte Variablen

         private long artikelnummer;
         private String artikelbezeichnung;
         private double verkaufspreis;

         private long sortierUmfang;

        //Setter und Getter der variablen

         public long getArtikelnummer() {
             return artikelnummer;
         }

         public void setArtikelnummer(long artikelnummer) {
             this.artikelnummer = artikelnummer;
         }

         public String getArtikelbezeichnung() {
             return artikelbezeichnung;
         }

         public void setArtikelbezeichnung(String artikelbezeichnung) {
             this.artikelbezeichnung = artikelbezeichnung;
         }

         public double getVerkaufspreis() {
             return verkaufspreis;
         }

         public void setVerkaufspreis(double verkaufspreis) {
             this.verkaufspreis = verkaufspreis;
         }

         public long getSortierUmfang() {
             return sortierUmfang;
         }

         public void setSortierUmfang(long sortierUmfang) {
             this.sortierUmfang = sortierUmfang;
         }


        // Konstruktor + Ausgabemethode
        public Artikel(long artikelnummer, String artikelbezeichnung, double verkaufspreis){
             this.artikelnummer = artikelnummer;
             this.artikelbezeichnung = artikelbezeichnung;
             this.verkaufspreis = verkaufspreis;

            System.out.println(artikelnummer + " " + artikelbezeichnung + " " + verkaufspreis);

        }


    }
}
