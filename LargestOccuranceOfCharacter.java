import java.util.Scanner;
public class LargestOccuranceOfCharacter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int carr[]=new int[str.length()];
        for(int i=0;i<str.length();i++){
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            carr[i]=count;
        }
        int largest=0;
        int lindex=0;
        for(int i=0;i<carr.length;i++){
            if(carr[i]>largest){
                largest=carr[i];
                lindex=i;
            }
        }
        System.out.println(str.charAt(lindex)+" repested "+largest);
    }
}
