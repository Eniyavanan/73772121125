import java.util.*;
public class CheckAlphabets {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);
        boolean result=true;
        String str=in.nextLine();
        str=str.toLowerCase();
        if(str.length()<26){
            result=false;
        }
        else{
            char arr[]=str.toCharArray();
            System.out.println(arr);
            int count=0;
            String temp="abcdefghijklmnopqrstuvwxyz";
            char temparr[]=temp.toCharArray();
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<temparr.length;j++){
                    System.out.println(arr[i]+"=="+temparr[j]);
                    if(temparr[i]==arr[j]){
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
            if(count!=26){
                result=false;
            }
            
        }
        System.out.println(result);
    }
    
}
