
package interfaceextends.robot;

        import java.util.ArrayList;
        import java.util.List;

public class C3PO implements MovableRobot {

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public C3PO(Point position){
        this.position = position;
    }
    public void moveTo(Point position){
        path.add(position);
        this.position = position;
    }
    public void fastMoveTo(Point position){
        path.add(position);
        this.position = position;
    }
    public List<Point> getPath(){
        return path;
    }
    public void rotate(int angle){
        this.angle = angle;
    }
    public int getAngle(){
        return angle;
    }
    public Point getPosition(){
        return position;
    }


}



