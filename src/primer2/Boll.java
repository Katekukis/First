package primer2;
import java.lang.*;


public class Boll {
    private String color;
    private int size;

        public Boll(String a, int n){
            color = a;
            size = n;
        }
        public Boll(String a){
            color = a;
            size = 0;
        }
        public Boll(){
            color = "Red";
            size = 0;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor(String color){
            return color;
        }

        public int getSize() {
            return size;
        }

        public String toString(){
            return this.color+", диаметр "+this.size;
        }

        public void boll(){
            System.out.println(color+" цвет мяча ");
        }
    }


