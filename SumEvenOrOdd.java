import java.util.Scanner;
public class SumEvenOrOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n=n1+n2;
        if(n%2==0){
            System.out.println("Its an Even number");
        }

        else{
            System.out.println("Its an Odd number");
        }
    }
}
