import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("Its an Even number");
        }

        else{
            System.out.println("Its an Odd number");
        }
    }
}
