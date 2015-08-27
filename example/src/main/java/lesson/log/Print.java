package lesson.log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Print {
    @Autowired
    @Qualifier("rectangle")
   private Figure figure;
    public void showSquare(){
        System.out.println("Square "+this.figure.getName()+ " is  : " + this.figure.square());
    }

}