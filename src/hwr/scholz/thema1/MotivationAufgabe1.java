package hwr.scholz.thema1;

public class MotivationAufgabe1 {

    public static void main(String[] args) {

        potenz(5, 5);

    }

      static long potenz (int basis, int exponent) {

          long ergebnis = basis;
          for (int i = 1; i < exponent; i++) {

              ergebnis *= basis;
          }
          System.out.println(ergebnis);

          return ergebnis;
      }

}

