package trackAndFieldMultithreading;

public class Coordinator extends TrackAndFieldPerson{

	Coordinator(String name, String role, int age) {
		super(name, role, age);
	}
	
	public void startup() {
		System.out.println(name + " is starting the track meet.");
	}

}
