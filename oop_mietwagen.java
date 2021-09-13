public class mietwagen 
{
    private String marke;
    private double gewicht;
    private double price;
    private double rentprice;
    private String category;


	public void setcategory(String category)
    { 
		this.category = category;
    }
    
    public void setname(String name)
    { 
		this.marke = marke;
    }
    
    public void setprice(double price)
    { 
		this.price = price;
    }
    
    public void setgewicht(double gewicht)
    { 
		this.gewicht = gewicht;
    }
    
       
 
    
    public String getname(String name)
    { 
		return this.marke;
    }
    
    public double getprice(double price)
    { 
		return this.price;
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
	    mietwagen mietwagen = new mietwagen();
		
	    mietwagen.marke = "audi";
	    mietwagen.price = 9999.00;
		mietwagen.gewicht = 700.00;
	    
	    mietwagen.category = "kleinwagen";
	    
	    int miettage = 3;
	    int km = 200;
	    
		clrscr();
		titel();
		
		System.out.print("auto marke:\t\t" + mietwagen.getname(mietwagen.marke) + "\n");
		System.out.print("auto preis:\t\t" + mietwagen.getprice(mietwagen.price) + "\n");
		System.out.print("auto gewicht:\t\t" + mietwagen.getgewicht(mietwagen.gewicht) + "\n");
		System.out.print("auto kategorie:\t\t" + mietwagen.getcategory(mietwagen.category, mietwagen.gewicht) + "\n\n");
		
		System.out.println("usereingabe");
		System.out.println(miettage +" Tage");
		System.out.println(km +" km");
		System.out.print(kosten(mietwagen.category, miettage, km) + "\n");
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
