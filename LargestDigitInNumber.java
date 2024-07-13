import java.util.Scanner;
public class LargestDigitInNumber{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int large=0;
        while(num!=0){
            int rem=num%10;
            if(large<rem){
                large=rem;
            }
            num=num/10;
        }
        System.out.println("Largest Digit= "+large);
    }
}
