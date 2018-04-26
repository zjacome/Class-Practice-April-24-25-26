import java.util.Scanner;
public class April_25_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
	System.out.println("How many number do you want to enter?");
	int y=in.nextInt();
	
	int[] Nums= new int[y];
	
	for(int x=0; x<Nums.length; x++) {
System.out.println("Enter the number to check?");	
	
		Nums[x]=in.nextInt();
	}
	for(int x=0; x<Nums.length; x++) {	
		
	
		
	if(Nums[x]%4==0 && Nums[x]%5==0 && Nums[x]>10) {
		
		System.out.println("The number is divisible by 4, 5 and 19"+Nums[x]);
	}
	else {
		System.out.println("No valid Numbers");
	}
		

	}

}
}