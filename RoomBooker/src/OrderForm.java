
import java.util.Date;

public class OrderForm {
	
	OrderForm(Date d, String c, int n)
	{
		desiredDate = d;
		desiredCourse = c;
		numberOfPeople = n;
	}
	
	boolean submit()
	{
		// check if any rooms are large enough to accommodate the booking, and if any trainers are availiable at the intended times
		return true;
	}
	
	formData getData()
	{
		formData fd = null;
		fd.desiredDate = desiredDate;
		fd.desiredCourse = desiredCourse;
		fd.numberOfPeople = numberOfPeople;
		return fd;
	}
	
	Date desiredDate;
	String desiredCourse;
	int numberOfPeople;                             

}
