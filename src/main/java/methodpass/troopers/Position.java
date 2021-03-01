package methodpass.troopers;

 public class Position {

    private double posX;
    private double posY;

    public Position(double posX, double posY){
        this.posX = posX;
        this.posY = posY;
    }
    public double getPosX(){
        return posX;
    }
    public double getPosY(){
        return posY;
    }
    public double distanceFrom(Position position){
        double forSqrt =
                (posX - position.posX)*(posX - position.posX) +
                (posY - position.posY)*(posY - position.posY);
        return Math.sqrt(forSqrt);
    }

     public static void main(String[] args) {
         Position pos1 = new Position(2, 6);
         Position pos2 = new Position(-5, 1.4);

         System.out.println(pos1.distanceFrom(pos2));
     }

}

