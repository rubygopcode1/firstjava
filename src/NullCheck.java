public class NullCheck {

	public static void main(String[] args) {
		// Accepts upto 3

		String[] list = new String[3];
		int index = 0;

		while ((index < args.length) && (index < 3)) {

			list[index] = args[index];
			index++;
		}

		try {
			// Check all the parameters
			for (int i = 0; i < list.length; i++) {

				if (list[i] == null) {
					System.out.println("Contains null");
					return;
				}
				if (list[i].equals("-help")) {
					System.out.println("help");
				} else if (list[i].equals("-cp")) {
					System.out.println("cp");
				}

			}
		} catch (Exception e) {
			System.out.println("Aray index");
		}
	}

}
