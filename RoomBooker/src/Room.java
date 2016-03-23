
public class Room {
	int capacity;
	private static int id = 0;
	
	static void addToID()
	{
		id++;
	}
	
	Room(int capacity)
	{
		this.capacity = capacity;
		addToID();
	}
	
	public int getID()
	{
		return id;
	}
	
	public int getCapacity()
	{
		return id;
	}

}
