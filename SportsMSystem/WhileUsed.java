package SportsMSystem;

import java.util.Scanner;

class sports{
	
	Scanner sc = new Scanner(System.in);
	String[] SportsList1 = {" 1 : Cricket", " 2 : Football", " 3 : Chess", " 4 : Table-Tennis", " 5 : BasketBall"," 6 : VollyBall"," 7 : Badminton"};
	
	//Printing Sports List
	public void PrintSports() {
		for(int i = 0; i < SportsList1.length; i++) {
			System.out.println(SportsList1[i]);
		}
		System.out.println("Enter Sports Do You Want to Play");
		int UserChoice = sc.nextInt();
		
		while(true) {
			switch(UserChoice) {
			case 1:
				System.out.println("Please Enter Your Name : ");
				String UserName = sc.next();
				System.out.println("Which Role Do You Want in Team");
				String UserRole = sc.next().toLowerCase();
				if(UserRole.contains("baller")) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
				}else if(UserRole.contains("batsman")) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
				}else if(UserRole.contains("wicket keeper") || UserRole.contains("keeper")) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
				}else if(UserRole.contains("all rounder")) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
				}else {
					System.out.println("Please Enter Valid Role");
				}
				break;
			case 2:
				System.out.println("Cricket");
				break;
			case 3:
				System.out.println("Cricket");
				break;
			case 4:
				System.out.println("Cricket");
				break;
			case 5:
				System.out.println("Cricket");
				break;
			case 6:
				System.out.println("Cricket");
				break;
			case 7:		
				System.out.println("Cricket");
				break;
			default:
				System.out.println("Please Enter Valid Choice");
			}	
		}	
	}
}


public class WhileUsed {
	public static void main(String[] args) {
		sports SportsList1Obj = new sports();
		SportsList1Obj.PrintSports();
		
		
	}

}
