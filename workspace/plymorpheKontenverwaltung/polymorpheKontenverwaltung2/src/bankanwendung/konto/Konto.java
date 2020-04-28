package bankanwendung.konto;

public class Konto {
    private  String name;
    private long nr;
    private double stand;

    public Konto(String name, long nr, double stand){
        this.name = name;
        this.nr = nr;
        this.stand = stand;
    }

    public void display(){
        System.out.println("Kontoinhaber: " + name);
        System.out.println("Kontonummer: " + nr);
        System.out.println("Kontostand: " + stand);
    }

    public double getStand(){
        return stand;
    }

    public void setStand(double stand){
        this.stand = stand;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (nr ^ (nr >>> 32));
		long temp;
		temp = Double.doubleToLongBits(stand);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Konto other = (Konto) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nr != other.nr)
			return false;
		if (Double.doubleToLongBits(stand) != Double.doubleToLongBits(other.stand))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Konto [Kontoinhaber=" + name + ", Kontonummer=" + nr + ", Stand=" + stand + "]";
	}

}

