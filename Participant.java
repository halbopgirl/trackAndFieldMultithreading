package trackAndFieldMultithreading;

public class Participant extends TrackAndFieldPerson{

	Participant(String name, String role, int age) {
		super(name, role, age);
	}
	
	public void practice() {
		System.out.println(super.name + " is practicing.");
	}
}
