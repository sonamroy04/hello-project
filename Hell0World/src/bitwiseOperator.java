
public class bitwiseOperator {

	public static void main(String[] args) {
		// IF BOTH THE VALUE IS 1 IT GIVE 1
		int m = 60;
		int n = 13;
		//60=0011 1100
		//13=0000 1101
		System.out.println(m&n);//0000 1100 give 1 if both value is 1
		System.out.println(m|n);//0011 1101 it give 1 atleast one value is 1
		System.out.println(m^n);//0011 0001 it give 0 for same & 1 for diff

	}

}
