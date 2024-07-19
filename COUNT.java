package calculate;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int up = 0,lp =0,v=0,s =0,c=0,n=0,sp=0;
				
		char arr[] = st.toCharArray();
		for(int i=0;i<arr.length;i++) {
		 if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' ) {
				v++;
			}
			 else {
				 c++;
			 }
		}
		for(int i=0;i<arr.length;i++) {
			if(Character.isUpperCase(arr[i])) {
				up++;
				
			}
			else  if(Character.isLowerCase(arr[i])){
				lp++;
			}
				
			
			
			else if(arr[i]>=33 && arr[i]<= 47 || arr[i] >= 58 && arr[i]<= 64) {
				s++;
			}
			else if(Character.isDigit(arr[i])) {
				n++;
				
			}
			else{
				sp++;
			}
		
}
		System.out.println("UPPER CASE :"+up);
		System.out.println("LOWER CASE :"+lp);
		System.out.println("VOWELS :"+v);
		System.out.println("SPECIAL CHAR :"+s);
		System.out.println("CONSTANT :"+c);
		System.out.println("SPACE :"+sp);
		System.out.println(" NUMBER :"+n);
	}

}
