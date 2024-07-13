import java.util.Scanner;
public class PositiveOrNegative{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n==0){
            System.out.println("Its an Zero");
        }
        else if(n>0){
            System.out.println("Its an positive number");
        }
        else{
            System.out.println("Its an negative number");
        }
    }
}
