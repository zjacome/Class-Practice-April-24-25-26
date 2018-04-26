
public class April_25_three_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] a= {5,2,8,23,14};
	int[] b= {67,32,7,4,61};
	int[] c= new int[5];
	
	
	for(int x=0;x<a.length; x++) {
		c[x]=(a[x]+b[x]);
		
		System.out.println(c[x]);
	}

	}

}
