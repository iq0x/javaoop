public class mietwagen 
{
    private String marke;
    private String category;
    private double price;


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
    
    
    public String getcategory(String name)
    { 
		return this.category;
    }
    
    public String getname(String name)
    { 
		return this.marke;
    }
    
    public double getprice(double price)
    { 
		return this.price;
    }
    
//---------------------------------------------------------------------

    public static void main(String[] args)
    {
		
	    mietwagen mietwagen = new mietwagen();
		
	    mietwagen.marke = "audi";
	    mietwagen.price = 1234.00;
	    
	    
		clrscr();
		titel();
		
		System.out.print(mietwagen.getname(mietwagen.marke) + "\n");
		System.out.print(mietwagen.getprice(mietwagen.price) + "\n");
		System.out.print(mietwagen.getcategory(mietwagen.category) + "\n");
		

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
