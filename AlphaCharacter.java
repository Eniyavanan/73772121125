import java.util.Scanner;
public class AlphaCharacter {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
