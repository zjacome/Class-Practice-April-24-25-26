import java.util.Scanner;
public class Average_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int y=in.nextInt();
		
		int[] Nums= new int[y];
		int sum=0;
		int Average=0;
		System.out.println("Enter the numbers");
		for(int x=0; x<Nums.length; x++) {
				
			Nums[x]=in.nextInt();
		sum=(sum+Nums[x]);	
		
			
		}
		Average=sum/y;
		System.out.println("The average is"+Average);



	}

}
