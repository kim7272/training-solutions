package javabeans;

public class Dog {

    private String name;
    private int age;
    private boolean pedigree;
    private double weight;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean isPedigree(){;
        return pedigree;
    }
    public double getWeight(){
        return weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPedigree(boolean b){
        this.pedigree = b;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

}
