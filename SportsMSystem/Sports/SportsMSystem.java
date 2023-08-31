package Sports;
import Sports.UserInput;
import java.util.Scanner;

public class SportsMSystem {
	public static void main(String[] args) {
		UserInput uinp = new UserInput();
		Scanner sc = new Scanner(System.in);
		uinp.PrintSports();
		sc.nextLine();
		uinp.SwitchCase();
	}

}
