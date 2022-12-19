package id.ac.undiksha.siak.entities;

public class Staff extends Person{
	private String nip;
	private String departement;
	private String faculty;
	
	public Staff(String nip, String name, String address, boolean gender, String departement, String faculty) {
		super(name, address, gender);
		this.nip = nip;
		this.departement = departement;
		this.faculty = faculty;
	}

	
	public Staff() {
		this.nip 			= "<invalid nip>";
		this.departement	= "<invalid faculty>";
		this.faculty 		= "<invalid faculty>";
	}

	public void printAllInfo() {
		System.out.println("Staff ");
		System.out.println("NIM \t\t: "			+ this.getNip());
		System.out.println("Name \t\t: "		+ this.getName());
		System.out.println("Address \t: "		+ this.getAddress());
		System.out.println("Gender \t\t: "		+ this.getGender());
		System.out.println("Departement \t: "	+ this.getDepartement());
		System.out.println("Faculty \t: "		+ this.getFaculty());
		System.out.println("");	
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nim) {
		this.nip = nim;
	}


	public String getDepartement() {
		return departement;
	}


	public void setDepartement(String departement) {
		this.departement = departement;
	}

}
