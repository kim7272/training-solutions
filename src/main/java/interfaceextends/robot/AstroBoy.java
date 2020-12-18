package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    public static final int ALTITUDE = 5;
    private long altitude;

    public AstroBoy(Point position) {
        this.position = position;
    }
    public void walkTo (Point position){
        path.add(position);
        this.position = position;
    }
    public void flyTo (Point position){
        path.add(position);
        this.position = position;
    }
    public void liftTo (long altitude) {
        this.altitude = altitude;
    }
    public void moveTo (Point position){
        walkTo(position);
        }
    public void fastMoveTo (Point position){
        liftTo(ALTITUDE);;
        path.add(new Point(0,0,getALTITUDE()));
        path.add(new Point(position.getX(), position.getY(),getALTITUDE()));
        this.position = position;
        path.add(position);
        this.position = position;
    } //komplex mozgás, felemelkedik, elrepül a célpont fölé, és leereszkedik

    public void rotate ( int angle){
            this.angle = angle;
        }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public List<Point> getPath() {
        return path;
    }

    public static int getALTITUDE() {
        return ALTITUDE;
    }

    public long getAltitude() {
        return altitude;
    }
}







