
public class StringMethods {

	public static void main(String[] args) {
		
		String name = "Niray";
		
		boolean printBool = name.equalsIgnoreCase("niray");
		int printLength = name.length();
		char printChar = name.charAt(0);
		boolean printEmpty = name.isEmpty();
		String printReplaced = name.replace('y', 'i');
		
		System.out.println(printBool);
		System.out.println(printLength);
		System.out.println(printChar);
		System.out.println(printEmpty);
		System.out.println(printReplaced);
	}
	
}
