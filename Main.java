public class Main {
	
	public static void main (String args []) {
		
		Human Alex = new Human("Alex", "Travers");
		
		Employee Laura = new Employee("Laura", "Martin",1500.0);
		Employee Quentin = new Employee("Quentin","Vaunac",1500.0);
		
		Firm Nike = new Firm("Nike",3); 
		

		System.out.println(Alex.toString());
		
		Laura.toString();
		Laura.setSalary(1600.0);
		Laura.toString();
		System.out.println(Quentin.toString());
		
		System.out.println(Nike.toString());
		
		Nike.add(Quentin);
		Nike.add(Laura);

		System.out.println(Nike.toString());
	}
}