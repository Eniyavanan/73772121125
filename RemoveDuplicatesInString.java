import java.util.Scanner;
public class RemoveDuplicatesInString {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String arr[]=str.split("");
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(temp.equals(arr[j])){
                    arr[i]="-1";
                    arr[j]="-1";
                }
            }
        }
        for(String chunk:arr){
            if(!chunk.equals("-1")){
                System.out.print(chunk+" ");
            }
            
        }
    }
}
