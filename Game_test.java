import java.util.Scanner;
public class Game_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		Game [] object= new Game[5];
		
		object[0]=new Game("Clue", "Mystery", 9);
		object[1]=new Game("Twister", "Party Game", 8);
		object[2]=new Game("Monopoly", "Family", 9);
		object[3]=new Game("Domino", "Family", 8);
		object[4]=new Game("Guess Who?", "Children", 8);
		
		for(int x=0; x<object.length; x++) {
			
			System.out.println(object[x].name);
		}
		
		System.out.println("What game would you like to play?");		
		String y=in.nextLine();
		
			if(y.equals(object[0].name)) {
				
		System.out.println("Game name:"+object[0].name+ " Genre:"+ object[0].genre+" Rating: "+object[0].rate);
			}
			else if(y.equals(object[1].name)) {
			System.out.println("Game name:"+object[1].name+ " Genre:"+ object[1].genre+" Rating: "+object[1].rate);
		
		}
			else if(y.equals(object[2].name)) {
				System.out.println("Game name:"+object[2].name+ " Genre:"+ object[2].genre+" Rating: "+object[2].rate);
			}
			else if(y.equals(object[3].name)) {
				System.out.println("Game name:"+object[3].name+ " Genre:"+ object[3].genre+" Rating: "+object[3].rate);
			}
			else if(y.equals(object[4].name)) {
				System.out.println("Game name:"+object[4].name+ " Genre:"+ object[4].genre+" Rating: "+object[4].rate);
			}
			else {
				System.out.println("Game was not found");
			}
			
}
}