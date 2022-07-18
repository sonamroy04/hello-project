
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n =sc.nextInt();
		int fact_var =1;
		for(int i=1;i<=n;i++) {
			fact_var =fact_var*i;
		}
		System.out.println("Factorial of the number:"+n+" is:"+fact_var);
			

	}

}
