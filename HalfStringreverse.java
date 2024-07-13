import java.util.Scanner;
public class HalfStringreverse {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println();
        String str=in.next();
        int half=str.length()/2;
        String str2=str.substring((half),str.length());
        StringBuffer sb=new StringBuffer(str2);
        sb=sb.reverse();
        String str3=sb.toString();
        System.out.println(str.substring(0, half)+str3);
    }
}
