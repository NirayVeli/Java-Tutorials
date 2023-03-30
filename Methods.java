
public class Methods {

	
	static void message(String name, int age) {
		System.out.println("Welcome "+ name);
		System.out.println("You are "+age+" years old");
	}
	
	static int math(int x, int y) {
		
		int z = x+y;
		return z;
		
	}
	
	public static void main(String[] args) {
		
		String name="Niray";
		int age = 22;
		
		message(name,age);
		
		int x = 5;
		int y = 10;

		System.out.println(math(x, y));
		
	}
	

}
