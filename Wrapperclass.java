package calculate;

import java.util.*;
public class Wrapper{
    public static void main(String [] args){
        
        byte a =1;
        Byte obj1 = new Byte(a);
        
        int b =10;
        Integer obj2 = new Integer(b);
        
        char c ='a';
        Character obj3 = new Character(c);
        
        float d = 10.1f;
        Float obj4 = new Float(d);
        
        double e = 7.322d;
        Double obj5 = new Double(e);
        
        long f = 1234567l;
        Long obj6 = new Long(f);
        
        
        boolean g =true;
        Boolean obj7 = new Boolean(g);
        
    
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);
        System.out.println(obj7);
        
        
    }
    
}
