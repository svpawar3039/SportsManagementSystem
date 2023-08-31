package Sports;

import java.util.Scanner;
import Sports.Cricket;
public class UserInput {


	Scanner sc = new Scanner(System.in);
	String[] SportsList = {" 1 : Cricket", " 2 : Football", " 3 : BasketBall ", " 4 : VollyBall", " 5 : Chess"," 6 : Table-Tennis"," 7 : Badminton"};
	String UserName,UserRole;
	boolean isRoleAssigned;
	//Printing Sports List
	public void PrintSports() {
		for(int i = 0; i < SportsList.length; i++) {
			System.out.println(SportsList[i]);
		}
	}

		
		
}
