import java.util.*;
interface circle{
   public void area();
}
interface rectangle{
    public void area1();
}
 interface triangle{
    public void area2();
}
class calculate implements circle,rectangle,triangle{
    public void area(){
        int r =12;
        int sum = (22/7)*r*r;
        System.out.println(sum);
        
    }
    public void area1(){
        int l =10;
        int b =45;
        int sum = l*b;
        System.out.println(sum);
    
    }
    public void area2(){
        int b =10;
        int h =56;
        float sum =(float)0.5*b*h;
        System.out.println(sum);
    }
}
public class main{
    public static void main(String args[]){
        calculate  c = new calculate();
        c.area();
        c.area1();
        c.area2();
    }
}
