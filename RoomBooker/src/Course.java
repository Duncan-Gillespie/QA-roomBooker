import java.util.ArrayList;


public class Course {
	private String name;
	private ArrayList<Employee> elligibleTrainers;
	
	Course(String name, ArrayList<Employee> elligibleTrainers)
	{
		this.name = name;
		this.elligibleTrainers = elligibleTrainers;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Employee> getElligibleTrainers() {
		return elligibleTrainers;
	}
}
