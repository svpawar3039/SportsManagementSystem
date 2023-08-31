package Sports;

import java.util.Scanner;

public class Cricket {
	UserInput uinp = new UserInput();
	Scanner sc = new Scanner(System.in);
	public void Cricket() {
		int baller = 4;
		int batsman = 4;
		int keeper = 1;
		int allRounder = 2;
		
		System.out.println("Please Enter Your Name : ");
		uinp.UserName = sc.next();
		
		System.out.println("Which Role Do You Want in Team");
		uinp.UserRole = sc.next().toLowerCase();
		
		while(uinp.isRoleAssigned != true) {
			if(uinp.UserRole.contains("baller")) {
				if(baller != 0) {
					System.out.println(uinp.UserName + " assigned a Role of " + uinp.UserRole);
					baller --;
					uinp.isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(uinp.UserRole.contains("batsman")) {
				if(batsman != 0) {
					System.out.println(uinp.UserName + " assigned a Role of " + uinp.UserRole);
					batsman --;
					uinp.isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(uinp.UserRole.contains("wicket keeper") || uinp.UserRole.contains("keeper")) {
				if(keeper != 0) {
					System.out.println(uinp.UserName + " assigned a Role of " + uinp.UserRole);
					keeper --;
					uinp.isRoleAssigned = true;
				}else {
					System.out.println("This Role is No Longer Available");
				}
			}else if(uinp.UserRole.contains("all rounder")) {
				if(allRounder != 0) {
					System.out.println(uinp.UserName + " assigned a Role of " + uinp.UserRole);
					baller --;
					batsman --;
					keeper --;
					allRounder--;
					uinp.isRoleAssigned = true;
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
