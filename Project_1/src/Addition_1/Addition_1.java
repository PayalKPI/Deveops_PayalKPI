package Addition_1;
import java.util.*;
public class Addition_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = s.nextInt();
		
		System.out.println("Enter second number");
		int y = s.nextInt();
		
		int sum = x+y;
		System.out.println("Sum is" + sum);
	}

}
