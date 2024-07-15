
import java.util.*;
public class Main {
	public static void main(java.lang.String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(String str : s.split(" "))
		{
			if(str.length()%2==0) {
				System.out.println(str+" "+str.length());
				
			}
			
		}
		
		
		
		

	}

}
