package Sports;
import Sports.*;
import java.util.Scanner;

public class SportsMSystem {
	public static void main(String[] args) {
		UserInput uinp = new UserInput();
		SwitchCase sw = new SwitchCase();
	
		Scanner sc = new Scanner(System.in);
		uinp.PrintSports();
		sc.nextLine();
		sw.SwitchCase();
	}

}
