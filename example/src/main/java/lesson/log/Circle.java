package lesson.log;

public class Circle extends Figure {
 private double radius;
    private  double Pi = 3.14;
    public Circle(String name,double radius){
        super(name);
        this.radius = radius;
    }

    public double square() {
        return Pi * this.radius  * this.radius;
    }
}