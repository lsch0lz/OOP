package bankanwendung.konto.spezial;

import bankanwendung.konto.Konto;

public class Spar extends Konto {
	
	private double habenzins;

	public Spar(String name, long nr, double stand, double habenzins) {
		super(name, nr, stand);
		this.habenzins = habenzins;
	}
	
	public void Display() {
		super.display();
		System.out.println("Habenszinssatz: " + habenzins);
	}

	public double getHabenzins() {
		return habenzins;
	}

	public void setHabenzins(double habenzins) {
		this.habenzins = habenzins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(habenzins);
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
		Spar other = (Spar) obj;
		if (Double.doubleToLongBits(habenzins) != Double.doubleToLongBits(other.habenzins))
			return false;
		return true;
	}
	

}
