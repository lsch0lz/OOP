import bankanwendung.konto.Konto;
import bankanwendung.konto.spezial.*;

public class KontenTest {

	public static void main(String[] args) {
		Giro g1 = new Giro("Mueller, Heiner", 123, 100.0, 1000.0, 12.0);
		Spar s = new Spar("Meier, Maria", 5678, 250.0, 1.0);
		
		g1.Display();
		s.Display();
		System.out.println();
		
		Giro g2 = new Giro("Mueller, Heiner", 123, 100.0, 1000.0, 12.0);
		System.out.println(g1.equals(g2));
		
		Konto k = new Konto("Mueller, Heiner", 123, 100.0);
		System.out.println(k);
	}

}
