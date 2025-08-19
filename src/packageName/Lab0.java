package packageName;
import java.util.Scanner;
public class Lab0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Verb: ");
		String verb = scan.nextLine();
		System.out.print("Adjective: ");
		String adjective = scan.nextLine();
		System.out.print("Noun: ");
		String noun = scan.nextLine();
		
		System.out.println("They wanted to "+verb+" a "+adjective+" "+noun+ " for the science fair.");
		
		scan.close();
	}

}
