package calculate;
import java.util.*;
public class Evenascii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch [] = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
		if(ch[i]%2==0) {
			System.out.print(ch[i]);
			
		}
		
		}

	}

}
