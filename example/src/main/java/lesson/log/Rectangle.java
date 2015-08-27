package lesson.log;

public class Rectangle extends Figure {
   private int a;
    private int b;
    public Rectangle(String name,int a, int b){
        super(name);
        this.a=a;
        this.b=b;
    }


    public double square() {
        return a*b;
    }
}
