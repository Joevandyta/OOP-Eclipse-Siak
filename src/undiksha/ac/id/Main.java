package undiksha.ac.id;

import id.ac.undiksha.siak.entities.*;

public class Main {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setNim("2115101027");
		std1.setName("Jopan");
		std1.setAddress("Singaraja");
		std1.setGender(true);
		std1.setStudyProgram("Computer Science");
		std1.setDepartement("Infomatika");
		std1.setFaculty("Engginer & Vocational Falculties");
		std1.printAllInfo();
	
		Student std2 = new Student(
				"ji&",
				"Singaraja",
				true,
				"123",
				"CS",
				"Informatic",
				"FTK"
			);
		std2.printAllInfo();
	
		Lecture ltr1 = new Lecture();		ltr1.setNip("2115101027");
		ltr1.setName("Vandy S.KOM M.KOM");
		ltr1.setAddress("Japan");
		ltr1.setGender(true);
		ltr1.setDepartement("Infomatika");
		ltr1.setFaculty("Engginer & Vocational Falculties");
		ltr1.printAllInfo();
		
		Lecture ltr2 = new Lecture(
				
			"202021",
			"Sif",
			"Valhala street",
			false,
			"IT",
			"FTK"
		);
		ltr2.printAllInfo();		
	
		Lecture staff1 = new Lecture();
		staff1.setNip("2115101027");
		staff1.setName("Diablo M.PD");
		staff1.setAddress("Denpasar");
		staff1.setGender(true);
		staff1.setFaculty("Engginer & Vocational Falculties");
		staff1.printAllInfo();
		
		Staff staff2 = new Staff(
				
				"202021",
				"Sif",
				"Valhala street",
				false,
				"Bisnis",
				"FE"
			);
		staff2.printAllInfo();
		
		
	}
	
}