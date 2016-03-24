
import java.util.Date;

public class OrderForm {
	
	OrderForm()
	{

	}
	
	void SetOrderForm(Date d, Course c, int n, int h)
	{
		desiredDate = d;
		desiredCourse = c;
		numberOfPeople = n;
		hoursDesired  = h;
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
	Course desiredCourse;
	int numberOfPeople;           
	int hoursDesired;

}
