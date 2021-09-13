public class Mietwagen 
{
    private double gewicht;
    private double price;
    private String category;

	public void setcategory(String category)
    { 
		this.category = category;
    }
   
    public void setgewicht(double gewicht)
    { 
		this.gewicht = gewicht;
    }
    
    
    public double getgewicht(double price)
    { 
		return this.gewicht;
    }
    
    public String getcategory(String category, double gewicht)
    { 
		if (gewicht < 1000)
			category = "kleinwagen";
		else 
			category = "grosswagen";
			
		return category;
    }
    
    
    
    public static double kosten(String category, int miettage, int km)
    {
		double kosten = 0;
		if (category.equals("kleinwagen"))
		{
			if (km < 200)
				kosten = miettage * 60 + km * 0.40;
			else
				kosten = miettage * 60 + (km - 200) * 0.40 ;
		}
		else
		{
			if (km < 200)
				kosten = miettage * 90 + km * 0.60;
			else
				kosten = miettage * 90 + (km - 300) * 0.60 ;
		}
		
		return kosten;
	}
    
//---------------------------------------------------------------------

    public static void main(String[] args)
    {
		clrscr();
		titel();
		int miettage = 1;
	    int km = 201;
	    
	    Mietwagen mietwagen = new Mietwagen();
	    
	    mietwagen.setcategory("");
	    mietwagen.setgewicht(1000);
	    
		System.out.println(miettage +" Tage");
		System.out.println(km +" km");
		System.out.print("auto kategorie:\t" + mietwagen.getcategory(mietwagen.category, mietwagen.gewicht) + "\n\n");
		System.out.print("Die kosten betragen: " + kosten(mietwagen.category, miettage, km) + "\n");
    }
    
//---------------------------------------------------------------------

    public static void titel()
    {
		System.out.println("█████████████████████████████████████");
		System.out.println("██           Mietwagen             ██");
		System.out.println("█████████████████████████████████████\n");
    }
    
    public static void clrscr()
    {
		System.out.print("\033[H\033[2J"); 
		System.out.flush();  
    }
}
