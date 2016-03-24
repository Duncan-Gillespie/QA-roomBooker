import java.util.ArrayList;


public final class Data {
	private static Data data = new Data();
	
	private ArrayList<Course> courseList = new ArrayList<Course>();
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();
	private ArrayList<Room> roomList = new ArrayList<Room>();
	
	private ArrayList<Employee> javaList = new ArrayList<Employee>();
	private ArrayList<Employee> poetryList = new ArrayList<Employee>();
	private ArrayList<Employee> mathList = new ArrayList<Employee>();
	private ArrayList<Employee> frenchList = new ArrayList<Employee>();
	
	private Data () { // private constructor
		
		employeeList.add(new Employee("James", 0));
		employeeList.add(new Employee("Dev", 1));
		employeeList.add(new Employee("Aaron", 2));
		employeeList.add(new Employee("Jacob", 3));
		
		javaList = employeeList;
		poetryList = employeeList;
		mathList.add(employeeList.get(1));
		frenchList.add(employeeList.get(1));
		frenchList.add(employeeList.get(3));
		
		
		courseList.add(new Course("Java",javaList));
		courseList.add(new Course("Poetry",poetryList));
		courseList.add(new Course("Math",mathList));
		courseList.add(new Course("French",frenchList));
		
		for (int i = 1; i < 20; i++)
		{
			roomList.add(new Room(i*5));
		}
		
		//employeeList.add(e)
    }
   
	public void setMyStaticMember(int val) {
       //myStaticMember = val;
    }
   
	public ArrayList<Course> getCourseList() {
        return courseList;
    }
  
	public static Data getInstance()
	{
		return data;
	}
}