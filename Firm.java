import java.util.ArrayList;

public class Firm {
	
	private String Name ;
	private int MaxEmplAmount;
	private int EmplAmount;
	private ArrayList<Employee> ListEmpl=new ArrayList<Employee>(); 
	
	public Firm(String Name, int MaxEmplAmount ) {
		this.Name=Name;
		this.MaxEmplAmount=MaxEmplAmount;
	}
	
	public void add(Employee E) {
		if (EmplAmount>=MaxEmplAmount) {
			System.out.println("ERROR add() : Over Max Amount Employee");
		} else {
			ListEmpl.add(E);
			EmplAmount+=1;
		}
	}
	
	public String toString() {
		String Display = "Firm: "+Name+", Amount of employees: "+EmplAmount +"\n";
		String DisplayList="";
		for (int i = 0; i < ListEmpl.size(); i++) {
			int j=i+1;
			DisplayList=DisplayList +j+". "+ListEmpl.get(i)+"\n";
		}
		return Display+DisplayList;
	}
	
}