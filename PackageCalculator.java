package calculate;
public class Add {
	public static void add1(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		add1(9,7);
		

	}

}
package calculate;
public class sub {
	public static void sub1(int a,int b) {
		int sum = a-b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		sub1(8,5);
		
	}

}
package calculate;
public class mul {
	public static void mul1(int a,int b) {
		int sum = a*b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		mul1(8,5);
		
	}


}
package calculate;
public class div {
	public static void div1(int a,int b) {
		int sum = a/b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		div1(8,7);
		
	}


}
package calculate;
import calculate.Add;
import calculate.sub;
import calculate.mul;
import calculate.div;
public class cal {
	public static void main(String ars[]) {
		Add a  =new Add();
		sub s = new sub();
		mul m = new mul();
		div d = new div();
		a.add1(9,900);
		s.sub1(7,10);
		m.mul1(45, 2);
		d.div1(4, 4);
	}

}
