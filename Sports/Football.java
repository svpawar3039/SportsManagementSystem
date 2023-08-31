package Sports;

import java.util.Scanner;

public class Football extends UserInput {
	Scanner sc = new Scanner(System.in);
	public void Football() {
		int defender = 4;
		int midfilder = 4;
		int goalkeeper = 1;
		int forward = 2;
		
		System.out.println("Please Enter Your Name : ");
		UserName = sc.next();
		
		System.out.println("Which Role Do You Want in Team");
		UserRole = sc.next();
		
		while(isRoleAssigned != true) {
			if(UserRole.equalsIgnoreCase("defender")) {
				if(defender != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					defender --;
					isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(UserRole.equalsIgnoreCase("midfilder")) {
				if(midfilder != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					midfilder --;
					isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(UserRole.equalsIgnoreCase("goalkeeper") || UserRole.equalsIgnoreCase("keeper")) {
				if(goalkeeper != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					goalkeeper --;
					isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(UserRole.equalsIgnoreCase("forward")) {
				if(forward != 0) {
					System.out.println(UserName + " assigned a Role of " + UserRole);
					
					forward--;
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
