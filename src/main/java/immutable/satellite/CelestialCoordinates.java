package immutable.satellite;

public class CelestialCoordinates {
   final private int x;
   final private int y;
   final private int z;

    public CelestialCoordinates(int x, int y, int z){
       this.x = x;
       this.y = y;
       this.z = z;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }

    public String toString() {
        return "CelestialCoordinates: " + "x=" + x + ", y=" + y + ", z=" + z ;
    }
}
