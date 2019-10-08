package student;

public class AddStudent {

	static Integer rollNo = 100;
	public String firstName = "";
	public String lastName = "";

	public AddStudent() {
		rollNo++;
	}

	public String getFirstName() {
		return firstName;
	}

	public String setFirstName(String firstName) {
		return this.firstName = firstName;

	}

	public String getLastName() {
		return lastName;
	}

	public String setLastName(String lastName) {
		return this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "AddStudent [ rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
