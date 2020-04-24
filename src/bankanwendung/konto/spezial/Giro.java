package bankanwendung.konto.spezial;

import bankanwendung.konto.Konto;

public class Giro extends Konto{
    private double limit;
    private double sollzins;

    public Giro(double limit, double sollzins) {
        this.limit = limit;
        this.sollzins = sollzins;
    }
}
