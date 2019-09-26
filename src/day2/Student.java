package day2;

public class Student {
	
	private int Student_id;
	private String Student_Name;
	private long ent_PhNo;
	private String Student_Add=null;
	private String StudentMailId=null;
	private String StudentDegree=null;
	private int yop;
	
	//Constructors
	
	Student(int Student_id,String Student_Name,long ent_PhNo){
		this.Student_id=Student_id;
		this.Student_Name=Student_Name;
		this.ent_PhNo=ent_PhNo;
	}
	Student(int Student_Id,String Student_Name,String StudentMailId){
		this.Student_id=Student_Id;
		this.Student_Name=Student_Name;
		this.StudentMailId=StudentMailId;
	}
	
	
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public long getEnt_PhNo() {
		return ent_PhNo;
	}
	public void setEnt_PhNo(long ent_PhNo) {
		this.ent_PhNo = ent_PhNo;
	}
	public String getStudent_Add() {
		return Student_Add;
	}
	public void setStudent_Add(String student_Add) {
		Student_Add = student_Add;
	}
	public String getStudentMailId() {
		return StudentMailId;
	}
	public void setStudentMailId(String studentMailId) {
		StudentMailId = studentMailId;
	}
	public String getStudentDegree() {
		return StudentDegree;
	}
	public void setStudentDegree(String studentDegree) {
		StudentDegree = studentDegree;
	}
	
	void Studentdetails(){
		System.out.println("StudentName: "+Student_id);
	}

}
