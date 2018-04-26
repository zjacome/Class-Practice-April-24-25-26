import java.util.Scanner;
public class Even_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("How many numbers will you enter in the array?");
		int x=in.nextInt();
		int [] nums= new int[x];
		System.out.println("Enter the numbers");
		for(int y=0; y<nums.length; y++) {
			nums[y]=in.nextInt();

			
		}
		System.out.println("Even numbers are:");	
		
		for(int y=0; y<nums.length; y++) {
			if(nums[y]%2==0) {
			System.out.println(nums[y]);
		}
			
	}
	}
}
