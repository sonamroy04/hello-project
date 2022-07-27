public class MethodProg {
  void display()
		{
			System.out.println("She is beautifull");
			System.out.println("Her name is SARAH");
		}
  void show()
	{
		System.out.println("HE is smart boy");
		System.out.println("His name is MANAS");
	}
 public static void add()//optional we can use public static or not
  {
	  int a=20,b=30;
	  System.out.println(a+b);
  }
	public static void main(String[] args) {
		
		MethodProg r=new MethodProg();
		r.display();
		r.show();
		MethodProg.add();/*here method call without object because add is static method 
		                   and static method can (must)call without object*/
		//r.add(); we can use when method is not static
	}

}
