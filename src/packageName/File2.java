package packageName;
import java.util.Scanner;
public class File2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your birth year: ");
		int year = scan.nextInt();
		int f = 100 + year;
		System.out.println("You will turn 100 in "+f);
		scan.close();

	}

}
