import java.util.Date;


public class DatesBooked {
	Date start;
	Date end;
	
	DatesBooked(Date start, Date end)
	{
		this.start = start;
		this.end = end;
	}

	public Date getStart() {
		return start;
	}

	public Date getEnd() {
		return end;
	}

}
