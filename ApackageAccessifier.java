package access2;
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

public class ApackageAccessifier {

	public static void main(String[] args) {
		C1 c =new C1();
		System.out.println(c.x);
		System.out.println(c.y);
		//System.out.println(c.z);
		//we can't access private modifier in same package
		System.out.println(c.s);

	}

}
