package ACCESS;
class C1{
	public int x=5;
	protected int y=6;
	private int z=9;
	int s=4;
	public void method1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(s);
	}
}
//we can access all modifier in same class
public class Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();
		c.method1();

	}

}
