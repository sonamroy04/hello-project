package mphasisSimpleLearner;
import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		int n;
		int fact_var = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number? ");
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			fact_var = fact_var * i;
		}
			System.out.println("factorial of the number "+n+ " is: "+fact_var);
		

	}

}
