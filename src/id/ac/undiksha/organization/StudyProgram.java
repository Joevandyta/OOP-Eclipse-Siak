package id.ac.undiksha.organization;

import id.ac.undiksha.siak.entities.Lecture;

public class StudyProgram implements Department{
	

	private String studyProgramCode;
	private String studyProgramName;
	
	public Lecture cordinator = new Lecture();
	
	public void setCordinator(Lecture cordinator) {
		this.cordinator = cordinator;
	}
	public StudyProgram(String studyProgramCode, String studyProgramName) {
		super();
		this.setStudyProgramCode(studyProgramCode);
		this.setStudyProgramName(studyProgramName);
	}

	public String getStudyProgramName() {
		return studyProgramName;
	}

	public void setStudyProgramName(String studyProgramName) {
		this.studyProgramName = studyProgramName;
	}

	public String getStudyProgramCode() {
		return studyProgramCode;
	}

	public void setStudyProgramCode(String studyProgramCode) {
		this.studyProgramCode = studyProgramCode;
	}
	
	private String departmentName;
	private String departmentCode;
	@Override
	public void setDeptName(String deptName) {
		this.departmentName = deptName;
	}

	@Override
	public String getDeptName() {
		// TODO Auto-generated method stub
		return this.departmentName;
	}

	@Override
	public void setDeptCode(String deptCode) {
		this.departmentCode = deptCode;
		
	}

	@Override
	public String getDeptCode() {
		// TODO Auto-generated method stub
		return this.departmentCode;
	}
}
