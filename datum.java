import java.util.Date;
import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.util.List;
import java.util.LinkedList;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.util.*;



public class Main
{
	public static void main(String []args)
	{		
		List<Termin> datumliste = new LinkedList<>();
		List<Name> namenliste1 = new LinkedList<>();
		List<Name> namenliste2 = new LinkedList<>();
		List<Name> namenliste3 = new LinkedList<>();
		List<Name> namenliste4 = new LinkedList<>();
		
		generateNames(namenliste1, namenliste2, namenliste3, namenliste4);
			
		byte count = 0;
		byte files = Byte.MAX_VALUE;	
			
		while (count < files)
		{
			count++;
			String x = "";
			String y = "";
			
			List<Name> list;
			
			byte r = (byte)(Math.random()*5+1);
			switch (r)
			{
				case 1:
						list = namenliste1;
					break;
				case 2:
						list = namenliste2;
					break;
				case 3:
						list = namenliste3;
					break;
				default:
						list = namenliste4;
					break;
			}
		
			
			byte a =(byte)(Math.random()*26+1);
			byte b =10;
			int c =2021;
			
			byte d =(byte)(Math.random()*10+12);
			byte e =(byte)(Math.random()*10+49);
			int Y =(int)(Math.random()*300+30);
			
			byte o = (byte)(Math.random()*7+1);
			switch (o)
			{
				case 1:
					x = "Berlin"; y = "Bauernstr. 22";
					break;
				case 2:
					x = "Bremen"; y = "ottostr. 11";
					break;
				case 3:
					x = "Dortmund"; y = "juhustr. 65";
					break;
				case 4:
					x = "München"; y = "Kornsttr. 44";
					break;
				case 5:
					x = "München"; y = "Berlinerstr. 44";
					break;
				case 6:
					x = "München"; y = "Vegesackerstr. 44";
					break;
				case 7:
					x = "München"; y = "Hulsberg. 44";
					break;
				case 8:
					x = "München"; y = "Ottersberg 44";
					break;
				case 9:
					x = "München"; y = "Bremerstr. 44";
					break;
				default:
					x = "Dresden"; y = "Winkelgasse. 12";
			}
			
	
			datumliste.add(new Termin(a,b,c,d,e, new Location(x, y), list, Y));	
			}
			
		
			
			
			Collections.sort(datumliste, Termin.TerminComparators);

			for (Termin datum : datumliste)
			{


			

				System.out.println("Datum:" + datum.getDay() + "." + datum.getMonth() + "." + datum.getYear() + ", " + datum.getHour() + ":" + datum.getMin() + "\tDauer: " + datum.getDauer() + "\tLocation: " + datum.getStandort() + "\tTeilnehmer: "+ datum.getTeilnehmer());
			}
		}	
		
		public static void generateNames(List<Name> namenliste1, List<Name> namenliste2, List<Name> namenliste3, List<Name> namenliste4)
		{
			namenliste1.add(new Name("Bernd"));
			namenliste1.add(new Name("Helmut"));
			namenliste1.add(new Name("Donald"));
			namenliste2.add(new Name("Helmut"));
			namenliste2.add(new Name("Uwe"));
			namenliste2.add(new Name("Adolf"));
			namenliste2.add(new Name("Uwe"));
			namenliste3.add(new Name("Otto"));
			namenliste3.add(new Name("Peter"));
			namenliste4.add(new Name("Adolf"));
			namenliste4.add(new Name("Stalin"));
			namenliste4.add(new Name("Adolf"));
			namenliste4.add(new Name("Harry"));
			namenliste4.add(new Name("Ironman"));
		}

}





class Termin 
{
	byte day;
	byte month;
	int year;
	byte hour;
	byte min;
	Location standort;
	List<Name> namenliste = new LinkedList<>();
	int dauer;
	
	Termin(byte day, byte month, int year, byte hour, byte min, Location standort, List<Name> namenliste, int dauer)
	{
		this.day = Objects.requireNonNull(day, "problem");
		this.month = Objects.requireNonNull(month, "null:! month");
		this.year = Objects.requireNonNull(year, "null:! month");
		this.hour = Objects.requireNonNull(hour, "null:! hour");
		this.min = Objects.requireNonNull(min, "null:! min");
		this.standort = Objects.requireNonNull(standort, "null:! min");
		this.namenliste = Objects.requireNonNull(namenliste, "null:! min");
		this.dauer = Objects.requireNonNull(dauer, "null:! min");
	}
	
	public byte getDay()
	{
		return day;
	}
	
	public byte getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public byte getHour()
	{
		return hour;
	}
	
	public byte getMin()
	{
		return min;
	}
	
		public int getDauer()
	{
		return dauer;
	}
	
	public Location getStandort()
	{
		return standort;
	}
	
	public List<Name> getTeilnehmer()
    {
		return namenliste;
    }
    
	public static Comparator<Termin> TerminComparators = new Comparator<Termin>() 
	{
		public int compare(Termin termin1, Termin termin2)  
		{
			byte n = termin1.getMin();
			byte m = termin1.getHour();
			byte g = termin1.getDay();
			byte h = termin1.getMonth();
			int f = termin1.getYear();
			
			byte n2 = termin1.getMin();
			byte m2 = termin1.getHour();
			byte g2 = termin2.getDay();
			byte h2 = termin2.getMonth();
			int f2 = termin2.getYear();
			
			LocalDateTime localDate = LocalDateTime.of ( f, h, g ,m ,n , 0);
			LocalDateTime localDate2 = LocalDateTime.of ( f2, h2, g2, m2 ,n2, 0);

	
				 
				
			return localDate.compareTo(localDate2);	
		}
	};
	
}



class Name
{
	String name;
	
		Name(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
		
		    public String toString() 
	{
		return name;
	}
}



class Location
{
	String strasse;
	String ort;
	
	Location(String strasse, String ort)
	{
		this.strasse = strasse;
		this.ort = ort;
	}
	
	public String getStrasse()
	{
		return strasse;
	}
	
	public String getOrt()
	{
		return ort;
	}
	
	    public String toString() 
	{
		return ort;
	}
	

}
