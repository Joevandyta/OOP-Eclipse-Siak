package id.ac.undiksha.siak.entities;

import id.ac.undiksha.organization.StudyProgram;

public class Student extends Person{
	
	public Student(String name, String address, boolean gender, String nim, 
			String studyProgramCode, String studyProgramName) {
		super(name, address, gender);
		this.nim = nim;
		studyProgram = new StudyProgram(studyProgramCode, studyProgramName);
	}

	private String nim;
	private StudyProgram studyProgram;// = new StudyProgram();
	
	
	public Student() {
		super();// untuk manggil contructor dari parent
		this.nim 			= "<Invalid NIM>";
		
		
	}
	public void printAllInfo() {
		System.out.println("Student ");
		System.out.println("NIM \t\t: " + this.getNim());
		System.out.println("Name \t\t: " + this.getName());
		System.out.println("Address \t: " + this.getAddress());
		System.out.println("Gender \t\t: " + (getGender()? "Male" : "Female"));
		System.out.println("Study Program Code \t: " + this.getStudyProgram().getStudyProgramCode());
		System.out.println("Study Program Name \t: " + this.getStudyProgram().getStudyProgramName());
//		System.out.println("Faculty \t: " + this.getFaculty() );
		System.out.println("");	
	}
	
	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	public StudyProgram getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(StudyProgram studyProgram) {
		this.studyProgram = studyProgram;
	}

	
}