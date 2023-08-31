package SportsMSystem;
import java.util.Scanner;

class SportsList{
	
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
	
	public void Cricket() {
		int baller = 4;
		int batsman = 4;
		int keeper = 1;
		int allRounder = 2;
		
		System.out.println("Please Enter Your Name : ");
		UserName = sc.next();
		
		System.out.println("Which Role Do You Want in Team");
		UserRole = sc.next().toLowerCase();
		
		while(isRoleAssigned != true) {
			if(UserRole.contains("baller")) {
				if(baller != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					baller --;
					isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(UserRole.contains("batsman")) {
				if(batsman != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					batsman --;
					isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(UserRole.contains("wicket keeper") || UserRole.contains("keeper")) {
				if(keeper != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					keeper --;
					isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(UserRole.contains("all rounder")) {
				if(allRounder != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					baller --;
					batsman --;
					keeper --;
					allRounder--;
					isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else {
				System.out.println("Please Enter Valid Role");
				sc.next();
			}
		}
		
	}
	
	public void Football() {
		
	}
	
	public void Basketball() {
		
	}
	public void VollyBall() {
		
	}
	public void Chess() {
		
	}
	public void TableTennis() {
		
	}
	public void Badminton() {
		
	}
	boolean ValidChoice;
	public void SwitchCase() {
		System.out.println("\nEnter Your Choice");
		try {
			int UserChoice = sc.nextInt();
			switch(UserChoice) {
			case 1:
				Cricket();
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


public class SportsMSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SportsList SportsListObj = new SportsList();
		SportsListObj.PrintSports();
		sc.nextLine();
		SportsListObj.SwitchCase();
		
		
		
	}

}
