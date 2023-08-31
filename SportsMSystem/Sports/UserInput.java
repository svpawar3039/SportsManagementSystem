package Sports;

import java.util.Scanner;
import Sports.Cricket;
public class UserInput {

	Cricket ck = new Cricket();

	Scanner sc = new Scanner(System.in);
	String[] SportsList = {" 1 : Cricket", " 2 : Football", " 3 : BasketBall ", " 4 : VollyBall", " 5 : Chess"," 6 : Table-Tennis"," 7 : Badminton"};
	String UserName,UserRole;
	boolean isRoleAssigned;
	//Printing Sports List
	public void PrintSports() {
		for(int i = 0; i < SportsList.length; i++) {
			System.out.println(SportsList[i]);
		}
		
		
		public void SwitchCase() {
			System.out.println("\nEnter Your Choice");
			try {
				int UserChoice = sc.nextInt();
				switch(UserChoice) {
				case 1:
					ck.Cricket();
					break;
				
				case 2:
				
					break;
				
				case 3:
				
					break;
				
				case 4:
				
					break;
				
				case 5:
				
					break;
				
				case 6:
				
					break;
				
				case 7:
				
					break;
				
				default:
					System.out.println("Please Enter Valid Choice");
				}
			}catch(Exception e) {
				System.out.println("enter valid choice");			
			}
		
		
		
	}
}
