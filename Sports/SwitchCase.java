package Sports;

import java.util.Scanner;

public class SwitchCase {
	Scanner sc = new Scanner(System.in);
	Cricket ck = new Cricket();
	Football fb = new Football();
	
	public void SwitchCase(int UserChoice) {
//		System.out.println("\nEnter Your Choice");
		try {
//			int UserChoice = sc.nextInt();
			switch(UserChoice) {
			case 1:
				ck.addPlayer();
				break;
			
			case 2:
				fb.addPlayer();
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
