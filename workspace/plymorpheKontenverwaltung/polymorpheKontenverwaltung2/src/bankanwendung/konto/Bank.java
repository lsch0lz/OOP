package bankanwendung.konto;

import bankanwendung.konto.spezial.*;

public class Bank {
	private int anzahl = 0;
	private int maxAnzahl;
	private Konto [] kontenListe;	//zeiger auf Kontenarray
	
	public Bank(int i) {
		maxAnzahl = i;
		kontenListe = new Konto[maxAnzahl];
		
	}

	public boolean insertGiro(String string, int i, double d, double e, double f) {
		if(anzahl>=maxAnzahl)	return false;
		kontenListe[anzahl] = new Giro( string,  i,  d,  e,  f);
		anzahl++;
		return true;
		
	}

	public boolean insertSpar(String string, int i, double d, double e) {
		if(anzahl>=maxAnzahl)	return false;
		kontenListe[anzahl] = new Spar( string,  i,  d,  e);
		anzahl++;	
		return true;
	}

	public void display() {
			for(int i=0; i < anzahl; i++) {
				kontenListe[i].display();
			}
	}

	
}
