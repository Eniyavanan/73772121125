package calculate;
import java.util.*;
public class Alpha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		for(int i=65;i<=90;i++) {
			if(s.contains(Character.toString(i))) {
				System.out.println(Character.toString(i)+" : "+(s.indexOf(i)));
			}
			else {
				System.out.println(Character.toString(i)+" :-1");
			}
		}
		
		
		

	}

}
