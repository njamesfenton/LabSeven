import java.util.*;

public class LabeSeven {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String another = "Y";
		
		int input;
		String[] names = new String[] { "Tom", "Beth", "Steve", "Stacey", "Charity", "Angel", "Andrea", "Nick" };
		do{
		System.out.println("Enter a number 1-8 to learn the name of a student");
		input = getValidNumberInRange(1, names.length);
		System.out.println(names[input-1]);
		System.out.println("Would you like to look up another person (y/n)");
		another = s.nextLine();}
		while(another.equalsIgnoreCase("y"));
	}

	public static int getValidNumberInRange(int min, int max) {
		int input = readValidIntegerNoExp();
		while (input < min || input > max) {
			System.out.println("Please Enter a number within range");
			input= s.nextInt();
			s.nextLine();
		}
		return input;
	}

	public static int readValidIntegerNoExp() {
		while (true) {
			if (s.hasNextInt())
				break;
			System.out.println("Please enter an integer");
			s.nextLine();
		}
		int x = s.nextInt();
		s.nextLine();

		return x;
	}

}