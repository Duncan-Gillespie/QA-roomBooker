import java.util.Scanner;

public class Main 
{
	void input()
	{
		Input input = new Input();
		input.promptName();
		input.promptNumber();
		input.promptDuration();
	}
	
	Main()
	{
		input();
	}
	
	public static void main(String[] args) 
	{
		Main theMain = new Main();
	}

}
