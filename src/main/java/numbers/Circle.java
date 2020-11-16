package numbers;

public class Circle {

    private int diameter;
    private double Pi;

    public Circle(int diameter){
        this.diameter = diameter;
        Pi = 3.14;

    }
    public double perimeter(){
       return (double) diameter * Pi;
    }
    public double area(){
        return (double) diameter*diameter*Pi/4;
    }
}


