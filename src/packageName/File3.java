package packageName;
import java.util.Scanner;
public class File3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int total = (a+b+c);
		int average = (total / 3);
		int star = (total % 5);
		System.out.println("Total Score: "+total);
		System.out.println("Average Score: "+average);
		System.out.println("Stars Earned: "+star);
		scan.close();

	}

}
