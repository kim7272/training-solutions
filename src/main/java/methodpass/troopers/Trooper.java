 package methodpass.troopers;

    public class Trooper {

    private Position position;
    private String name;

    public Trooper(String name) {
            if ( name.isEmpty()){
                throw new IllegalArgumentException("Name must not be empty.");
            }
            this.name = name;
            this.position = new Position(0,0);
        }

    public String getName(){
        return name;
    }
    public Position getPosition(){
        return position;
    }
    public void changePosition(Position target){
        if (target ==  null){
            throw new IllegalArgumentException("Change to nowhere.");
        }
        this.position = target;
    }
    public double distanceFrom(Position target){

        return this.position.distanceFrom(target);
    }


}
