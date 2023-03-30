import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> car = new ArrayList<String>();
		
		car.add("Mustang");
		car.add("BMW");
		car.add("Lada");
		
		// set, remove, clear
		// car.set(0, "Moskvic");
		// car.remove(2);
		// car.clear();
		
		for(int i = 0; i<car.size();i++) {
			System.out.println(car.get(i));
		}
		
	}

}
