import java.util.ArrayList;
import java.util.Scanner;


public class Input {

	private Scanner sc = new Scanner(System.in);
	//
	int errorValue = -1;
	
	Input()
	{
		//tempList.add("Java");
		//tempList.add("Math");
		//tempList.add("Poetry");
		//tempList.add("French");
	}
	
	private boolean checkOnList(String input)
	{
		ArrayList<String> tempList = Data.getInstance().getCourseList();
		for(String i : tempList)
		{
			if(i.equals(input))
			{
				return true;
			}
		}
		return false;
	}
	
	private String getUserString(){
		String input;
		try {
			input = sc.nextLine();
			System.out.println(input);
		} 
		catch (Exception e) {
			System.out.println("Error you messed up somewhat, try again \n\n");
			return "";
		}
		return input;
	}
	
	private int getUserInt(){
		int input;
		try{
			input = sc.nextInt();
			System.out.println(input);
		}
		catch (Exception e) {
			System.out.println("Error you messed up somewhat, try again \n\n");
			sc.next();
			return errorValue;
		}
		return input;
	}
	/*public void promptName()
	{
		String input;
		boolean resolved = false;
		do {
			System.out.println(" Enter the name of the course \n\n");
			input = getUserString();
			if(!input.isEmpty())
				resolved=true;
		} while(!resolved);
	}*/
	
	public void promptName()
	{
		String input;
		boolean resolved = false;
		while(!resolved) 
		{
			System.out.println(" Enter the name of the course \n\n");
			input = getUserString();
			if(!input.isEmpty()&&checkOnList(input))
				resolved=true;
			else
			{
				System.out.println("NoT oN tHe LiSt");
			}
		} 
	}
	
	
	
	public void promptDate()
	{
		String input;
		boolean resolved = false;
		while(!resolved) 
		{
			System.out.println(" Enter the date you wish to reserve\n\n");
			input = getUserString();
			if(!input.isEmpty()&&checkOnList(input))
				resolved=true;
			else
			{
				System.out.println("NoT oN tHe LiSt");
			}
		} 
	}
	
	public void promptNumber()
	{
		int input;
		boolean resolved = false;
		while(!resolved) 
		{
			System.out.println(" Enter the number who will be attending \n\n");
			input = getUserInt();
			if(input!=errorValue)
				resolved=true;
			else
			{
				System.out.println("invalid value");
			}
		} 
	}
	
	public void promptDuration()
	{
		int input;
		boolean resolved = false;
		while(!resolved) 
		{
			System.out.println(" How many hours will the presentation last for \n\n");
			input = getUserInt();
			if(input!=errorValue)
				resolved=true;
			else
			{
				System.out.println("invalid value");
			}
		} 
	}
}
