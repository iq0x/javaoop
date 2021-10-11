import java.util.Objects;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.*;
//import java.util.Calender;


public class Main
{
	public static void main(String []artgs)
	{
		List<Event> eventliste = new LinkedList<>();
		
		eventliste.add(new Event("Halloween", "22/11/2020"));
		eventliste.add(new Event("birthday", "9/9/2020"));
		eventliste.add(new Event("silverster", "1/2/2020"));
		eventliste.add(new Event("christmas", "5/1/2020"));
		eventliste.add(new Event("birthday", "12/10/2020"));
		
		Event.checkWinter(eventliste);
	}
}


class Event
{
	String EventName;
	String EventDatum;
	
	Event(String EventName, String EventDatum)
	{
		this.EventName = Objects.requireNonNull(EventName,"EventName can not be Null");
		this.EventDatum = Objects.requireNonNull(EventDatum, "EventDatum can not be Null");
	}
	
	public String getEventName()
	{
			return EventName;
	}
	
	public String getEventDatum()
	{
			return EventDatum;
	}
	
	public static void checkWinter(List<Event> eventliste)
	{
		for (Event event : eventliste)
		{
			//System.out.println("event: " + event.getEventDatum());
			
			Date a = null;

			try 
			{
				a = new SimpleDateFormat("dd/MM/yyyy").parse(event.getEventDatum());  
			} 
			catch (ParseException e) 
			{
				System.err.println("leck eier");
			}
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(a);
			
			int currentMONTH = calendar.get(Calendar.MONTH)+1;
			int winterTIME = 8;
			
			if (currentMONTH > winterTIME)
			{
				System.out.println(event.getEventName() + " is in the winter");
			}
		}
	}
}
