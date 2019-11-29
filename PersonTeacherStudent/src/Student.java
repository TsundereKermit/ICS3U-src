/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cxiao
 */
public class Student extends Person {
        
        private int grade;
        private String studentId;
        private int numLates=0;
        
        public Student (String first, String last) {
                this(first, last, 87, "s346908379");
        }
        
        public Student (String f, String l, int g, String id) {
                this(f, l, "74 Birkendale Dr.", g, id);
        }
        
        public Student (String f, String l, String a, int g, String id) {
                setGrade(g);
                setStudentId(id);
                setAddress(a);
                setFirstName(f);
                setLastName(l);
        }
        
        public int getGrade() {
            return grade;
        }
        
        public String getStudentId() {
            return studentId;
        }
        
        public int getNumLates() {
            return numLates;
        }
        
        public void setGrade (int n) {
            grade=n;
        }
        
        public void setStudentId (String id) {
            studentId=id;
        }
        
        public void addLate() {
            numLates++;
        }
        
        private boolean isValidId(String id) {
		if (id.length() != 10) 
			return false;
		if ( id.charAt(0) != 's' && id.charAt(0) != 'S' ) 
			return false;
		id = id.substring(1);
		for ( int i = 0; i < id.length(); i++) {
			if (!Character.isDigit(id.charAt(i)))  
				return false;
		}
		return true;	
	}
        
        public String toString() {
            String st = "Student's FirstName: " + getFirstName() 
		          + "\nLastName: " + getLastName()
		          + "\nAddress: " + getAddress() 
		          + "\nGrade: " + getGrade()
		          + "\nStudent Id: " + getStudentId();
		return st; 
        }
        
        public boolean equals(Person obj) {
		Student other = (Student)obj;
		if (getFirstName().equals(other.getFirstName()) 
		 && getLastName().equals(other.getLastName()) 
		 && studentId.equals(other.getStudentId())) 
			return true;
		return false;
	}
}
