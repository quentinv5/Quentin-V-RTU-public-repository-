public class Human {
	
	private String Name ;
	private String Surname;
		
	public Human(String Name, String Surname ) {
		this.Name=Name;
		this.Surname=Surname;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getSurname() {
		return Surname;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public void setSurname(String Surname) {
		this.Surname=Surname;
	}
	
	public String toString() {
		return "Name: "+Name+", Surname: "+Surname;
	}
}
