package id.ac.undiksha.siak.entities;

public class Student extends Person{
	
	public Student(String name, String address, boolean gender, String nim, 
			String faculty, String departement, String studyProgram) {
		super(name, address, gender);
		this.nim = nim;
		this.studyProgram = studyProgram;
		this.departement = departement;
		this.faculty = faculty;
	}

	private String nim;
	private String studyProgram;
	private String departement;
	private String faculty;
	

	
	public Student() {
		super();// untuk manggil contructor dari parent
		this.nim 			= "<Invalid NIM>";
		this.studyProgram	= "<Invalid Study Program>";
		this.departement	= "<Invalid Departement>";
		this.faculty 		= "<Invalid Faculty>";
		
	}
	public void printAllInfo() {
		System.out.println("Student ");
		System.out.println("NIM \t\t: " + this.getNim());
		System.out.println("Name \t\t: " + this.getName());
		System.out.println("Address \t: " + this.getAddress());
		System.out.println("Gender \t\t: " + this.getGender());
		System.out.println("Study Program \t: " + this.getStudyProgram());
		System.out.println("Departement \t: " + this.getDepartement());
		System.out.println("Faculty \t: " + this.getFaculty() );
		System.out.println("");	
	}
	
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}
}