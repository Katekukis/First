package primer1;
import java.lang.*;

public class Dogs {
    private String name;
    private int age;

    public Dogs(String n, int a){
        name = n;
        age = a;
    }
    public Dogs(String n){
        name = n;
        age = 0;
    }
    public Dogs(){
        name = "Pup";
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return this.name+", возраст "+this.age;
    }

    public void dogs(){
        System.out.println(name+" имя собаки ");
    }
}
