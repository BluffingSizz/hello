package ch14;

public class Student {
	String num;
	String name;
	String major;
	int year;
	String professor;
	//get,setter 생성자
	
	public Student() {
		
	}

	public Student(String num, String name, String major, int year, String professor) {
		this.num = num;
		this.name = name;
		this.major = major;
		this.year = year;
		this.professor = professor;
	}

	public String getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public int getYear() {
		return year;
	}

	public String getProfessor() {
		return professor;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
	

}
