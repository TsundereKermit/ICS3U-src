public class Teacher extends Person {
	private String teachables;
	private String employeeId;

	public Teacher(){
		this("Mr.","Nobody","1 First Street","Spare","c00000");
	}
	
	public Teacher(String first, String last) {
		this(first,last,"1 First Street","Spare","c00000");
	}

	public Teacher(String f, String l, String t, String id) {
		this(f,l,"1 First Street",t,id);
	}
	
	public Teacher(String f, String l, String a, String t, String id) {
		this(f, l, a, 0, 0, 0, t, id);
	}

	public Teacher(String f, String l, String a, int y, int m, int d, String t, String id)
	{
		super(f, l, a, y, m, d);
		setTeachables(t);
		setEmployeeId(id);
	}
	
	
	public String getTeachables() {
		return teachables;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String id) {
		if (isValidId(id))
		 employeeId = id;
	}

	public void setTeachables(String t) {
		teachables = t;
	}

	public boolean isValidId(String id) {
		if (id.length() != 6)
			return false;
		if (id.charAt(0) != 'c' && id.charAt(0) != 'C')
			return false;
		id = id.substring(1);
		for (int i = 0; i < id.length(); i++) {
			if (!Character.isDigit(id.charAt(i)))  return false;
			//if (id.charAt(i) < '0' || id.charAt(i) > '9') return false;
		}
		return true;
	}

	public void markStudentLate(Student s) {
		s.addLate();
	}

	public String toString() {
		String st = "Teacher's FirstName: " + getFirstName() 
		          + "\nLastName: " + getLastName() 
		          + "\nAddress: " + getAddress() 
		          +"\nTeachables: " + getTeachables()
		          + "\nTeacher Id: " + getEmployeeId()
				  + "\nBirthday: " + getBirthday();
		return st;
	}

	public boolean equals(Object obj) {
		Teacher other = (Teacher) obj;
		if (getFirstName().equals(other.getFirstName())
				&& getLastName().equals(other.getLastName())
				&& employeeId.equals(other.getEmployeeId()))
			return true;
		return false;
	}
}