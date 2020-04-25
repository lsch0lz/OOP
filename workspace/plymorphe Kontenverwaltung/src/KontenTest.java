import bankanwendung.konto.Bank;
import bankanwendung.konto.Konto;
import bankanwendung.konto.spezial.*;

public class KontenTest {

	public static void main(String[] args) {
		
		Bank b = new Bank(100);
		b.insertGiro("Mueller, Heiner", 123, 100.0, 1000.0, 12.0);
		b.insertSpar("Meier, Maria", 5678, 250.0, 1.0);
		
		b.display();
		
		
	}
}
