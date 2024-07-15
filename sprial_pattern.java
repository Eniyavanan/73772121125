package calculate;
import java.util.*;
public class squarepattern {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1 ) {
					System.out.print("4"+" ");
				}
				else if(i==1 || i==n-2 || j==1 || j==n-2) {
					System.out.print("3"+" ");
				}
				else if(i==2 || i==n-3 || j==2 || j==n-3) {
					System.out.print("2"+" ");
				}
				else{
					System.out.print("1"+" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
