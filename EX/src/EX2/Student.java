package EX2;

public class Student {
	private String department;
	private int studentNo;
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
public static void main(String[] args){
	
		Student student = new Student();
		student.setDepartment("휴먼로봇융합전공");
		student.setStudentNo(20181420);
		
		System.out.println(student.getDepartment());
		System.out.println(student.getStudentNo());
	}
}
