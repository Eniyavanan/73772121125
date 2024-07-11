import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char a = 'A';
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(a +" ");
				
			}
			a++;
			if(a>'z') {
				break;
			}
			System.out.println();
			
		}
		
		
		

	}

}
