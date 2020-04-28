package bankanwendung.konto.spezial;

import bankanwendung.konto.Konto;

public class Giro extends Konto {
	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public double getSollzins() {
		return sollzins;
	}

	public void setSollzins(double sollzins) {
		this.sollzins = sollzins;
	}

	private double limit;
	private double sollzins;
	
	public Giro(String name, long nr, double stand, double limit, double sollzins) {
		super(name, nr, stand);	//Konstruktor der Basisklasse
		this.limit = limit;
		this.sollzins = sollzins;
	}
	
	public void Display() {
		super.display();
		System.out.println("Überziehungslimit: " + limit);
		System.out.println("Sollzinssatz: " + sollzins);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(limit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sollzins);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Giro other = (Giro) obj;
		if (Double.doubleToLongBits(limit) != Double.doubleToLongBits(other.limit))
			return false;
		if (Double.doubleToLongBits(sollzins) != Double.doubleToLongBits(other.sollzins))
			return false;
		return true;
	}
	
}
