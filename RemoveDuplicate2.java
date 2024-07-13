import java.util.Scanner;
public class RemoveDuplicate2 {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String str2=in.next();
        char arr[]=str.toCharArray();
        char arr1[]=str2.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    arr[i]='0';
                }
            }
        }
        for(char ch:arr){
            if(ch!='0'){
                System.out.print(ch);
            }
        }
    }
}
