package hwr.scholz.thema1;

public class ÜbungenAufgabe1 {

    public static void main(String[] args) {
        Point test = new Point(2,4,3);
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

        public Point(int x, int y, int z){
                
                this.x = x;
                this.y = y;
                this.z = z;

                System.out.println("Die ugekehrten Punkte sind: " + x + y + z);
            
            }
    }

}

}