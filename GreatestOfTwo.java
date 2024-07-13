import java.util.Scanner;
public class GreatestOfTwo {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1=in.nextInt();
        if(n>n1){
            System.out.println(n+" is largest");
        }
        else{
            System.out.println(n1+" is largest");
        }
    }
}
