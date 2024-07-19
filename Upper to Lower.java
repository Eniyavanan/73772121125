package calculate;
import java.util.*;
public class Stringln {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  = sc.next();
		char arr[] = s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(Character.isUpperCase(arr[i])) {
				arr[i] = Character.toLowerCase(arr[i]);
			}
			else {
				arr[i] = Character.toUpperCase(arr[i]);
			}
			System.out.print(arr[i]);
		}
	
		
	}

}
