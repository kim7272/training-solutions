package abstractclass.gamecharacter;

public class Point {

    private long x;
    private long y;

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long distance(Point point){
        long value = (this.x - point.getX()) * (this.x - point.getX()) + (this.y - point.getY()) * (this.y - point.getY());
        long result =  (long) Math.sqrt(value);
        return result;
    }
}
