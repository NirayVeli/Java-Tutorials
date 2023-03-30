
public class Main {

	public static void main(String[] args) {
		
		double x = 2.4;
		double y = 9;
		double z = -6;
		
		double maxResult = Math.max(x, y);
		double minResult = Math.min(y, z);
		double sqrtResult = Math.sqrt(y);
		double roundedResult = Math.round(x);
		
		System.out.println(maxResult);
		System.out.println(minResult);
		System.out.println(sqrtResult);
		System.out.println(roundedResult);
	}

}
