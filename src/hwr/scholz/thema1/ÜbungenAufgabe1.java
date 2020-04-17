package hwr.scholz.thema1;
import java.lang.Math;

public class ÜbungenAufgabe1 {

    public static void main(String[] args) {

    }

    public static class Point{

            private int x;
            private int y;
            private int z;


            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getZ() {
                return z;
            }

            public void setZ(int z) {
                this.z = z;
            }

        public void negate() {

                this.x = x*-1;
                this.y = y*-1;
                this.z = z*-1;

                System.out.println("Die ugekehrten Punkte sind: " + x + " " + y + " " + z);

        }

        public double norm(){

            return Math.sqrt(this.x * this.x = this.y * this.y + this.z * this.z);

        }

        public void print(){
            System.out.println("( " + this.x + " " + this.y + " " + this.z + " )");
        }




    }

}

