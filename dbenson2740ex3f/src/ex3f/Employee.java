package ex3f;

public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee(){
		
		idNumber = 0;
		name = "";
		department = "";
		position = "";
		
	}
	
	public Employee(int id, String n){
		
		idNumber = id;
		name = n;
		department = "";
		position = "";
		
	}
	
	public Employee(int id, String n, String d, String p){
		
		idNumber = id;
		name = n;
		department = d;
		position = p;
		
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIdNumber(){
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("ID: ");
		str.append(this.idNumber);
		str.append(", ");
		str.append(this.name);
		str.append(", Dept: ");
		str.append(this.department);
		str.append(", Position: ");
		str.append(this.position);
		
		return str.toString();
				
	}

}
