package primer2;
import java.lang.*;

public class Test_boll {
    public static void main(String[] args){
        Boll b1 = new Boll("Желтый",40);
        Boll b2 = new Boll("Зеленый", 50);
        b2.setSize(1);
        System.out.println(b1);
        b1.boll();
        b2.boll();
    }
}
