import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		
		System.out.println(get(s));
	}
		public static String get(String s) {
			String v ="aeiouAEIOU";
		char arr[] = s.toCharArray();

		for(int i=0;i<arr.length;i++) {
			char ch =arr[i];		
			if(v.indexOf(ch) != -1){
				arr[i]='z';
			}
		
		}

			return new String(arr);
		
	}

}
