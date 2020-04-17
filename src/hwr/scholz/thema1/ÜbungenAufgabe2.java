package hwr.scholz.thema1;

public class ÜbungenAufgabe2 {

    public class MyTime {

        int Sekunden, Minuten, Stunden;

        public int getSekunden() {
            return Sekunden;
        }

        public void setSekunden(int sekunden) {
            Sekunden = sekunden;
        }

        public int getMinuten() {
            return Minuten;
        }

        public void setMinuten(int minuten) {
            Minuten = minuten;
        }

        public int getStunden() {
            return Stunden;
        }

        public void setStunden(int stunden) {
            Stunden = stunden;
        }


        public void advance(int h, int m, int s){
            this.Minuten = this.Minuten + m;
            this.Sekunden = this.Sekunden + s;
            this.Stunden = this.Stunden + h;

            System.out.println(this.Stunden + " " + this.Minuten + " " + this.Sekunden);

        }


    }
}
