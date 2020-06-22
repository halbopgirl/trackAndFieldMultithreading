package trackAndFieldMultithreading;

public class Trainer extends TrackAndFieldPerson{

	Trainer(String name, String role, int age) {
		super(name, role, age);
	}
	
	public void lecture() {
		System.out.println(name + " is lecturing.");
	}
}
