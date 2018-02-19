import java.util.Scanner;

public class TestCallable {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter name #: ");
		String name = sc.nextLine();
		System.out.println("Enter age:# ");
		int age = Integer.valueOf(sc.nextLine());

		System.out.println(name + ":" + age);

	}

}
