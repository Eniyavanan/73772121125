package calculate;
import java.util.*;
public class character {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[]  = s.toCharArray();
		System.out.println("The First character :");
		for(int i=0;i<ch.length;i++) {
			if(ch[i] !=' ' && (i==0 || ch[i-1] == ' ')) {
				System.out.println(ch[i]);
				
			}
		}
		

	}

}
