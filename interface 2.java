import java.util.*;
interface resizable{
    public void width(int w);
    public void height(int h);
}
public  class rectangle implements resizable{
    public void width(int w){
        int width=88;
        System.out.println("Default:"+width);
        width=w;
        System.out.println("Resized :"+width);
    }
    public void height(int h){
       int width=888;
        System.out.println("Default:"+width);
        width=h;
        System.out.println("Resized :"+width);
    }
    public static void main(String a[]){
        rectangle r = new rectangle();
        r.width(5);
        r.height(4);
    }
}
