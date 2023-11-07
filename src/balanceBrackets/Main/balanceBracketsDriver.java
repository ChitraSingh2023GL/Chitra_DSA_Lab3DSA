package balanceBrackets.Main;
import java.util.Scanner;
import balanceBrackets.Service.balanceBracketsService;

public class balanceBracketsDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String input;
			balanceBracketsService obj = new balanceBracketsService();
			System.out.println("Enter input string to check balance brackets like  ( [ [ { } ] ] )");
			if (sc.hasNextLine()) {
				input = sc.nextLine().trim();
				boolean result = obj.checkBalanceBrackets(input);
				if (result == true) {
					System.out.println("The entered String has Balanced Brackets.");
				} else {
					System.out.println("The entered Strings do not contain Balanced Brackets.");

				}
			}

		} catch (Exception ex) {
			System.out.println("Please check details of runtime error.\n" + ex.getMessage());
		} finally {
			sc.close();
		}

	}

}
