import java.util.Random;

public class Wind 
{
    private double speed;
    private String category;
    
    public void setSpeed(double speed)
    { 
		this.speed = speed;
    }
    
//---------------------------------------------------------------------
    
    public double getSpeed(double speed)
    { 
		return this.speed;
    }
    
//---------------------------------------------------------------------
    
     public double getB(double speed)
    { 
		 double result = (int)((getKnots(speed)/3.01)/1.5);
		 if (result >= 12) result = 12;
		 return result;
    }
    
        public double getKnots(double speed)
    { 
		 
		 return speed / 1.823;
    }
    
//---------------------------------------------------------------------

    public void setCategory(String category)
    { 
		this.category = category;
    }
    
    
    public String getCategory(String category, double speed)
    { 
		if (speed < 2) category = "Windstill";
		if (speed > 2 && speed < 120) category = "Windig";
		if (speed > 120) category = "Orkan";	
			
		return category;
    }
    
//---------------------------------------------------------------------

    public static void main(String[] args)
    {
		
		while( true )
		{
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
			
			Random rand = new Random();
			
			clrscr();
			
			Wind wind = new Wind();
			
			wind.setSpeed(rand.nextInt(140));
			
			System.out.println("wind speed:\t" + wind.getSpeed(wind.speed));
			
			System.out.println("wind categorie:\t" + wind.getCategory(wind.category, wind.speed));

			System.out.println("wind in knots:\t" + wind.getKnots(wind.speed));

			System.out.println("Beaufordvalue:\t" + wind.getB(wind.speed));
		}
    }
    
//---------------------------------------------------------------------

    public static void clrscr()
    {
		System.out.print("\033[H\033[2J"); 
		System.out.flush();  
    }
}
