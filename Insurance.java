import java.util.Scanner;
public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("How old are you?");
		int ag=in.nextInt();
		System.out.println("What is your weight?");
		int w8=in.nextInt();
		System.out.println("What is your annual income?");
		double income=in.nextDouble();
		
		if(ag<18) {
			System.out.println("You fall in the Minor Category");
		}
		else if(ag>18 && ag<38 && w8<200) {
			System.out.println("You are in the Healthy-Catgory");
		}
		else if(ag>38 && ag<58 && income>50000) {
			System.out.println("You are in the Low Risk-Category");
		}
		else if(ag>58) {
			System.out.println("You are in the High Risk-Category");
		}

	}

}
