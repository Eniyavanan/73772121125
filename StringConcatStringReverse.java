import java.util.Scanner;
public class StringConcatStringReverse {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println();
        String str=in.nextLine();
        String str1=in.nextLine();
        StringBuffer sb=new StringBuffer(str1);
        String str2=sb.reverse().toString();
        System.out.println(str+str2);
    }
}
