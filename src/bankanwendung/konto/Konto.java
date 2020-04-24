package bankanwendung.konto;

public class Konto {
    private  String name;
    private long nr;
    private double stand;

    private Konto(String name, long nr, double stand){
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

    public void setStand(){
        this.stand = stand;
    }

}

