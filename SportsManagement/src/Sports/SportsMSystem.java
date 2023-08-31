package Sports;
import Sports.*;
import java.util.Scanner;

public class SportsMSystem {
	public static void main(String[] args) {
		UserInput uinp = new UserInput();
		SwitchCase sw = new SwitchCase();
	
		Scanner sc = new Scanner(System.in);
		int Option=-1;
		while (Option != 0) {
			
			uinp.PrintSports();
//			sc.nextLine();
			System.out.println("\nEnter Your Choice");
			Option = sc.nextInt();
			if(Option == 0)break;
			sw.SwitchCase(Option);
		}
		
		
	}

}
