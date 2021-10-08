import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
import java.text.ParseException;

public class Main
{
	public static void main(String args[]) throws Exception
	{
		List<Obst> liste = new LinkedList<>();
		
		liste.add(new Obst("31/05/1998", "banane", 4.00));
		liste.add(new Obst("22/12/1998", "banane", 4.00));
		liste.add(new Obst("25/12/1998", "banane", 4.00));
		liste.add(new Obst("24/02/1998", "banane", 4.00));
		liste.add(new Obst("01/10/1990", "banane", 4.00));
		liste.add(new Obst("07/09/1991", "banane", 4.00));
		
		Collections.sort(liste, Obst.ObstComparators);
		Obst.verfallsdatumAnzeigen(liste);
	}
}

class Verfallsdatum
{
	String datum;
	Verfallsdatum(String datum)
	{
		this.datum = Objects.requireNonNull(datum," datum can not be null");
	}
	
	public String getDatum()
	{
		return datum;
	}
	
	
	public static Comparator<Obst> ObstComparators = new Comparator<Obst>() 
	{
		public int compare(Obst obst1, Obst obst2) 
		{
			Date a = null;
			Date b = null;
		   
			try 
			{
				a = new SimpleDateFormat("dd/MM/yyyy").parse(obst1.getDatum());  
				b = new SimpleDateFormat("dd/MM/yyyy").parse(obst2.getDatum());
			} 
			catch (ParseException e) 
			{
				System.err.println("leck eier");
			}
			
			return a.compareTo(b);	
		}
	};
	
	
	public static void verfallsdatumAnzeigen(List<Obst> liste) throws Exception
	{
		for (Obst obst : liste)
		{
			String sDate = obst.getDatum();
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);  
    
			System.out.println(obst.getBezeichnung() +" "+obst.getDatum());
		}
	}	
}


class Obst extends Verfallsdatum
{
	String bezeichnung;
	double gewicht;
	
	Obst(String datum, String bezeichnung, double gewicht)
	{
		super(datum);
		this.bezeichnung = Objects.requireNonNull(bezeichnung, "weight can not be null!");
		this.gewicht = Objects.requireNonNull(gewicht, "weight can not be null!");
	}
	
	public String getBezeichnung()
	{
		return bezeichnung;
	}
	
}
