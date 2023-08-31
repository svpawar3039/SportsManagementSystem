package Sports;
//check 
import java.util.Scanner;

public class Cricket extends UserInput {
	Scanner sc = new Scanner(System.in);
	public void addPlayer() {
		int baller = 4;
		int batsman = 4;
		int keeper = 1;
		int allRounder = 2;
		
		System.out.println("Please Enter Your Name : ");
		UserName = sc.next();
		
		System.out.println("Which Role Do You Want in Team");
		UserRole = sc.next();
		
		while(isRoleAssigned != true) {
			if(UserRole.equalsIgnoreCase("baller")) {
				if(baller != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					baller --;
					isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(UserRole.equalsIgnoreCase("batsman")) {
				if(batsman != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					batsman --;
					isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(UserRole.equalsIgnoreCase("wicket keeper") || UserRole.equalsIgnoreCase("keeper")) {
				if(keeper != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					keeper --;
					isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(UserRole.equalsIgnoreCase("all rounder")) {
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
	


}
