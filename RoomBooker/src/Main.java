import java.util.Scanner;

public class Main 
{
	void input()
	{
		Input input = new Input(new OrderForm());
		input.handleInput();
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
