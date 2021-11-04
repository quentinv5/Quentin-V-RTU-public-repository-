public class Employee extends Human {
	private double Salary;
	
	public Employee(String Name, String Surname, Double Salary) {
		super(Name, Surname);
		this.Salary=Salary; 
	}	
	
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double Salary) {
		this.Salary=Salary;
	}
	
	public String toString() {
		return super.toString()+", Salary: "+Salary;
	}
}