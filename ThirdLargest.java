import java.util.Scanner;
public class ThirdLargest{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int largest=arr[0];
        int sl=arr[0];
        int tl=arr[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    largest=arr[i];
                    sl=largest;
                }
                else if(sl>arr[i]){
                    sl=arr[i];
                }
            }
        }
        System.out.println(largest);
        System.out.println(sl);
    }
}
