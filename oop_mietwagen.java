public class mietwagen 
{
    private String marke;

    private double gewicht;
    private double price;
    private double rentprice;
    private String category;


	public void setcategory(String name)
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
		return category;
    }
    
//---------------------------------------------------------------------

    public static void main(String[] args)
    {
	    mietwagen mietwagen = new mietwagen();
		
	    mietwagen.marke = "audi";
	    mietwagen.price = 9999.00;
		mietwagen.gewicht = 1234.00;
	    
	    mietwagen.category = "kleinwagen";
	    
		clrscr();
		titel();
		
		System.out.print(mietwagen.getname(mietwagen.marke) + "\n");
		System.out.print(mietwagen.getprice(mietwagen.price) + "\n");
		System.out.print(mietwagen.getgewicht(mietwagen.gewicht) + "\n");
		System.out.print(mietwagen.getcategory(mietwagen.category, mietwagen.gewicht) + "\n");

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
