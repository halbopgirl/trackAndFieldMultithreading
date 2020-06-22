package trackAndFieldMultithreading;

public class TrackAndFieldPerson {
	String name;
	String role;
	int age;
	
	TrackAndFieldPerson(String name, String role, int age) {
		this.name = name;
		this.role = role;
		this.age = age;
	}
	
	public void joining() {
		System.out.println(name + " enters the field.");
	}
	
	public void end() {
		System.out.println(name + " leaves the field.");
	}
}
