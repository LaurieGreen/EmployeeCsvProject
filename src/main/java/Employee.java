import java.util.Date;

public class Employee {
	private String employeeID;
	private String namePrefix;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String email;
	private String dateOfBirth;
	private String joiningDate;
	private int salary;

	public Employee(String[] employeeData) {
		setEmployeeID( employeeData[0] );
		setNamePrefix( employeeData[1] );
		setFirstName( employeeData[2] );
		setMiddleName( employeeData[3] );
		setLastName( employeeData[4] );
		setGender( employeeData[5] );
		setEmail( employeeData[6] );
		setDateOfBirth( employeeData[7] );
		setJoiningDate( employeeData[8] );
		setSalary( Integer.parseInt( employeeData[9]) );
	}

	public void setEmployeeID( final String employeeID ) {
		this.employeeID = employeeID;
	}

	public void setNamePrefix( final String namePrefix ) {
		this.namePrefix = namePrefix;
	}

	public void setFirstName( final String firstName ) {
		this.firstName = firstName;
	}

	public void setMiddleName( final String middleName ) {
		this.middleName = middleName;
	}

	public void setLastName( final String lastName ) {
		this.lastName = lastName;
	}

	public void setGender( final String gender ) {
		this.gender = gender;
	}

	public void setEmail( final String email ) {
		this.email = email;
	}

	public void setDateOfBirth( final String dateOfBirth ) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setJoiningDate( final String joiningDate ) {
		this.joiningDate = joiningDate;
	}

	public void setSalary( final int salary ) {
		this.salary = salary;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getNamePrefix() {
		return namePrefix;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "employeeID='" + employeeID + '\'' + ", namePrefix='" + namePrefix + '\'' + ", firstName='" + firstName + '\'' + ", middleName='" + middleName + '\'' + ", lastName='" + lastName + '\'' + ", gender='" + gender + '\'' + ", email='" + email + '\'' + ", dateOfBirth='" + dateOfBirth + '\'' + ", joiningDate='" + joiningDate + '\'' + ", salary=" + salary + '}';
	}
}
