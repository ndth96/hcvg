package vn.hvcg;
import com.example.AnotherHello;

// vn.hvcg.HelloWorld

public class HelloWorld{
    
    public static void main(String[] args) {
        Person a = new Person();
        //a.name = "Minh";
        System.out.println(a.sayCount());
       // System.out.println(a.sayMyName("2"));
    }
    
    public static void sub(String[] args){
        System.out.println("Hello " + args[0] +". Age: " +args[1]);
    }
}