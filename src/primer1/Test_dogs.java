package primer1;
import java.lang.*;
public class Test_dogs {
    public static void main(String[] args){
        Dogs d1 = new Dogs("Джек", 6);
        Dogs d2 = new Dogs("Ричи", 2);
        Dogs d3 = new Dogs("Майк", 4);
        d3.setAge(1);
        System.out.println(d1);
        d1.dogs();
        d2.dogs();
        d3.dogs();

    }
}
