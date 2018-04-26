import java.util.Scanner;
public class Cat_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);	
		
	String [] cats= new String[3];
	String [] breed= new String[3];
	String [] middle= new String[2];
		
	
	for(int x=0; x<cats.length; x++) {
		System.out.println("Enter the name of the cat");
	    cats[x]=in.nextLine();
	    System.out.println("Enter the breed of the cat");
	    breed[x]=in.nextLine();
		
		
	}
	middle[0]=cats[cats.length/2];
	middle[1]=breed[cats.length/2];
	
	Cat mid= new Cat(middle[0], middle[1]);
	 
	System.out.println(mid.name+" " +mid.breed);
	
	
	
	
	}

	}

