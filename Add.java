import java .util.*;
public class Add {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c='a';
		
			int a = sc.nextInt();
			for(int i=1;i<=a;i++) {
				StringBuilder line=new StringBuilder();
				for(int j=1;j<=i;j++) {
					line.insert(0,c);
					c++;
				}
				
				System.out.println(line);
				}
			}
				

	}
