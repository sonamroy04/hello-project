
public class array {
	//static void minimum(int x[]) 
	static void maximum(int x[]){
		int value = x[0];
		for (int m = 1; m < x.length; m++)
			if (value < x[m])
				value = x[m];
	 System.out.println(value);
	}
	public static void main(String[] args) {
     int arr[] = {93,9,3,399};
     //minimum(arr);
     maximum(arr);
     
     
	}
     

	
}
