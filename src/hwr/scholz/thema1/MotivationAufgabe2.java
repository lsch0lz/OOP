package hwr.scholz.thema1;
import java.util.Scanner;
import java.util.Vector;

public class MotivationAufgabe2 {

    public static void main(String[] args) {

        abfrage();
    }

    public static Vector abfrage(){

        Vector v = new Vector();
        Scanner scanner_abfrage = new Scanner(System.in);
        System.out.println("Wollen Sie eine weitere Zahl eingeben? [y/n]");
        String abfrage = scanner_abfrage.nextLine();

        while (abfrage == "y"){
            System.out.println("Gib die gewünschte Zahl ein: ");

            Scanner scanner_zahl = new Scanner(System.in);
            int zahl = scanner_zahl.nextInt();

            v.add(zahl);
            System.out.println(zahl);
        }
        return v;
    }

}

//NOT FINISHED